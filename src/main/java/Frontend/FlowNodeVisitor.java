package Frontend;

import Model.Flowgraph.FNVariable;
import Model.Flowgraph.FlowNode;
import antlr.MicroCParser.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class FlowNodeVisitor {
    private int id = 0;
    private Stack<FlowNode> currentWhileLoopFlowNodes = new Stack<>();
    private List<FlowNode> currentBreakFlowNodes = new ArrayList<>();
    private List<FlowNode> currentIfElseFinalFlowNodes = new ArrayList<>();

    private FlowNode invokeChildMethod(ParseTree parseTree, FlowNode flowNode) {
        for (Method method : this.getClass().getMethods()) {
            Class<?>[] params = method.getParameterTypes();
            if (method.getDeclaringClass().getName().equals(this.getClass().getName()) &&
                    params.length == 2 && params[0].isInstance(parseTree)) {
                try {
                    return (FlowNode)method.invoke(this, parseTree, flowNode);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        System.err.println("FAILED TO INVOKE CHILD METHOD: " + parseTree.getText());
        return null;
    }

    public FlowNode visitProgram(ProgramContext ctx) {
        FlowNode flowNode = new FlowNode(id);
        visitBlock(ctx.block(), flowNode);
        return flowNode;
    }

    public FlowNode visitBlock(BlockContext ctx, FlowNode flowNode) {
        Iterator<StatementContext> iterator = ctx.statement().iterator();
        while (iterator.hasNext()) {
            StatementContext child = iterator.next();
            flowNode = visitStatement(child, flowNode);
            if (iterator.hasNext()) {
                FlowNode orgFlowNode = flowNode;
                flowNode = new FlowNode(++id);
                if (orgFlowNode.isNotContinueOrBreakNode())
                    this.addEdge(orgFlowNode, flowNode);
                Iterator<FlowNode> flowNodeIterator = currentIfElseFinalFlowNodes.iterator();
                while (flowNodeIterator.hasNext()) {
                    FlowNode next = flowNodeIterator.next();
                    if (next.isNotContinueOrBreakNode())
                        this.addEdge(next, flowNode);
                    flowNodeIterator.remove();
                }
                if (child.statementWhile() != null) {
                    flowNodeIterator = currentBreakFlowNodes.iterator();
                    while (flowNodeIterator.hasNext()) {
                        this.addEdge(flowNodeIterator.next(), flowNode);
                        flowNodeIterator.remove();
                    }
                }
            }
        }
        return flowNode;
    }

    public FlowNode visitStatement(StatementContext ctx, FlowNode flowNode) {
        FlowNode result = null;
        for (ParseTree child : ctx.children) {
            flowNode.setStatement(child.getText());
            result = invokeChildMethod(child, flowNode);
        }
        return result;
    }

    public FlowNode visitStatementAssign(StatementAssignContext ctx, FlowNode flowNode) {
        extractFNVariableFromIdentifier(ctx.lhs, flowNode.getWriteVariables());
        extractFNVariableFromExpression(ctx.rhs, flowNode.getReadVariables());
        return flowNode;
    }

    public FlowNode visitStatementAssignRecord(StatementAssignRecordContext ctx, FlowNode flowNode) {
        extractFNVariableFromIdentifier(ctx.lhs, flowNode.getWriteVariables());
        extractFNVariableFromExpressionNumeric(ctx.fst, flowNode.getReadVariables());
        flowNode.addReadVariable(new FNVariable());
        extractFNVariableFromExpressionNumeric(ctx.snd, flowNode.getReadVariables());
        return flowNode;
    }

    public FlowNode visitStatementIf(StatementIfContext ctx, FlowNode flowNode) {
        flowNode.setStatement(ctx.children.subList(0, 4).stream().map(ParseTree::getText).collect(Collectors.joining()));
        FlowNode newFlowNode = extractCondition(ctx.condition, flowNode);
        FlowNode ifBlockFinalFlowNode = visitBlock(ctx.ifBlock, newFlowNode);
        if (ctx.elseBlock != null) {
            newFlowNode = new FlowNode(++id);
            this.addEdge(flowNode, newFlowNode);
            FlowNode elseBlockFinalFlowNode = visitBlock(ctx.elseBlock, newFlowNode);
            currentIfElseFinalFlowNodes.add(elseBlockFinalFlowNode);
        } else {
            currentIfElseFinalFlowNodes.add(flowNode);
        }
        return ifBlockFinalFlowNode;
    }

    public FlowNode visitStatementWhile(StatementWhileContext ctx, FlowNode flowNode) {
        flowNode.setStatement(ctx.children.subList(0, 4).stream().map(ParseTree::getText).collect(Collectors.joining()));
        FlowNode newFlowNode = extractCondition(ctx.condition, flowNode);
        currentWhileLoopFlowNodes.push(flowNode);
        FlowNode newFinalFlowNode = visitBlock(ctx.whileBlock, newFlowNode);
        currentWhileLoopFlowNodes.pop();
        this.addEdge(newFinalFlowNode, flowNode);
        return flowNode;
    }

    private FlowNode extractCondition(ExpressionBooleanContext ctx, FlowNode flowNode) {
        extractFNVariableExpressionFromBoolean(ctx, flowNode.getReadVariables());
        FlowNode newFlowNode = new FlowNode(++id);
        this.addEdge(flowNode, newFlowNode);
        return newFlowNode;
    }

    public FlowNode visitStatementRead(StatementReadContext ctx, FlowNode flowNode) {
        extractFNVariableFromIdentifier(ctx.var, flowNode.getWriteVariables());
        return flowNode;
    }

    public FlowNode visitStatementWrite(StatementWriteContext ctx, FlowNode flowNode) {
        extractFNVariableFromExpression(ctx.ex, flowNode.getReadVariables());
        return flowNode;
    }

    public FlowNode visitStatementBreak(StatementBreakContext ctx, FlowNode flowNode) {
        if (currentWhileLoopFlowNodes.empty())
            throw new IllegalArgumentException("Break called outside while loop");
        currentBreakFlowNodes.add(flowNode);
        return flowNode;
    }

    public FlowNode visitStatementContinue(StatementContinueContext ctx, FlowNode flowNode) {
        if (currentWhileLoopFlowNodes.empty())
            throw new IllegalArgumentException("Continue called outside while loop");
        this.addEdge(flowNode, currentWhileLoopFlowNodes.peek());
        return flowNode;
    }

    public FlowNode visitVarDeclaration(VarDeclarationContext ctx, FlowNode flowNode) {
        flowNode.setStatement(ctx.getText());
        return visitVariable(ctx.var, flowNode);
    }

    private FlowNode visitVariable(VariableContext ctx, FlowNode flowNode) {
        FNVariable fnVariable = new FNVariable(ctx.variableName.getText());
        if (ctx.type().typeBasic() != null) {
            if (ctx.type().typeBasic().typeInt() != null)
                fnVariable.setType(FNVariable.Type.INT);
            else if (ctx.type().typeBasic().typeRecord() != null)
                fnVariable.setType(FNVariable.Type.RECORD);
            flowNode.addWriteVariable(fnVariable);
        } else if (ctx.type().typeArray() != null) {
            fnVariable.setType(FNVariable.Type.ARRAY);
            flowNode.addWriteVariable(fnVariable);
            flowNode.addWriteVariable(new FNVariable());
            extractFNVariableFromExpressionNumeric(ctx.type().typeArray().value, flowNode.getWriteVariables());
        }
        return flowNode;
    }

    private void extractFNVariableFromExpression(ExpressionContext ctx, List<FNVariable> fnVariables) {
        fnVariables.add(new FNVariable());
        if (ctx.expressionNumeric() != null) {
            extractFNVariableFromExpressionNumeric(ctx.expressionNumeric(), fnVariables);
        } else if (ctx.expressionBoolean() != null) {
            extractFNVariableExpressionFromBoolean(ctx.expressionBoolean(), fnVariables);
        }
    }

    private void extractFNVariableFromExpressionNumeric(ExpressionNumericContext ctx, List<FNVariable> fnVariables) {
        if (ctx.expressionIdentifier() != null) {
            extractFNVariableFromIdentifier(ctx.expressionIdentifier().ident, fnVariables);
        } else if (ctx.expressionConstantInteger() != null) {
            FNVariable fnVariable = getOrCreateNewVariable(fnVariables);
            fnVariable.setType(FNVariable.Type.CONSTANT);
            fnVariable.setValue(Integer.parseInt(ctx.expressionConstantInteger().value.getText()));
        } else if (ctx.lhs != null && ctx.rhs != null) {
            extractFNVariableFromExpressionNumeric(ctx.lhs, fnVariables);
            fnVariables.add(new FNVariable());
            extractFNVariableFromExpressionNumeric(ctx.rhs, fnVariables);
        }
    }

    private void extractFNVariableExpressionFromBoolean(ExpressionBooleanContext ctx, List<FNVariable> fnVariables) {
        if (ctx.expressionNumericCompare() != null) {
            fnVariables.add(new FNVariable());
            extractFNVariableFromExpressionNumeric(ctx.expressionNumericCompare().lhs, fnVariables);
            fnVariables.add(new FNVariable());
            extractFNVariableFromExpressionNumeric(ctx.expressionNumericCompare().rhs, fnVariables);
        } else if (ctx.eblhs != null && ctx.ebrhs != null) {
            fnVariables.add(new FNVariable());
            extractFNVariableExpressionFromBoolean(ctx.ebrhs, fnVariables);
            fnVariables.add(new FNVariable());
            extractFNVariableExpressionFromBoolean(ctx.eblhs, fnVariables);
        } else if (ctx.nrhs != null) {
            fnVariables.add(new FNVariable());
            extractFNVariableExpressionFromBoolean(ctx.nrhs, fnVariables);
        }
    }

    private void extractFNVariableFromIdentifier(IdentifierContext ctx, List<FNVariable> fnVariables) {
        FNVariable fnVariable = getOrCreateNewVariable(fnVariables);
        if (ctx.identifierInt() != null) {
            fnVariable.setName(ctx.identifierInt().name.getText());
            fnVariable.setType(FNVariable.Type.INT);
        } else if (ctx.identifierArray() != null) {
            fnVariable.setName(ctx.identifierArray().name.getText());
            fnVariable.setType(FNVariable.Type.ARRAY);
            fnVariables.add(new FNVariable());
            extractFNVariableFromExpressionNumeric(ctx.identifierArray().element, fnVariables);
        } else if (ctx.identifierRecordFst() != null) {
            fnVariable.setName(ctx.identifierRecordFst().name.getText());
            fnVariable.setType(FNVariable.Type.RECORDFST);
        } else if (ctx.identifierRecordSND() != null) {
            fnVariable.setName(ctx.identifierRecordSND().name.getText());
            fnVariable.setType(FNVariable.Type.RECORDSCND);
        }
    }

    private FNVariable getOrCreateNewVariable(List<FNVariable> fnVariables) {
        if (fnVariables.size() > 0) {
            return fnVariables.get(fnVariables.size() - 1);
        }
        else {
            FNVariable fnVariable = new FNVariable();
            fnVariables.add(fnVariable);
            return fnVariable;
        }
    }

    private void addEdge(FlowNode fromNode, FlowNode toNode) {
        fromNode.addChild(toNode);
        toNode.addParent(fromNode);
    }
}

package Frontend;

import Model.Flowgraph.FNVariable;
import Model.Flowgraph.FlowNode;
import antlr.MicroCParser.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class FlowNodeVisitor {
    private int id = 0;
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

    public void visitTerminalNode(TerminalNodeImpl node, FlowNode flowNode) {
    }

    public FlowNode visitProgram(ProgramContext ctx) {
        FlowNode flowNode = new FlowNode(id);
        visitBlock(ctx.block(), flowNode);
        return flowNode;
    }

    public FlowNode visitBlock(BlockContext ctx, FlowNode flowNode) {
        boolean first = true;
        for (StatementContext child : ctx.statement()) {
            if (!first) {
                FlowNode orgFlowNode = flowNode;
                flowNode = new FlowNode(++id);
                orgFlowNode.addEdge(flowNode);
            }
            first = false;
            flowNode = visitStatement(child, flowNode);
        }
        return flowNode;
    }

    public FlowNode visitStatement(StatementContext ctx, FlowNode flowNode) {
        FlowNode result = null;
        for (ParseTree child : ctx.children) {
            result = invokeChildMethod(child, flowNode);
        }
        return result;
    }

    public FlowNode visitStatementAssign(StatementAssignContext ctx, FlowNode flowNode) {
        extractFNVariableFromIdentifier(ctx.lhs, flowNode.getLhsVariables());
        extractFNVariableFromExpression(ctx.rhs, flowNode.getRhsVariables());
        return flowNode;
    }

    public FlowNode visitStatementAssignRecord(StatementAssignRecordContext ctx, FlowNode flowNode) {
        extractFNVariableFromIdentifier(ctx.lhs, flowNode.getLhsVariables());
        extractFNVariableFromExpressionNumeric(ctx.fst, flowNode.getRhsVariables());
        flowNode.addRhsVariable(new FNVariable());
        extractFNVariableFromExpressionNumeric(ctx.snd, flowNode.getRhsVariables());
        return flowNode;
    }

    public FlowNode visitStatementIf(StatementIfContext ctx, FlowNode flowNode) {
        extractFNVariableExpressionFromBoolean(ctx.condition, flowNode.getRhsVariables());
        FlowNode newFlowNode = new FlowNode(++id);
        flowNode.addEdge(newFlowNode);
        FlowNode ifBlockFinalFlowNode = visitBlock(ctx.ifBlock, newFlowNode);
        //if (ctx.elseBlock != null) {
         //   newFlowNode = new FlowNode(++id);
          //  flowNode.addEdge(newFlowNode);
           // FlowNode elseBlockFinalFlowNode = visitBlock(ctx.elseBlock, newFlowNode);
        //}
        return ifBlockFinalFlowNode;
    }

    public FlowNode visitStatementWhile(StatementWhileContext ctx, FlowNode flowNode) {
        extractFNVariableExpressionFromBoolean(ctx.condition, flowNode.getRhsVariables());
        FlowNode newFlowNode = new FlowNode(++id);
        flowNode.addEdge(newFlowNode);
        FlowNode newFinalFlowNode = visitBlock(ctx.whileBlock, newFlowNode);
        newFinalFlowNode.addEdge(flowNode);
        return flowNode;
    }

    public FlowNode visitStatementRead(StatementReadContext ctx, FlowNode flowNode) {
        extractFNVariableFromIdentifier(ctx.var, flowNode.getLhsVariables());
        return flowNode;
    }

    public FlowNode visitStatementWrite(StatementWriteContext ctx, FlowNode flowNode) {
        extractFNVariableFromExpression(ctx.ex, flowNode.getRhsVariables());
        return flowNode;
    }

    public FlowNode visitStatementBreak(StatementBreakContext ctx, FlowNode flowNode) {
        return null;
    }

    public FlowNode visitStatementContinue(StatementContinueContext ctx, FlowNode flowNode) {
        return null;
    }

    public FlowNode visitVarDeclaration(VarDeclarationContext ctx, FlowNode flowNode) {
        return visitVariable(ctx.var, flowNode);
    }

    private FlowNode visitVariable(VariableContext ctx, FlowNode flowNode) {
        FNVariable fnVariable = new FNVariable(ctx.variableName.getText());
        if (ctx.type().typeBasic() != null) {
            if (ctx.type().typeBasic().typeInt() != null)
                fnVariable.setType(FNVariable.Type.INT);
            else if (ctx.type().typeBasic().typeRecord() != null)
                fnVariable.setType(FNVariable.Type.RECORD);
            flowNode.addLhsVariable(fnVariable);
        } else if (ctx.type().typeArray() != null) {
            fnVariable.setType(FNVariable.Type.ARRAY);
            flowNode.addLhsVariable(fnVariable);
            flowNode.addLhsVariable(new FNVariable());
            extractFNVariableFromExpressionNumeric(ctx.type().typeArray().value, flowNode.getLhsVariables());
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
}

package Frontend;

import Model.Flowgraph.FlowNode;
import antlr.MicroCParser;
import antlr.MicroCVisitor;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FlowNodeVisitor extends AbstractParseTreeVisitor<FlowNode> implements MicroCVisitor<FlowNode> {
    private FlowNode currentFlowNode;

    private FlowNode invokeChildMethod(ParseTree parseTree) {
        for (Method method : this.getClass().getMethods()) {
            Class<?>[] params = method.getParameterTypes();
            if (method.getDeclaringClass().getName().equals(this.getClass().getName()) &&
                    params.length == 1 && params[0].isInstance(parseTree)) {
                try {
                    return (FlowNode) method.invoke(this, parseTree);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }
        System.err.println("FAILED TO INVOKE CHILD METHOD: " + parseTree.getText());
        return null;
    }

    public FlowNode visitTerminalNode(TerminalNodeImpl node) {
        return null;
    }

    @Override
    public FlowNode visitProgram(MicroCParser.ProgramContext ctx) {
        this.currentFlowNode = new FlowNode();

        return invokeChildMethod(ctx.block());
    }

    @Override
    public FlowNode visitBlock(MicroCParser.BlockContext ctx) {
        FlowNode orgNode = currentFlowNode;
        for (ParseTree child : ctx.children) {
            invokeChildMethod(child);
        }
        return orgNode;
    }

    @Override
    public FlowNode visitStatement(MicroCParser.StatementContext ctx) {
        FlowNode orgNode = currentFlowNode;
        for (ParseTree child : ctx.children) {
            invokeChildMethod(child);
        }
        return null;
    }

    @Override
    public FlowNode visitStatementAssign(MicroCParser.StatementAssignContext ctx) {
        return null;
    }

    @Override
    public FlowNode visitStatementAssignRecord(MicroCParser.StatementAssignRecordContext ctx) {
        return null;
    }

    @Override
    public FlowNode visitStatementIf(MicroCParser.StatementIfContext ctx) {
        return null;
    }

    @Override
    public FlowNode visitStatementWhile(MicroCParser.StatementWhileContext ctx) {
        return null;
    }

    @Override
    public FlowNode visitStatementRead(MicroCParser.StatementReadContext ctx) {
        return null;
    }

    @Override
    public FlowNode visitStatementWrite(MicroCParser.StatementWriteContext ctx) {
        return null;
    }

    @Override
    public FlowNode visitStatementBreak(MicroCParser.StatementBreakContext ctx) {
        return null;
    }

    @Override
    public FlowNode visitStatementContinue(MicroCParser.StatementContinueContext ctx) {
        return null;
    }

    @Override
    public FlowNode visitIdentifier(MicroCParser.IdentifierContext ctx) {
        return null;
    }

    @Override
    public FlowNode visitExpression(MicroCParser.ExpressionContext ctx) {
        return null;
    }

    @Override
    public FlowNode visitExpressionL(MicroCParser.ExpressionLContext ctx) {
        return null;
    }

    @Override
    public FlowNode visitExpressionA(MicroCParser.ExpressionAContext ctx) {
        return null;
    }

    @Override
    public FlowNode visitExpressionB(MicroCParser.ExpressionBContext ctx) {
        return null;
    }

    @Override
    public FlowNode visitExpressionIdentifier(MicroCParser.ExpressionIdentifierContext ctx) {
        return null;
    }

    @Override
    public FlowNode visitExpressionRecordFirst(MicroCParser.ExpressionRecordFirstContext ctx) {
        return null;
    }

    @Override
    public FlowNode visitExpressionRecordSecond(MicroCParser.ExpressionRecordSecondContext ctx) {
        return null;
    }

    @Override
    public FlowNode visitExpressionConstantInteger(MicroCParser.ExpressionConstantIntegerContext ctx) {
        return null;
    }

    @Override
    public FlowNode visitExpressionCompare(MicroCParser.ExpressionCompareContext ctx) {
        return null;
    }

    @Override
    public FlowNode visitOperatorNumeric(MicroCParser.OperatorNumericContext ctx) {
        return null;
    }

    @Override
    public FlowNode visitOperatorCompare(MicroCParser.OperatorCompareContext ctx) {
        return null;
    }

    @Override
    public FlowNode visitOperatorBool(MicroCParser.OperatorBoolContext ctx) {
        return null;
    }

    @Override
    public FlowNode visitVarDeclaration(MicroCParser.VarDeclarationContext ctx) {
        visitVariable(ctx.var);
        return null;
    }

    @Override
    public FlowNode visitVariable(MicroCParser.VariableContext ctx) {
        System.out.println(ctx.variableName.getText());
        currentFlowNode.addLhsVariable(ctx.variableName.getText());
        visitType(ctx.type());
        return null;
    }

    @Override
    public FlowNode visitType(MicroCParser.TypeContext ctx) {
        for (ParseTree child : ctx.children)
            invokeChildMethod(child);
        return null;
    }

    @Override
    public FlowNode visitTypeBasic(MicroCParser.TypeBasicContext ctx) {
        for (ParseTree child : ctx.children)
            invokeChildMethod(child);
        return null;
    }

    @Override
    public FlowNode visitTypeArray(MicroCParser.TypeArrayContext ctx) {
        visitExpressionA(ctx.value);
        return null;
    }

    @Override
    public FlowNode visitTypeInt(MicroCParser.TypeIntContext ctx) {
        return null;
    }

    @Override
    public FlowNode visitTypeRecord(MicroCParser.TypeRecordContext ctx) {
        return null;
    }
}

// Generated from C:/Users/Kaare/IdeaProjects/PAnal/src/main/java/antlr\MicroC.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MicroCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MicroCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MicroCParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MicroCParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MicroCParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MicroCParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#statementAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssign(MicroCParser.StatementAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#statementAssignRecord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssignRecord(MicroCParser.StatementAssignRecordContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#statementIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementIf(MicroCParser.StatementIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#statementWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWhile(MicroCParser.StatementWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#statementRead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementRead(MicroCParser.StatementReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#statementWrite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWrite(MicroCParser.StatementWriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#statementBreak}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBreak(MicroCParser.StatementBreakContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#statementContinue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementContinue(MicroCParser.StatementContinueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(MicroCParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MicroCParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#expressionL}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionL(MicroCParser.ExpressionLContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#expressionA}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionA(MicroCParser.ExpressionAContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#expressionB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionB(MicroCParser.ExpressionBContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#expressionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionIdentifier(MicroCParser.ExpressionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#expressionRecordFirst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionRecordFirst(MicroCParser.ExpressionRecordFirstContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#expressionRecordSecond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionRecordSecond(MicroCParser.ExpressionRecordSecondContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#expressionConstantInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionConstantInteger(MicroCParser.ExpressionConstantIntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#expressionCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionCompare(MicroCParser.ExpressionCompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#operatorNumeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorNumeric(MicroCParser.OperatorNumericContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#operatorCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorCompare(MicroCParser.OperatorCompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#operatorBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperatorBool(MicroCParser.OperatorBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(MicroCParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(MicroCParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MicroCParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#typeBasic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBasic(MicroCParser.TypeBasicContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#typeArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArray(MicroCParser.TypeArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#typeInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInt(MicroCParser.TypeIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link MicroCParser#typeRecord}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeRecord(MicroCParser.TypeRecordContext ctx);
}
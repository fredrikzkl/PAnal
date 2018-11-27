// Generated from C:/Users/Kaare/IdeaProjects/PAnal/src/main/java/antlr\MicroC.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MicroCParser}.
 */
public interface MicroCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MicroCParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MicroCParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MicroCParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MicroCParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MicroCParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MicroCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MicroCParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#statementAssign}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssign(MicroCParser.StatementAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#statementAssign}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssign(MicroCParser.StatementAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#statementAssignRecord}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssignRecord(MicroCParser.StatementAssignRecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#statementAssignRecord}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssignRecord(MicroCParser.StatementAssignRecordContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#statementIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementIf(MicroCParser.StatementIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#statementIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementIf(MicroCParser.StatementIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#statementWhile}.
	 * @param ctx the parse tree
	 */
	void enterStatementWhile(MicroCParser.StatementWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#statementWhile}.
	 * @param ctx the parse tree
	 */
	void exitStatementWhile(MicroCParser.StatementWhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#statementRead}.
	 * @param ctx the parse tree
	 */
	void enterStatementRead(MicroCParser.StatementReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#statementRead}.
	 * @param ctx the parse tree
	 */
	void exitStatementRead(MicroCParser.StatementReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#statementWrite}.
	 * @param ctx the parse tree
	 */
	void enterStatementWrite(MicroCParser.StatementWriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#statementWrite}.
	 * @param ctx the parse tree
	 */
	void exitStatementWrite(MicroCParser.StatementWriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#statementBreak}.
	 * @param ctx the parse tree
	 */
	void enterStatementBreak(MicroCParser.StatementBreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#statementBreak}.
	 * @param ctx the parse tree
	 */
	void exitStatementBreak(MicroCParser.StatementBreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#statementContinue}.
	 * @param ctx the parse tree
	 */
	void enterStatementContinue(MicroCParser.StatementContinueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#statementContinue}.
	 * @param ctx the parse tree
	 */
	void exitStatementContinue(MicroCParser.StatementContinueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MicroCParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MicroCParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MicroCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MicroCParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#expressionL}.
	 * @param ctx the parse tree
	 */
	void enterExpressionL(MicroCParser.ExpressionLContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#expressionL}.
	 * @param ctx the parse tree
	 */
	void exitExpressionL(MicroCParser.ExpressionLContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#expressionA}.
	 * @param ctx the parse tree
	 */
	void enterExpressionA(MicroCParser.ExpressionAContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#expressionA}.
	 * @param ctx the parse tree
	 */
	void exitExpressionA(MicroCParser.ExpressionAContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#expressionB}.
	 * @param ctx the parse tree
	 */
	void enterExpressionB(MicroCParser.ExpressionBContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#expressionB}.
	 * @param ctx the parse tree
	 */
	void exitExpressionB(MicroCParser.ExpressionBContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#expressionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterExpressionIdentifier(MicroCParser.ExpressionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#expressionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitExpressionIdentifier(MicroCParser.ExpressionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#expressionRecordFirst}.
	 * @param ctx the parse tree
	 */
	void enterExpressionRecordFirst(MicroCParser.ExpressionRecordFirstContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#expressionRecordFirst}.
	 * @param ctx the parse tree
	 */
	void exitExpressionRecordFirst(MicroCParser.ExpressionRecordFirstContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#expressionRecordSecond}.
	 * @param ctx the parse tree
	 */
	void enterExpressionRecordSecond(MicroCParser.ExpressionRecordSecondContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#expressionRecordSecond}.
	 * @param ctx the parse tree
	 */
	void exitExpressionRecordSecond(MicroCParser.ExpressionRecordSecondContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#expressionConstantInteger}.
	 * @param ctx the parse tree
	 */
	void enterExpressionConstantInteger(MicroCParser.ExpressionConstantIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#expressionConstantInteger}.
	 * @param ctx the parse tree
	 */
	void exitExpressionConstantInteger(MicroCParser.ExpressionConstantIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#expressionCompare}.
	 * @param ctx the parse tree
	 */
	void enterExpressionCompare(MicroCParser.ExpressionCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#expressionCompare}.
	 * @param ctx the parse tree
	 */
	void exitExpressionCompare(MicroCParser.ExpressionCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#operatorNumeric}.
	 * @param ctx the parse tree
	 */
	void enterOperatorNumeric(MicroCParser.OperatorNumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#operatorNumeric}.
	 * @param ctx the parse tree
	 */
	void exitOperatorNumeric(MicroCParser.OperatorNumericContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#operatorCompare}.
	 * @param ctx the parse tree
	 */
	void enterOperatorCompare(MicroCParser.OperatorCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#operatorCompare}.
	 * @param ctx the parse tree
	 */
	void exitOperatorCompare(MicroCParser.OperatorCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#operatorBool}.
	 * @param ctx the parse tree
	 */
	void enterOperatorBool(MicroCParser.OperatorBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#operatorBool}.
	 * @param ctx the parse tree
	 */
	void exitOperatorBool(MicroCParser.OperatorBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(MicroCParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(MicroCParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(MicroCParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(MicroCParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MicroCParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MicroCParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#typeBasic}.
	 * @param ctx the parse tree
	 */
	void enterTypeBasic(MicroCParser.TypeBasicContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#typeBasic}.
	 * @param ctx the parse tree
	 */
	void exitTypeBasic(MicroCParser.TypeBasicContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#typeArray}.
	 * @param ctx the parse tree
	 */
	void enterTypeArray(MicroCParser.TypeArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#typeArray}.
	 * @param ctx the parse tree
	 */
	void exitTypeArray(MicroCParser.TypeArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#typeInt}.
	 * @param ctx the parse tree
	 */
	void enterTypeInt(MicroCParser.TypeIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#typeInt}.
	 * @param ctx the parse tree
	 */
	void exitTypeInt(MicroCParser.TypeIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroCParser#typeRecord}.
	 * @param ctx the parse tree
	 */
	void enterTypeRecord(MicroCParser.TypeRecordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroCParser#typeRecord}.
	 * @param ctx the parse tree
	 */
	void exitTypeRecord(MicroCParser.TypeRecordContext ctx);
}
// Generated from C:/Users/kjj.ITMDKLT105/IdeaProjects/PAnal/src/main/java/antlr\MicroC.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MicroCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TYPEINT=1, FST=2, SND=3, PLUS=4, MINUS=5, TIMES=6, DIVIDE=7, MODULU=8, 
		LESSTHAN=9, GREATERTHAN=10, LESSTHANOREQUAL=11, GREATERTHANOREQUAL=12, 
		EQUALS=13, NOTEQUALS=14, NOT=15, AND=16, OR=17, SEMICOLON=18, COLON=19, 
		EQUAL=20, DOT=21, COMMA=22, ROUNDOPEN=23, ROUNDCLOSE=24, SQUAREOPEN=25, 
		SQUARECLOSE=26, CURLYOPEN=27, CURLYCLOSE=28, TRUE=29, FALSE=30, IF=31, 
		ELSE=32, WHILE=33, READ=34, WRITE=35, BREAK=36, CONTINUE=37, IDENT=38, 
		INT=39, WHITESPACE=40;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_statementAssign = 3, 
		RULE_statementAssignRecord = 4, RULE_statementIf = 5, RULE_statementWhile = 6, 
		RULE_statementRead = 7, RULE_statementWrite = 8, RULE_statementBreak = 9, 
		RULE_statementContinue = 10, RULE_identifier = 11, RULE_identifierInt = 12, 
		RULE_identifierArray = 13, RULE_identifierRecordFst = 14, RULE_identifierRecordSND = 15, 
		RULE_expression = 16, RULE_expressionNumeric = 17, RULE_expressionBoolean = 18, 
		RULE_expressionIdentifier = 19, RULE_expressionConstantInteger = 20, RULE_expressionNumericCompare = 21, 
		RULE_operatorNumeric = 22, RULE_operatorCompare = 23, RULE_operatorBool = 24, 
		RULE_varDeclaration = 25, RULE_variable = 26, RULE_type = 27, RULE_typeBasic = 28, 
		RULE_typeArray = 29, RULE_typeInt = 30, RULE_typeRecord = 31;
	public static final String[] ruleNames = {
		"program", "block", "statement", "statementAssign", "statementAssignRecord", 
		"statementIf", "statementWhile", "statementRead", "statementWrite", "statementBreak", 
		"statementContinue", "identifier", "identifierInt", "identifierArray", 
		"identifierRecordFst", "identifierRecordSND", "expression", "expressionNumeric", 
		"expressionBoolean", "expressionIdentifier", "expressionConstantInteger", 
		"expressionNumericCompare", "operatorNumeric", "operatorCompare", "operatorBool", 
		"varDeclaration", "variable", "type", "typeBasic", "typeArray", "typeInt", 
		"typeRecord"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'fst'", "'snd'", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", 
		"'>'", null, null, "'=='", "'!='", "'!'", "'&'", "'|'", "';'", "':'", 
		"'='", "'.'", "','", "'('", "')'", "'['", "']'", "'{'", "'}'", "'true'", 
		"'false'", "'if'", "'else'", "'while'", "'read'", "'write'", "'break'", 
		"'continue'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "TYPEINT", "FST", "SND", "PLUS", "MINUS", "TIMES", "DIVIDE", "MODULU", 
		"LESSTHAN", "GREATERTHAN", "LESSTHANOREQUAL", "GREATERTHANOREQUAL", "EQUALS", 
		"NOTEQUALS", "NOT", "AND", "OR", "SEMICOLON", "COLON", "EQUAL", "DOT", 
		"COMMA", "ROUNDOPEN", "ROUNDCLOSE", "SQUAREOPEN", "SQUARECLOSE", "CURLYOPEN", 
		"CURLYCLOSE", "TRUE", "FALSE", "IF", "ELSE", "WHILE", "READ", "WRITE", 
		"BREAK", "CONTINUE", "IDENT", "INT", "WHITESPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MicroC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MicroCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode CURLYOPEN() { return getToken(MicroCParser.CURLYOPEN, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(MicroCParser.CURLYCLOSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(CURLYOPEN);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPEINT) | (1L << CURLYOPEN) | (1L << IF) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << BREAK) | (1L << CONTINUE) | (1L << IDENT))) != 0)) {
				{
				{
				setState(67);
				statement();
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public StatementAssignContext statementAssign() {
			return getRuleContext(StatementAssignContext.class,0);
		}
		public StatementAssignRecordContext statementAssignRecord() {
			return getRuleContext(StatementAssignRecordContext.class,0);
		}
		public StatementIfContext statementIf() {
			return getRuleContext(StatementIfContext.class,0);
		}
		public StatementWhileContext statementWhile() {
			return getRuleContext(StatementWhileContext.class,0);
		}
		public StatementReadContext statementRead() {
			return getRuleContext(StatementReadContext.class,0);
		}
		public StatementWriteContext statementWrite() {
			return getRuleContext(StatementWriteContext.class,0);
		}
		public StatementBreakContext statementBreak() {
			return getRuleContext(StatementBreakContext.class,0);
		}
		public StatementContinueContext statementContinue() {
			return getRuleContext(StatementContinueContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				varDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				statementAssign();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				statementAssignRecord();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				statementIf();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				statementWhile();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(81);
				statementRead();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(82);
				statementWrite();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(83);
				statementBreak();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(84);
				statementContinue();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementAssignContext extends ParserRuleContext {
		public IdentifierContext lhs;
		public ExpressionContext rhs;
		public TerminalNode COLON() { return getToken(MicroCParser.COLON, 0); }
		public TerminalNode EQUAL() { return getToken(MicroCParser.EQUAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(MicroCParser.SEMICOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterStatementAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitStatementAssign(this);
		}
	}

	public final StatementAssignContext statementAssign() throws RecognitionException {
		StatementAssignContext _localctx = new StatementAssignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statementAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			((StatementAssignContext)_localctx).lhs = identifier();
			setState(88);
			match(COLON);
			setState(89);
			match(EQUAL);
			setState(90);
			((StatementAssignContext)_localctx).rhs = expression();
			setState(91);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementAssignRecordContext extends ParserRuleContext {
		public IdentifierContext lhs;
		public ExpressionNumericContext fst;
		public ExpressionNumericContext snd;
		public TerminalNode COLON() { return getToken(MicroCParser.COLON, 0); }
		public TerminalNode EQUAL() { return getToken(MicroCParser.EQUAL, 0); }
		public TerminalNode ROUNDOPEN() { return getToken(MicroCParser.ROUNDOPEN, 0); }
		public TerminalNode COMMA() { return getToken(MicroCParser.COMMA, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MicroCParser.ROUNDCLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(MicroCParser.SEMICOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionNumericContext> expressionNumeric() {
			return getRuleContexts(ExpressionNumericContext.class);
		}
		public ExpressionNumericContext expressionNumeric(int i) {
			return getRuleContext(ExpressionNumericContext.class,i);
		}
		public StatementAssignRecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementAssignRecord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterStatementAssignRecord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitStatementAssignRecord(this);
		}
	}

	public final StatementAssignRecordContext statementAssignRecord() throws RecognitionException {
		StatementAssignRecordContext _localctx = new StatementAssignRecordContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statementAssignRecord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			((StatementAssignRecordContext)_localctx).lhs = identifier();
			setState(94);
			match(COLON);
			setState(95);
			match(EQUAL);
			setState(96);
			match(ROUNDOPEN);
			setState(97);
			((StatementAssignRecordContext)_localctx).fst = expressionNumeric(0);
			setState(98);
			match(COMMA);
			setState(99);
			((StatementAssignRecordContext)_localctx).snd = expressionNumeric(0);
			setState(100);
			match(ROUNDCLOSE);
			setState(101);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementIfContext extends ParserRuleContext {
		public ExpressionBooleanContext condition;
		public BlockContext ifBlock;
		public BlockContext elseBlock;
		public TerminalNode IF() { return getToken(MicroCParser.IF, 0); }
		public TerminalNode ROUNDOPEN() { return getToken(MicroCParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MicroCParser.ROUNDCLOSE, 0); }
		public ExpressionBooleanContext expressionBoolean() {
			return getRuleContext(ExpressionBooleanContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MicroCParser.ELSE, 0); }
		public StatementIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterStatementIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitStatementIf(this);
		}
	}

	public final StatementIfContext statementIf() throws RecognitionException {
		StatementIfContext _localctx = new StatementIfContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statementIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(IF);
			setState(104);
			match(ROUNDOPEN);
			setState(105);
			((StatementIfContext)_localctx).condition = expressionBoolean(0);
			setState(106);
			match(ROUNDCLOSE);
			setState(107);
			((StatementIfContext)_localctx).ifBlock = block();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(108);
				match(ELSE);
				setState(109);
				((StatementIfContext)_localctx).elseBlock = block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementWhileContext extends ParserRuleContext {
		public ExpressionBooleanContext condition;
		public BlockContext whileBlock;
		public TerminalNode WHILE() { return getToken(MicroCParser.WHILE, 0); }
		public TerminalNode ROUNDOPEN() { return getToken(MicroCParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MicroCParser.ROUNDCLOSE, 0); }
		public ExpressionBooleanContext expressionBoolean() {
			return getRuleContext(ExpressionBooleanContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterStatementWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitStatementWhile(this);
		}
	}

	public final StatementWhileContext statementWhile() throws RecognitionException {
		StatementWhileContext _localctx = new StatementWhileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statementWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(WHILE);
			setState(113);
			match(ROUNDOPEN);
			setState(114);
			((StatementWhileContext)_localctx).condition = expressionBoolean(0);
			setState(115);
			match(ROUNDCLOSE);
			setState(116);
			((StatementWhileContext)_localctx).whileBlock = block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementReadContext extends ParserRuleContext {
		public IdentifierContext var;
		public TerminalNode READ() { return getToken(MicroCParser.READ, 0); }
		public TerminalNode SEMICOLON() { return getToken(MicroCParser.SEMICOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StatementReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterStatementRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitStatementRead(this);
		}
	}

	public final StatementReadContext statementRead() throws RecognitionException {
		StatementReadContext _localctx = new StatementReadContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statementRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(READ);
			setState(119);
			((StatementReadContext)_localctx).var = identifier();
			setState(120);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementWriteContext extends ParserRuleContext {
		public ExpressionContext ex;
		public TerminalNode WRITE() { return getToken(MicroCParser.WRITE, 0); }
		public TerminalNode SEMICOLON() { return getToken(MicroCParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementWriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWrite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterStatementWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitStatementWrite(this);
		}
	}

	public final StatementWriteContext statementWrite() throws RecognitionException {
		StatementWriteContext _localctx = new StatementWriteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statementWrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(WRITE);
			setState(123);
			((StatementWriteContext)_localctx).ex = expression();
			setState(124);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementBreakContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(MicroCParser.BREAK, 0); }
		public TerminalNode SEMICOLON() { return getToken(MicroCParser.SEMICOLON, 0); }
		public StatementBreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBreak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterStatementBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitStatementBreak(this);
		}
	}

	public final StatementBreakContext statementBreak() throws RecognitionException {
		StatementBreakContext _localctx = new StatementBreakContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statementBreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(BREAK);
			setState(127);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContinueContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(MicroCParser.CONTINUE, 0); }
		public TerminalNode SEMICOLON() { return getToken(MicroCParser.SEMICOLON, 0); }
		public StatementContinueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementContinue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterStatementContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitStatementContinue(this);
		}
	}

	public final StatementContinueContext statementContinue() throws RecognitionException {
		StatementContinueContext _localctx = new StatementContinueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statementContinue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(CONTINUE);
			setState(130);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierIntContext identifierInt() {
			return getRuleContext(IdentifierIntContext.class,0);
		}
		public IdentifierArrayContext identifierArray() {
			return getRuleContext(IdentifierArrayContext.class,0);
		}
		public IdentifierRecordFstContext identifierRecordFst() {
			return getRuleContext(IdentifierRecordFstContext.class,0);
		}
		public IdentifierRecordSNDContext identifierRecordSND() {
			return getRuleContext(IdentifierRecordSNDContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_identifier);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				identifierInt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				identifierArray();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				identifierRecordFst();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				identifierRecordSND();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierIntContext extends ParserRuleContext {
		public Token name;
		public TerminalNode IDENT() { return getToken(MicroCParser.IDENT, 0); }
		public IdentifierIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterIdentifierInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitIdentifierInt(this);
		}
	}

	public final IdentifierIntContext identifierInt() throws RecognitionException {
		IdentifierIntContext _localctx = new IdentifierIntContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_identifierInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			((IdentifierIntContext)_localctx).name = match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierArrayContext extends ParserRuleContext {
		public Token name;
		public ExpressionNumericContext element;
		public TerminalNode SQUAREOPEN() { return getToken(MicroCParser.SQUAREOPEN, 0); }
		public TerminalNode SQUARECLOSE() { return getToken(MicroCParser.SQUARECLOSE, 0); }
		public TerminalNode IDENT() { return getToken(MicroCParser.IDENT, 0); }
		public ExpressionNumericContext expressionNumeric() {
			return getRuleContext(ExpressionNumericContext.class,0);
		}
		public IdentifierArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterIdentifierArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitIdentifierArray(this);
		}
	}

	public final IdentifierArrayContext identifierArray() throws RecognitionException {
		IdentifierArrayContext _localctx = new IdentifierArrayContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_identifierArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			((IdentifierArrayContext)_localctx).name = match(IDENT);
			setState(141);
			match(SQUAREOPEN);
			setState(142);
			((IdentifierArrayContext)_localctx).element = expressionNumeric(0);
			setState(143);
			match(SQUARECLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierRecordFstContext extends ParserRuleContext {
		public Token name;
		public TerminalNode DOT() { return getToken(MicroCParser.DOT, 0); }
		public TerminalNode FST() { return getToken(MicroCParser.FST, 0); }
		public TerminalNode IDENT() { return getToken(MicroCParser.IDENT, 0); }
		public IdentifierRecordFstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierRecordFst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterIdentifierRecordFst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitIdentifierRecordFst(this);
		}
	}

	public final IdentifierRecordFstContext identifierRecordFst() throws RecognitionException {
		IdentifierRecordFstContext _localctx = new IdentifierRecordFstContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_identifierRecordFst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			((IdentifierRecordFstContext)_localctx).name = match(IDENT);
			setState(146);
			match(DOT);
			setState(147);
			match(FST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierRecordSNDContext extends ParserRuleContext {
		public Token name;
		public TerminalNode DOT() { return getToken(MicroCParser.DOT, 0); }
		public TerminalNode SND() { return getToken(MicroCParser.SND, 0); }
		public TerminalNode IDENT() { return getToken(MicroCParser.IDENT, 0); }
		public IdentifierRecordSNDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierRecordSND; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterIdentifierRecordSND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitIdentifierRecordSND(this);
		}
	}

	public final IdentifierRecordSNDContext identifierRecordSND() throws RecognitionException {
		IdentifierRecordSNDContext _localctx = new IdentifierRecordSNDContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_identifierRecordSND);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			((IdentifierRecordSNDContext)_localctx).name = match(IDENT);
			setState(150);
			match(DOT);
			setState(151);
			match(SND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionNumericContext expressionNumeric() {
			return getRuleContext(ExpressionNumericContext.class,0);
		}
		public ExpressionBooleanContext expressionBoolean() {
			return getRuleContext(ExpressionBooleanContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				expressionNumeric(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				expressionBoolean(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionNumericContext extends ParserRuleContext {
		public ExpressionNumericContext lhs;
		public OperatorNumericContext op;
		public ExpressionNumericContext rhs;
		public ExpressionIdentifierContext expressionIdentifier() {
			return getRuleContext(ExpressionIdentifierContext.class,0);
		}
		public ExpressionConstantIntegerContext expressionConstantInteger() {
			return getRuleContext(ExpressionConstantIntegerContext.class,0);
		}
		public List<ExpressionNumericContext> expressionNumeric() {
			return getRuleContexts(ExpressionNumericContext.class);
		}
		public ExpressionNumericContext expressionNumeric(int i) {
			return getRuleContext(ExpressionNumericContext.class,i);
		}
		public OperatorNumericContext operatorNumeric() {
			return getRuleContext(OperatorNumericContext.class,0);
		}
		public ExpressionNumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionNumeric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterExpressionNumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitExpressionNumeric(this);
		}
	}

	public final ExpressionNumericContext expressionNumeric() throws RecognitionException {
		return expressionNumeric(0);
	}

	private ExpressionNumericContext expressionNumeric(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionNumericContext _localctx = new ExpressionNumericContext(_ctx, _parentState);
		ExpressionNumericContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expressionNumeric, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(158);
				expressionIdentifier();
				}
				break;
			case INT:
				{
				setState(159);
				expressionConstantInteger();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionNumericContext(_parentctx, _parentState);
					_localctx.lhs = _prevctx;
					_localctx.lhs = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expressionNumeric);
					setState(162);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(163);
					((ExpressionNumericContext)_localctx).op = operatorNumeric();
					setState(164);
					((ExpressionNumericContext)_localctx).rhs = expressionNumeric(2);
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionBooleanContext extends ParserRuleContext {
		public ExpressionBooleanContext eblhs;
		public ExpressionBooleanContext nrhs;
		public OperatorBoolContext op;
		public ExpressionBooleanContext ebrhs;
		public TerminalNode TRUE() { return getToken(MicroCParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MicroCParser.FALSE, 0); }
		public ExpressionNumericCompareContext expressionNumericCompare() {
			return getRuleContext(ExpressionNumericCompareContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MicroCParser.NOT, 0); }
		public List<ExpressionBooleanContext> expressionBoolean() {
			return getRuleContexts(ExpressionBooleanContext.class);
		}
		public ExpressionBooleanContext expressionBoolean(int i) {
			return getRuleContext(ExpressionBooleanContext.class,i);
		}
		public OperatorBoolContext operatorBool() {
			return getRuleContext(OperatorBoolContext.class,0);
		}
		public ExpressionBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionBoolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterExpressionBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitExpressionBoolean(this);
		}
	}

	public final ExpressionBooleanContext expressionBoolean() throws RecognitionException {
		return expressionBoolean(0);
	}

	private ExpressionBooleanContext expressionBoolean(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionBooleanContext _localctx = new ExpressionBooleanContext(_ctx, _parentState);
		ExpressionBooleanContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expressionBoolean, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				{
				setState(172);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(173);
				match(FALSE);
				}
				break;
			case IDENT:
			case INT:
				{
				setState(174);
				expressionNumericCompare();
				}
				break;
			case NOT:
				{
				setState(175);
				match(NOT);
				setState(176);
				((ExpressionBooleanContext)_localctx).nrhs = expressionBoolean(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionBooleanContext(_parentctx, _parentState);
					_localctx.eblhs = _prevctx;
					_localctx.eblhs = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expressionBoolean);
					setState(179);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(180);
					((ExpressionBooleanContext)_localctx).op = operatorBool();
					setState(181);
					((ExpressionBooleanContext)_localctx).ebrhs = expressionBoolean(3);
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionIdentifierContext extends ParserRuleContext {
		public IdentifierContext ident;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterExpressionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitExpressionIdentifier(this);
		}
	}

	public final ExpressionIdentifierContext expressionIdentifier() throws RecognitionException {
		ExpressionIdentifierContext _localctx = new ExpressionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			((ExpressionIdentifierContext)_localctx).ident = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionConstantIntegerContext extends ParserRuleContext {
		public Token value;
		public TerminalNode INT() { return getToken(MicroCParser.INT, 0); }
		public ExpressionConstantIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterExpressionConstantInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitExpressionConstantInteger(this);
		}
	}

	public final ExpressionConstantIntegerContext expressionConstantInteger() throws RecognitionException {
		ExpressionConstantIntegerContext _localctx = new ExpressionConstantIntegerContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expressionConstantInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			((ExpressionConstantIntegerContext)_localctx).value = match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionNumericCompareContext extends ParserRuleContext {
		public ExpressionNumericContext lhs;
		public OperatorCompareContext op;
		public ExpressionNumericContext rhs;
		public List<ExpressionNumericContext> expressionNumeric() {
			return getRuleContexts(ExpressionNumericContext.class);
		}
		public ExpressionNumericContext expressionNumeric(int i) {
			return getRuleContext(ExpressionNumericContext.class,i);
		}
		public OperatorCompareContext operatorCompare() {
			return getRuleContext(OperatorCompareContext.class,0);
		}
		public ExpressionNumericCompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionNumericCompare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterExpressionNumericCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitExpressionNumericCompare(this);
		}
	}

	public final ExpressionNumericCompareContext expressionNumericCompare() throws RecognitionException {
		ExpressionNumericCompareContext _localctx = new ExpressionNumericCompareContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressionNumericCompare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			((ExpressionNumericCompareContext)_localctx).lhs = expressionNumeric(0);
			setState(193);
			((ExpressionNumericCompareContext)_localctx).op = operatorCompare();
			setState(194);
			((ExpressionNumericCompareContext)_localctx).rhs = expressionNumeric(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorNumericContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(MicroCParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MicroCParser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(MicroCParser.TIMES, 0); }
		public TerminalNode DIVIDE() { return getToken(MicroCParser.DIVIDE, 0); }
		public TerminalNode MODULU() { return getToken(MicroCParser.MODULU, 0); }
		public OperatorNumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorNumeric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterOperatorNumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitOperatorNumeric(this);
		}
	}

	public final OperatorNumericContext operatorNumeric() throws RecognitionException {
		OperatorNumericContext _localctx = new OperatorNumericContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_operatorNumeric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TIMES) | (1L << DIVIDE) | (1L << MODULU))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorCompareContext extends ParserRuleContext {
		public TerminalNode LESSTHAN() { return getToken(MicroCParser.LESSTHAN, 0); }
		public TerminalNode GREATERTHAN() { return getToken(MicroCParser.GREATERTHAN, 0); }
		public TerminalNode LESSTHANOREQUAL() { return getToken(MicroCParser.LESSTHANOREQUAL, 0); }
		public TerminalNode GREATERTHANOREQUAL() { return getToken(MicroCParser.GREATERTHANOREQUAL, 0); }
		public TerminalNode EQUALS() { return getToken(MicroCParser.EQUALS, 0); }
		public TerminalNode NOTEQUALS() { return getToken(MicroCParser.NOTEQUALS, 0); }
		public OperatorCompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorCompare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterOperatorCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitOperatorCompare(this);
		}
	}

	public final OperatorCompareContext operatorCompare() throws RecognitionException {
		OperatorCompareContext _localctx = new OperatorCompareContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_operatorCompare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESSTHAN) | (1L << GREATERTHAN) | (1L << LESSTHANOREQUAL) | (1L << GREATERTHANOREQUAL) | (1L << EQUALS) | (1L << NOTEQUALS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorBoolContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(MicroCParser.AND, 0); }
		public TerminalNode OR() { return getToken(MicroCParser.OR, 0); }
		public OperatorBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorBool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterOperatorBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitOperatorBool(this);
		}
	}

	public final OperatorBoolContext operatorBool() throws RecognitionException {
		OperatorBoolContext _localctx = new OperatorBoolContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_operatorBool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclarationContext extends ParserRuleContext {
		public VariableContext var;
		public TerminalNode SEMICOLON() { return getToken(MicroCParser.SEMICOLON, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			((VarDeclarationContext)_localctx).var = variable();
			setState(203);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public Token variableName;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MicroCParser.IDENT, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			type();
			setState(206);
			((VariableContext)_localctx).variableName = match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeBasicContext typeBasic() {
			return getRuleContext(TypeBasicContext.class,0);
		}
		public TypeArrayContext typeArray() {
			return getRuleContext(TypeArrayContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_type);
		try {
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				typeBasic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				typeArray();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBasicContext extends ParserRuleContext {
		public TypeIntContext typeInt() {
			return getRuleContext(TypeIntContext.class,0);
		}
		public TypeRecordContext typeRecord() {
			return getRuleContext(TypeRecordContext.class,0);
		}
		public TypeBasicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBasic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterTypeBasic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitTypeBasic(this);
		}
	}

	public final TypeBasicContext typeBasic() throws RecognitionException {
		TypeBasicContext _localctx = new TypeBasicContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_typeBasic);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPEINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				typeInt();
				}
				break;
			case CURLYOPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				typeRecord();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArrayContext extends ParserRuleContext {
		public ExpressionNumericContext value;
		public TypeBasicContext typeBasic() {
			return getRuleContext(TypeBasicContext.class,0);
		}
		public TerminalNode SQUAREOPEN() { return getToken(MicroCParser.SQUAREOPEN, 0); }
		public TerminalNode SQUARECLOSE() { return getToken(MicroCParser.SQUARECLOSE, 0); }
		public ExpressionNumericContext expressionNumeric() {
			return getRuleContext(ExpressionNumericContext.class,0);
		}
		public TypeArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterTypeArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitTypeArray(this);
		}
	}

	public final TypeArrayContext typeArray() throws RecognitionException {
		TypeArrayContext _localctx = new TypeArrayContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typeArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			typeBasic();
			setState(217);
			match(SQUAREOPEN);
			setState(218);
			((TypeArrayContext)_localctx).value = expressionNumeric(0);
			setState(219);
			match(SQUARECLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeIntContext extends ParserRuleContext {
		public TerminalNode TYPEINT() { return getToken(MicroCParser.TYPEINT, 0); }
		public TypeIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterTypeInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitTypeInt(this);
		}
	}

	public final TypeIntContext typeInt() throws RecognitionException {
		TypeIntContext _localctx = new TypeIntContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typeInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(TYPEINT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeRecordContext extends ParserRuleContext {
		public TerminalNode CURLYOPEN() { return getToken(MicroCParser.CURLYOPEN, 0); }
		public List<TerminalNode> TYPEINT() { return getTokens(MicroCParser.TYPEINT); }
		public TerminalNode TYPEINT(int i) {
			return getToken(MicroCParser.TYPEINT, i);
		}
		public TerminalNode FST() { return getToken(MicroCParser.FST, 0); }
		public TerminalNode SEMICOLON() { return getToken(MicroCParser.SEMICOLON, 0); }
		public TerminalNode SND() { return getToken(MicroCParser.SND, 0); }
		public TerminalNode CURLYCLOSE() { return getToken(MicroCParser.CURLYCLOSE, 0); }
		public TypeRecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeRecord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterTypeRecord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitTypeRecord(this);
		}
	}

	public final TypeRecordContext typeRecord() throws RecognitionException {
		TypeRecordContext _localctx = new TypeRecordContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_typeRecord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(CURLYOPEN);
			setState(224);
			match(TYPEINT);
			setState(225);
			match(FST);
			setState(226);
			match(SEMICOLON);
			setState(227);
			match(TYPEINT);
			setState(228);
			match(SND);
			setState(229);
			match(CURLYCLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return expressionNumeric_sempred((ExpressionNumericContext)_localctx, predIndex);
		case 18:
			return expressionBoolean_sempred((ExpressionBooleanContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressionNumeric_sempred(ExpressionNumericContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expressionBoolean_sempred(ExpressionBooleanContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00ea\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\7\3G\n\3\f\3\16\3J\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4X\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7q\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u008b\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\5\22\u009e\n\22"+
		"\3\23\3\23\3\23\5\23\u00a3\n\23\3\23\3\23\3\23\3\23\7\23\u00a9\n\23\f"+
		"\23\16\23\u00ac\13\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00b4\n\24\3"+
		"\24\3\24\3\24\3\24\7\24\u00ba\n\24\f\24\16\24\u00bd\13\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\35\3\35\5\35\u00d5\n\35\3\36\3\36\5\36\u00d9\n\36"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\2\4$&\"\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\5\3\2"+
		"\6\n\3\2\13\20\3\2\22\23\2\u00e0\2B\3\2\2\2\4D\3\2\2\2\6W\3\2\2\2\bY\3"+
		"\2\2\2\n_\3\2\2\2\fi\3\2\2\2\16r\3\2\2\2\20x\3\2\2\2\22|\3\2\2\2\24\u0080"+
		"\3\2\2\2\26\u0083\3\2\2\2\30\u008a\3\2\2\2\32\u008c\3\2\2\2\34\u008e\3"+
		"\2\2\2\36\u0093\3\2\2\2 \u0097\3\2\2\2\"\u009d\3\2\2\2$\u00a2\3\2\2\2"+
		"&\u00b3\3\2\2\2(\u00be\3\2\2\2*\u00c0\3\2\2\2,\u00c2\3\2\2\2.\u00c6\3"+
		"\2\2\2\60\u00c8\3\2\2\2\62\u00ca\3\2\2\2\64\u00cc\3\2\2\2\66\u00cf\3\2"+
		"\2\28\u00d4\3\2\2\2:\u00d8\3\2\2\2<\u00da\3\2\2\2>\u00df\3\2\2\2@\u00e1"+
		"\3\2\2\2BC\5\4\3\2C\3\3\2\2\2DH\7\35\2\2EG\5\6\4\2FE\3\2\2\2GJ\3\2\2\2"+
		"HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7\36\2\2L\5\3\2\2\2MX\5\4\3"+
		"\2NX\5\64\33\2OX\5\b\5\2PX\5\n\6\2QX\5\f\7\2RX\5\16\b\2SX\5\20\t\2TX\5"+
		"\22\n\2UX\5\24\13\2VX\5\26\f\2WM\3\2\2\2WN\3\2\2\2WO\3\2\2\2WP\3\2\2\2"+
		"WQ\3\2\2\2WR\3\2\2\2WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\7\3\2\2"+
		"\2YZ\5\30\r\2Z[\7\25\2\2[\\\7\26\2\2\\]\5\"\22\2]^\7\24\2\2^\t\3\2\2\2"+
		"_`\5\30\r\2`a\7\25\2\2ab\7\26\2\2bc\7\31\2\2cd\5$\23\2de\7\30\2\2ef\5"+
		"$\23\2fg\7\32\2\2gh\7\24\2\2h\13\3\2\2\2ij\7!\2\2jk\7\31\2\2kl\5&\24\2"+
		"lm\7\32\2\2mp\5\4\3\2no\7\"\2\2oq\5\4\3\2pn\3\2\2\2pq\3\2\2\2q\r\3\2\2"+
		"\2rs\7#\2\2st\7\31\2\2tu\5&\24\2uv\7\32\2\2vw\5\4\3\2w\17\3\2\2\2xy\7"+
		"$\2\2yz\5\30\r\2z{\7\24\2\2{\21\3\2\2\2|}\7%\2\2}~\5\"\22\2~\177\7\24"+
		"\2\2\177\23\3\2\2\2\u0080\u0081\7&\2\2\u0081\u0082\7\24\2\2\u0082\25\3"+
		"\2\2\2\u0083\u0084\7\'\2\2\u0084\u0085\7\24\2\2\u0085\27\3\2\2\2\u0086"+
		"\u008b\5\32\16\2\u0087\u008b\5\34\17\2\u0088\u008b\5\36\20\2\u0089\u008b"+
		"\5 \21\2\u008a\u0086\3\2\2\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u0089\3\2\2\2\u008b\31\3\2\2\2\u008c\u008d\7(\2\2\u008d\33\3\2\2\2\u008e"+
		"\u008f\7(\2\2\u008f\u0090\7\33\2\2\u0090\u0091\5$\23\2\u0091\u0092\7\34"+
		"\2\2\u0092\35\3\2\2\2\u0093\u0094\7(\2\2\u0094\u0095\7\27\2\2\u0095\u0096"+
		"\7\4\2\2\u0096\37\3\2\2\2\u0097\u0098\7(\2\2\u0098\u0099\7\27\2\2\u0099"+
		"\u009a\7\5\2\2\u009a!\3\2\2\2\u009b\u009e\5$\23\2\u009c\u009e\5&\24\2"+
		"\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e#\3\2\2\2\u009f\u00a0\b"+
		"\23\1\2\u00a0\u00a3\5(\25\2\u00a1\u00a3\5*\26\2\u00a2\u009f\3\2\2\2\u00a2"+
		"\u00a1\3\2\2\2\u00a3\u00aa\3\2\2\2\u00a4\u00a5\f\3\2\2\u00a5\u00a6\5."+
		"\30\2\u00a6\u00a7\5$\23\4\u00a7\u00a9\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a9"+
		"\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab%\3\2\2\2"+
		"\u00ac\u00aa\3\2\2\2\u00ad\u00ae\b\24\1\2\u00ae\u00b4\7\37\2\2\u00af\u00b4"+
		"\7 \2\2\u00b0\u00b4\5,\27\2\u00b1\u00b2\7\21\2\2\u00b2\u00b4\5&\24\3\u00b3"+
		"\u00ad\3\2\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b4\u00bb\3\2\2\2\u00b5\u00b6\f\4\2\2\u00b6\u00b7\5\62\32\2\u00b7"+
		"\u00b8\5&\24\5\u00b8\u00ba\3\2\2\2\u00b9\u00b5\3\2\2\2\u00ba\u00bd\3\2"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\'\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00be\u00bf\5\30\r\2\u00bf)\3\2\2\2\u00c0\u00c1\7)\2\2\u00c1"+
		"+\3\2\2\2\u00c2\u00c3\5$\23\2\u00c3\u00c4\5\60\31\2\u00c4\u00c5\5$\23"+
		"\2\u00c5-\3\2\2\2\u00c6\u00c7\t\2\2\2\u00c7/\3\2\2\2\u00c8\u00c9\t\3\2"+
		"\2\u00c9\61\3\2\2\2\u00ca\u00cb\t\4\2\2\u00cb\63\3\2\2\2\u00cc\u00cd\5"+
		"\66\34\2\u00cd\u00ce\7\24\2\2\u00ce\65\3\2\2\2\u00cf\u00d0\58\35\2\u00d0"+
		"\u00d1\7(\2\2\u00d1\67\3\2\2\2\u00d2\u00d5\5:\36\2\u00d3\u00d5\5<\37\2"+
		"\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d59\3\2\2\2\u00d6\u00d9\5"+
		"> \2\u00d7\u00d9\5@!\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9;"+
		"\3\2\2\2\u00da\u00db\5:\36\2\u00db\u00dc\7\33\2\2\u00dc\u00dd\5$\23\2"+
		"\u00dd\u00de\7\34\2\2\u00de=\3\2\2\2\u00df\u00e0\7\3\2\2\u00e0?\3\2\2"+
		"\2\u00e1\u00e2\7\35\2\2\u00e2\u00e3\7\3\2\2\u00e3\u00e4\7\4\2\2\u00e4"+
		"\u00e5\7\24\2\2\u00e5\u00e6\7\3\2\2\u00e6\u00e7\7\5\2\2\u00e7\u00e8\7"+
		"\36\2\2\u00e8A\3\2\2\2\rHWp\u008a\u009d\u00a2\u00aa\u00b3\u00bb\u00d4"+
		"\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
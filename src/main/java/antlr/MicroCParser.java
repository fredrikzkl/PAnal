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
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				statementAssign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				statementAssignRecord();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				statementIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				statementWhile();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				statementRead();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(81);
				statementWrite();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(82);
				statementBreak();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(83);
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
			setState(86);
			((StatementAssignContext)_localctx).lhs = identifier();
			setState(87);
			match(COLON);
			setState(88);
			match(EQUAL);
			setState(89);
			((StatementAssignContext)_localctx).rhs = expression();
			setState(90);
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
			setState(92);
			((StatementAssignRecordContext)_localctx).lhs = identifier();
			setState(93);
			match(COLON);
			setState(94);
			match(EQUAL);
			setState(95);
			match(ROUNDOPEN);
			setState(96);
			((StatementAssignRecordContext)_localctx).fst = expressionNumeric(0);
			setState(97);
			match(COMMA);
			setState(98);
			((StatementAssignRecordContext)_localctx).snd = expressionNumeric(0);
			setState(99);
			match(ROUNDCLOSE);
			setState(100);
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
			setState(102);
			match(IF);
			setState(103);
			match(ROUNDOPEN);
			setState(104);
			((StatementIfContext)_localctx).condition = expressionBoolean(0);
			setState(105);
			match(ROUNDCLOSE);
			setState(106);
			((StatementIfContext)_localctx).ifBlock = block();
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(107);
				match(ELSE);
				setState(108);
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
			setState(111);
			match(WHILE);
			setState(112);
			match(ROUNDOPEN);
			setState(113);
			((StatementWhileContext)_localctx).condition = expressionBoolean(0);
			setState(114);
			match(ROUNDCLOSE);
			setState(115);
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
			setState(117);
			match(READ);
			setState(118);
			((StatementReadContext)_localctx).var = identifier();
			setState(119);
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
			setState(121);
			match(WRITE);
			setState(122);
			((StatementWriteContext)_localctx).ex = expression();
			setState(123);
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
			setState(125);
			match(BREAK);
			setState(126);
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
			setState(128);
			match(CONTINUE);
			setState(129);
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
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				identifierInt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				identifierArray();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				identifierRecordFst();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
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
			setState(137);
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
			setState(139);
			((IdentifierArrayContext)_localctx).name = match(IDENT);
			setState(140);
			match(SQUAREOPEN);
			setState(141);
			((IdentifierArrayContext)_localctx).element = expressionNumeric(0);
			setState(142);
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
			setState(144);
			((IdentifierRecordFstContext)_localctx).name = match(IDENT);
			setState(145);
			match(DOT);
			setState(146);
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
			setState(148);
			((IdentifierRecordSNDContext)_localctx).name = match(IDENT);
			setState(149);
			match(DOT);
			setState(150);
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
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				expressionNumeric(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
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
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(157);
				expressionIdentifier();
				}
				break;
			case INT:
				{
				setState(158);
				expressionConstantInteger();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
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
					setState(161);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(162);
					((ExpressionNumericContext)_localctx).op = operatorNumeric();
					setState(163);
					((ExpressionNumericContext)_localctx).rhs = expressionNumeric(2);
					}
					} 
				}
				setState(169);
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
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				{
				setState(171);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(172);
				match(FALSE);
				}
				break;
			case IDENT:
			case INT:
				{
				setState(173);
				expressionNumericCompare();
				}
				break;
			case NOT:
				{
				setState(174);
				match(NOT);
				setState(175);
				((ExpressionBooleanContext)_localctx).nrhs = expressionBoolean(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(184);
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
					setState(178);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(179);
					((ExpressionBooleanContext)_localctx).op = operatorBool();
					setState(180);
					((ExpressionBooleanContext)_localctx).ebrhs = expressionBoolean(3);
					}
					} 
				}
				setState(186);
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
			setState(187);
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
			setState(189);
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
			setState(191);
			((ExpressionNumericCompareContext)_localctx).lhs = expressionNumeric(0);
			setState(192);
			((ExpressionNumericCompareContext)_localctx).op = operatorCompare();
			setState(193);
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
			setState(195);
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
			setState(197);
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
			setState(199);
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
			setState(201);
			((VarDeclarationContext)_localctx).var = variable();
			setState(202);
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
			setState(204);
			type();
			setState(205);
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
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				typeBasic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
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
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPEINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				typeInt();
				}
				break;
			case CURLYOPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
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
			setState(215);
			typeBasic();
			setState(216);
			match(SQUAREOPEN);
			setState(217);
			((TypeArrayContext)_localctx).value = expressionNumeric(0);
			setState(218);
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
			setState(220);
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
			setState(222);
			match(CURLYOPEN);
			setState(223);
			match(TYPEINT);
			setState(224);
			match(FST);
			setState(225);
			match(SEMICOLON);
			setState(226);
			match(TYPEINT);
			setState(227);
			match(SND);
			setState(228);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00e9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\7\3G\n\3\f\3\16\3J\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4W\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7p\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\5\r\u008a\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\5\22\u009d\n\22\3\23"+
		"\3\23\3\23\5\23\u00a2\n\23\3\23\3\23\3\23\3\23\7\23\u00a8\n\23\f\23\16"+
		"\23\u00ab\13\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00b3\n\24\3\24\3\24"+
		"\3\24\3\24\7\24\u00b9\n\24\f\24\16\24\u00bc\13\24\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\35\3\35\5\35\u00d4\n\35\3\36\3\36\5\36\u00d8\n\36\3\37\3"+
		"\37\3\37\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\2\4$&\"\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\5\3\2\6\n\3"+
		"\2\13\20\3\2\22\23\2\u00de\2B\3\2\2\2\4D\3\2\2\2\6V\3\2\2\2\bX\3\2\2\2"+
		"\n^\3\2\2\2\fh\3\2\2\2\16q\3\2\2\2\20w\3\2\2\2\22{\3\2\2\2\24\177\3\2"+
		"\2\2\26\u0082\3\2\2\2\30\u0089\3\2\2\2\32\u008b\3\2\2\2\34\u008d\3\2\2"+
		"\2\36\u0092\3\2\2\2 \u0096\3\2\2\2\"\u009c\3\2\2\2$\u00a1\3\2\2\2&\u00b2"+
		"\3\2\2\2(\u00bd\3\2\2\2*\u00bf\3\2\2\2,\u00c1\3\2\2\2.\u00c5\3\2\2\2\60"+
		"\u00c7\3\2\2\2\62\u00c9\3\2\2\2\64\u00cb\3\2\2\2\66\u00ce\3\2\2\28\u00d3"+
		"\3\2\2\2:\u00d7\3\2\2\2<\u00d9\3\2\2\2>\u00de\3\2\2\2@\u00e0\3\2\2\2B"+
		"C\5\4\3\2C\3\3\2\2\2DH\7\35\2\2EG\5\6\4\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2"+
		"\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7\36\2\2L\5\3\2\2\2MW\5\64\33\2NW\5"+
		"\b\5\2OW\5\n\6\2PW\5\f\7\2QW\5\16\b\2RW\5\20\t\2SW\5\22\n\2TW\5\24\13"+
		"\2UW\5\26\f\2VM\3\2\2\2VN\3\2\2\2VO\3\2\2\2VP\3\2\2\2VQ\3\2\2\2VR\3\2"+
		"\2\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\7\3\2\2\2XY\5\30\r\2YZ\7\25\2\2Z["+
		"\7\26\2\2[\\\5\"\22\2\\]\7\24\2\2]\t\3\2\2\2^_\5\30\r\2_`\7\25\2\2`a\7"+
		"\26\2\2ab\7\31\2\2bc\5$\23\2cd\7\30\2\2de\5$\23\2ef\7\32\2\2fg\7\24\2"+
		"\2g\13\3\2\2\2hi\7!\2\2ij\7\31\2\2jk\5&\24\2kl\7\32\2\2lo\5\4\3\2mn\7"+
		"\"\2\2np\5\4\3\2om\3\2\2\2op\3\2\2\2p\r\3\2\2\2qr\7#\2\2rs\7\31\2\2st"+
		"\5&\24\2tu\7\32\2\2uv\5\4\3\2v\17\3\2\2\2wx\7$\2\2xy\5\30\r\2yz\7\24\2"+
		"\2z\21\3\2\2\2{|\7%\2\2|}\5\"\22\2}~\7\24\2\2~\23\3\2\2\2\177\u0080\7"+
		"&\2\2\u0080\u0081\7\24\2\2\u0081\25\3\2\2\2\u0082\u0083\7\'\2\2\u0083"+
		"\u0084\7\24\2\2\u0084\27\3\2\2\2\u0085\u008a\5\32\16\2\u0086\u008a\5\34"+
		"\17\2\u0087\u008a\5\36\20\2\u0088\u008a\5 \21\2\u0089\u0085\3\2\2\2\u0089"+
		"\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\31\3\2\2"+
		"\2\u008b\u008c\7(\2\2\u008c\33\3\2\2\2\u008d\u008e\7(\2\2\u008e\u008f"+
		"\7\33\2\2\u008f\u0090\5$\23\2\u0090\u0091\7\34\2\2\u0091\35\3\2\2\2\u0092"+
		"\u0093\7(\2\2\u0093\u0094\7\27\2\2\u0094\u0095\7\4\2\2\u0095\37\3\2\2"+
		"\2\u0096\u0097\7(\2\2\u0097\u0098\7\27\2\2\u0098\u0099\7\5\2\2\u0099!"+
		"\3\2\2\2\u009a\u009d\5$\23\2\u009b\u009d\5&\24\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009b\3\2\2\2\u009d#\3\2\2\2\u009e\u009f\b\23\1\2\u009f\u00a2\5(\25\2"+
		"\u00a0\u00a2\5*\26\2\u00a1\u009e\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a9"+
		"\3\2\2\2\u00a3\u00a4\f\3\2\2\u00a4\u00a5\5.\30\2\u00a5\u00a6\5$\23\4\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2"+
		"\2\2\u00a9\u00aa\3\2\2\2\u00aa%\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad"+
		"\b\24\1\2\u00ad\u00b3\7\37\2\2\u00ae\u00b3\7 \2\2\u00af\u00b3\5,\27\2"+
		"\u00b0\u00b1\7\21\2\2\u00b1\u00b3\5&\24\3\u00b2\u00ac\3\2\2\2\u00b2\u00ae"+
		"\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00ba\3\2\2\2\u00b4"+
		"\u00b5\f\4\2\2\u00b5\u00b6\5\62\32\2\u00b6\u00b7\5&\24\5\u00b7\u00b9\3"+
		"\2\2\2\u00b8\u00b4\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\'\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\5\30\r"+
		"\2\u00be)\3\2\2\2\u00bf\u00c0\7)\2\2\u00c0+\3\2\2\2\u00c1\u00c2\5$\23"+
		"\2\u00c2\u00c3\5\60\31\2\u00c3\u00c4\5$\23\2\u00c4-\3\2\2\2\u00c5\u00c6"+
		"\t\2\2\2\u00c6/\3\2\2\2\u00c7\u00c8\t\3\2\2\u00c8\61\3\2\2\2\u00c9\u00ca"+
		"\t\4\2\2\u00ca\63\3\2\2\2\u00cb\u00cc\5\66\34\2\u00cc\u00cd\7\24\2\2\u00cd"+
		"\65\3\2\2\2\u00ce\u00cf\58\35\2\u00cf\u00d0\7(\2\2\u00d0\67\3\2\2\2\u00d1"+
		"\u00d4\5:\36\2\u00d2\u00d4\5<\37\2\u00d3\u00d1\3\2\2\2\u00d3\u00d2\3\2"+
		"\2\2\u00d49\3\2\2\2\u00d5\u00d8\5> \2\u00d6\u00d8\5@!\2\u00d7\u00d5\3"+
		"\2\2\2\u00d7\u00d6\3\2\2\2\u00d8;\3\2\2\2\u00d9\u00da\5:\36\2\u00da\u00db"+
		"\7\33\2\2\u00db\u00dc\5$\23\2\u00dc\u00dd\7\34\2\2\u00dd=\3\2\2\2\u00de"+
		"\u00df\7\3\2\2\u00df?\3\2\2\2\u00e0\u00e1\7\35\2\2\u00e1\u00e2\7\3\2\2"+
		"\u00e2\u00e3\7\4\2\2\u00e3\u00e4\7\24\2\2\u00e4\u00e5\7\3\2\2\u00e5\u00e6"+
		"\7\5\2\2\u00e6\u00e7\7\36\2\2\u00e7A\3\2\2\2\rHVo\u0089\u009c\u00a1\u00a9"+
		"\u00b2\u00ba\u00d3\u00d7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
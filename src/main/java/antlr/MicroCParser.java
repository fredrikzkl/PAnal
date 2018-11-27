package antlr;// Generated from C:/Users/Kaare/IdeaProjects/PAnal/src/main/antlr\MicroC.g4 by ANTLR 4.7
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
		RULE_statementContinue = 10, RULE_identifier = 11, RULE_expression = 12, 
		RULE_expressionL = 13, RULE_expressionA = 14, RULE_expressionB = 15, RULE_expressionIdentifier = 16, 
		RULE_expressionRecordFirst = 17, RULE_expressionRecordSecond = 18, RULE_expressionConstantInteger = 19, 
		RULE_expressionCompare = 20, RULE_operatorNumeric = 21, RULE_operatorCompare = 22, 
		RULE_operatorBool = 23, RULE_varDeclaration = 24, RULE_variable = 25, 
		RULE_type = 26, RULE_typeBasic = 27, RULE_typeArray = 28, RULE_typeInt = 29, 
		RULE_typeRecord = 30;
	public static final String[] ruleNames = {
		"program", "block", "statement", "statementAssign", "statementAssignRecord", 
		"statementIf", "statementWhile", "statementRead", "statementWrite", "statementBreak", 
		"statementContinue", "identifier", "expression", "expressionL", "expressionA", 
		"expressionB", "expressionIdentifier", "expressionRecordFirst", "expressionRecordSecond", 
		"expressionConstantInteger", "expressionCompare", "operatorNumeric", "operatorCompare", 
		"operatorBool", "varDeclaration", "variable", "type", "typeBasic", "typeArray", 
		"typeInt", "typeRecord"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'fst'", "'snd'", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", 
		"'>'", null, null, "'=='", "'!='", "'not'", "'&'", "'|'", "';'", "':'", 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
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
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(CURLYOPEN);
			setState(68);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(65);
					varDeclaration();
					}
					} 
				}
				setState(70);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CURLYOPEN) | (1L << IF) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << BREAK) | (1L << CONTINUE) | (1L << IDENT))) != 0)) {
				{
				{
				setState(71);
				statement();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				statementAssign();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				statementAssignRecord();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				statementIf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				statementWhile();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				statementRead();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(85);
				statementWrite();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(86);
				statementBreak();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(87);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitStatementAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementAssignContext statementAssign() throws RecognitionException {
		StatementAssignContext _localctx = new StatementAssignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statementAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			((StatementAssignContext)_localctx).lhs = identifier();
			setState(91);
			match(COLON);
			setState(92);
			match(EQUAL);
			setState(93);
			((StatementAssignContext)_localctx).rhs = expression();
			setState(94);
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
		public ExpressionContext fst;
		public ExpressionContext snd;
		public TerminalNode COLON() { return getToken(MicroCParser.COLON, 0); }
		public TerminalNode EQUAL() { return getToken(MicroCParser.EQUAL, 0); }
		public TerminalNode ROUNDOPEN() { return getToken(MicroCParser.ROUNDOPEN, 0); }
		public TerminalNode COMMA() { return getToken(MicroCParser.COMMA, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MicroCParser.ROUNDCLOSE, 0); }
		public TerminalNode SEMICOLON() { return getToken(MicroCParser.SEMICOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitStatementAssignRecord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementAssignRecordContext statementAssignRecord() throws RecognitionException {
		StatementAssignRecordContext _localctx = new StatementAssignRecordContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statementAssignRecord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			((StatementAssignRecordContext)_localctx).lhs = identifier();
			setState(97);
			match(COLON);
			setState(98);
			match(EQUAL);
			setState(99);
			match(ROUNDOPEN);
			setState(100);
			((StatementAssignRecordContext)_localctx).fst = expression();
			setState(101);
			match(COMMA);
			setState(102);
			((StatementAssignRecordContext)_localctx).snd = expression();
			setState(103);
			match(ROUNDCLOSE);
			setState(104);
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
		public ExpressionContext condition;
		public BlockContext ifBlock;
		public BlockContext elseBlock;
		public TerminalNode IF() { return getToken(MicroCParser.IF, 0); }
		public TerminalNode ROUNDOPEN() { return getToken(MicroCParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MicroCParser.ROUNDCLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitStatementIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementIfContext statementIf() throws RecognitionException {
		StatementIfContext _localctx = new StatementIfContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statementIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(IF);
			setState(107);
			match(ROUNDOPEN);
			setState(108);
			((StatementIfContext)_localctx).condition = expression();
			setState(109);
			match(ROUNDCLOSE);
			setState(110);
			((StatementIfContext)_localctx).ifBlock = block();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(111);
				match(ELSE);
				setState(112);
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
		public ExpressionContext condition;
		public StatementContext whileBlock;
		public TerminalNode WHILE() { return getToken(MicroCParser.WHILE, 0); }
		public TerminalNode ROUNDOPEN() { return getToken(MicroCParser.ROUNDOPEN, 0); }
		public TerminalNode ROUNDCLOSE() { return getToken(MicroCParser.ROUNDCLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitStatementWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWhileContext statementWhile() throws RecognitionException {
		StatementWhileContext _localctx = new StatementWhileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statementWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(WHILE);
			setState(116);
			match(ROUNDOPEN);
			setState(117);
			((StatementWhileContext)_localctx).condition = expression();
			setState(118);
			match(ROUNDCLOSE);
			setState(119);
			((StatementWhileContext)_localctx).whileBlock = statement();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitStatementRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementReadContext statementRead() throws RecognitionException {
		StatementReadContext _localctx = new StatementReadContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statementRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(READ);
			setState(122);
			((StatementReadContext)_localctx).var = identifier();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitStatementWrite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWriteContext statementWrite() throws RecognitionException {
		StatementWriteContext _localctx = new StatementWriteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statementWrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(WRITE);
			setState(126);
			((StatementWriteContext)_localctx).ex = expression();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitStatementBreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBreakContext statementBreak() throws RecognitionException {
		StatementBreakContext _localctx = new StatementBreakContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statementBreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(BREAK);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitStatementContinue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContinueContext statementContinue() throws RecognitionException {
		StatementContinueContext _localctx = new StatementContinueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statementContinue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(CONTINUE);
			setState(133);
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
		public Token name;
		public ExpressionContext element;
		public TerminalNode IDENT() { return getToken(MicroCParser.IDENT, 0); }
		public TerminalNode SQUAREOPEN() { return getToken(MicroCParser.SQUAREOPEN, 0); }
		public TerminalNode SQUARECLOSE() { return getToken(MicroCParser.SQUARECLOSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(MicroCParser.DOT, 0); }
		public TerminalNode FST() { return getToken(MicroCParser.FST, 0); }
		public TerminalNode SND() { return getToken(MicroCParser.SND, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_identifier);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				((IdentifierContext)_localctx).name = match(IDENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				((IdentifierContext)_localctx).name = match(IDENT);
				setState(137);
				match(SQUAREOPEN);
				setState(138);
				((IdentifierContext)_localctx).element = expression();
				setState(139);
				match(SQUARECLOSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				((IdentifierContext)_localctx).name = match(IDENT);
				setState(142);
				match(DOT);
				setState(143);
				match(FST);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				((IdentifierContext)_localctx).name = match(IDENT);
				setState(145);
				match(DOT);
				setState(146);
				match(SND);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionLContext expressionL() {
			return getRuleContext(ExpressionLContext.class,0);
		}
		public ExpressionAContext expressionA() {
			return getRuleContext(ExpressionAContext.class,0);
		}
		public ExpressionBContext expressionB() {
			return getRuleContext(ExpressionBContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				expressionL();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				expressionA(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				expressionB(0);
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

	public static class ExpressionLContext extends ParserRuleContext {
		public ExpressionIdentifierContext expressionIdentifier() {
			return getRuleContext(ExpressionIdentifierContext.class,0);
		}
		public ExpressionRecordFirstContext expressionRecordFirst() {
			return getRuleContext(ExpressionRecordFirstContext.class,0);
		}
		public ExpressionRecordSecondContext expressionRecordSecond() {
			return getRuleContext(ExpressionRecordSecondContext.class,0);
		}
		public ExpressionLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterExpressionL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitExpressionL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitExpressionL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionLContext expressionL() throws RecognitionException {
		ExpressionLContext _localctx = new ExpressionLContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressionL);
		try {
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				expressionIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				expressionRecordFirst();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				expressionRecordSecond();
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

	public static class ExpressionAContext extends ParserRuleContext {
		public ExpressionAContext lhs;
		public OperatorNumericContext op;
		public ExpressionAContext rhs;
		public ExpressionLContext expressionL() {
			return getRuleContext(ExpressionLContext.class,0);
		}
		public ExpressionConstantIntegerContext expressionConstantInteger() {
			return getRuleContext(ExpressionConstantIntegerContext.class,0);
		}
		public List<ExpressionAContext> expressionA() {
			return getRuleContexts(ExpressionAContext.class);
		}
		public ExpressionAContext expressionA(int i) {
			return getRuleContext(ExpressionAContext.class,i);
		}
		public OperatorNumericContext operatorNumeric() {
			return getRuleContext(OperatorNumericContext.class,0);
		}
		public ExpressionAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterExpressionA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitExpressionA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitExpressionA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionAContext expressionA() throws RecognitionException {
		return expressionA(0);
	}

	private ExpressionAContext expressionA(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionAContext _localctx = new ExpressionAContext(_ctx, _parentState);
		ExpressionAContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expressionA, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(160);
				expressionL();
				}
				break;
			case INT:
				{
				setState(161);
				expressionConstantInteger();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionAContext(_parentctx, _parentState);
					_localctx.lhs = _prevctx;
					_localctx.lhs = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expressionA);
					setState(164);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(165);
					((ExpressionAContext)_localctx).op = operatorNumeric();
					setState(166);
					((ExpressionAContext)_localctx).rhs = expressionA(2);
					}
					} 
				}
				setState(172);
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

	public static class ExpressionBContext extends ParserRuleContext {
		public ExpressionBContext lhs;
		public OperatorBoolContext op;
		public ExpressionBContext rhs;
		public TerminalNode TRUE() { return getToken(MicroCParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MicroCParser.FALSE, 0); }
		public ExpressionCompareContext expressionCompare() {
			return getRuleContext(ExpressionCompareContext.class,0);
		}
		public TerminalNode NOT() { return getToken(MicroCParser.NOT, 0); }
		public List<ExpressionBContext> expressionB() {
			return getRuleContexts(ExpressionBContext.class);
		}
		public ExpressionBContext expressionB(int i) {
			return getRuleContext(ExpressionBContext.class,i);
		}
		public OperatorBoolContext operatorBool() {
			return getRuleContext(OperatorBoolContext.class,0);
		}
		public ExpressionBContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionB; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterExpressionB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitExpressionB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitExpressionB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionBContext expressionB() throws RecognitionException {
		return expressionB(0);
	}

	private ExpressionBContext expressionB(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionBContext _localctx = new ExpressionBContext(_ctx, _parentState);
		ExpressionBContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expressionB, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				{
				setState(174);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(175);
				match(FALSE);
				}
				break;
			case IDENT:
			case INT:
				{
				setState(176);
				expressionCompare();
				}
				break;
			case NOT:
				{
				setState(177);
				match(NOT);
				setState(178);
				expressionB(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionBContext(_parentctx, _parentState);
					_localctx.lhs = _prevctx;
					_localctx.lhs = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expressionB);
					setState(181);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(182);
					((ExpressionBContext)_localctx).op = operatorBool();
					setState(183);
					((ExpressionBContext)_localctx).rhs = expressionB(3);
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitExpressionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionIdentifierContext expressionIdentifier() throws RecognitionException {
		ExpressionIdentifierContext _localctx = new ExpressionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expressionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
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

	public static class ExpressionRecordFirstContext extends ParserRuleContext {
		public IdentifierContext ident;
		public TerminalNode DOT() { return getToken(MicroCParser.DOT, 0); }
		public TerminalNode FST() { return getToken(MicroCParser.FST, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionRecordFirstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionRecordFirst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterExpressionRecordFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitExpressionRecordFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitExpressionRecordFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionRecordFirstContext expressionRecordFirst() throws RecognitionException {
		ExpressionRecordFirstContext _localctx = new ExpressionRecordFirstContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expressionRecordFirst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			((ExpressionRecordFirstContext)_localctx).ident = identifier();
			setState(193);
			match(DOT);
			setState(194);
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

	public static class ExpressionRecordSecondContext extends ParserRuleContext {
		public IdentifierContext ident;
		public TerminalNode DOT() { return getToken(MicroCParser.DOT, 0); }
		public TerminalNode SND() { return getToken(MicroCParser.SND, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionRecordSecondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionRecordSecond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterExpressionRecordSecond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitExpressionRecordSecond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitExpressionRecordSecond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionRecordSecondContext expressionRecordSecond() throws RecognitionException {
		ExpressionRecordSecondContext _localctx = new ExpressionRecordSecondContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressionRecordSecond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			((ExpressionRecordSecondContext)_localctx).ident = identifier();
			setState(197);
			match(DOT);
			setState(198);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitExpressionConstantInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantIntegerContext expressionConstantInteger() throws RecognitionException {
		ExpressionConstantIntegerContext _localctx = new ExpressionConstantIntegerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressionConstantInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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

	public static class ExpressionCompareContext extends ParserRuleContext {
		public ExpressionAContext lhs;
		public OperatorCompareContext op;
		public ExpressionAContext rhs;
		public List<ExpressionAContext> expressionA() {
			return getRuleContexts(ExpressionAContext.class);
		}
		public ExpressionAContext expressionA(int i) {
			return getRuleContext(ExpressionAContext.class,i);
		}
		public OperatorCompareContext operatorCompare() {
			return getRuleContext(OperatorCompareContext.class,0);
		}
		public ExpressionCompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionCompare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).enterExpressionCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MicroCListener ) ((MicroCListener)listener).exitExpressionCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitExpressionCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionCompareContext expressionCompare() throws RecognitionException {
		ExpressionCompareContext _localctx = new ExpressionCompareContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expressionCompare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			((ExpressionCompareContext)_localctx).lhs = expressionA(0);
			setState(203);
			((ExpressionCompareContext)_localctx).op = operatorCompare();
			setState(204);
			((ExpressionCompareContext)_localctx).rhs = expressionA(0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitOperatorNumeric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorNumericContext operatorNumeric() throws RecognitionException {
		OperatorNumericContext _localctx = new OperatorNumericContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_operatorNumeric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitOperatorCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorCompareContext operatorCompare() throws RecognitionException {
		OperatorCompareContext _localctx = new OperatorCompareContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_operatorCompare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitOperatorBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorBoolContext operatorBool() throws RecognitionException {
		OperatorBoolContext _localctx = new OperatorBoolContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_operatorBool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			((VarDeclarationContext)_localctx).var = variable();
			setState(213);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			type();
			setState(216);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_type);
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				typeBasic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitTypeBasic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBasicContext typeBasic() throws RecognitionException {
		TypeBasicContext _localctx = new TypeBasicContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeBasic);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPEINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				typeInt();
				}
				break;
			case CURLYOPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
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
		public Token value;
		public TypeBasicContext typeBasic() {
			return getRuleContext(TypeBasicContext.class,0);
		}
		public TerminalNode SQUAREOPEN() { return getToken(MicroCParser.SQUAREOPEN, 0); }
		public TerminalNode SQUARECLOSE() { return getToken(MicroCParser.SQUARECLOSE, 0); }
		public TerminalNode INT() { return getToken(MicroCParser.INT, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitTypeArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArrayContext typeArray() throws RecognitionException {
		TypeArrayContext _localctx = new TypeArrayContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_typeArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			typeBasic();
			setState(227);
			match(SQUAREOPEN);
			setState(228);
			((TypeArrayContext)_localctx).value = match(INT);
			setState(229);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitTypeInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIntContext typeInt() throws RecognitionException {
		TypeIntContext _localctx = new TypeIntContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typeInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MicroCVisitor ) return ((MicroCVisitor<? extends T>)visitor).visitTypeRecord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeRecordContext typeRecord() throws RecognitionException {
		TypeRecordContext _localctx = new TypeRecordContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typeRecord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(CURLYOPEN);
			setState(234);
			match(TYPEINT);
			setState(235);
			match(FST);
			setState(236);
			match(SEMICOLON);
			setState(237);
			match(TYPEINT);
			setState(238);
			match(SND);
			setState(239);
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
		case 14:
			return expressionA_sempred((ExpressionAContext)_localctx, predIndex);
		case 15:
			return expressionB_sempred((ExpressionBContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressionA_sempred(ExpressionAContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expressionB_sempred(ExpressionBContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00f4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\7\3E\n\3\f\3\16\3H\13\3\3\3\7\3K\n\3\f\3\16\3N\13\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4[\n\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\5\7t\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u0096\n\r\3\16\3\16\3\16\5\16\u009b\n\16\3\17\3\17\3\17\5\17\u00a0"+
		"\n\17\3\20\3\20\3\20\5\20\u00a5\n\20\3\20\3\20\3\20\3\20\7\20\u00ab\n"+
		"\20\f\20\16\20\u00ae\13\20\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b6\n"+
		"\21\3\21\3\21\3\21\3\21\7\21\u00bc\n\21\f\21\16\21\u00bf\13\21\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3"+
		"\34\5\34\u00df\n\34\3\35\3\35\5\35\u00e3\n\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \2\4\36 !\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\5\3\2\6\n\3\2\13\20\3\2\22"+
		"\23\2\u00ee\2@\3\2\2\2\4B\3\2\2\2\6Z\3\2\2\2\b\\\3\2\2\2\nb\3\2\2\2\f"+
		"l\3\2\2\2\16u\3\2\2\2\20{\3\2\2\2\22\177\3\2\2\2\24\u0083\3\2\2\2\26\u0086"+
		"\3\2\2\2\30\u0095\3\2\2\2\32\u009a\3\2\2\2\34\u009f\3\2\2\2\36\u00a4\3"+
		"\2\2\2 \u00b5\3\2\2\2\"\u00c0\3\2\2\2$\u00c2\3\2\2\2&\u00c6\3\2\2\2(\u00ca"+
		"\3\2\2\2*\u00cc\3\2\2\2,\u00d0\3\2\2\2.\u00d2\3\2\2\2\60\u00d4\3\2\2\2"+
		"\62\u00d6\3\2\2\2\64\u00d9\3\2\2\2\66\u00de\3\2\2\28\u00e2\3\2\2\2:\u00e4"+
		"\3\2\2\2<\u00e9\3\2\2\2>\u00eb\3\2\2\2@A\5\4\3\2A\3\3\2\2\2BF\7\35\2\2"+
		"CE\5\62\32\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GL\3\2\2\2HF\3\2\2"+
		"\2IK\5\6\4\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2"+
		"\2OP\7\36\2\2P\5\3\2\2\2Q[\5\4\3\2R[\5\b\5\2S[\5\n\6\2T[\5\f\7\2U[\5\16"+
		"\b\2V[\5\20\t\2W[\5\22\n\2X[\5\24\13\2Y[\5\26\f\2ZQ\3\2\2\2ZR\3\2\2\2"+
		"ZS\3\2\2\2ZT\3\2\2\2ZU\3\2\2\2ZV\3\2\2\2ZW\3\2\2\2ZX\3\2\2\2ZY\3\2\2\2"+
		"[\7\3\2\2\2\\]\5\30\r\2]^\7\25\2\2^_\7\26\2\2_`\5\32\16\2`a\7\24\2\2a"+
		"\t\3\2\2\2bc\5\30\r\2cd\7\25\2\2de\7\26\2\2ef\7\31\2\2fg\5\32\16\2gh\7"+
		"\30\2\2hi\5\32\16\2ij\7\32\2\2jk\7\24\2\2k\13\3\2\2\2lm\7!\2\2mn\7\31"+
		"\2\2no\5\32\16\2op\7\32\2\2ps\5\4\3\2qr\7\"\2\2rt\5\4\3\2sq\3\2\2\2st"+
		"\3\2\2\2t\r\3\2\2\2uv\7#\2\2vw\7\31\2\2wx\5\32\16\2xy\7\32\2\2yz\5\6\4"+
		"\2z\17\3\2\2\2{|\7$\2\2|}\5\30\r\2}~\7\24\2\2~\21\3\2\2\2\177\u0080\7"+
		"%\2\2\u0080\u0081\5\32\16\2\u0081\u0082\7\24\2\2\u0082\23\3\2\2\2\u0083"+
		"\u0084\7&\2\2\u0084\u0085\7\24\2\2\u0085\25\3\2\2\2\u0086\u0087\7\'\2"+
		"\2\u0087\u0088\7\24\2\2\u0088\27\3\2\2\2\u0089\u0096\7(\2\2\u008a\u008b"+
		"\7(\2\2\u008b\u008c\7\33\2\2\u008c\u008d\5\32\16\2\u008d\u008e\7\34\2"+
		"\2\u008e\u0096\3\2\2\2\u008f\u0090\7(\2\2\u0090\u0091\7\27\2\2\u0091\u0096"+
		"\7\4\2\2\u0092\u0093\7(\2\2\u0093\u0094\7\27\2\2\u0094\u0096\7\5\2\2\u0095"+
		"\u0089\3\2\2\2\u0095\u008a\3\2\2\2\u0095\u008f\3\2\2\2\u0095\u0092\3\2"+
		"\2\2\u0096\31\3\2\2\2\u0097\u009b\5\34\17\2\u0098\u009b\5\36\20\2\u0099"+
		"\u009b\5 \21\2\u009a\u0097\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u0099\3\2"+
		"\2\2\u009b\33\3\2\2\2\u009c\u00a0\5\"\22\2\u009d\u00a0\5$\23\2\u009e\u00a0"+
		"\5&\24\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0"+
		"\35\3\2\2\2\u00a1\u00a2\b\20\1\2\u00a2\u00a5\5\34\17\2\u00a3\u00a5\5("+
		"\25\2\u00a4\u00a1\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00ac\3\2\2\2\u00a6"+
		"\u00a7\f\3\2\2\u00a7\u00a8\5,\27\2\u00a8\u00a9\5\36\20\4\u00a9\u00ab\3"+
		"\2\2\2\u00aa\u00a6\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\37\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\b\21\1"+
		"\2\u00b0\u00b6\7\37\2\2\u00b1\u00b6\7 \2\2\u00b2\u00b6\5*\26\2\u00b3\u00b4"+
		"\7\21\2\2\u00b4\u00b6\5 \21\3\u00b5\u00af\3\2\2\2\u00b5\u00b1\3\2\2\2"+
		"\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00bd\3\2\2\2\u00b7\u00b8"+
		"\f\4\2\2\u00b8\u00b9\5\60\31\2\u00b9\u00ba\5 \21\5\u00ba\u00bc\3\2\2\2"+
		"\u00bb\u00b7\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be!\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\5\30\r\2\u00c1"+
		"#\3\2\2\2\u00c2\u00c3\5\30\r\2\u00c3\u00c4\7\27\2\2\u00c4\u00c5\7\4\2"+
		"\2\u00c5%\3\2\2\2\u00c6\u00c7\5\30\r\2\u00c7\u00c8\7\27\2\2\u00c8\u00c9"+
		"\7\5\2\2\u00c9\'\3\2\2\2\u00ca\u00cb\7)\2\2\u00cb)\3\2\2\2\u00cc\u00cd"+
		"\5\36\20\2\u00cd\u00ce\5.\30\2\u00ce\u00cf\5\36\20\2\u00cf+\3\2\2\2\u00d0"+
		"\u00d1\t\2\2\2\u00d1-\3\2\2\2\u00d2\u00d3\t\3\2\2\u00d3/\3\2\2\2\u00d4"+
		"\u00d5\t\4\2\2\u00d5\61\3\2\2\2\u00d6\u00d7\5\64\33\2\u00d7\u00d8\7\24"+
		"\2\2\u00d8\63\3\2\2\2\u00d9\u00da\5\66\34\2\u00da\u00db\7(\2\2\u00db\65"+
		"\3\2\2\2\u00dc\u00df\58\35\2\u00dd\u00df\5:\36\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00dd\3\2\2\2\u00df\67\3\2\2\2\u00e0\u00e3\5<\37\2\u00e1\u00e3\5> \2"+
		"\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e39\3\2\2\2\u00e4\u00e5\5"+
		"8\35\2\u00e5\u00e6\7\33\2\2\u00e6\u00e7\7)\2\2\u00e7\u00e8\7\34\2\2\u00e8"+
		";\3\2\2\2\u00e9\u00ea\7\3\2\2\u00ea=\3\2\2\2\u00eb\u00ec\7\35\2\2\u00ec"+
		"\u00ed\7\3\2\2\u00ed\u00ee\7\4\2\2\u00ee\u00ef\7\24\2\2\u00ef\u00f0\7"+
		"\3\2\2\u00f0\u00f1\7\5\2\2\u00f1\u00f2\7\36\2\2\u00f2?\3\2\2\2\17FLZs"+
		"\u0095\u009a\u009f\u00a4\u00ac\u00b5\u00bd\u00de\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
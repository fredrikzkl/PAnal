// Generated from C:/Users/Kaare/IdeaProjects/PAnal/src/main/java/antlr\MicroC.g4 by ANTLR 4.7
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MicroCLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"TYPEINT", "FST", "SND", "PLUS", "MINUS", "TIMES", "DIVIDE", "MODULU", 
		"LESSTHAN", "GREATERTHAN", "LESSTHANOREQUAL", "GREATERTHANOREQUAL", "EQUALS", 
		"NOTEQUALS", "NOT", "AND", "OR", "SEMICOLON", "COLON", "EQUAL", "DOT", 
		"COMMA", "ROUNDOPEN", "ROUNDCLOSE", "SQUAREOPEN", "SQUARECLOSE", "CURLYOPEN", 
		"CURLYCLOSE", "TRUE", "FALSE", "IF", "ELSE", "WHILE", "READ", "WRITE", 
		"BREAK", "CONTINUE", "LOWER", "UPPER", "NONNULL", "NUMBER", "IDENT", "INT", 
		"WHITESPACE"
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


	public MicroCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MicroC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u00fa\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\5*\u00db\n*\3+\3+\5+\u00df\n+"+
		"\3+\3+\3+\3+\7+\u00e5\n+\f+\16+\u00e8\13+\3,\3,\3,\7,\u00ed\n,\f,\16,"+
		"\u00f0\13,\5,\u00f2\n,\3-\6-\u00f5\n-\r-\16-\u00f6\3-\3-\2\2.\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M\2O\2Q\2S\2U(W)Y*\3\2\3\5\2\13\f\17\17\"\"\2\u00fe\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2\2\2\5_\3\2\2"+
		"\2\7c\3\2\2\2\tg\3\2\2\2\13i\3\2\2\2\rk\3\2\2\2\17m\3\2\2\2\21o\3\2\2"+
		"\2\23q\3\2\2\2\25s\3\2\2\2\27u\3\2\2\2\31x\3\2\2\2\33{\3\2\2\2\35~\3\2"+
		"\2\2\37\u0081\3\2\2\2!\u0085\3\2\2\2#\u0087\3\2\2\2%\u0089\3\2\2\2\'\u008b"+
		"\3\2\2\2)\u008d\3\2\2\2+\u008f\3\2\2\2-\u0091\3\2\2\2/\u0093\3\2\2\2\61"+
		"\u0095\3\2\2\2\63\u0097\3\2\2\2\65\u0099\3\2\2\2\67\u009b\3\2\2\29\u009d"+
		"\3\2\2\2;\u009f\3\2\2\2=\u00a4\3\2\2\2?\u00aa\3\2\2\2A\u00ad\3\2\2\2C"+
		"\u00b2\3\2\2\2E\u00b8\3\2\2\2G\u00bd\3\2\2\2I\u00c3\3\2\2\2K\u00c9\3\2"+
		"\2\2M\u00d2\3\2\2\2O\u00d4\3\2\2\2Q\u00d6\3\2\2\2S\u00da\3\2\2\2U\u00de"+
		"\3\2\2\2W\u00f1\3\2\2\2Y\u00f4\3\2\2\2[\\\7k\2\2\\]\7p\2\2]^\7v\2\2^\4"+
		"\3\2\2\2_`\7h\2\2`a\7u\2\2ab\7v\2\2b\6\3\2\2\2cd\7u\2\2de\7p\2\2ef\7f"+
		"\2\2f\b\3\2\2\2gh\7-\2\2h\n\3\2\2\2ij\7/\2\2j\f\3\2\2\2kl\7,\2\2l\16\3"+
		"\2\2\2mn\7\61\2\2n\20\3\2\2\2op\7\'\2\2p\22\3\2\2\2qr\7>\2\2r\24\3\2\2"+
		"\2st\7@\2\2t\26\3\2\2\2uv\5\23\n\2vw\5)\25\2w\30\3\2\2\2xy\5\25\13\2y"+
		"z\5)\25\2z\32\3\2\2\2{|\7?\2\2|}\7?\2\2}\34\3\2\2\2~\177\7#\2\2\177\u0080"+
		"\7?\2\2\u0080\36\3\2\2\2\u0081\u0082\7p\2\2\u0082\u0083\7q\2\2\u0083\u0084"+
		"\7v\2\2\u0084 \3\2\2\2\u0085\u0086\7(\2\2\u0086\"\3\2\2\2\u0087\u0088"+
		"\7~\2\2\u0088$\3\2\2\2\u0089\u008a\7=\2\2\u008a&\3\2\2\2\u008b\u008c\7"+
		"<\2\2\u008c(\3\2\2\2\u008d\u008e\7?\2\2\u008e*\3\2\2\2\u008f\u0090\7\60"+
		"\2\2\u0090,\3\2\2\2\u0091\u0092\7.\2\2\u0092.\3\2\2\2\u0093\u0094\7*\2"+
		"\2\u0094\60\3\2\2\2\u0095\u0096\7+\2\2\u0096\62\3\2\2\2\u0097\u0098\7"+
		"]\2\2\u0098\64\3\2\2\2\u0099\u009a\7_\2\2\u009a\66\3\2\2\2\u009b\u009c"+
		"\7}\2\2\u009c8\3\2\2\2\u009d\u009e\7\177\2\2\u009e:\3\2\2\2\u009f\u00a0"+
		"\7v\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7w\2\2\u00a2\u00a3\7g\2\2\u00a3"+
		"<\3\2\2\2\u00a4\u00a5\7h\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7n\2\2\u00a7"+
		"\u00a8\7u\2\2\u00a8\u00a9\7g\2\2\u00a9>\3\2\2\2\u00aa\u00ab\7k\2\2\u00ab"+
		"\u00ac\7h\2\2\u00ac@\3\2\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7n\2\2\u00af"+
		"\u00b0\7u\2\2\u00b0\u00b1\7g\2\2\u00b1B\3\2\2\2\u00b2\u00b3\7y\2\2\u00b3"+
		"\u00b4\7j\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7g\2\2"+
		"\u00b7D\3\2\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7c\2"+
		"\2\u00bb\u00bc\7f\2\2\u00bcF\3\2\2\2\u00bd\u00be\7y\2\2\u00be\u00bf\7"+
		"t\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7v\2\2\u00c1\u00c2\7g\2\2\u00c2H"+
		"\3\2\2\2\u00c3\u00c4\7d\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7g\2\2\u00c6"+
		"\u00c7\7c\2\2\u00c7\u00c8\7m\2\2\u00c8J\3\2\2\2\u00c9\u00ca\7e\2\2\u00ca"+
		"\u00cb\7q\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7k\2\2"+
		"\u00ce\u00cf\7p\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1\7g\2\2\u00d1L\3\2\2"+
		"\2\u00d2\u00d3\4c|\2\u00d3N\3\2\2\2\u00d4\u00d5\4C\\\2\u00d5P\3\2\2\2"+
		"\u00d6\u00d7\4\63;\2\u00d7R\3\2\2\2\u00d8\u00db\7\62\2\2\u00d9\u00db\5"+
		"Q)\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00dbT\3\2\2\2\u00dc\u00df"+
		"\5M\'\2\u00dd\u00df\5O(\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df"+
		"\u00e6\3\2\2\2\u00e0\u00e5\5M\'\2\u00e1\u00e5\5O(\2\u00e2\u00e5\5S*\2"+
		"\u00e3\u00e5\7a\2\2\u00e4\u00e0\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7V\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00f2\7\62\2\2"+
		"\u00ea\u00ee\5Q)\2\u00eb\u00ed\5S*\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3"+
		"\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u00e9\3\2\2\2\u00f1\u00ea\3\2\2\2\u00f2X\3\2\2\2"+
		"\u00f3\u00f5\t\2\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4"+
		"\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\b-\2\2\u00f9"+
		"Z\3\2\2\2\n\2\u00da\u00de\u00e4\u00e6\u00ee\u00f1\u00f6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
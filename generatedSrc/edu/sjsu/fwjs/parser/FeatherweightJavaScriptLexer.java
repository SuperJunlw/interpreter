// Generated from java-escape by ANTLR 4.11.1
 package edu.sjsu.fwjs.parser; 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FeatherweightJavaScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, IF=6, ELSE=7, WHILE=8, FUNCTION=9, 
		VAR=10, PRINT=11, INT=12, BOOL=13, NULL=14, ID=15, MUL=16, DIV=17, ADD=18, 
		SUB=19, MOD=20, GT=21, LT=22, GE=23, LE=24, EQ=25, ASSIGN=26, SEPARATOR=27, 
		NEWLINE=28, BLOCK_COMMENT=29, LINE_COMMENT=30, WS=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "IF", "ELSE", "WHILE", "FUNCTION", 
			"VAR", "PRINT", "INT", "BOOL", "NULL", "ID", "MUL", "DIV", "ADD", "SUB", 
			"MOD", "GT", "LT", "GE", "LE", "EQ", "ASSIGN", "SEPARATOR", "NEWLINE", 
			"BLOCK_COMMENT", "LINE_COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "','", "'if'", "'else'", "'while'", 
			"'function'", "'var'", "'print'", null, null, "'null'", null, "'*'", 
			"'/'", "'+'", "'-'", "'%'", "'>'", "'<'", "'>='", "'<='", "'=='", "'='", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "IF", "ELSE", "WHILE", "FUNCTION", 
			"VAR", "PRINT", "INT", "BOOL", "NULL", "ID", "MUL", "DIV", "ADD", "SUB", 
			"MOD", "GT", "LT", "GE", "LE", "EQ", "ASSIGN", "SEPARATOR", "NEWLINE", 
			"BLOCK_COMMENT", "LINE_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public FeatherweightJavaScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FeatherweightJavaScript.g4"; }

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
		"\u0004\u0000\u001f\u00cd\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b"+
		"m\b\u000b\n\u000b\f\u000bp\t\u000b\u0001\u000b\u0003\u000bs\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f~\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u0087\b\u000e\n\u000e\f\u000e\u008a\t\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0003\u001b\u00a8\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0005\u001c\u00b2\b\u001c\n\u001c\f\u001c\u00b5\t\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0005\u001d\u00c0\b\u001d\n\u001d\f\u001d\u00c3"+
		"\t\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0004\u001e\u00c8\b\u001e"+
		"\u000b\u001e\f\u001e\u00c9\u0001\u001e\u0001\u001e\u0001\u00b3\u0000\u001f"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017"+
		"/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f\u0001\u0000\u0006"+
		"\u0001\u000019\u0001\u000009\u0003\u0000AZ__az\u0004\u000009AZ__az\u0002"+
		"\u0000\n\n\r\r\u0002\u0000\t\t  \u00d4\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001"+
		"\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000"+
		"\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000"+
		";\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0001?\u0001"+
		"\u0000\u0000\u0000\u0003A\u0001\u0000\u0000\u0000\u0005C\u0001\u0000\u0000"+
		"\u0000\u0007E\u0001\u0000\u0000\u0000\tG\u0001\u0000\u0000\u0000\u000b"+
		"I\u0001\u0000\u0000\u0000\rL\u0001\u0000\u0000\u0000\u000fQ\u0001\u0000"+
		"\u0000\u0000\u0011W\u0001\u0000\u0000\u0000\u0013`\u0001\u0000\u0000\u0000"+
		"\u0015d\u0001\u0000\u0000\u0000\u0017r\u0001\u0000\u0000\u0000\u0019}"+
		"\u0001\u0000\u0000\u0000\u001b\u007f\u0001\u0000\u0000\u0000\u001d\u0084"+
		"\u0001\u0000\u0000\u0000\u001f\u008b\u0001\u0000\u0000\u0000!\u008d\u0001"+
		"\u0000\u0000\u0000#\u008f\u0001\u0000\u0000\u0000%\u0091\u0001\u0000\u0000"+
		"\u0000\'\u0093\u0001\u0000\u0000\u0000)\u0095\u0001\u0000\u0000\u0000"+
		"+\u0097\u0001\u0000\u0000\u0000-\u0099\u0001\u0000\u0000\u0000/\u009c"+
		"\u0001\u0000\u0000\u00001\u009f\u0001\u0000\u0000\u00003\u00a2\u0001\u0000"+
		"\u0000\u00005\u00a4\u0001\u0000\u0000\u00007\u00a7\u0001\u0000\u0000\u0000"+
		"9\u00ad\u0001\u0000\u0000\u0000;\u00bb\u0001\u0000\u0000\u0000=\u00c7"+
		"\u0001\u0000\u0000\u0000?@\u0005(\u0000\u0000@\u0002\u0001\u0000\u0000"+
		"\u0000AB\u0005)\u0000\u0000B\u0004\u0001\u0000\u0000\u0000CD\u0005{\u0000"+
		"\u0000D\u0006\u0001\u0000\u0000\u0000EF\u0005}\u0000\u0000F\b\u0001\u0000"+
		"\u0000\u0000GH\u0005,\u0000\u0000H\n\u0001\u0000\u0000\u0000IJ\u0005i"+
		"\u0000\u0000JK\u0005f\u0000\u0000K\f\u0001\u0000\u0000\u0000LM\u0005e"+
		"\u0000\u0000MN\u0005l\u0000\u0000NO\u0005s\u0000\u0000OP\u0005e\u0000"+
		"\u0000P\u000e\u0001\u0000\u0000\u0000QR\u0005w\u0000\u0000RS\u0005h\u0000"+
		"\u0000ST\u0005i\u0000\u0000TU\u0005l\u0000\u0000UV\u0005e\u0000\u0000"+
		"V\u0010\u0001\u0000\u0000\u0000WX\u0005f\u0000\u0000XY\u0005u\u0000\u0000"+
		"YZ\u0005n\u0000\u0000Z[\u0005c\u0000\u0000[\\\u0005t\u0000\u0000\\]\u0005"+
		"i\u0000\u0000]^\u0005o\u0000\u0000^_\u0005n\u0000\u0000_\u0012\u0001\u0000"+
		"\u0000\u0000`a\u0005v\u0000\u0000ab\u0005a\u0000\u0000bc\u0005r\u0000"+
		"\u0000c\u0014\u0001\u0000\u0000\u0000de\u0005p\u0000\u0000ef\u0005r\u0000"+
		"\u0000fg\u0005i\u0000\u0000gh\u0005n\u0000\u0000hi\u0005t\u0000\u0000"+
		"i\u0016\u0001\u0000\u0000\u0000jn\u0007\u0000\u0000\u0000km\u0007\u0001"+
		"\u0000\u0000lk\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000os\u0001\u0000\u0000\u0000"+
		"pn\u0001\u0000\u0000\u0000qs\u00050\u0000\u0000rj\u0001\u0000\u0000\u0000"+
		"rq\u0001\u0000\u0000\u0000s\u0018\u0001\u0000\u0000\u0000tu\u0005t\u0000"+
		"\u0000uv\u0005r\u0000\u0000vw\u0005u\u0000\u0000w~\u0005e\u0000\u0000"+
		"xy\u0005f\u0000\u0000yz\u0005a\u0000\u0000z{\u0005l\u0000\u0000{|\u0005"+
		"s\u0000\u0000|~\u0005e\u0000\u0000}t\u0001\u0000\u0000\u0000}x\u0001\u0000"+
		"\u0000\u0000~\u001a\u0001\u0000\u0000\u0000\u007f\u0080\u0005n\u0000\u0000"+
		"\u0080\u0081\u0005u\u0000\u0000\u0081\u0082\u0005l\u0000\u0000\u0082\u0083"+
		"\u0005l\u0000\u0000\u0083\u001c\u0001\u0000\u0000\u0000\u0084\u0088\u0007"+
		"\u0002\u0000\u0000\u0085\u0087\u0007\u0003\u0000\u0000\u0086\u0085\u0001"+
		"\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u001e\u0001"+
		"\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008c\u0005"+
		"*\u0000\u0000\u008c \u0001\u0000\u0000\u0000\u008d\u008e\u0005/\u0000"+
		"\u0000\u008e\"\u0001\u0000\u0000\u0000\u008f\u0090\u0005+\u0000\u0000"+
		"\u0090$\u0001\u0000\u0000\u0000\u0091\u0092\u0005-\u0000\u0000\u0092&"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0005%\u0000\u0000\u0094(\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0005>\u0000\u0000\u0096*\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0005<\u0000\u0000\u0098,\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0005>\u0000\u0000\u009a\u009b\u0005=\u0000\u0000\u009b.\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0005<\u0000\u0000\u009d\u009e\u0005=\u0000\u0000"+
		"\u009e0\u0001\u0000\u0000\u0000\u009f\u00a0\u0005=\u0000\u0000\u00a0\u00a1"+
		"\u0005=\u0000\u0000\u00a12\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005="+
		"\u0000\u0000\u00a34\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005;\u0000\u0000"+
		"\u00a56\u0001\u0000\u0000\u0000\u00a6\u00a8\u0005\r\u0000\u0000\u00a7"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\n\u0000\u0000\u00aa\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0006\u001b\u0000\u0000\u00ac8\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0005/\u0000\u0000\u00ae\u00af\u0005*\u0000"+
		"\u0000\u00af\u00b3\u0001\u0000\u0000\u0000\u00b0\u00b2\t\u0000\u0000\u0000"+
		"\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b6\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0005*\u0000\u0000\u00b7\u00b8\u0005/\u0000\u0000\u00b8\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b9\u00ba\u0006\u001c\u0000\u0000\u00ba:\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0005/\u0000\u0000\u00bc\u00bd\u0005/\u0000"+
		"\u0000\u00bd\u00c1\u0001\u0000\u0000\u0000\u00be\u00c0\b\u0004\u0000\u0000"+
		"\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000"+
		"\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0006\u001d\u0000\u0000\u00c5<\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c8\u0007\u0005\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0006\u001e\u0000\u0000\u00cc>\u0001\u0000\u0000\u0000\t\u0000"+
		"nr}\u0088\u00a7\u00b3\u00c1\u00c9\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
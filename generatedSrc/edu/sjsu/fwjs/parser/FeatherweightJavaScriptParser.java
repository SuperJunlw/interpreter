// Generated from java-escape by ANTLR 4.11.1
 package edu.sjsu.fwjs.parser; 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FeatherweightJavaScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, IF=6, ELSE=7, WHILE=8, FUNCTION=9, 
		VAR=10, PRINT=11, INT=12, BOOL=13, NULL=14, ID=15, MUL=16, DIV=17, ADD=18, 
		SUB=19, MOD=20, GT=21, LT=22, GE=23, LE=24, EQ=25, ASSIGN=26, SEPARATOR=27, 
		NEWLINE=28, BLOCK_COMMENT=29, LINE_COMMENT=30, WS=31;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2, RULE_block = 3, RULE_params = 4, 
		RULE_args = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr", "block", "params", "args"
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FeatherweightJavaScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				stat();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 134283074L) != 0 );
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends StatContext {
		public TerminalNode PRINT() { return getToken(FeatherweightJavaScriptParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(FeatherweightJavaScriptParser.SEPARATOR, 0); }
		public PrintContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfThenElseContext extends StatContext {
		public TerminalNode IF() { return getToken(FeatherweightJavaScriptParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(FeatherweightJavaScriptParser.ELSE, 0); }
		public IfThenElseContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitIfThenElse(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfThenContext extends StatContext {
		public TerminalNode IF() { return getToken(FeatherweightJavaScriptParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfThenContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitIfThen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends StatContext {
		public TerminalNode WHILE() { return getToken(FeatherweightJavaScriptParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BareExprContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(FeatherweightJavaScriptParser.SEPARATOR, 0); }
		public BareExprContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitBareExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EmptyContext extends StatContext {
		public TerminalNode SEPARATOR() { return getToken(FeatherweightJavaScriptParser.SEPARATOR, 0); }
		public EmptyContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new BareExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				expr(0);
				setState(18);
				match(SEPARATOR);
				}
				break;
			case 2:
				_localctx = new IfThenElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				match(IF);
				setState(21);
				match(T__0);
				setState(22);
				expr(0);
				setState(23);
				match(T__1);
				setState(24);
				block();
				setState(25);
				match(ELSE);
				setState(26);
				block();
				}
				break;
			case 3:
				_localctx = new IfThenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				match(IF);
				setState(29);
				match(T__0);
				setState(30);
				expr(0);
				setState(31);
				match(T__1);
				setState(32);
				block();
				}
				break;
			case 4:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(34);
				match(WHILE);
				setState(35);
				match(T__0);
				setState(36);
				expr(0);
				setState(37);
				match(T__1);
				setState(38);
				block();
				}
				break;
			case 5:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				match(PRINT);
				setState(41);
				match(T__0);
				setState(42);
				expr(0);
				setState(43);
				match(T__1);
				setState(45);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(44);
					match(SEPARATOR);
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new EmptyContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(47);
				match(SEPARATOR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ExprContext {
		public TerminalNode FUNCTION() { return getToken(FeatherweightJavaScriptParser.FUNCTION, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDeclarationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableDecContext extends ExprContext {
		public TerminalNode VAR() { return getToken(FeatherweightJavaScriptParser.VAR, 0); }
		public TerminalNode ID() { return getToken(FeatherweightJavaScriptParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(FeatherweightJavaScriptParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableDecContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitVariableDec(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableRefContext extends ExprContext {
		public TerminalNode ID() { return getToken(FeatherweightJavaScriptParser.ID, 0); }
		public VariableRefContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitVariableRef(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivModContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(FeatherweightJavaScriptParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(FeatherweightJavaScriptParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(FeatherweightJavaScriptParser.MOD, 0); }
		public MulDivModContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitMulDivMod(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LtLeGtGeEqContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(FeatherweightJavaScriptParser.LT, 0); }
		public TerminalNode LE() { return getToken(FeatherweightJavaScriptParser.LE, 0); }
		public TerminalNode GT() { return getToken(FeatherweightJavaScriptParser.GT, 0); }
		public TerminalNode GE() { return getToken(FeatherweightJavaScriptParser.GE, 0); }
		public TerminalNode EQ() { return getToken(FeatherweightJavaScriptParser.EQ, 0); }
		public LtLeGtGeEqContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitLtLeGtGeEq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(FeatherweightJavaScriptParser.BOOL, 0); }
		public BoolContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullContext extends ExprContext {
		public TerminalNode NULL() { return getToken(FeatherweightJavaScriptParser.NULL, 0); }
		public NullContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(FeatherweightJavaScriptParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(FeatherweightJavaScriptParser.SUB, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionApplicationContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FunctionApplicationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitFunctionApplication(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignStatementContext extends ExprContext {
		public TerminalNode ID() { return getToken(FeatherweightJavaScriptParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(FeatherweightJavaScriptParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignStatementContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(FeatherweightJavaScriptParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionDeclarationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(51);
				match(FUNCTION);
				setState(52);
				match(T__0);
				setState(53);
				params();
				setState(54);
				match(T__1);
				setState(55);
				block();
				}
				break;
			case 2:
				{
				_localctx = new VariableDecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57);
				match(VAR);
				setState(58);
				match(ID);
				setState(59);
				match(ASSIGN);
				setState(60);
				expr(8);
				}
				break;
			case 3:
				{
				_localctx = new VariableDecContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				match(VAR);
				setState(62);
				match(ID);
				setState(63);
				match(ASSIGN);
				setState(64);
				block();
				}
				break;
			case 4:
				{
				_localctx = new VariableRefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(65);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new AssignStatementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(ID);
				setState(67);
				match(ASSIGN);
				setState(68);
				expr(5);
				}
				break;
			case 6:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				match(INT);
				}
				break;
			case 7:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(BOOL);
				}
				break;
			case 8:
				{
				_localctx = new NullContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				match(NULL);
				}
				break;
			case 9:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				match(T__0);
				setState(73);
				expr(0);
				setState(74);
				match(T__1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(92);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(78);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(79);
						((MulDivModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 1245184L) != 0) ) {
							((MulDivModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(80);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(81);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(82);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(83);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new LtLeGtGeEqContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(84);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(85);
						((LtLeGtGeEqContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 65011712L) != 0) ) {
							((LtLeGtGeEqContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(86);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new FunctionApplicationContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(87);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(88);
						match(T__0);
						setState(89);
						args();
						setState(90);
						match(T__1);
						}
						break;
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FullBlockContext extends BlockContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public FullBlockContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitFullBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpBlockContext extends BlockContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public SimpBlockContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitSimpBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new FullBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(T__2);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((_la) & ~0x3f) == 0 && ((1L << _la) & 134283074L) != 0) {
					{
					{
					setState(98);
					stat();
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(104);
				match(T__3);
				}
				break;
			case T__0:
			case IF:
			case WHILE:
			case FUNCTION:
			case VAR:
			case PRINT:
			case INT:
			case BOOL:
			case NULL:
			case ID:
			case SEPARATOR:
				_localctx = new SimpBlockContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				stat();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(FeatherweightJavaScriptParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(FeatherweightJavaScriptParser.ID, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(108);
				match(ID);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(109);
					match(T__4);
					setState(110);
					match(ID);
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FeatherweightJavaScriptVisitor ) return ((FeatherweightJavaScriptVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 62978L) != 0) {
				{
				setState(118);
				expr(0);
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(119);
					match(T__4);
					setState(120);
					expr(0);
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u0081\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000"+
		"\f\u0000\u000f\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		".\b\u0001\u0001\u0001\u0003\u00011\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002M\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002]\b\u0002\n\u0002"+
		"\f\u0002`\t\u0002\u0001\u0003\u0001\u0003\u0005\u0003d\b\u0003\n\u0003"+
		"\f\u0003g\t\u0003\u0001\u0003\u0001\u0003\u0003\u0003k\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004p\b\u0004\n\u0004\f\u0004s\t\u0004"+
		"\u0003\u0004u\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"z\b\u0005\n\u0005\f\u0005}\t\u0005\u0003\u0005\u007f\b\u0005\u0001\u0005"+
		"\u0000\u0001\u0004\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0003\u0002"+
		"\u0000\u0010\u0011\u0014\u0014\u0001\u0000\u0012\u0013\u0001\u0000\u0015"+
		"\u0019\u0093\u0000\r\u0001\u0000\u0000\u0000\u00020\u0001\u0000\u0000"+
		"\u0000\u0004L\u0001\u0000\u0000\u0000\u0006j\u0001\u0000\u0000\u0000\b"+
		"t\u0001\u0000\u0000\u0000\n~\u0001\u0000\u0000\u0000\f\u000e\u0003\u0002"+
		"\u0001\u0000\r\f\u0001\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000"+
		"\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000"+
		"\u0010\u0001\u0001\u0000\u0000\u0000\u0011\u0012\u0003\u0004\u0002\u0000"+
		"\u0012\u0013\u0005\u001b\u0000\u0000\u00131\u0001\u0000\u0000\u0000\u0014"+
		"\u0015\u0005\u0006\u0000\u0000\u0015\u0016\u0005\u0001\u0000\u0000\u0016"+
		"\u0017\u0003\u0004\u0002\u0000\u0017\u0018\u0005\u0002\u0000\u0000\u0018"+
		"\u0019\u0003\u0006\u0003\u0000\u0019\u001a\u0005\u0007\u0000\u0000\u001a"+
		"\u001b\u0003\u0006\u0003\u0000\u001b1\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0005\u0006\u0000\u0000\u001d\u001e\u0005\u0001\u0000\u0000\u001e\u001f"+
		"\u0003\u0004\u0002\u0000\u001f \u0005\u0002\u0000\u0000 !\u0003\u0006"+
		"\u0003\u0000!1\u0001\u0000\u0000\u0000\"#\u0005\b\u0000\u0000#$\u0005"+
		"\u0001\u0000\u0000$%\u0003\u0004\u0002\u0000%&\u0005\u0002\u0000\u0000"+
		"&\'\u0003\u0006\u0003\u0000\'1\u0001\u0000\u0000\u0000()\u0005\u000b\u0000"+
		"\u0000)*\u0005\u0001\u0000\u0000*+\u0003\u0004\u0002\u0000+-\u0005\u0002"+
		"\u0000\u0000,.\u0005\u001b\u0000\u0000-,\u0001\u0000\u0000\u0000-.\u0001"+
		"\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/1\u0005\u001b\u0000\u0000"+
		"0\u0011\u0001\u0000\u0000\u00000\u0014\u0001\u0000\u0000\u00000\u001c"+
		"\u0001\u0000\u0000\u00000\"\u0001\u0000\u0000\u00000(\u0001\u0000\u0000"+
		"\u00000/\u0001\u0000\u0000\u00001\u0003\u0001\u0000\u0000\u000023\u0006"+
		"\u0002\uffff\uffff\u000034\u0005\t\u0000\u000045\u0005\u0001\u0000\u0000"+
		"56\u0003\b\u0004\u000067\u0005\u0002\u0000\u000078\u0003\u0006\u0003\u0000"+
		"8M\u0001\u0000\u0000\u00009:\u0005\n\u0000\u0000:;\u0005\u000f\u0000\u0000"+
		";<\u0005\u001a\u0000\u0000<M\u0003\u0004\u0002\b=>\u0005\n\u0000\u0000"+
		">?\u0005\u000f\u0000\u0000?@\u0005\u001a\u0000\u0000@M\u0003\u0006\u0003"+
		"\u0000AM\u0005\u000f\u0000\u0000BC\u0005\u000f\u0000\u0000CD\u0005\u001a"+
		"\u0000\u0000DM\u0003\u0004\u0002\u0005EM\u0005\f\u0000\u0000FM\u0005\r"+
		"\u0000\u0000GM\u0005\u000e\u0000\u0000HI\u0005\u0001\u0000\u0000IJ\u0003"+
		"\u0004\u0002\u0000JK\u0005\u0002\u0000\u0000KM\u0001\u0000\u0000\u0000"+
		"L2\u0001\u0000\u0000\u0000L9\u0001\u0000\u0000\u0000L=\u0001\u0000\u0000"+
		"\u0000LA\u0001\u0000\u0000\u0000LB\u0001\u0000\u0000\u0000LE\u0001\u0000"+
		"\u0000\u0000LF\u0001\u0000\u0000\u0000LG\u0001\u0000\u0000\u0000LH\u0001"+
		"\u0000\u0000\u0000M^\u0001\u0000\u0000\u0000NO\n\r\u0000\u0000OP\u0007"+
		"\u0000\u0000\u0000P]\u0003\u0004\u0002\u000eQR\n\f\u0000\u0000RS\u0007"+
		"\u0001\u0000\u0000S]\u0003\u0004\u0002\rTU\n\u000b\u0000\u0000UV\u0007"+
		"\u0002\u0000\u0000V]\u0003\u0004\u0002\fWX\n\t\u0000\u0000XY\u0005\u0001"+
		"\u0000\u0000YZ\u0003\n\u0005\u0000Z[\u0005\u0002\u0000\u0000[]\u0001\u0000"+
		"\u0000\u0000\\N\u0001\u0000\u0000\u0000\\Q\u0001\u0000\u0000\u0000\\T"+
		"\u0001\u0000\u0000\u0000\\W\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\u0005\u0001"+
		"\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000ae\u0005\u0003\u0000\u0000"+
		"bd\u0003\u0002\u0001\u0000cb\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000"+
		"\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000hk\u0005\u0004\u0000\u0000ik\u0003"+
		"\u0002\u0001\u0000ja\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000"+
		"k\u0007\u0001\u0000\u0000\u0000lq\u0005\u000f\u0000\u0000mn\u0005\u0005"+
		"\u0000\u0000np\u0005\u000f\u0000\u0000om\u0001\u0000\u0000\u0000ps\u0001"+
		"\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000"+
		"ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000tl\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000u\t\u0001\u0000\u0000\u0000v{\u0003\u0004"+
		"\u0002\u0000wx\u0005\u0005\u0000\u0000xz\u0003\u0004\u0002\u0000yw\u0001"+
		"\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000"+
		"\u0000\u0000~v\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000"+
		"\u007f\u000b\u0001\u0000\u0000\u0000\f\u000f-0L\\^ejqt{~";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
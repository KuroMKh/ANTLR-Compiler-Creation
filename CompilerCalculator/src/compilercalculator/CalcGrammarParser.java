// Generated from java-escape by ANTLR 4.11.1

	package compilercalculator;
	import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CalcGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ID=8, INT=9, FLOAT=10, 
		NEWLINE=11, WS=12;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr = 2, RULE_multExpr = 3, RULE_atom = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr", "multExpr", "atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'+'", "'-'", "'/'", "'*'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "ID", "INT", "FLOAT", 
			"NEWLINE", "WS"
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


		/** Map variable name to Integer object holding value */
		HashMap memory = new HashMap();

	public CalcGrammarParser(TokenStream input) {
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				stat();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 3392L) != 0 );
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
		public ExprContext expr;
		public Token ID;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CalcGrammarParser.NEWLINE, 0); }
		public TerminalNode ID() { return getToken(CalcGrammarParser.ID, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				((StatContext)_localctx).expr = expr();
				setState(17);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(16);
					match(NEWLINE);
					}
					break;
				}
				System.out.println(((StatContext)_localctx).expr.value);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				((StatContext)_localctx).ID = match(ID);
				setState(22);
				match(T__0);
				setState(23);
				((StatContext)_localctx).expr = expr();
				setState(24);
				match(NEWLINE);

						memory.put((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null), new Float(((StatContext)_localctx).expr.value));
						//System.out.println("New variable: "+(((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null)+" with value ="+((StatContext)_localctx).expr.value);
				      
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				match(NEWLINE);
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
		public float value;
		public MultExprContext e;
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			((ExprContext)_localctx).e = multExpr();
			((ExprContext)_localctx).value =  ((ExprContext)_localctx).e.value;
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__2) {
				{
				setState(43);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(32);
					match(T__1);
					setState(33);
					((ExprContext)_localctx).e = multExpr();
					_localctx.value += ((ExprContext)_localctx).e.value;
					}
					break;
				case T__2:
					{
					setState(36);
					match(T__2);
					setState(37);
					((ExprContext)_localctx).e = multExpr();
					_localctx.value -= ((ExprContext)_localctx).e.value;
					setState(39);
					match(T__3);
					setState(40);
					((ExprContext)_localctx).e = multExpr();
					_localctx.value /= ((ExprContext)_localctx).e.value;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class MultExprContext extends ParserRuleContext {
		public float value;
		public AtomContext e;
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).enterMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).exitMultExpr(this);
		}
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_multExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			((MultExprContext)_localctx).e = atom();
			((MultExprContext)_localctx).value =  ((MultExprContext)_localctx).e.value;
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(50);
				match(T__4);
				setState(51);
				((MultExprContext)_localctx).e = atom();
				_localctx.value *= ((MultExprContext)_localctx).e.value;
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class AtomContext extends ParserRuleContext {
		public float value;
		public Token FLOAT;
		public Token ID;
		public ExprContext e;
		public TerminalNode FLOAT() { return getToken(CalcGrammarParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(CalcGrammarParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalcGrammarListener ) ((CalcGrammarListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atom);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				((AtomContext)_localctx).FLOAT = match(FLOAT);
				((AtomContext)_localctx).value =  Float.parseFloat((((AtomContext)_localctx).FLOAT!=null?((AtomContext)_localctx).FLOAT.getText():null));
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				((AtomContext)_localctx).ID = match(ID);

				        Float v = (Float)memory.get((((AtomContext)_localctx).ID!=null?((AtomContext)_localctx).ID.getText():null));
				        if ( v!=null ) ((AtomContext)_localctx).value =  v.floatValue();
				        else System.err.println("undefined variable "+(((AtomContext)_localctx).ID!=null?((AtomContext)_localctx).ID.getText():null));
				        
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(T__5);
				setState(64);
				((AtomContext)_localctx).e = expr();
				setState(65);
				match(T__6);
				((AtomContext)_localctx).value =  ((AtomContext)_localctx).e.value;
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

	public static final String _serializedATN =
		"\u0004\u0001\fG\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u0012\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u001d\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002,\b\u0002\n\u0002\f\u0002/\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u00037\b\u0003\n\u0003\f\u0003:\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004E\b\u0004\u0001\u0004\u0000\u0000\u0005\u0000"+
		"\u0002\u0004\u0006\b\u0000\u0000J\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0002\u001c\u0001\u0000\u0000\u0000\u0004\u001e\u0001\u0000\u0000\u0000"+
		"\u00060\u0001\u0000\u0000\u0000\bD\u0001\u0000\u0000\u0000\n\f\u0003\u0002"+
		"\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000\f\r\u0001\u0000\u0000\u0000"+
		"\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e"+
		"\u0001\u0001\u0000\u0000\u0000\u000f\u0011\u0003\u0004\u0002\u0000\u0010"+
		"\u0012\u0005\u000b\u0000\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0011"+
		"\u0012\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013"+
		"\u0014\u0006\u0001\uffff\uffff\u0000\u0014\u001d\u0001\u0000\u0000\u0000"+
		"\u0015\u0016\u0005\b\u0000\u0000\u0016\u0017\u0005\u0001\u0000\u0000\u0017"+
		"\u0018\u0003\u0004\u0002\u0000\u0018\u0019\u0005\u000b\u0000\u0000\u0019"+
		"\u001a\u0006\u0001\uffff\uffff\u0000\u001a\u001d\u0001\u0000\u0000\u0000"+
		"\u001b\u001d\u0005\u000b\u0000\u0000\u001c\u000f\u0001\u0000\u0000\u0000"+
		"\u001c\u0015\u0001\u0000\u0000\u0000\u001c\u001b\u0001\u0000\u0000\u0000"+
		"\u001d\u0003\u0001\u0000\u0000\u0000\u001e\u001f\u0003\u0006\u0003\u0000"+
		"\u001f-\u0006\u0002\uffff\uffff\u0000 !\u0005\u0002\u0000\u0000!\"\u0003"+
		"\u0006\u0003\u0000\"#\u0006\u0002\uffff\uffff\u0000#,\u0001\u0000\u0000"+
		"\u0000$%\u0005\u0003\u0000\u0000%&\u0003\u0006\u0003\u0000&\'\u0006\u0002"+
		"\uffff\uffff\u0000\'(\u0005\u0004\u0000\u0000()\u0003\u0006\u0003\u0000"+
		")*\u0006\u0002\uffff\uffff\u0000*,\u0001\u0000\u0000\u0000+ \u0001\u0000"+
		"\u0000\u0000+$\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.\u0005\u0001\u0000\u0000"+
		"\u0000/-\u0001\u0000\u0000\u000001\u0003\b\u0004\u000018\u0006\u0003\uffff"+
		"\uffff\u000023\u0005\u0005\u0000\u000034\u0003\b\u0004\u000045\u0006\u0003"+
		"\uffff\uffff\u000057\u0001\u0000\u0000\u000062\u0001\u0000\u0000\u0000"+
		"7:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000"+
		"\u00009\u0007\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000;<\u0005"+
		"\n\u0000\u0000<E\u0006\u0004\uffff\uffff\u0000=>\u0005\b\u0000\u0000>"+
		"E\u0006\u0004\uffff\uffff\u0000?@\u0005\u0006\u0000\u0000@A\u0003\u0004"+
		"\u0002\u0000AB\u0005\u0007\u0000\u0000BC\u0006\u0004\uffff\uffff\u0000"+
		"CE\u0001\u0000\u0000\u0000D;\u0001\u0000\u0000\u0000D=\u0001\u0000\u0000"+
		"\u0000D?\u0001\u0000\u0000\u0000E\t\u0001\u0000\u0000\u0000\u0007\r\u0011"+
		"\u001c+-8D";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
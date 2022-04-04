// Generated from C:/Users/Kuba/Desktop/spasspr/Spass-Prover9-converter-master/src/grammar\prover9Parser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class prover9ParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, OPEN_PAREN=15, CLOSE_PAREN=16, 
		AND=17, OR=18, NOT=19, FORALL=20, RIGHT_IMPLIES=21, LEFT_IMPLIES=22, IFF=23, 
		EQ=24, NOT_EQ=25, EXISTS=26, FALSE=27, TRUE=28, COMMA=29, DOT=30, INTEGER=31, 
		IDENT=32, WS=33, BINARY_TERM_OPERATION=34, Identifier=35;
	public static final int
		RULE_top_level_formula = 0, RULE_integer = 1, RULE_string = 2, RULE_formula = 3, 
		RULE_problem = 4, RULE_logical_part = 5, RULE_term = 6, RULE_term_list = 7, 
		RULE_quant_sym = 8, RULE_symbol = 9, RULE_cnf_clause_body = 10, RULE_binary_operation = 11, 
		RULE_quantifier = 12, RULE_identifier = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"top_level_formula", "integer", "string", "formula", "problem", "logical_part", 
			"term", "term_list", "quant_sym", "symbol", "cnf_clause_body", "binary_operation", 
			"quantifier", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'formulas'", "'end_of_list'", "'['", "']'", "'forall'", "'equal'", 
			"'true'", "'false'", "'or'", "'and'", "'not'", "'implies'", "'implied'", 
			"'equiv'", "'('", "')'", "'&'", "'|'", "'-'", "'all'", "'->'", "'<-'", 
			"'<->'", "'='", "'!='", "'exists'", "'$F'", "'$T'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "OPEN_PAREN", "CLOSE_PAREN", "AND", "OR", "NOT", "FORALL", 
			"RIGHT_IMPLIES", "LEFT_IMPLIES", "IFF", "EQ", "NOT_EQ", "EXISTS", "FALSE", 
			"TRUE", "COMMA", "DOT", "INTEGER", "IDENT", "WS", "BINARY_TERM_OPERATION", 
			"Identifier"
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
	public String getGrammarFileName() { return "prover9Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public prover9ParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Top_level_formulaContext extends ParserRuleContext {
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public TerminalNode DOT() { return getToken(prover9ParserParser.DOT, 0); }
		public Top_level_formulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_level_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).enterTop_level_formula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).exitTop_level_formula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof prover9ParserVisitor ) return ((prover9ParserVisitor<? extends T>)visitor).visitTop_level_formula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Top_level_formulaContext top_level_formula() throws RecognitionException {
		Top_level_formulaContext _localctx = new Top_level_formulaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_top_level_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			formula();
			setState(29);
			match(DOT);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(prover9ParserParser.INTEGER, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof prover9ParserVisitor ) return ((prover9ParserVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(INTEGER);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(prover9ParserParser.IDENT, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof prover9ParserVisitor ) return ((prover9ParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(IDENT);
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

	public static class FormulaContext extends ParserRuleContext {
		public List<ProblemContext> problem() {
			return getRuleContexts(ProblemContext.class);
		}
		public ProblemContext problem(int i) {
			return getRuleContext(ProblemContext.class,i);
		}
		public TerminalNode EOF() { return getToken(prover9ParserParser.EOF, 0); }
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).enterFormula(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).exitFormula(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof prover9ParserVisitor ) return ((prover9ParserVisitor<? extends T>)visitor).visitFormula(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		FormulaContext _localctx = new FormulaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formula);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			problem();
			setState(36);
			problem();
			setState(37);
			match(EOF);
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

	public static class ProblemContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(prover9ParserParser.OPEN_PAREN, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(prover9ParserParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> DOT() { return getTokens(prover9ParserParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(prover9ParserParser.DOT, i);
		}
		public Logical_partContext logical_part() {
			return getRuleContext(Logical_partContext.class,0);
		}
		public ProblemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_problem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).enterProblem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).exitProblem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof prover9ParserVisitor ) return ((prover9ParserVisitor<? extends T>)visitor).visitProblem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProblemContext problem() throws RecognitionException {
		ProblemContext _localctx = new ProblemContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_problem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__0);
			setState(40);
			match(OPEN_PAREN);
			setState(41);
			string();
			setState(42);
			match(CLOSE_PAREN);
			setState(43);
			match(DOT);
			setState(44);
			logical_part();
			setState(45);
			match(T__1);
			setState(46);
			match(DOT);
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

	public static class Logical_partContext extends ParserRuleContext {
		public List<TerminalNode> DOT() { return getTokens(prover9ParserParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(prover9ParserParser.DOT, i);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(prover9ParserParser.OPEN_PAREN, 0); }
		public List<Cnf_clause_bodyContext> cnf_clause_body() {
			return getRuleContexts(Cnf_clause_bodyContext.class);
		}
		public Cnf_clause_bodyContext cnf_clause_body(int i) {
			return getRuleContext(Cnf_clause_bodyContext.class,i);
		}
		public Binary_operationContext binary_operation() {
			return getRuleContext(Binary_operationContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(prover9ParserParser.CLOSE_PAREN, 0); }
		public Logical_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).enterLogical_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).exitLogical_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof prover9ParserVisitor ) return ((prover9ParserVisitor<? extends T>)visitor).visitLogical_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_partContext logical_part() throws RecognitionException {
		Logical_partContext _localctx = new Logical_partContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_logical_part);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(48);
				quantifier();
				setState(49);
				term();
				setState(50);
				match(OPEN_PAREN);
				setState(51);
				cnf_clause_body();
				setState(52);
				binary_operation();
				setState(53);
				cnf_clause_body();
				setState(54);
				match(CLOSE_PAREN);
				setState(55);
				match(DOT);
				}
				break;
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << EXISTS) | (1L << IDENT) | (1L << Identifier))) != 0)) {
				{
				setState(59);
				cnf_clause_body();
				}
			}

			setState(62);
			match(DOT);
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

	public static class TermContext extends ParserRuleContext {
		public Quant_symContext quant_sym() {
			return getRuleContext(Quant_symContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(prover9ParserParser.OPEN_PAREN, 0); }
		public Term_listContext term_list() {
			return getRuleContext(Term_listContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(prover9ParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(prover9ParserParser.COMMA, i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(prover9ParserParser.CLOSE_PAREN, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof prover9ParserVisitor ) return ((prover9ParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_term);
		int _la;
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				quant_sym();
				setState(65);
				match(OPEN_PAREN);
				setState(66);
				term_list();
				setState(67);
				match(COMMA);
				setState(68);
				term();
				setState(69);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				symbol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				symbol();
				setState(73);
				match(OPEN_PAREN);
				setState(74);
				term();
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(75);
					match(COMMA);
					setState(76);
					term();
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(82);
				match(CLOSE_PAREN);
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

	public static class Term_listContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(prover9ParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(prover9ParserParser.COMMA, i);
		}
		public Term_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).enterTerm_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).exitTerm_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof prover9ParserVisitor ) return ((prover9ParserVisitor<? extends T>)visitor).visitTerm_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Term_listContext term_list() throws RecognitionException {
		Term_listContext _localctx = new Term_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_term_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__2);
			setState(87);
			term();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(88);
				match(COMMA);
				setState(89);
				term();
				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			match(T__3);
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

	public static class Quant_symContext extends ParserRuleContext {
		public TerminalNode EXISTS() { return getToken(prover9ParserParser.EXISTS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Quant_symContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quant_sym; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).enterQuant_sym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).exitQuant_sym(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof prover9ParserVisitor ) return ((prover9ParserVisitor<? extends T>)visitor).visitQuant_sym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Quant_symContext quant_sym() throws RecognitionException {
		Quant_symContext _localctx = new Quant_symContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_quant_sym);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(T__4);
				}
				break;
			case EXISTS:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(EXISTS);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				identifier();
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

	public static class SymbolContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).exitSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof prover9ParserVisitor ) return ((prover9ParserVisitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_symbol);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(T__7);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 8);
				{
				setState(109);
				match(T__12);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 9);
				{
				setState(110);
				match(T__13);
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 10);
				{
				setState(111);
				identifier();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 11);
				{
				setState(112);
				string();
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

	public static class Cnf_clause_bodyContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(prover9ParserParser.OPEN_PAREN, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(prover9ParserParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(prover9ParserParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(prover9ParserParser.COMMA, i);
		}
		public Cnf_clause_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cnf_clause_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).enterCnf_clause_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).exitCnf_clause_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof prover9ParserVisitor ) return ((prover9ParserVisitor<? extends T>)visitor).visitCnf_clause_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cnf_clause_bodyContext cnf_clause_body() throws RecognitionException {
		Cnf_clause_bodyContext _localctx = new Cnf_clause_bodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cnf_clause_body);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(T__8);
				setState(116);
				match(OPEN_PAREN);
				setState(117);
				term();
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(118);
					match(COMMA);
					setState(119);
					term();
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(125);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				term();
				setState(128);
				match(OPEN_PAREN);
				setState(129);
				term();
				setState(130);
				match(CLOSE_PAREN);
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

	public static class Binary_operationContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(prover9ParserParser.OR, 0); }
		public TerminalNode AND() { return getToken(prover9ParserParser.AND, 0); }
		public TerminalNode RIGHT_IMPLIES() { return getToken(prover9ParserParser.RIGHT_IMPLIES, 0); }
		public TerminalNode LEFT_IMPLIES() { return getToken(prover9ParserParser.LEFT_IMPLIES, 0); }
		public TerminalNode IFF() { return getToken(prover9ParserParser.IFF, 0); }
		public Binary_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).enterBinary_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).exitBinary_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof prover9ParserVisitor ) return ((prover9ParserVisitor<? extends T>)visitor).visitBinary_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_operationContext binary_operation() throws RecognitionException {
		Binary_operationContext _localctx = new Binary_operationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_binary_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << OR) | (1L << RIGHT_IMPLIES) | (1L << LEFT_IMPLIES) | (1L << IFF))) != 0)) ) {
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

	public static class QuantifierContext extends ParserRuleContext {
		public TerminalNode FORALL() { return getToken(prover9ParserParser.FORALL, 0); }
		public TerminalNode EXISTS() { return getToken(prover9ParserParser.EXISTS, 0); }
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).enterQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).exitQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof prover9ParserVisitor ) return ((prover9ParserVisitor<? extends T>)visitor).visitQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !(_la==FORALL || _la==EXISTS) ) {
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(prover9ParserParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prover9ParserListener ) ((prover9ParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof prover9ParserVisitor ) return ((prover9ParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(Identifier);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u008f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7<\n\7\3\7\5\7?\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bP\n\b\f\b\16\bS\13\b\3\b\3\b\5\bW\n\b"+
		"\3\t\3\t\3\t\3\t\7\t]\n\t\f\t\16\t`\13\t\3\t\3\t\3\n\3\n\3\n\5\ng\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13t\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\7\f{\n\f\f\f\16\f~\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u0087\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\2\4\4\2\23\24\27\31\4\2\26\26\34\34\2\u0094\2\36\3"+
		"\2\2\2\4!\3\2\2\2\6#\3\2\2\2\b%\3\2\2\2\n)\3\2\2\2\f;\3\2\2\2\16V\3\2"+
		"\2\2\20X\3\2\2\2\22f\3\2\2\2\24s\3\2\2\2\26\u0086\3\2\2\2\30\u0088\3\2"+
		"\2\2\32\u008a\3\2\2\2\34\u008c\3\2\2\2\36\37\5\b\5\2\37 \7 \2\2 \3\3\2"+
		"\2\2!\"\7!\2\2\"\5\3\2\2\2#$\7\"\2\2$\7\3\2\2\2%&\5\n\6\2&\'\5\n\6\2\'"+
		"(\7\2\2\3(\t\3\2\2\2)*\7\3\2\2*+\7\21\2\2+,\5\6\4\2,-\7\22\2\2-.\7 \2"+
		"\2./\5\f\7\2/\60\7\4\2\2\60\61\7 \2\2\61\13\3\2\2\2\62\63\5\32\16\2\63"+
		"\64\5\16\b\2\64\65\7\21\2\2\65\66\5\26\f\2\66\67\5\30\r\2\678\5\26\f\2"+
		"89\7\22\2\29:\7 \2\2:<\3\2\2\2;\62\3\2\2\2;<\3\2\2\2<>\3\2\2\2=?\5\26"+
		"\f\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7 \2\2A\r\3\2\2\2BC\5\22\n\2CD\7"+
		"\21\2\2DE\5\20\t\2EF\7\37\2\2FG\5\16\b\2GH\7\22\2\2HW\3\2\2\2IW\5\24\13"+
		"\2JK\5\24\13\2KL\7\21\2\2LQ\5\16\b\2MN\7\37\2\2NP\5\16\b\2OM\3\2\2\2P"+
		"S\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7\22\2\2UW\3\2\2\2"+
		"VB\3\2\2\2VI\3\2\2\2VJ\3\2\2\2W\17\3\2\2\2XY\7\5\2\2Y^\5\16\b\2Z[\7\37"+
		"\2\2[]\5\16\b\2\\Z\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^"+
		"\3\2\2\2ab\7\6\2\2b\21\3\2\2\2cg\7\7\2\2dg\7\34\2\2eg\5\34\17\2fc\3\2"+
		"\2\2fd\3\2\2\2fe\3\2\2\2g\23\3\2\2\2ht\7\b\2\2it\7\t\2\2jt\7\n\2\2kt\7"+
		"\13\2\2lt\7\f\2\2mt\7\r\2\2nt\7\16\2\2ot\7\17\2\2pt\7\20\2\2qt\5\34\17"+
		"\2rt\5\6\4\2sh\3\2\2\2si\3\2\2\2sj\3\2\2\2sk\3\2\2\2sl\3\2\2\2sm\3\2\2"+
		"\2sn\3\2\2\2so\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3\2\2\2t\25\3\2\2\2uv\7\13"+
		"\2\2vw\7\21\2\2w|\5\16\b\2xy\7\37\2\2y{\5\16\b\2zx\3\2\2\2{~\3\2\2\2|"+
		"z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\22\2\2\u0080\u0087"+
		"\3\2\2\2\u0081\u0082\5\16\b\2\u0082\u0083\7\21\2\2\u0083\u0084\5\16\b"+
		"\2\u0084\u0085\7\22\2\2\u0085\u0087\3\2\2\2\u0086u\3\2\2\2\u0086\u0081"+
		"\3\2\2\2\u0087\27\3\2\2\2\u0088\u0089\t\2\2\2\u0089\31\3\2\2\2\u008a\u008b"+
		"\t\3\2\2\u008b\33\3\2\2\2\u008c\u008d\7%\2\2\u008d\35\3\2\2\2\13;>QV^"+
		"fs|\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from Neo4J.g by ANTLR 4.5.3
package lenguajes.project;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Neo4JParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, MATCH=5, CREATE=6, RETURN=7, AVG=8, AND=9, 
		SUM=10, DISTINCT=11, MAX=12, MIN=13, WITH=14, OPTIONAL=15, OR=16, NOT=17, 
		EXISTS=18, HAS=19, STARTS=20, ENDS=21, TRUE=22, FALSE=23, CONTAINS=24, 
		WHERE=25, IN=26, COUNT=27, RELS=28, RELATIONSHIP=29, NODE=30, NODES=31, 
		PROPS=32, INDEX=33, ON=34, SET=35, DETACH=36, DELETE=37, REMOVE=38, ORDER=39, 
		BY=40, DESC=41, ASC=42, LENGHT=43, LIMIT=44, SKIP_TOKEN=45, RAND=46, DROP=47, 
		ID=48, LABEL=49, TOKEN_IGUAL=50, TOKEN_REGEX=51, TOKEN_AGREGAR=52, TOKEN_DIF=53, 
		TOKEN_MAYOR=54, TOKEN_MAYOR_IGUAL=55, TOKEN_MENOR=56, TOKEN_MENOR_IGUAL=57, 
		TOKEN_PAR_IZR=58, TOKEN_PAR_DER=59, TOKEN_COR_IZR=60, TOKEN_COR_DER=61, 
		TOKEN_LLAVE_IZR=62, TOKEN_LLAVE_DER=63, TOKEN_COMA=64, TOKEN_PYC=65, TOKEN_FIN_LINEA=66, 
		TOKEN_MUL=67, TOKEN_DIV=68, TOKEN_MAS=69, TOKEN_MENOS=70, TOKEN_RELATION=71, 
		TOKEN_DIRECTED_RELATION=72, TOKEN_POT=73, TOKEN_PUNTO=74, TOKEN_XOR=75, 
		TOKEN_DOSP=76, TOKEN_CADENA=77, TOKEN_REAL=78, TOKEN_ENTERO=79, WS=80, 
		LINE_COMMENT=81;
	public static final int
		RULE_init = 0, RULE_select_sentence = 1, RULE_basic_query = 2, RULE_opt_where = 3, 
		RULE_create = 4, RULE_opt_create = 5, RULE_relation_def = 6, RULE_relation_type = 7, 
		RULE_node_def = 8, RULE_definition = 9, RULE_props_list = 10, RULE_prop = 11, 
		RULE_exp = 12, RULE_b_term = 13, RULE_eq_factor = 14, RULE_dif_opt = 15, 
		RULE_b_factor = 16, RULE_rel_opt = 17, RULE_exp_num = 18, RULE_sum_opt = 19, 
		RULE_mod_term = 20, RULE_mul_opt = 21, RULE_s_term = 22, RULE_not_factor = 23, 
		RULE_factor = 24, RULE_function_sentence = 25, RULE_relationship_rels = 26, 
		RULE_node_nodes = 27, RULE_token_mod = 28, RULE_token_y = 29, RULE_token_o = 30, 
		RULE_token_neg = 31;
	public static final String[] ruleNames = {
		"init", "select_sentence", "basic_query", "opt_where", "create", "opt_create", 
		"relation_def", "relation_type", "node_def", "definition", "props_list", 
		"prop", "exp", "b_term", "eq_factor", "dif_opt", "b_factor", "rel_opt", 
		"exp_num", "sum_opt", "mod_term", "mul_opt", "s_term", "not_factor", "factor", 
		"function_sentence", "relationship_rels", "node_nodes", "token_mod", "token_y", 
		"token_o", "token_neg"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'%'", "'&'", "'|'", "'~'", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'='", "'~='", "'+='", "'!='", "'>'", "'>='", "'<'", 
		"'<='", "'('", "')'", "'['", "']'", "'{'", "'}'", "','", "';'", "'\n'", 
		"'*'", "'/'", "'+'", "'-'", "'--'", "'-->'", "'^'", "'.'", null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "MATCH", "CREATE", "RETURN", "AVG", "AND", 
		"SUM", "DISTINCT", "MAX", "MIN", "WITH", "OPTIONAL", "OR", "NOT", "EXISTS", 
		"HAS", "STARTS", "ENDS", "TRUE", "FALSE", "CONTAINS", "WHERE", "IN", "COUNT", 
		"RELS", "RELATIONSHIP", "NODE", "NODES", "PROPS", "INDEX", "ON", "SET", 
		"DETACH", "DELETE", "REMOVE", "ORDER", "BY", "DESC", "ASC", "LENGHT", 
		"LIMIT", "SKIP_TOKEN", "RAND", "DROP", "ID", "LABEL", "TOKEN_IGUAL", "TOKEN_REGEX", 
		"TOKEN_AGREGAR", "TOKEN_DIF", "TOKEN_MAYOR", "TOKEN_MAYOR_IGUAL", "TOKEN_MENOR", 
		"TOKEN_MENOR_IGUAL", "TOKEN_PAR_IZR", "TOKEN_PAR_DER", "TOKEN_COR_IZR", 
		"TOKEN_COR_DER", "TOKEN_LLAVE_IZR", "TOKEN_LLAVE_DER", "TOKEN_COMA", "TOKEN_PYC", 
		"TOKEN_FIN_LINEA", "TOKEN_MUL", "TOKEN_DIV", "TOKEN_MAS", "TOKEN_MENOS", 
		"TOKEN_RELATION", "TOKEN_DIRECTED_RELATION", "TOKEN_POT", "TOKEN_PUNTO", 
		"TOKEN_XOR", "TOKEN_DOSP", "TOKEN_CADENA", "TOKEN_REAL", "TOKEN_ENTERO", 
		"WS", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Neo4J.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Neo4JParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public List<CreateContext> create() {
			return getRuleContexts(CreateContext.class);
		}
		public CreateContext create(int i) {
			return getRuleContext(CreateContext.class,i);
		}
		public List<Select_sentenceContext> select_sentence() {
			return getRuleContexts(Select_sentenceContext.class);
		}
		public Select_sentenceContext select_sentence(int i) {
			return getRuleContext(Select_sentenceContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CREATE) {
					{
					{
					setState(64);
					create();
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MATCH) {
					{
					{
					setState(70);
					select_sentence();
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Select_sentenceContext extends ParserRuleContext {
		public Opt_whereContext opt_where() {
			return getRuleContext(Opt_whereContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode TOKEN_PYC() { return getToken(Neo4JParser.TOKEN_PYC, 0); }
		public TerminalNode RETURN() { return getToken(Neo4JParser.RETURN, 0); }
		public TerminalNode SET() { return getToken(Neo4JParser.SET, 0); }
		public TerminalNode DELETE() { return getToken(Neo4JParser.DELETE, 0); }
		public List<TerminalNode> MATCH() { return getTokens(Neo4JParser.MATCH); }
		public TerminalNode MATCH(int i) {
			return getToken(Neo4JParser.MATCH, i);
		}
		public List<Basic_queryContext> basic_query() {
			return getRuleContexts(Basic_queryContext.class);
		}
		public Basic_queryContext basic_query(int i) {
			return getRuleContext(Basic_queryContext.class,i);
		}
		public List<TerminalNode> TOKEN_COMA() { return getTokens(Neo4JParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(Neo4JParser.TOKEN_COMA, i);
		}
		public Select_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterSelect_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitSelect_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitSelect_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_sentenceContext select_sentence() throws RecognitionException {
		Select_sentenceContext _localctx = new Select_sentenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_select_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(78);
				match(MATCH);
				setState(79);
				basic_query();
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MATCH );
			setState(84);
			opt_where();
			setState(85);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << SET) | (1L << DELETE))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(86);
			exp(0);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(87);
				match(TOKEN_COMA);
				setState(88);
				exp(0);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(TOKEN_PYC);
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

	public static class Basic_queryContext extends ParserRuleContext {
		public List<Node_defContext> node_def() {
			return getRuleContexts(Node_defContext.class);
		}
		public Node_defContext node_def(int i) {
			return getRuleContext(Node_defContext.class,i);
		}
		public Relation_typeContext relation_type() {
			return getRuleContext(Relation_typeContext.class,0);
		}
		public Basic_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterBasic_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitBasic_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitBasic_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_queryContext basic_query() throws RecognitionException {
		Basic_queryContext _localctx = new Basic_queryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_basic_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			node_def();
			setState(100);
			_la = _input.LA(1);
			if (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (TOKEN_MENOS - 70)) | (1L << (TOKEN_RELATION - 70)) | (1L << (TOKEN_DIRECTED_RELATION - 70)))) != 0)) {
				{
				setState(97);
				relation_type();
				setState(98);
				node_def();
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

	public static class Opt_whereContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(Neo4JParser.WHERE, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> TOKEN_COMA() { return getTokens(Neo4JParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(Neo4JParser.TOKEN_COMA, i);
		}
		public Opt_whereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterOpt_where(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitOpt_where(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitOpt_where(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_whereContext opt_where() throws RecognitionException {
		Opt_whereContext _localctx = new Opt_whereContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_opt_where);
		int _la;
		try {
			setState(112);
			switch (_input.LA(1)) {
			case WHERE:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(WHERE);
				setState(103);
				exp(0);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOKEN_COMA) {
					{
					{
					setState(104);
					match(TOKEN_COMA);
					setState(105);
					exp(0);
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RETURN:
			case SET:
			case DELETE:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class CreateContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(Neo4JParser.CREATE, 0); }
		public Opt_createContext opt_create() {
			return getRuleContext(Opt_createContext.class,0);
		}
		public TerminalNode TOKEN_PYC() { return getToken(Neo4JParser.TOKEN_PYC, 0); }
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitCreate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitCreate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_create);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(CREATE);
			setState(115);
			opt_create();
			setState(116);
			match(TOKEN_PYC);
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

	public static class Opt_createContext extends ParserRuleContext {
		public Opt_createContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_create; }
	 
		public Opt_createContext() { }
		public void copyFrom(Opt_createContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Create_multipleContext extends Opt_createContext {
		public List<Node_defContext> node_def() {
			return getRuleContexts(Node_defContext.class);
		}
		public Node_defContext node_def(int i) {
			return getRuleContext(Node_defContext.class,i);
		}
		public List<TerminalNode> TOKEN_COMA() { return getTokens(Neo4JParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(Neo4JParser.TOKEN_COMA, i);
		}
		public Create_multipleContext(Opt_createContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterCreate_multiple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitCreate_multiple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitCreate_multiple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Create_relationContext extends Opt_createContext {
		public List<Relation_defContext> relation_def() {
			return getRuleContexts(Relation_defContext.class);
		}
		public Relation_defContext relation_def(int i) {
			return getRuleContext(Relation_defContext.class,i);
		}
		public List<TerminalNode> TOKEN_COMA() { return getTokens(Neo4JParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(Neo4JParser.TOKEN_COMA, i);
		}
		public Create_relationContext(Opt_createContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterCreate_relation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitCreate_relation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitCreate_relation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_createContext opt_create() throws RecognitionException {
		Opt_createContext _localctx = new Opt_createContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_opt_create);
		int _la;
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new Create_multipleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				node_def();
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOKEN_COMA) {
					{
					{
					setState(119);
					match(TOKEN_COMA);
					setState(120);
					node_def();
					}
					}
					setState(125);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new Create_relationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				relation_def();
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOKEN_COMA) {
					{
					{
					setState(127);
					match(TOKEN_COMA);
					setState(128);
					relation_def();
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class Relation_defContext extends ParserRuleContext {
		public List<Node_defContext> node_def() {
			return getRuleContexts(Node_defContext.class);
		}
		public Node_defContext node_def(int i) {
			return getRuleContext(Node_defContext.class,i);
		}
		public Relation_typeContext relation_type() {
			return getRuleContext(Relation_typeContext.class,0);
		}
		public Relation_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterRelation_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitRelation_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitRelation_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relation_defContext relation_def() throws RecognitionException {
		Relation_defContext _localctx = new Relation_defContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_relation_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			node_def();
			setState(137);
			relation_type();
			setState(138);
			node_def();
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

	public static class Relation_typeContext extends ParserRuleContext {
		public Relation_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_type; }
	 
		public Relation_typeContext() { }
		public void copyFrom(Relation_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Simple_relationContext extends Relation_typeContext {
		public TerminalNode TOKEN_RELATION() { return getToken(Neo4JParser.TOKEN_RELATION, 0); }
		public Simple_relationContext(Relation_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterSimple_relation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitSimple_relation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitSimple_relation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Directed_relationContext extends Relation_typeContext {
		public TerminalNode TOKEN_DIRECTED_RELATION() { return getToken(Neo4JParser.TOKEN_DIRECTED_RELATION, 0); }
		public Directed_relationContext(Relation_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterDirected_relation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitDirected_relation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitDirected_relation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Complex_relationContext extends Relation_typeContext {
		public List<TerminalNode> TOKEN_MENOS() { return getTokens(Neo4JParser.TOKEN_MENOS); }
		public TerminalNode TOKEN_MENOS(int i) {
			return getToken(Neo4JParser.TOKEN_MENOS, i);
		}
		public TerminalNode TOKEN_COR_IZR() { return getToken(Neo4JParser.TOKEN_COR_IZR, 0); }
		public TerminalNode TOKEN_COR_DER() { return getToken(Neo4JParser.TOKEN_COR_DER, 0); }
		public TerminalNode TOKEN_DOSP() { return getToken(Neo4JParser.TOKEN_DOSP, 0); }
		public TerminalNode LABEL() { return getToken(Neo4JParser.LABEL, 0); }
		public List<TerminalNode> TOKEN_MAYOR() { return getTokens(Neo4JParser.TOKEN_MAYOR); }
		public TerminalNode TOKEN_MAYOR(int i) {
			return getToken(Neo4JParser.TOKEN_MAYOR, i);
		}
		public Complex_relationContext(Relation_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterComplex_relation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitComplex_relation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitComplex_relation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relation_typeContext relation_type() throws RecognitionException {
		Relation_typeContext _localctx = new Relation_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_relation_type);
		int _la;
		try {
			setState(155);
			switch (_input.LA(1)) {
			case TOKEN_RELATION:
				_localctx = new Simple_relationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(TOKEN_RELATION);
				}
				break;
			case TOKEN_DIRECTED_RELATION:
				_localctx = new Directed_relationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(TOKEN_DIRECTED_RELATION);
				}
				break;
			case TOKEN_MENOS:
				_localctx = new Complex_relationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(TOKEN_MENOS);
				setState(143);
				match(TOKEN_COR_IZR);
				setState(146);
				_la = _input.LA(1);
				if (_la==TOKEN_DOSP) {
					{
					setState(144);
					match(TOKEN_DOSP);
					setState(145);
					match(LABEL);
					}
				}

				setState(148);
				match(TOKEN_COR_DER);
				setState(149);
				match(TOKEN_MENOS);
				setState(151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(150);
					match(TOKEN_MAYOR);
					}
					}
					setState(153); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TOKEN_MAYOR );
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

	public static class Node_defContext extends ParserRuleContext {
		public TerminalNode TOKEN_PAR_IZR() { return getToken(Neo4JParser.TOKEN_PAR_IZR, 0); }
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public TerminalNode TOKEN_PAR_DER() { return getToken(Neo4JParser.TOKEN_PAR_DER, 0); }
		public Node_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterNode_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitNode_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitNode_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_defContext node_def() throws RecognitionException {
		Node_defContext _localctx = new Node_defContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_node_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(TOKEN_PAR_IZR);
			setState(158);
			definition();
			setState(159);
			match(TOKEN_PAR_DER);
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

	public static class DefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Neo4JParser.ID, 0); }
		public TerminalNode TOKEN_DOSP() { return getToken(Neo4JParser.TOKEN_DOSP, 0); }
		public TerminalNode LABEL() { return getToken(Neo4JParser.LABEL, 0); }
		public Props_listContext props_list() {
			return getRuleContext(Props_listContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_definition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(ID);
			setState(162);
			match(TOKEN_DOSP);
			setState(163);
			match(LABEL);
			setState(165);
			_la = _input.LA(1);
			if (_la==TOKEN_LLAVE_IZR) {
				{
				setState(164);
				props_list();
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

	public static class Props_listContext extends ParserRuleContext {
		public TerminalNode TOKEN_LLAVE_IZR() { return getToken(Neo4JParser.TOKEN_LLAVE_IZR, 0); }
		public List<PropContext> prop() {
			return getRuleContexts(PropContext.class);
		}
		public PropContext prop(int i) {
			return getRuleContext(PropContext.class,i);
		}
		public TerminalNode TOKEN_LLAVE_DER() { return getToken(Neo4JParser.TOKEN_LLAVE_DER, 0); }
		public List<TerminalNode> TOKEN_COMA() { return getTokens(Neo4JParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(Neo4JParser.TOKEN_COMA, i);
		}
		public Props_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_props_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterProps_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitProps_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitProps_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Props_listContext props_list() throws RecognitionException {
		Props_listContext _localctx = new Props_listContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_props_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(TOKEN_LLAVE_IZR);
			setState(168);
			prop();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_COMA) {
				{
				{
				setState(169);
				match(TOKEN_COMA);
				setState(170);
				prop();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(176);
			match(TOKEN_LLAVE_DER);
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

	public static class PropContext extends ParserRuleContext {
		public PropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prop; }
	 
		public PropContext() { }
		public void copyFrom(PropContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PropertyContext extends PropContext {
		public TerminalNode ID() { return getToken(Neo4JParser.ID, 0); }
		public TerminalNode TOKEN_DOSP() { return getToken(Neo4JParser.TOKEN_DOSP, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PropertyContext(PropContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Query_condContext extends PropContext {
		public TerminalNode ID() { return getToken(Neo4JParser.ID, 0); }
		public Rel_optContext rel_opt() {
			return getRuleContext(Rel_optContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Query_condContext(PropContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterQuery_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitQuery_cond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitQuery_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropContext prop() throws RecognitionException {
		PropContext _localctx = new PropContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_prop);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new PropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(ID);
				setState(179);
				match(TOKEN_DOSP);
				setState(180);
				exp(0);
				}
				break;
			case 2:
				_localctx = new Query_condContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(ID);
				setState(182);
				rel_opt();
				setState(183);
				exp(0);
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

	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Or_operationContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Token_oContext token_o() {
			return getRuleContext(Token_oContext.class,0);
		}
		public B_termContext b_term() {
			return getRuleContext(B_termContext.class,0);
		}
		public Or_operationContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterOr_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitOr_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitOr_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Exp_singleContext extends ExpContext {
		public B_termContext b_term() {
			return getRuleContext(B_termContext.class,0);
		}
		public Exp_singleContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterExp_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitExp_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitExp_single(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Xor_operationContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TOKEN_XOR() { return getToken(Neo4JParser.TOKEN_XOR, 0); }
		public B_termContext b_term() {
			return getRuleContext(B_termContext.class,0);
		}
		public Xor_operationContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterXor_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitXor_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitXor_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Exp_singleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(188);
			b_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(197);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new Or_operationContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(190);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(191);
						token_o();
						setState(192);
						b_term(0);
						}
						break;
					case 2:
						{
						_localctx = new Xor_operationContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(194);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(195);
						match(TOKEN_XOR);
						setState(196);
						b_term(0);
						}
						break;
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class B_termContext extends ParserRuleContext {
		public B_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_term; }
	 
		public B_termContext() { }
		public void copyFrom(B_termContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class And_operationContext extends B_termContext {
		public B_termContext b_term() {
			return getRuleContext(B_termContext.class,0);
		}
		public Token_yContext token_y() {
			return getRuleContext(Token_yContext.class,0);
		}
		public Eq_factorContext eq_factor() {
			return getRuleContext(Eq_factorContext.class,0);
		}
		public And_operationContext(B_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterAnd_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitAnd_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitAnd_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class B_term_singleContext extends B_termContext {
		public Eq_factorContext eq_factor() {
			return getRuleContext(Eq_factorContext.class,0);
		}
		public B_term_singleContext(B_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterB_term_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitB_term_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitB_term_single(this);
			else return visitor.visitChildren(this);
		}
	}

	public final B_termContext b_term() throws RecognitionException {
		return b_term(0);
	}

	private B_termContext b_term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		B_termContext _localctx = new B_termContext(_ctx, _parentState);
		B_termContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_b_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new B_term_singleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(203);
			eq_factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new And_operationContext(new B_termContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_b_term);
					setState(205);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(206);
					token_y();
					setState(207);
					eq_factor();
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class Eq_factorContext extends ParserRuleContext {
		public Eq_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_factor; }
	 
		public Eq_factorContext() { }
		public void copyFrom(Eq_factorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Equals_operationContext extends Eq_factorContext {
		public List<B_factorContext> b_factor() {
			return getRuleContexts(B_factorContext.class);
		}
		public B_factorContext b_factor(int i) {
			return getRuleContext(B_factorContext.class,i);
		}
		public Dif_optContext dif_opt() {
			return getRuleContext(Dif_optContext.class,0);
		}
		public Equals_operationContext(Eq_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterEquals_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitEquals_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitEquals_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Eq_factor_singleContext extends Eq_factorContext {
		public B_factorContext b_factor() {
			return getRuleContext(B_factorContext.class,0);
		}
		public Eq_factor_singleContext(Eq_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterEq_factor_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitEq_factor_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitEq_factor_single(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_factorContext eq_factor() throws RecognitionException {
		Eq_factorContext _localctx = new Eq_factorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_eq_factor);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new Equals_operationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				b_factor();
				setState(215);
				dif_opt();
				setState(216);
				b_factor();
				}
				break;
			case 2:
				_localctx = new Eq_factor_singleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				b_factor();
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

	public static class Dif_optContext extends ParserRuleContext {
		public TerminalNode TOKEN_IGUAL() { return getToken(Neo4JParser.TOKEN_IGUAL, 0); }
		public TerminalNode TOKEN_DIF() { return getToken(Neo4JParser.TOKEN_DIF, 0); }
		public Dif_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dif_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterDif_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitDif_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitDif_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dif_optContext dif_opt() throws RecognitionException {
		Dif_optContext _localctx = new Dif_optContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dif_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if ( !(_la==TOKEN_IGUAL || _la==TOKEN_DIF) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class B_factorContext extends ParserRuleContext {
		public B_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b_factor; }
	 
		public B_factorContext() { }
		public void copyFrom(B_factorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Rel_operationContext extends B_factorContext {
		public List<Exp_numContext> exp_num() {
			return getRuleContexts(Exp_numContext.class);
		}
		public Exp_numContext exp_num(int i) {
			return getRuleContext(Exp_numContext.class,i);
		}
		public Rel_optContext rel_opt() {
			return getRuleContext(Rel_optContext.class,0);
		}
		public Rel_operationContext(B_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterRel_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitRel_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitRel_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class B_factor_singleContext extends B_factorContext {
		public Exp_numContext exp_num() {
			return getRuleContext(Exp_numContext.class,0);
		}
		public B_factor_singleContext(B_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterB_factor_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitB_factor_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitB_factor_single(this);
			else return visitor.visitChildren(this);
		}
	}

	public final B_factorContext b_factor() throws RecognitionException {
		B_factorContext _localctx = new B_factorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_b_factor);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new Rel_operationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				exp_num(0);
				setState(224);
				rel_opt();
				setState(225);
				exp_num(0);
				}
				break;
			case 2:
				_localctx = new B_factor_singleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				exp_num(0);
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

	public static class Rel_optContext extends ParserRuleContext {
		public TerminalNode TOKEN_MAYOR() { return getToken(Neo4JParser.TOKEN_MAYOR, 0); }
		public TerminalNode TOKEN_MAYOR_IGUAL() { return getToken(Neo4JParser.TOKEN_MAYOR_IGUAL, 0); }
		public TerminalNode TOKEN_MENOR() { return getToken(Neo4JParser.TOKEN_MENOR, 0); }
		public TerminalNode TOKEN_MENOR_IGUAL() { return getToken(Neo4JParser.TOKEN_MENOR_IGUAL, 0); }
		public TerminalNode TOKEN_IGUAL() { return getToken(Neo4JParser.TOKEN_IGUAL, 0); }
		public TerminalNode TOKEN_REGEX() { return getToken(Neo4JParser.TOKEN_REGEX, 0); }
		public Rel_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterRel_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitRel_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitRel_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_optContext rel_opt() throws RecognitionException {
		Rel_optContext _localctx = new Rel_optContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_rel_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_IGUAL) | (1L << TOKEN_REGEX) | (1L << TOKEN_MAYOR) | (1L << TOKEN_MAYOR_IGUAL) | (1L << TOKEN_MENOR) | (1L << TOKEN_MENOR_IGUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Exp_numContext extends ParserRuleContext {
		public Exp_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_num; }
	 
		public Exp_numContext() { }
		public void copyFrom(Exp_numContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Exp_num_singleContext extends Exp_numContext {
		public Mod_termContext mod_term() {
			return getRuleContext(Mod_termContext.class,0);
		}
		public Exp_num_singleContext(Exp_numContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterExp_num_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitExp_num_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitExp_num_single(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Sum_operationContext extends Exp_numContext {
		public Exp_numContext exp_num() {
			return getRuleContext(Exp_numContext.class,0);
		}
		public Sum_optContext sum_opt() {
			return getRuleContext(Sum_optContext.class,0);
		}
		public Mod_termContext mod_term() {
			return getRuleContext(Mod_termContext.class,0);
		}
		public Sum_operationContext(Exp_numContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterSum_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitSum_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitSum_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_numContext exp_num() throws RecognitionException {
		return exp_num(0);
	}

	private Exp_numContext exp_num(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp_numContext _localctx = new Exp_numContext(_ctx, _parentState);
		Exp_numContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_exp_num, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Exp_num_singleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(233);
			mod_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Sum_operationContext(new Exp_numContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exp_num);
					setState(235);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(236);
					sum_opt();
					setState(237);
					mod_term(0);
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class Sum_optContext extends ParserRuleContext {
		public TerminalNode TOKEN_MAS() { return getToken(Neo4JParser.TOKEN_MAS, 0); }
		public TerminalNode TOKEN_MENOS() { return getToken(Neo4JParser.TOKEN_MENOS, 0); }
		public Sum_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterSum_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitSum_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitSum_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sum_optContext sum_opt() throws RecognitionException {
		Sum_optContext _localctx = new Sum_optContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sum_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
			if ( !(_la==TOKEN_MAS || _la==TOKEN_MENOS) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Mod_termContext extends ParserRuleContext {
		public Mod_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_term; }
	 
		public Mod_termContext() { }
		public void copyFrom(Mod_termContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Mod_term_singleContext extends Mod_termContext {
		public S_termContext s_term() {
			return getRuleContext(S_termContext.class,0);
		}
		public Mod_term_singleContext(Mod_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterMod_term_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitMod_term_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitMod_term_single(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Mul_mod_operationContext extends Mod_termContext {
		public Mod_termContext mod_term() {
			return getRuleContext(Mod_termContext.class,0);
		}
		public Mul_optContext mul_opt() {
			return getRuleContext(Mul_optContext.class,0);
		}
		public S_termContext s_term() {
			return getRuleContext(S_termContext.class,0);
		}
		public Mul_mod_operationContext(Mod_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterMul_mod_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitMul_mod_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitMul_mod_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mod_termContext mod_term() throws RecognitionException {
		return mod_term(0);
	}

	private Mod_termContext mod_term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Mod_termContext _localctx = new Mod_termContext(_ctx, _parentState);
		Mod_termContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_mod_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Mod_term_singleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(247);
			s_term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Mul_mod_operationContext(new Mod_termContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_mod_term);
					setState(249);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(250);
					mul_opt();
					setState(251);
					s_term(0);
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class Mul_optContext extends ParserRuleContext {
		public TerminalNode TOKEN_MUL() { return getToken(Neo4JParser.TOKEN_MUL, 0); }
		public TerminalNode TOKEN_DIV() { return getToken(Neo4JParser.TOKEN_DIV, 0); }
		public Token_modContext token_mod() {
			return getRuleContext(Token_modContext.class,0);
		}
		public Mul_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterMul_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitMul_opt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitMul_opt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mul_optContext mul_opt() throws RecognitionException {
		Mul_optContext _localctx = new Mul_optContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mul_opt);
		try {
			setState(261);
			switch (_input.LA(1)) {
			case TOKEN_MUL:
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(TOKEN_MUL);
				}
				break;
			case TOKEN_DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(TOKEN_DIV);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				token_mod();
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

	public static class S_termContext extends ParserRuleContext {
		public S_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s_term; }
	 
		public S_termContext() { }
		public void copyFrom(S_termContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class S_term_singleContext extends S_termContext {
		public Not_factorContext not_factor() {
			return getRuleContext(Not_factorContext.class,0);
		}
		public S_term_singleContext(S_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterS_term_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitS_term_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitS_term_single(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Pot_operationContext extends S_termContext {
		public S_termContext s_term() {
			return getRuleContext(S_termContext.class,0);
		}
		public TerminalNode TOKEN_POT() { return getToken(Neo4JParser.TOKEN_POT, 0); }
		public Not_factorContext not_factor() {
			return getRuleContext(Not_factorContext.class,0);
		}
		public Pot_operationContext(S_termContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterPot_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitPot_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitPot_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final S_termContext s_term() throws RecognitionException {
		return s_term(0);
	}

	private S_termContext s_term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		S_termContext _localctx = new S_termContext(_ctx, _parentState);
		S_termContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_s_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new S_term_singleContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(264);
			not_factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Pot_operationContext(new S_termContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_s_term);
					setState(266);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(267);
					match(TOKEN_POT);
					setState(268);
					not_factor();
					}
					} 
				}
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class Not_factorContext extends ParserRuleContext {
		public Not_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_factor; }
	 
		public Not_factorContext() { }
		public void copyFrom(Not_factorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Not_factor_singleContext extends Not_factorContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Not_factor_singleContext(Not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterNot_factor_single(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitNot_factor_single(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitNot_factor_single(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Negation_operationContext extends Not_factorContext {
		public Token_negContext token_neg() {
			return getRuleContext(Token_negContext.class,0);
		}
		public Not_factorContext not_factor() {
			return getRuleContext(Not_factorContext.class,0);
		}
		public Negation_operationContext(Not_factorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterNegation_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitNegation_operation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitNegation_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_factorContext not_factor() throws RecognitionException {
		Not_factorContext _localctx = new Not_factorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_not_factor);
		try {
			setState(278);
			switch (_input.LA(1)) {
			case T__3:
			case NOT:
				_localctx = new Negation_operationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				token_neg();
				setState(275);
				not_factor();
				}
				break;
			case AVG:
			case SUM:
			case DISTINCT:
			case MAX:
			case MIN:
			case TRUE:
			case FALSE:
			case COUNT:
			case ID:
			case TOKEN_PAR_IZR:
			case TOKEN_CADENA:
			case TOKEN_REAL:
			case TOKEN_ENTERO:
				_localctx = new Not_factor_singleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				factor();
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode TOKEN_CADENA() { return getToken(Neo4JParser.TOKEN_CADENA, 0); }
		public TerminalNode TOKEN_REAL() { return getToken(Neo4JParser.TOKEN_REAL, 0); }
		public TerminalNode TOKEN_ENTERO() { return getToken(Neo4JParser.TOKEN_ENTERO, 0); }
		public TerminalNode TRUE() { return getToken(Neo4JParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Neo4JParser.FALSE, 0); }
		public TerminalNode TOKEN_PAR_IZR() { return getToken(Neo4JParser.TOKEN_PAR_IZR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode TOKEN_PAR_DER() { return getToken(Neo4JParser.TOKEN_PAR_DER, 0); }
		public List<TerminalNode> ID() { return getTokens(Neo4JParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Neo4JParser.ID, i);
		}
		public TerminalNode TOKEN_PUNTO() { return getToken(Neo4JParser.TOKEN_PUNTO, 0); }
		public Function_sentenceContext function_sentence() {
			return getRuleContext(Function_sentenceContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_factor);
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				match(TOKEN_CADENA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				match(TOKEN_REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				match(TOKEN_ENTERO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(283);
				match(TRUE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(284);
				match(FALSE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(285);
				match(TOKEN_PAR_IZR);
				setState(286);
				exp(0);
				setState(287);
				match(TOKEN_PAR_DER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(289);
				match(ID);
				setState(290);
				match(TOKEN_PUNTO);
				setState(291);
				match(ID);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(292);
				function_sentence();
				setState(293);
				match(TOKEN_PAR_IZR);
				setState(294);
				exp(0);
				setState(295);
				match(TOKEN_PAR_DER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(297);
				match(ID);
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

	public static class Function_sentenceContext extends ParserRuleContext {
		public TerminalNode AVG() { return getToken(Neo4JParser.AVG, 0); }
		public TerminalNode COUNT() { return getToken(Neo4JParser.COUNT, 0); }
		public TerminalNode SUM() { return getToken(Neo4JParser.SUM, 0); }
		public TerminalNode MAX() { return getToken(Neo4JParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(Neo4JParser.MIN, 0); }
		public TerminalNode DISTINCT() { return getToken(Neo4JParser.DISTINCT, 0); }
		public Function_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterFunction_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitFunction_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitFunction_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_sentenceContext function_sentence() throws RecognitionException {
		Function_sentenceContext _localctx = new Function_sentenceContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_function_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AVG) | (1L << SUM) | (1L << DISTINCT) | (1L << MAX) | (1L << MIN) | (1L << COUNT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Relationship_relsContext extends ParserRuleContext {
		public TerminalNode RELATIONSHIP() { return getToken(Neo4JParser.RELATIONSHIP, 0); }
		public TerminalNode TOKEN_DOSP() { return getToken(Neo4JParser.TOKEN_DOSP, 0); }
		public TerminalNode RELS() { return getToken(Neo4JParser.RELS, 0); }
		public Relationship_relsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationship_rels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterRelationship_rels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitRelationship_rels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitRelationship_rels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relationship_relsContext relationship_rels() throws RecognitionException {
		Relationship_relsContext _localctx = new Relationship_relsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_relationship_rels);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(RELATIONSHIP);
			setState(303);
			match(TOKEN_DOSP);
			setState(304);
			match(RELS);
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

	public static class Node_nodesContext extends ParserRuleContext {
		public TerminalNode NODE() { return getToken(Neo4JParser.NODE, 0); }
		public TerminalNode TOKEN_DOSP() { return getToken(Neo4JParser.TOKEN_DOSP, 0); }
		public TerminalNode NODES() { return getToken(Neo4JParser.NODES, 0); }
		public Node_nodesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_nodes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterNode_nodes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitNode_nodes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitNode_nodes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Node_nodesContext node_nodes() throws RecognitionException {
		Node_nodesContext _localctx = new Node_nodesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_node_nodes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(NODE);
			setState(307);
			match(TOKEN_DOSP);
			setState(308);
			match(NODES);
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

	public static class Token_modContext extends ParserRuleContext {
		public Token_modContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterToken_mod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitToken_mod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitToken_mod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Token_modContext token_mod() throws RecognitionException {
		Token_modContext _localctx = new Token_modContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_token_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__0);
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

	public static class Token_yContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(Neo4JParser.AND, 0); }
		public Token_yContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_y; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterToken_y(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitToken_y(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitToken_y(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Token_yContext token_y() throws RecognitionException {
		Token_yContext _localctx = new Token_yContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_token_y);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==AND) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Token_oContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(Neo4JParser.OR, 0); }
		public Token_oContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_o; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterToken_o(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitToken_o(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitToken_o(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Token_oContext token_o() throws RecognitionException {
		Token_oContext _localctx = new Token_oContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_token_o);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==OR) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Token_negContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(Neo4JParser.NOT, 0); }
		public Token_negContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token_neg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).enterToken_neg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Neo4JListener ) ((Neo4JListener)listener).exitToken_neg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Neo4JVisitor ) return ((Neo4JVisitor<? extends T>)visitor).visitToken_neg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Token_negContext token_neg() throws RecognitionException {
		Token_negContext _localctx = new Token_negContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_token_neg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==NOT) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 13:
			return b_term_sempred((B_termContext)_localctx, predIndex);
		case 18:
			return exp_num_sempred((Exp_numContext)_localctx, predIndex);
		case 20:
			return mod_term_sempred((Mod_termContext)_localctx, predIndex);
		case 22:
			return s_term_sempred((S_termContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean b_term_sempred(B_termContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp_num_sempred(Exp_numContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mod_term_sempred(Mod_termContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean s_term_sempred(S_termContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3S\u0141\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\7\2J\n\2\f\2\16\2M\13\2\5\2O\n\2\3"+
		"\3\3\3\6\3S\n\3\r\3\16\3T\3\3\3\3\3\3\3\3\3\3\7\3\\\n\3\f\3\16\3_\13\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\5\4g\n\4\3\5\3\5\3\5\3\5\7\5m\n\5\f\5\16\5p\13"+
		"\5\3\5\5\5s\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7|\n\7\f\7\16\7\177\13\7"+
		"\3\7\3\7\3\7\7\7\u0084\n\7\f\7\16\7\u0087\13\7\5\7\u0089\n\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0095\n\t\3\t\3\t\3\t\6\t\u009a\n\t"+
		"\r\t\16\t\u009b\5\t\u009e\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13"+
		"\u00a8\n\13\3\f\3\f\3\f\3\f\7\f\u00ae\n\f\f\f\16\f\u00b1\13\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00bc\n\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\7\16\u00c8\n\16\f\16\16\16\u00cb\13\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\7\17\u00d4\n\17\f\17\16\17\u00d7\13\17\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u00de\n\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u00e7\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24"+
		"\u00f2\n\24\f\24\16\24\u00f5\13\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u0100\n\26\f\26\16\26\u0103\13\26\3\27\3\27\3\27\5\27"+
		"\u0108\n\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0110\n\30\f\30\16\30\u0113"+
		"\13\30\3\31\3\31\3\31\3\31\5\31\u0119\n\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u012d"+
		"\n\32\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3!\2\7\32\34&*.\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@\2\n\5\2\t\t%%\'\'\4\2\64\64\67\67\4\2\64"+
		"\658;\3\2GH\5\2\n\n\f\17\35\35\4\2\4\4\13\13\4\2\5\5\22\22\4\2\6\6\23"+
		"\23\u0145\2N\3\2\2\2\4R\3\2\2\2\6b\3\2\2\2\br\3\2\2\2\nt\3\2\2\2\f\u0088"+
		"\3\2\2\2\16\u008a\3\2\2\2\20\u009d\3\2\2\2\22\u009f\3\2\2\2\24\u00a3\3"+
		"\2\2\2\26\u00a9\3\2\2\2\30\u00bb\3\2\2\2\32\u00bd\3\2\2\2\34\u00cc\3\2"+
		"\2\2\36\u00dd\3\2\2\2 \u00df\3\2\2\2\"\u00e6\3\2\2\2$\u00e8\3\2\2\2&\u00ea"+
		"\3\2\2\2(\u00f6\3\2\2\2*\u00f8\3\2\2\2,\u0107\3\2\2\2.\u0109\3\2\2\2\60"+
		"\u0118\3\2\2\2\62\u012c\3\2\2\2\64\u012e\3\2\2\2\66\u0130\3\2\2\28\u0134"+
		"\3\2\2\2:\u0138\3\2\2\2<\u013a\3\2\2\2>\u013c\3\2\2\2@\u013e\3\2\2\2B"+
		"D\5\n\6\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FO\3\2\2\2GE\3\2\2\2"+
		"HJ\5\4\3\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LO\3\2\2\2MK\3\2\2\2"+
		"NE\3\2\2\2NK\3\2\2\2O\3\3\2\2\2PQ\7\7\2\2QS\5\6\4\2RP\3\2\2\2ST\3\2\2"+
		"\2TR\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\5\b\5\2WX\t\2\2\2X]\5\32\16\2YZ\7B"+
		"\2\2Z\\\5\32\16\2[Y\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_"+
		"]\3\2\2\2`a\7C\2\2a\5\3\2\2\2bf\5\22\n\2cd\5\20\t\2de\5\22\n\2eg\3\2\2"+
		"\2fc\3\2\2\2fg\3\2\2\2g\7\3\2\2\2hi\7\33\2\2in\5\32\16\2jk\7B\2\2km\5"+
		"\32\16\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2os\3\2\2\2pn\3\2\2\2q"+
		"s\3\2\2\2rh\3\2\2\2rq\3\2\2\2s\t\3\2\2\2tu\7\b\2\2uv\5\f\7\2vw\7C\2\2"+
		"w\13\3\2\2\2x}\5\22\n\2yz\7B\2\2z|\5\22\n\2{y\3\2\2\2|\177\3\2\2\2}{\3"+
		"\2\2\2}~\3\2\2\2~\u0089\3\2\2\2\177}\3\2\2\2\u0080\u0085\5\16\b\2\u0081"+
		"\u0082\7B\2\2\u0082\u0084\5\16\b\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0088x\3\2\2\2\u0088\u0080\3\2\2\2\u0089\r\3\2\2\2\u008a"+
		"\u008b\5\22\n\2\u008b\u008c\5\20\t\2\u008c\u008d\5\22\n\2\u008d\17\3\2"+
		"\2\2\u008e\u009e\7I\2\2\u008f\u009e\7J\2\2\u0090\u0091\7H\2\2\u0091\u0094"+
		"\7>\2\2\u0092\u0093\7N\2\2\u0093\u0095\7\63\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7?\2\2\u0097\u0099\7H\2"+
		"\2\u0098\u009a\78\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u008e\3\2\2\2\u009d"+
		"\u008f\3\2\2\2\u009d\u0090\3\2\2\2\u009e\21\3\2\2\2\u009f\u00a0\7<\2\2"+
		"\u00a0\u00a1\5\24\13\2\u00a1\u00a2\7=\2\2\u00a2\23\3\2\2\2\u00a3\u00a4"+
		"\7\62\2\2\u00a4\u00a5\7N\2\2\u00a5\u00a7\7\63\2\2\u00a6\u00a8\5\26\f\2"+
		"\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\25\3\2\2\2\u00a9\u00aa"+
		"\7@\2\2\u00aa\u00af\5\30\r\2\u00ab\u00ac\7B\2\2\u00ac\u00ae\5\30\r\2\u00ad"+
		"\u00ab\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\7A\2\2\u00b3"+
		"\27\3\2\2\2\u00b4\u00b5\7\62\2\2\u00b5\u00b6\7N\2\2\u00b6\u00bc\5\32\16"+
		"\2\u00b7\u00b8\7\62\2\2\u00b8\u00b9\5$\23\2\u00b9\u00ba\5\32\16\2\u00ba"+
		"\u00bc\3\2\2\2\u00bb\u00b4\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bc\31\3\2\2"+
		"\2\u00bd\u00be\b\16\1\2\u00be\u00bf\5\34\17\2\u00bf\u00c9\3\2\2\2\u00c0"+
		"\u00c1\f\5\2\2\u00c1\u00c2\5> \2\u00c2\u00c3\5\34\17\2\u00c3\u00c8\3\2"+
		"\2\2\u00c4\u00c5\f\4\2\2\u00c5\u00c6\7M\2\2\u00c6\u00c8\5\34\17\2\u00c7"+
		"\u00c0\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\33\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd"+
		"\b\17\1\2\u00cd\u00ce\5\36\20\2\u00ce\u00d5\3\2\2\2\u00cf\u00d0\f\4\2"+
		"\2\u00d0\u00d1\5<\37\2\u00d1\u00d2\5\36\20\2\u00d2\u00d4\3\2\2\2\u00d3"+
		"\u00cf\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\35\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\5\"\22\2\u00d9\u00da"+
		"\5 \21\2\u00da\u00db\5\"\22\2\u00db\u00de\3\2\2\2\u00dc\u00de\5\"\22\2"+
		"\u00dd\u00d8\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\37\3\2\2\2\u00df\u00e0"+
		"\t\3\2\2\u00e0!\3\2\2\2\u00e1\u00e2\5&\24\2\u00e2\u00e3\5$\23\2\u00e3"+
		"\u00e4\5&\24\2\u00e4\u00e7\3\2\2\2\u00e5\u00e7\5&\24\2\u00e6\u00e1\3\2"+
		"\2\2\u00e6\u00e5\3\2\2\2\u00e7#\3\2\2\2\u00e8\u00e9\t\4\2\2\u00e9%\3\2"+
		"\2\2\u00ea\u00eb\b\24\1\2\u00eb\u00ec\5*\26\2\u00ec\u00f3\3\2\2\2\u00ed"+
		"\u00ee\f\4\2\2\u00ee\u00ef\5(\25\2\u00ef\u00f0\5*\26\2\u00f0\u00f2\3\2"+
		"\2\2\u00f1\u00ed\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\'\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\t\5\2\2"+
		"\u00f7)\3\2\2\2\u00f8\u00f9\b\26\1\2\u00f9\u00fa\5.\30\2\u00fa\u0101\3"+
		"\2\2\2\u00fb\u00fc\f\4\2\2\u00fc\u00fd\5,\27\2\u00fd\u00fe\5.\30\2\u00fe"+
		"\u0100\3\2\2\2\u00ff\u00fb\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102+\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0108"+
		"\7E\2\2\u0105\u0108\7F\2\2\u0106\u0108\5:\36\2\u0107\u0104\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108-\3\2\2\2\u0109\u010a\b\30\1\2"+
		"\u010a\u010b\5\60\31\2\u010b\u0111\3\2\2\2\u010c\u010d\f\4\2\2\u010d\u010e"+
		"\7K\2\2\u010e\u0110\5\60\31\2\u010f\u010c\3\2\2\2\u0110\u0113\3\2\2\2"+
		"\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112/\3\2\2\2\u0113\u0111\3"+
		"\2\2\2\u0114\u0115\5@!\2\u0115\u0116\5\60\31\2\u0116\u0119\3\2\2\2\u0117"+
		"\u0119\5\62\32\2\u0118\u0114\3\2\2\2\u0118\u0117\3\2\2\2\u0119\61\3\2"+
		"\2\2\u011a\u012d\7O\2\2\u011b\u012d\7P\2\2\u011c\u012d\7Q\2\2\u011d\u012d"+
		"\7\30\2\2\u011e\u012d\7\31\2\2\u011f\u0120\7<\2\2\u0120\u0121\5\32\16"+
		"\2\u0121\u0122\7=\2\2\u0122\u012d\3\2\2\2\u0123\u0124\7\62\2\2\u0124\u0125"+
		"\7L\2\2\u0125\u012d\7\62\2\2\u0126\u0127\5\64\33\2\u0127\u0128\7<\2\2"+
		"\u0128\u0129\5\32\16\2\u0129\u012a\7=\2\2\u012a\u012d\3\2\2\2\u012b\u012d"+
		"\7\62\2\2\u012c\u011a\3\2\2\2\u012c\u011b\3\2\2\2\u012c\u011c\3\2\2\2"+
		"\u012c\u011d\3\2\2\2\u012c\u011e\3\2\2\2\u012c\u011f\3\2\2\2\u012c\u0123"+
		"\3\2\2\2\u012c\u0126\3\2\2\2\u012c\u012b\3\2\2\2\u012d\63\3\2\2\2\u012e"+
		"\u012f\t\6\2\2\u012f\65\3\2\2\2\u0130\u0131\7\37\2\2\u0131\u0132\7N\2"+
		"\2\u0132\u0133\7\36\2\2\u0133\67\3\2\2\2\u0134\u0135\7 \2\2\u0135\u0136"+
		"\7N\2\2\u0136\u0137\7!\2\2\u01379\3\2\2\2\u0138\u0139\7\3\2\2\u0139;\3"+
		"\2\2\2\u013a\u013b\t\7\2\2\u013b=\3\2\2\2\u013c\u013d\t\b\2\2\u013d?\3"+
		"\2\2\2\u013e\u013f\t\t\2\2\u013fA\3\2\2\2\36EKNT]fnr}\u0085\u0088\u0094"+
		"\u009b\u009d\u00a7\u00af\u00bb\u00c7\u00c9\u00d5\u00dd\u00e6\u00f3\u0101"+
		"\u0107\u0111\u0118\u012c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VHDLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ENTITY=3, IS=4, PORT=5, BEGIN=6, END=7, ARCHITECTURE=8, 
		OF=9, SIGNAL=10, IN=11, OUT=12, MAP=13, STD_LOGIC=14, XOR=15, AND=16, 
		NAND=17, OR=18, NOT=19, XNOR=20, NOR=21, COMMA=22, LPARENT=23, RPARENT=24, 
		COLON=25, EQ=26, MUL=27, DIV=28, LE=29, GE=30, SEMI=31, UNDERSCORE=32, 
		BASIC_IDENTIFIER=33, DIGIT=34, LETTER=35, WS=36;
	public static final int
		RULE_file = 0, RULE_entity_declaration = 1, RULE_port_declaration = 2, 
		RULE_port_list = 3, RULE_interface_declarations = 4, RULE_input_declaration = 5, 
		RULE_output_declaration = 6, RULE_identifier_list = 7, RULE_identifier = 8, 
		RULE_architecture = 9, RULE_architecture_details = 10, RULE_assignment_expression = 11, 
		RULE_expression = 12, RULE_unary_operator = 13, RULE_binary_operator = 14, 
		RULE_entity_work = 15, RULE_port_spec = 16, RULE_assignment_list = 17, 
		RULE_assignment = 18;
	public static final String[] ruleNames = {
		"file", "entity_declaration", "port_declaration", "port_list", "interface_declarations", 
		"input_declaration", "output_declaration", "identifier_list", "identifier", 
		"architecture", "architecture_details", "assignment_expression", "expression", 
		"unary_operator", "binary_operator", "entity_work", "port_spec", "assignment_list", 
		"assignment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'std_logic'", "'work.'", null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"','", "'('", "')'", "':'", "'='", "'*'", "'/'", "'<='", "'=>'", "';'", 
		"'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "ENTITY", "IS", "PORT", "BEGIN", "END", "ARCHITECTURE", 
		"OF", "SIGNAL", "IN", "OUT", "MAP", "STD_LOGIC", "XOR", "AND", "NAND", 
		"OR", "NOT", "XNOR", "NOR", "COMMA", "LPARENT", "RPARENT", "COLON", "EQ", 
		"MUL", "DIV", "LE", "GE", "SEMI", "UNDERSCORE", "BASIC_IDENTIFIER", "DIGIT", 
		"LETTER", "WS"
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
	public String getGrammarFileName() { return "VHDL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VHDLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public Entity_declarationContext entity_declaration() {
			return getRuleContext(Entity_declarationContext.class,0);
		}
		public ArchitectureContext architecture() {
			return getRuleContext(ArchitectureContext.class,0);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			entity_declaration();
			setState(39);
			architecture();
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

	public static class Entity_declarationContext extends ParserRuleContext {
		public TerminalNode ENTITY() { return getToken(VHDLParser.ENTITY, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode IS() { return getToken(VHDLParser.IS, 0); }
		public Port_declarationContext port_declaration() {
			return getRuleContext(Port_declarationContext.class,0);
		}
		public TerminalNode END() { return getToken(VHDLParser.END, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Entity_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterEntity_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitEntity_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitEntity_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_declarationContext entity_declaration() throws RecognitionException {
		Entity_declarationContext _localctx = new Entity_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entity_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(ENTITY);
			setState(42);
			identifier();
			setState(43);
			match(IS);
			setState(44);
			port_declaration();
			setState(45);
			match(END);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER) {
				{
				setState(46);
				identifier();
				}
			}

			setState(49);
			match(SEMI);
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

	public static class Port_declarationContext extends ParserRuleContext {
		public TerminalNode PORT() { return getToken(VHDLParser.PORT, 0); }
		public TerminalNode LPARENT() { return getToken(VHDLParser.LPARENT, 0); }
		public Port_listContext port_list() {
			return getRuleContext(Port_listContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(VHDLParser.RPARENT, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Port_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterPort_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitPort_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitPort_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Port_declarationContext port_declaration() throws RecognitionException {
		Port_declarationContext _localctx = new Port_declarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_port_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(PORT);
			setState(52);
			match(LPARENT);
			setState(53);
			port_list();
			setState(54);
			match(RPARENT);
			setState(55);
			match(SEMI);
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

	public static class Port_listContext extends ParserRuleContext {
		public Interface_declarationsContext interface_declarations() {
			return getRuleContext(Interface_declarationsContext.class,0);
		}
		public Port_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterPort_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitPort_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitPort_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Port_listContext port_list() throws RecognitionException {
		Port_listContext _localctx = new Port_listContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_port_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			interface_declarations();
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

	public static class Interface_declarationsContext extends ParserRuleContext {
		public Input_declarationContext input_declaration() {
			return getRuleContext(Input_declarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Output_declarationContext output_declaration() {
			return getRuleContext(Output_declarationContext.class,0);
		}
		public Interface_declarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterInterface_declarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitInterface_declarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitInterface_declarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_declarationsContext interface_declarations() throws RecognitionException {
		Interface_declarationsContext _localctx = new Interface_declarationsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_interface_declarations);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				input_declaration();
				setState(60);
				match(SEMI);
				setState(61);
				output_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				output_declaration();
				setState(64);
				match(SEMI);
				setState(65);
				input_declaration();
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

	public static class Input_declarationContext extends ParserRuleContext {
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public TerminalNode IN() { return getToken(VHDLParser.IN, 0); }
		public Input_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterInput_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitInput_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitInput_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_declarationContext input_declaration() throws RecognitionException {
		Input_declarationContext _localctx = new Input_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_input_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			identifier_list();
			setState(70);
			match(COLON);
			setState(71);
			match(IN);
			setState(72);
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

	public static class Output_declarationContext extends ParserRuleContext {
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public TerminalNode OUT() { return getToken(VHDLParser.OUT, 0); }
		public Output_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterOutput_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitOutput_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitOutput_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_declarationContext output_declaration() throws RecognitionException {
		Output_declarationContext _localctx = new Output_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_output_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			identifier_list();
			setState(75);
			match(COLON);
			setState(76);
			match(OUT);
			setState(77);
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

	public static class Identifier_listContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VHDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VHDLParser.COMMA, i);
		}
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterIdentifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitIdentifier_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitIdentifier_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			identifier();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(80);
				match(COMMA);
				setState(81);
				identifier();
				}
				}
				setState(86);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode BASIC_IDENTIFIER() { return getToken(VHDLParser.BASIC_IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(BASIC_IDENTIFIER);
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

	public static class ArchitectureContext extends ParserRuleContext {
		public TerminalNode ARCHITECTURE() { return getToken(VHDLParser.ARCHITECTURE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OF() { return getToken(VHDLParser.OF, 0); }
		public TerminalNode IS() { return getToken(VHDLParser.IS, 0); }
		public TerminalNode SIGNAL() { return getToken(VHDLParser.SIGNAL, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public List<TerminalNode> SEMI() { return getTokens(VHDLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(VHDLParser.SEMI, i);
		}
		public TerminalNode BEGIN() { return getToken(VHDLParser.BEGIN, 0); }
		public Architecture_detailsContext architecture_details() {
			return getRuleContext(Architecture_detailsContext.class,0);
		}
		public TerminalNode END() { return getToken(VHDLParser.END, 0); }
		public ArchitectureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_architecture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterArchitecture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitArchitecture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitArchitecture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArchitectureContext architecture() throws RecognitionException {
		ArchitectureContext _localctx = new ArchitectureContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_architecture);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(ARCHITECTURE);
			setState(90);
			identifier();
			setState(91);
			match(OF);
			setState(92);
			identifier();
			setState(93);
			match(IS);
			setState(94);
			match(SIGNAL);
			setState(95);
			identifier_list();
			setState(96);
			match(COLON);
			setState(97);
			match(T__0);
			setState(98);
			match(SEMI);
			setState(99);
			match(BEGIN);
			setState(100);
			architecture_details();
			setState(101);
			match(END);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER) {
				{
				setState(102);
				identifier();
				}
			}

			setState(105);
			match(SEMI);
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

	public static class Architecture_detailsContext extends ParserRuleContext {
		public List<Assignment_expressionContext> assignment_expression() {
			return getRuleContexts(Assignment_expressionContext.class);
		}
		public Assignment_expressionContext assignment_expression(int i) {
			return getRuleContext(Assignment_expressionContext.class,i);
		}
		public Architecture_detailsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_architecture_details; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterArchitecture_details(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitArchitecture_details(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitArchitecture_details(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Architecture_detailsContext architecture_details() throws RecognitionException {
		Architecture_detailsContext _localctx = new Architecture_detailsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_architecture_details);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BASIC_IDENTIFIER) {
				{
				{
				setState(107);
				assignment_expression();
				}
				}
				setState(112);
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

	public static class Assignment_expressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LE() { return getToken(VHDLParser.LE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterAssignment_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitAssignment_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitAssignment_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_expressionContext assignment_expression() throws RecognitionException {
		Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			identifier();
			setState(114);
			match(LE);
			setState(115);
			expression(0);
			setState(116);
			match(SEMI);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionIdentifierContext extends ExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionIdentifierContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterExpressionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitExpressionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitExpressionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionParenthesesContext extends ExpressionContext {
		public TerminalNode LPARENT() { return getToken(VHDLParser.LPARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(VHDLParser.RPARENT, 0); }
		public ExpressionParenthesesContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterExpressionParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitExpressionParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitExpressionParentheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionBinaryOperatorContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Binary_operatorContext binary_operator() {
			return getRuleContext(Binary_operatorContext.class,0);
		}
		public ExpressionBinaryOperatorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterExpressionBinaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitExpressionBinaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitExpressionBinaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionUnaryOperatorContext extends ExpressionContext {
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionUnaryOperatorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterExpressionUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitExpressionUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitExpressionUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
				{
				_localctx = new ExpressionIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(119);
				identifier();
				}
				break;
			case NOT:
				{
				_localctx = new ExpressionUnaryOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				unary_operator();
				setState(121);
				expression(3);
				}
				break;
			case LPARENT:
				{
				_localctx = new ExpressionParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(LPARENT);
				setState(124);
				expression(0);
				setState(125);
				match(RPARENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionBinaryOperatorContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(129);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(130);
					binary_operator();
					setState(131);
					expression(3);
					}
					} 
				}
				setState(137);
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(VHDLParser.NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unary_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(NOT);
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

	public static class Binary_operatorContext extends ParserRuleContext {
		public Binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operator; }
	 
		public Binary_operatorContext() { }
		public void copyFrom(Binary_operatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrOpContext extends Binary_operatorContext {
		public TerminalNode OR() { return getToken(VHDLParser.OR, 0); }
		public OrOpContext(Binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterOrOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitOrOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitOrOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NorOpContext extends Binary_operatorContext {
		public TerminalNode NOR() { return getToken(VHDLParser.NOR, 0); }
		public NorOpContext(Binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterNorOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitNorOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitNorOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndOpContext extends Binary_operatorContext {
		public TerminalNode AND() { return getToken(VHDLParser.AND, 0); }
		public AndOpContext(Binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterAndOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitAndOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitAndOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XorOpContext extends Binary_operatorContext {
		public TerminalNode XOR() { return getToken(VHDLParser.XOR, 0); }
		public XorOpContext(Binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterXorOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitXorOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitXorOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NandOpContext extends Binary_operatorContext {
		public TerminalNode NAND() { return getToken(VHDLParser.NAND, 0); }
		public NandOpContext(Binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterNandOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitNandOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitNandOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_operatorContext binary_operator() throws RecognitionException {
		Binary_operatorContext _localctx = new Binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_binary_operator);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				_localctx = new AndOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(AND);
				}
				break;
			case OR:
				_localctx = new OrOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(OR);
				}
				break;
			case NAND:
				_localctx = new NandOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(NAND);
				}
				break;
			case NOR:
				_localctx = new NorOpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				match(NOR);
				}
				break;
			case XOR:
				_localctx = new XorOpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				match(XOR);
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

	public static class Entity_workContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public TerminalNode ENTITY() { return getToken(VHDLParser.ENTITY, 0); }
		public TerminalNode PORT() { return getToken(VHDLParser.PORT, 0); }
		public TerminalNode MAP() { return getToken(VHDLParser.MAP, 0); }
		public TerminalNode LPARENT() { return getToken(VHDLParser.LPARENT, 0); }
		public Port_specContext port_spec() {
			return getRuleContext(Port_specContext.class,0);
		}
		public TerminalNode RPARENT() { return getToken(VHDLParser.RPARENT, 0); }
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
		public Entity_workContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_work; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterEntity_work(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitEntity_work(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitEntity_work(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_workContext entity_work() throws RecognitionException {
		Entity_workContext _localctx = new Entity_workContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_entity_work);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			identifier();
			setState(148);
			match(COLON);
			setState(149);
			match(ENTITY);
			setState(150);
			match(T__1);
			setState(151);
			identifier();
			setState(152);
			match(PORT);
			setState(153);
			match(MAP);
			setState(154);
			match(LPARENT);
			setState(155);
			port_spec();
			setState(156);
			match(RPARENT);
			setState(157);
			match(SEMI);
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

	public static class Port_specContext extends ParserRuleContext {
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public Assignment_listContext assignment_list() {
			return getRuleContext(Assignment_listContext.class,0);
		}
		public Port_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterPort_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitPort_spec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitPort_spec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Port_specContext port_spec() throws RecognitionException {
		Port_specContext _localctx = new Port_specContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_port_spec);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				identifier_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				assignment_list();
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

	public static class Assignment_listContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VHDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VHDLParser.COMMA, i);
		}
		public Assignment_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterAssignment_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitAssignment_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitAssignment_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_listContext assignment_list() throws RecognitionException {
		Assignment_listContext _localctx = new Assignment_listContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignment_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			assignment();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(164);
				match(COMMA);
				setState(165);
				assignment();
				}
				}
				setState(170);
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

	public static class AssignmentContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode GE() { return getToken(VHDLParser.GE, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			identifier();
			setState(172);
			match(GE);
			setState(173);
			identifier();
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
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00b2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6F\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\tU\n\t"+
		"\f\t\16\tX\13\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\5\13j\n\13\3\13\3\13\3\f\7\fo\n\f\f\f\16\fr\13"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u0082\n\16\3\16\3\16\3\16\3\16\7\16\u0088\n\16\f\16\16\16\u008b\13"+
		"\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u0094\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\5\22\u00a4\n\22"+
		"\3\23\3\23\3\23\7\23\u00a9\n\23\f\23\16\23\u00ac\13\23\3\24\3\24\3\24"+
		"\3\24\3\24\2\3\32\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\2\2"+
		"\u00ac\2(\3\2\2\2\4+\3\2\2\2\6\65\3\2\2\2\b;\3\2\2\2\nE\3\2\2\2\fG\3\2"+
		"\2\2\16L\3\2\2\2\20Q\3\2\2\2\22Y\3\2\2\2\24[\3\2\2\2\26p\3\2\2\2\30s\3"+
		"\2\2\2\32\u0081\3\2\2\2\34\u008c\3\2\2\2\36\u0093\3\2\2\2 \u0095\3\2\2"+
		"\2\"\u00a3\3\2\2\2$\u00a5\3\2\2\2&\u00ad\3\2\2\2()\5\4\3\2)*\5\24\13\2"+
		"*\3\3\2\2\2+,\7\5\2\2,-\5\22\n\2-.\7\6\2\2./\5\6\4\2/\61\7\t\2\2\60\62"+
		"\5\22\n\2\61\60\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\7!\2\2\64\5"+
		"\3\2\2\2\65\66\7\7\2\2\66\67\7\31\2\2\678\5\b\5\289\7\32\2\29:\7!\2\2"+
		":\7\3\2\2\2;<\5\n\6\2<\t\3\2\2\2=>\5\f\7\2>?\7!\2\2?@\5\16\b\2@F\3\2\2"+
		"\2AB\5\16\b\2BC\7!\2\2CD\5\f\7\2DF\3\2\2\2E=\3\2\2\2EA\3\2\2\2F\13\3\2"+
		"\2\2GH\5\20\t\2HI\7\33\2\2IJ\7\r\2\2JK\7\3\2\2K\r\3\2\2\2LM\5\20\t\2M"+
		"N\7\33\2\2NO\7\16\2\2OP\7\3\2\2P\17\3\2\2\2QV\5\22\n\2RS\7\30\2\2SU\5"+
		"\22\n\2TR\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\21\3\2\2\2XV\3\2\2\2"+
		"YZ\7#\2\2Z\23\3\2\2\2[\\\7\n\2\2\\]\5\22\n\2]^\7\13\2\2^_\5\22\n\2_`\7"+
		"\6\2\2`a\7\f\2\2ab\5\20\t\2bc\7\33\2\2cd\7\3\2\2de\7!\2\2ef\7\b\2\2fg"+
		"\5\26\f\2gi\7\t\2\2hj\5\22\n\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7!\2\2"+
		"l\25\3\2\2\2mo\5\30\r\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\27\3"+
		"\2\2\2rp\3\2\2\2st\5\22\n\2tu\7\37\2\2uv\5\32\16\2vw\7!\2\2w\31\3\2\2"+
		"\2xy\b\16\1\2y\u0082\5\22\n\2z{\5\34\17\2{|\5\32\16\5|\u0082\3\2\2\2}"+
		"~\7\31\2\2~\177\5\32\16\2\177\u0080\7\32\2\2\u0080\u0082\3\2\2\2\u0081"+
		"x\3\2\2\2\u0081z\3\2\2\2\u0081}\3\2\2\2\u0082\u0089\3\2\2\2\u0083\u0084"+
		"\f\4\2\2\u0084\u0085\5\36\20\2\u0085\u0086\5\32\16\5\u0086\u0088\3\2\2"+
		"\2\u0087\u0083\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\33\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008d\7\25\2\2\u008d"+
		"\35\3\2\2\2\u008e\u0094\7\22\2\2\u008f\u0094\7\24\2\2\u0090\u0094\7\23"+
		"\2\2\u0091\u0094\7\27\2\2\u0092\u0094\7\21\2\2\u0093\u008e\3\2\2\2\u0093"+
		"\u008f\3\2\2\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2"+
		"\2\2\u0094\37\3\2\2\2\u0095\u0096\5\22\n\2\u0096\u0097\7\33\2\2\u0097"+
		"\u0098\7\5\2\2\u0098\u0099\7\4\2\2\u0099\u009a\5\22\n\2\u009a\u009b\7"+
		"\7\2\2\u009b\u009c\7\17\2\2\u009c\u009d\7\31\2\2\u009d\u009e\5\"\22\2"+
		"\u009e\u009f\7\32\2\2\u009f\u00a0\7!\2\2\u00a0!\3\2\2\2\u00a1\u00a4\5"+
		"\20\t\2\u00a2\u00a4\5$\23\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"#\3\2\2\2\u00a5\u00aa\5&\24\2\u00a6\u00a7\7\30\2\2\u00a7\u00a9\5&\24\2"+
		"\u00a8\u00a6\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab%\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\5\22\n\2\u00ae"+
		"\u00af\7 \2\2\u00af\u00b0\5\22\n\2\u00b0\'\3\2\2\2\f\61EVip\u0081\u0089"+
		"\u0093\u00a3\u00aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
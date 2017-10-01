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
		T__0=1, ENTITY=2, IS=3, PORT=4, BEGIN=5, END=6, ARCHITECTURE=7, OF=8, 
		SIGNAL=9, IN=10, OUT=11, MAP=12, STDLOGIC=13, XOR=14, AND=15, NAND=16, 
		OR=17, NOT=18, XNOR=19, NOR=20, COMMA=21, LPARENT=22, RPARENT=23, COLON=24, 
		EQ=25, MUL=26, DIV=27, LE=28, GE=29, SEMI=30, BASIC_IDENTIFIER=31, DIGIT=32, 
		LETTER=33, BOOLEAN_CONST=34, WS=35;
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
		null, "'work.'", null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "','", "'('", 
		"')'", "':'", "'='", "'*'", "'/'", "'<='", "'=>'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ENTITY", "IS", "PORT", "BEGIN", "END", "ARCHITECTURE", "OF", 
		"SIGNAL", "IN", "OUT", "MAP", "STDLOGIC", "XOR", "AND", "NAND", "OR", 
		"NOT", "XNOR", "NOR", "COMMA", "LPARENT", "RPARENT", "COLON", "EQ", "MUL", 
		"DIV", "LE", "GE", "SEMI", "BASIC_IDENTIFIER", "DIGIT", "LETTER", "BOOLEAN_CONST", 
		"WS"
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
		public TerminalNode EOF() { return getToken(VHDLParser.EOF, 0); }
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
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTITY:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				entity_declaration();
				setState(39);
				architecture();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(EOF);
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
			setState(44);
			match(ENTITY);
			setState(45);
			identifier();
			setState(46);
			match(IS);
			setState(47);
			port_declaration();
			setState(48);
			match(END);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER) {
				{
				setState(49);
				identifier();
				}
			}

			setState(52);
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
			setState(54);
			match(PORT);
			setState(55);
			match(LPARENT);
			setState(56);
			port_list();
			setState(57);
			match(RPARENT);
			setState(58);
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
			setState(60);
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
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				input_declaration();
				setState(63);
				match(SEMI);
				setState(64);
				output_declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				output_declaration();
				setState(67);
				match(SEMI);
				setState(68);
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
		public TerminalNode STDLOGIC() { return getToken(VHDLParser.STDLOGIC, 0); }
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
			setState(72);
			identifier_list();
			setState(73);
			match(COLON);
			setState(74);
			match(IN);
			setState(75);
			match(STDLOGIC);
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
		public TerminalNode STDLOGIC() { return getToken(VHDLParser.STDLOGIC, 0); }
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
			setState(77);
			identifier_list();
			setState(78);
			match(COLON);
			setState(79);
			match(OUT);
			setState(80);
			match(STDLOGIC);
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
			setState(82);
			identifier();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(83);
				match(COMMA);
				setState(84);
				identifier();
				}
				}
				setState(89);
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
			setState(90);
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
		public TerminalNode STDLOGIC() { return getToken(VHDLParser.STDLOGIC, 0); }
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
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(ARCHITECTURE);
				setState(93);
				identifier();
				setState(94);
				match(OF);
				setState(95);
				identifier();
				setState(96);
				match(IS);
				setState(97);
				match(SIGNAL);
				setState(98);
				identifier_list();
				setState(99);
				match(COLON);
				setState(100);
				match(STDLOGIC);
				setState(101);
				match(SEMI);
				setState(102);
				match(BEGIN);
				setState(103);
				architecture_details();
				setState(104);
				match(END);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BASIC_IDENTIFIER) {
					{
					setState(105);
					identifier();
					}
				}

				setState(108);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(ARCHITECTURE);
				setState(111);
				identifier();
				setState(112);
				match(OF);
				setState(113);
				identifier();
				setState(114);
				match(IS);
				setState(115);
				match(BEGIN);
				setState(116);
				architecture_details();
				setState(117);
				match(END);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BASIC_IDENTIFIER) {
					{
					setState(118);
					identifier();
					}
				}

				setState(121);
				match(SEMI);
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
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BASIC_IDENTIFIER) {
				{
				{
				setState(125);
				assignment_expression();
				}
				}
				setState(130);
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
			setState(131);
			identifier();
			setState(132);
			match(LE);
			setState(133);
			expression(0);
			setState(134);
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
	public static class ExpressionBooleanConstContext extends ExpressionContext {
		public TerminalNode BOOLEAN_CONST() { return getToken(VHDLParser.BOOLEAN_CONST, 0); }
		public ExpressionBooleanConstContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterExpressionBooleanConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitExpressionBooleanConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitExpressionBooleanConst(this);
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
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASIC_IDENTIFIER:
				{
				_localctx = new ExpressionIdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(137);
				identifier();
				}
				break;
			case NOT:
				{
				_localctx = new ExpressionUnaryOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				unary_operator();
				setState(139);
				expression(4);
				}
				break;
			case LPARENT:
				{
				_localctx = new ExpressionParenthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
				match(LPARENT);
				setState(142);
				expression(0);
				setState(143);
				match(RPARENT);
				}
				break;
			case BOOLEAN_CONST:
				{
				_localctx = new ExpressionBooleanConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(BOOLEAN_CONST);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionBinaryOperatorContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(148);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(149);
					binary_operator();
					setState(150);
					expression(4);
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
			setState(157);
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
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				_localctx = new AndOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(AND);
				}
				break;
			case OR:
				_localctx = new OrOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(OR);
				}
				break;
			case NAND:
				_localctx = new NandOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(NAND);
				}
				break;
			case NOR:
				_localctx = new NorOpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				match(NOR);
				}
				break;
			case XOR:
				_localctx = new XorOpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
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
			setState(166);
			identifier();
			setState(167);
			match(COLON);
			setState(168);
			match(ENTITY);
			setState(169);
			match(T__0);
			setState(170);
			identifier();
			setState(171);
			match(PORT);
			setState(172);
			match(MAP);
			setState(173);
			match(LPARENT);
			setState(174);
			port_spec();
			setState(175);
			match(RPARENT);
			setState(176);
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
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				identifier_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
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
			setState(182);
			assignment();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(183);
				match(COMMA);
				setState(184);
				assignment();
				}
				}
				setState(189);
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
			setState(190);
			identifier();
			setState(191);
			match(GE);
			setState(192);
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
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00c5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\5\2-\n\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3\65\n\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6I\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\7\tX\n\t\f\t\16\t[\13\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13m\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13z\n\13\3\13\3\13\5\13~\n\13\3"+
		"\f\7\f\u0081\n\f\f\f\16\f\u0084\13\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0095\n\16\3\16\3\16\3\16\3\16"+
		"\7\16\u009b\n\16\f\16\16\16\u009e\13\16\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00a7\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\5\22\u00b7\n\22\3\23\3\23\3\23\7\23\u00bc\n\23\f"+
		"\23\16\23\u00bf\13\23\3\24\3\24\3\24\3\24\3\24\2\3\32\25\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&\2\2\2\u00c3\2,\3\2\2\2\4.\3\2\2\2\68\3\2"+
		"\2\2\b>\3\2\2\2\nH\3\2\2\2\fJ\3\2\2\2\16O\3\2\2\2\20T\3\2\2\2\22\\\3\2"+
		"\2\2\24}\3\2\2\2\26\u0082\3\2\2\2\30\u0085\3\2\2\2\32\u0094\3\2\2\2\34"+
		"\u009f\3\2\2\2\36\u00a6\3\2\2\2 \u00a8\3\2\2\2\"\u00b6\3\2\2\2$\u00b8"+
		"\3\2\2\2&\u00c0\3\2\2\2()\5\4\3\2)*\5\24\13\2*-\3\2\2\2+-\7\2\2\3,(\3"+
		"\2\2\2,+\3\2\2\2-\3\3\2\2\2./\7\4\2\2/\60\5\22\n\2\60\61\7\5\2\2\61\62"+
		"\5\6\4\2\62\64\7\b\2\2\63\65\5\22\n\2\64\63\3\2\2\2\64\65\3\2\2\2\65\66"+
		"\3\2\2\2\66\67\7 \2\2\67\5\3\2\2\289\7\6\2\29:\7\30\2\2:;\5\b\5\2;<\7"+
		"\31\2\2<=\7 \2\2=\7\3\2\2\2>?\5\n\6\2?\t\3\2\2\2@A\5\f\7\2AB\7 \2\2BC"+
		"\5\16\b\2CI\3\2\2\2DE\5\16\b\2EF\7 \2\2FG\5\f\7\2GI\3\2\2\2H@\3\2\2\2"+
		"HD\3\2\2\2I\13\3\2\2\2JK\5\20\t\2KL\7\32\2\2LM\7\f\2\2MN\7\17\2\2N\r\3"+
		"\2\2\2OP\5\20\t\2PQ\7\32\2\2QR\7\r\2\2RS\7\17\2\2S\17\3\2\2\2TY\5\22\n"+
		"\2UV\7\27\2\2VX\5\22\n\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\21\3"+
		"\2\2\2[Y\3\2\2\2\\]\7!\2\2]\23\3\2\2\2^_\7\t\2\2_`\5\22\n\2`a\7\n\2\2"+
		"ab\5\22\n\2bc\7\5\2\2cd\7\13\2\2de\5\20\t\2ef\7\32\2\2fg\7\17\2\2gh\7"+
		" \2\2hi\7\7\2\2ij\5\26\f\2jl\7\b\2\2km\5\22\n\2lk\3\2\2\2lm\3\2\2\2mn"+
		"\3\2\2\2no\7 \2\2o~\3\2\2\2pq\7\t\2\2qr\5\22\n\2rs\7\n\2\2st\5\22\n\2"+
		"tu\7\5\2\2uv\7\7\2\2vw\5\26\f\2wy\7\b\2\2xz\5\22\n\2yx\3\2\2\2yz\3\2\2"+
		"\2z{\3\2\2\2{|\7 \2\2|~\3\2\2\2}^\3\2\2\2}p\3\2\2\2~\25\3\2\2\2\177\u0081"+
		"\5\30\r\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\27\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\5\22\n"+
		"\2\u0086\u0087\7\36\2\2\u0087\u0088\5\32\16\2\u0088\u0089\7 \2\2\u0089"+
		"\31\3\2\2\2\u008a\u008b\b\16\1\2\u008b\u0095\5\22\n\2\u008c\u008d\5\34"+
		"\17\2\u008d\u008e\5\32\16\6\u008e\u0095\3\2\2\2\u008f\u0090\7\30\2\2\u0090"+
		"\u0091\5\32\16\2\u0091\u0092\7\31\2\2\u0092\u0095\3\2\2\2\u0093\u0095"+
		"\7$\2\2\u0094\u008a\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u008f\3\2\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\u009c\3\2\2\2\u0096\u0097\f\5\2\2\u0097\u0098\5\36"+
		"\20\2\u0098\u0099\5\32\16\6\u0099\u009b\3\2\2\2\u009a\u0096\3\2\2\2\u009b"+
		"\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\33\3\2\2"+
		"\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\24\2\2\u00a0\35\3\2\2\2\u00a1\u00a7"+
		"\7\21\2\2\u00a2\u00a7\7\23\2\2\u00a3\u00a7\7\22\2\2\u00a4\u00a7\7\26\2"+
		"\2\u00a5\u00a7\7\20\2\2\u00a6\u00a1\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a6"+
		"\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\37\3\2\2"+
		"\2\u00a8\u00a9\5\22\n\2\u00a9\u00aa\7\32\2\2\u00aa\u00ab\7\4\2\2\u00ab"+
		"\u00ac\7\3\2\2\u00ac\u00ad\5\22\n\2\u00ad\u00ae\7\6\2\2\u00ae\u00af\7"+
		"\16\2\2\u00af\u00b0\7\30\2\2\u00b0\u00b1\5\"\22\2\u00b1\u00b2\7\31\2\2"+
		"\u00b2\u00b3\7 \2\2\u00b3!\3\2\2\2\u00b4\u00b7\5\20\t\2\u00b5\u00b7\5"+
		"$\23\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7#\3\2\2\2\u00b8\u00bd"+
		"\5&\24\2\u00b9\u00ba\7\27\2\2\u00ba\u00bc\5&\24\2\u00bb\u00b9\3\2\2\2"+
		"\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be%\3"+
		"\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\5\22\n\2\u00c1\u00c2\7\37\2\2\u00c2"+
		"\u00c3\5\22\n\2\u00c3\'\3\2\2\2\17,\64HYly}\u0082\u0094\u009c\u00a6\u00b6"+
		"\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
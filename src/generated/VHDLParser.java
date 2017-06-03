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
		RULE_file = 0, RULE_unit = 1, RULE_entity_declaration = 2, RULE_port_declaration = 3, 
		RULE_port_list = 4, RULE_interface_declarations = 5, RULE_interface_declaration = 6, 
		RULE_identifier_list = 7, RULE_identifier = 8, RULE_architecture = 9, 
		RULE_architecture_details = 10, RULE_assignment_expression = 11, RULE_expression = 12, 
		RULE_unary_operator = 13, RULE_binary_operator = 14, RULE_entity_work = 15, 
		RULE_port_spec = 16, RULE_assignment_list = 17, RULE_assignment = 18;
	public static final String[] ruleNames = {
		"file", "unit", "entity_declaration", "port_declaration", "port_list", 
		"interface_declarations", "interface_declaration", "identifier_list", 
		"identifier", "architecture", "architecture_details", "assignment_expression", 
		"expression", "unary_operator", "binary_operator", "entity_work", "port_spec", 
		"assignment_list", "assignment"
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
		public TerminalNode EOF() { return getToken(VHDLParser.EOF, 0); }
		public List<UnitContext> unit() {
			return getRuleContexts(UnitContext.class);
		}
		public UnitContext unit(int i) {
			return getRuleContext(UnitContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENTITY || _la==ARCHITECTURE) {
				{
				{
				setState(38);
				unit();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
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

	public static class UnitContext extends ParserRuleContext {
		public Entity_declarationContext entity_declaration() {
			return getRuleContext(Entity_declarationContext.class,0);
		}
		public ArchitectureContext architecture() {
			return getRuleContext(ArchitectureContext.class,0);
		}
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_unit);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTITY:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				entity_declaration();
				}
				break;
			case ARCHITECTURE:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				architecture();
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
		enterRule(_localctx, 4, RULE_entity_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(ENTITY);
			setState(51);
			identifier();
			setState(52);
			match(IS);
			setState(53);
			port_declaration();
			setState(54);
			match(END);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER) {
				{
				setState(55);
				identifier();
				}
			}

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
		enterRule(_localctx, 6, RULE_port_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(PORT);
			setState(61);
			match(LPARENT);
			setState(62);
			port_list();
			setState(63);
			match(RPARENT);
			setState(64);
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
		enterRule(_localctx, 8, RULE_port_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
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
		public List<Interface_declarationContext> interface_declaration() {
			return getRuleContexts(Interface_declarationContext.class);
		}
		public Interface_declarationContext interface_declaration(int i) {
			return getRuleContext(Interface_declarationContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(VHDLParser.SEMI, 0); }
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
		enterRule(_localctx, 10, RULE_interface_declarations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			interface_declaration();
			setState(69);
			match(SEMI);
			setState(70);
			interface_declaration();
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

	public static class Interface_declarationContext extends ParserRuleContext {
		public Interface_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_declaration; }
	 
		public Interface_declarationContext() { }
		public void copyFrom(Interface_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InterfaceDeclarationInContext extends Interface_declarationContext {
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public TerminalNode IN() { return getToken(VHDLParser.IN, 0); }
		public InterfaceDeclarationInContext(Interface_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterInterfaceDeclarationIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitInterfaceDeclarationIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitInterfaceDeclarationIn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InterfaceDeclarationOutContext extends Interface_declarationContext {
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VHDLParser.COLON, 0); }
		public TerminalNode OUT() { return getToken(VHDLParser.OUT, 0); }
		public InterfaceDeclarationOutContext(Interface_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterInterfaceDeclarationOut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitInterfaceDeclarationOut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitInterfaceDeclarationOut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_declarationContext interface_declaration() throws RecognitionException {
		Interface_declarationContext _localctx = new Interface_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_interface_declaration);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new InterfaceDeclarationInContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				identifier_list();
				setState(73);
				match(COLON);
				setState(74);
				match(IN);
				setState(75);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new InterfaceDeclarationOutContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				identifier_list();
				setState(78);
				match(COLON);
				setState(79);
				match(OUT);
				setState(80);
				match(T__0);
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
			setState(84);
			identifier();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(85);
				match(COMMA);
				setState(86);
				identifier();
				}
				}
				setState(91);
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
			setState(92);
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
			setState(94);
			match(ARCHITECTURE);
			setState(95);
			identifier();
			setState(96);
			match(OF);
			setState(97);
			identifier();
			setState(98);
			match(IS);
			setState(99);
			match(SIGNAL);
			setState(100);
			identifier_list();
			setState(101);
			match(COLON);
			setState(102);
			match(T__0);
			setState(103);
			match(SEMI);
			setState(104);
			match(BEGIN);
			setState(105);
			architecture_details();
			setState(106);
			match(END);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BASIC_IDENTIFIER) {
				{
				setState(107);
				identifier();
				}
			}

			setState(110);
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
		public List<Entity_workContext> entity_work() {
			return getRuleContexts(Entity_workContext.class);
		}
		public Entity_workContext entity_work(int i) {
			return getRuleContext(Entity_workContext.class,i);
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
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BASIC_IDENTIFIER) {
					{
					{
					setState(112);
					assignment_expression();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BASIC_IDENTIFIER) {
					{
					{
					setState(118);
					entity_work();
					}
					}
					setState(123);
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
			setState(126);
			identifier();
			setState(127);
			match(LE);
			setState(128);
			expression();
			setState(129);
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
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public Binary_operatorContext binary_operator() {
			return getRuleContext(Binary_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPARENT() { return getToken(VHDLParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(VHDLParser.RPARENT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		int _la;
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case BASIC_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(131);
					unary_operator();
					}
				}

				setState(134);
				identifier();
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << XOR) | (1L << AND) | (1L << NAND) | (1L << OR) | (1L << NOR))) != 0)) {
					{
					setState(135);
					binary_operator();
					setState(136);
					expression();
					}
				}

				}
				break;
			case LPARENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(LPARENT);
				setState(141);
				expression();
				setState(142);
				match(RPARENT);
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
	 
		public Unary_operatorContext() { }
		public void copyFrom(Unary_operatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NOTContext extends Unary_operatorContext {
		public TerminalNode NOT() { return getToken(VHDLParser.NOT, 0); }
		public NOTContext(Unary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterNOT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitNOT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitNOT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unary_operator);
		try {
			_localctx = new NOTContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
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
	public static class NORContext extends Binary_operatorContext {
		public TerminalNode NOR() { return getToken(VHDLParser.NOR, 0); }
		public NORContext(Binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterNOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitNOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitNOR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ORContext extends Binary_operatorContext {
		public TerminalNode OR() { return getToken(VHDLParser.OR, 0); }
		public ORContext(Binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitOR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ANDContext extends Binary_operatorContext {
		public TerminalNode AND() { return getToken(VHDLParser.AND, 0); }
		public ANDContext(Binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterAND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitAND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitAND(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XORContext extends Binary_operatorContext {
		public TerminalNode XOR() { return getToken(VHDLParser.XOR, 0); }
		public XORContext(Binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterXOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitXOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitXOR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NANDContext extends Binary_operatorContext {
		public TerminalNode NAND() { return getToken(VHDLParser.NAND, 0); }
		public NANDContext(Binary_operatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).enterNAND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VHDLListener ) ((VHDLListener)listener).exitNAND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VHDLVisitor ) return ((VHDLVisitor<? extends T>)visitor).visitNAND(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_operatorContext binary_operator() throws RecognitionException {
		Binary_operatorContext _localctx = new Binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_binary_operator);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				_localctx = new ANDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(AND);
				}
				break;
			case OR:
				_localctx = new ORContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(OR);
				}
				break;
			case NAND:
				_localctx = new NANDContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				match(NAND);
				}
				break;
			case NOR:
				_localctx = new NORContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(151);
				match(NOR);
				}
				break;
			case XOR:
				_localctx = new XORContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(152);
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
			setState(155);
			identifier();
			setState(156);
			match(COLON);
			setState(157);
			match(ENTITY);
			setState(158);
			match(T__1);
			setState(159);
			identifier();
			setState(160);
			match(PORT);
			setState(161);
			match(MAP);
			setState(162);
			match(LPARENT);
			setState(163);
			port_spec();
			setState(164);
			match(RPARENT);
			setState(165);
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
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				identifier_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
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
			setState(171);
			assignment();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(172);
				match(COMMA);
				setState(173);
				assignment();
				}
				}
				setState(178);
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
			setState(179);
			identifier();
			setState(180);
			match(GE);
			setState(181);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00ba\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3\3\3\3\5\3\63"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bU"+
		"\n\b\3\t\3\t\3\t\7\tZ\n\t\f\t\16\t]\13\t\3\n\3\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13o\n\13\3\13\3\13"+
		"\3\f\7\ft\n\f\f\f\16\fw\13\f\3\f\7\fz\n\f\f\f\16\f}\13\f\5\f\177\n\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\5\16\u0087\n\16\3\16\3\16\3\16\3\16\5\16\u008d"+
		"\n\16\3\16\3\16\3\16\3\16\5\16\u0093\n\16\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u009c\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\5\22\u00ac\n\22\3\23\3\23\3\23\7\23\u00b1\n\23\f"+
		"\23\16\23\u00b4\13\23\3\24\3\24\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&\2\2\2\u00b8\2+\3\2\2\2\4\62\3\2\2\2\6\64\3"+
		"\2\2\2\b>\3\2\2\2\nD\3\2\2\2\fF\3\2\2\2\16T\3\2\2\2\20V\3\2\2\2\22^\3"+
		"\2\2\2\24`\3\2\2\2\26~\3\2\2\2\30\u0080\3\2\2\2\32\u0092\3\2\2\2\34\u0094"+
		"\3\2\2\2\36\u009b\3\2\2\2 \u009d\3\2\2\2\"\u00ab\3\2\2\2$\u00ad\3\2\2"+
		"\2&\u00b5\3\2\2\2(*\5\4\3\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,."+
		"\3\2\2\2-+\3\2\2\2./\7\2\2\3/\3\3\2\2\2\60\63\5\6\4\2\61\63\5\24\13\2"+
		"\62\60\3\2\2\2\62\61\3\2\2\2\63\5\3\2\2\2\64\65\7\5\2\2\65\66\5\22\n\2"+
		"\66\67\7\6\2\2\678\5\b\5\28:\7\t\2\29;\5\22\n\2:9\3\2\2\2:;\3\2\2\2;<"+
		"\3\2\2\2<=\7!\2\2=\7\3\2\2\2>?\7\7\2\2?@\7\31\2\2@A\5\n\6\2AB\7\32\2\2"+
		"BC\7!\2\2C\t\3\2\2\2DE\5\f\7\2E\13\3\2\2\2FG\5\16\b\2GH\7!\2\2HI\5\16"+
		"\b\2I\r\3\2\2\2JK\5\20\t\2KL\7\33\2\2LM\7\r\2\2MN\7\3\2\2NU\3\2\2\2OP"+
		"\5\20\t\2PQ\7\33\2\2QR\7\16\2\2RS\7\3\2\2SU\3\2\2\2TJ\3\2\2\2TO\3\2\2"+
		"\2U\17\3\2\2\2V[\5\22\n\2WX\7\30\2\2XZ\5\22\n\2YW\3\2\2\2Z]\3\2\2\2[Y"+
		"\3\2\2\2[\\\3\2\2\2\\\21\3\2\2\2][\3\2\2\2^_\7#\2\2_\23\3\2\2\2`a\7\n"+
		"\2\2ab\5\22\n\2bc\7\13\2\2cd\5\22\n\2de\7\6\2\2ef\7\f\2\2fg\5\20\t\2g"+
		"h\7\33\2\2hi\7\3\2\2ij\7!\2\2jk\7\b\2\2kl\5\26\f\2ln\7\t\2\2mo\5\22\n"+
		"\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7!\2\2q\25\3\2\2\2rt\5\30\r\2sr\3\2"+
		"\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\177\3\2\2\2wu\3\2\2\2xz\5 \21\2yx"+
		"\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\177\3\2\2\2}{\3\2\2\2~u\3\2\2"+
		"\2~{\3\2\2\2\177\27\3\2\2\2\u0080\u0081\5\22\n\2\u0081\u0082\7\37\2\2"+
		"\u0082\u0083\5\32\16\2\u0083\u0084\7!\2\2\u0084\31\3\2\2\2\u0085\u0087"+
		"\5\34\17\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2"+
		"\u0088\u008c\5\22\n\2\u0089\u008a\5\36\20\2\u008a\u008b\5\32\16\2\u008b"+
		"\u008d\3\2\2\2\u008c\u0089\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0093\3\2"+
		"\2\2\u008e\u008f\7\31\2\2\u008f\u0090\5\32\16\2\u0090\u0091\7\32\2\2\u0091"+
		"\u0093\3\2\2\2\u0092\u0086\3\2\2\2\u0092\u008e\3\2\2\2\u0093\33\3\2\2"+
		"\2\u0094\u0095\7\25\2\2\u0095\35\3\2\2\2\u0096\u009c\7\22\2\2\u0097\u009c"+
		"\7\24\2\2\u0098\u009c\7\23\2\2\u0099\u009c\7\27\2\2\u009a\u009c\7\21\2"+
		"\2\u009b\u0096\3\2\2\2\u009b\u0097\3\2\2\2\u009b\u0098\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009b\u009a\3\2\2\2\u009c\37\3\2\2\2\u009d\u009e\5\22\n\2\u009e"+
		"\u009f\7\33\2\2\u009f\u00a0\7\5\2\2\u00a0\u00a1\7\4\2\2\u00a1\u00a2\5"+
		"\22\n\2\u00a2\u00a3\7\7\2\2\u00a3\u00a4\7\17\2\2\u00a4\u00a5\7\31\2\2"+
		"\u00a5\u00a6\5\"\22\2\u00a6\u00a7\7\32\2\2\u00a7\u00a8\7!\2\2\u00a8!\3"+
		"\2\2\2\u00a9\u00ac\5\20\t\2\u00aa\u00ac\5$\23\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00aa\3\2\2\2\u00ac#\3\2\2\2\u00ad\u00b2\5&\24\2\u00ae\u00af\7\30\2\2"+
		"\u00af\u00b1\5&\24\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3%\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5"+
		"\u00b6\5\22\n\2\u00b6\u00b7\7 \2\2\u00b7\u00b8\5\22\n\2\u00b8\'\3\2\2"+
		"\2\21+\62:T[nu{~\u0086\u008c\u0092\u009b\u00ab\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
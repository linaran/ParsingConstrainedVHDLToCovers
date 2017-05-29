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
  static {
    RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION);
  }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache =
      new PredictionContextCache();
  public static final int
      T__0 = 1, T__1 = 2, ENTITY = 3, IS = 4, PORT = 5, BEGIN = 6, END = 7, ARCHITECTURE = 8,
      OF = 9, SIGNAL = 10, IN = 11, OUT = 12, MAP = 13, STD_LOGIC = 14, XOR = 15, AND = 16,
      NAND = 17, OR = 18, NOT = 19, XNOR = 20, NOR = 21, COMMA = 22, LPARENT = 23, RPARENT = 24,
      COLON = 25, EQ = 26, MUL = 27, DIV = 28, LE = 29, GE = 30, SEMI = 31, UNDERSCORE = 32,
      BASIC_IDENTIFIER = 33, DIGIT = 34, LETTER = 35, WS = 36;
  public static final int
      RULE_file = 0, RULE_unit = 1, RULE_entity_declaration = 2, RULE_port_declaration = 3,
      RULE_port_list = 4, RULE_interface_declarations = 5, RULE_interface_declaration = 6,
      RULE_identifier_list = 7, RULE_in_out = 8, RULE_identifier = 9, RULE_architecture = 10,
      RULE_architecture_details = 11, RULE_assignment_expression = 12, RULE_expression = 13,
      RULE_unary_operator = 14, RULE_binary_operator = 15, RULE_entity_work = 16,
      RULE_port_spec = 17, RULE_assignment_list = 18, RULE_assignment = 19;
  public static final String[] ruleNames = {
      "file", "unit", "entity_declaration", "port_declaration", "port_list",
      "interface_declarations", "interface_declaration", "identifier_list",
      "in_out", "identifier", "architecture", "architecture_details", "assignment_expression",
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
  public String getGrammarFileName() {
    return "VHDL.g4";
  }

  @Override
  public String[] getRuleNames() {
    return ruleNames;
  }

  @Override
  public String getSerializedATN() {
    return _serializedATN;
  }

  @Override
  public ATN getATN() {
    return _ATN;
  }

  public VHDLParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
  }

  public static class FileContext extends ParserRuleContext {
    public TerminalNode EOF() {
      return getToken(VHDLParser.EOF, 0);
    }

    public List<UnitContext> unit() {
      return getRuleContexts(UnitContext.class);
    }

    public UnitContext unit(int i) {
      return getRuleContext(UnitContext.class, i);
    }

    public FileContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_file;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).enterFile(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).exitFile(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof VHDLVisitor) return ((VHDLVisitor<? extends T>) visitor).visitFile(this);
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
        setState(43);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == ENTITY || _la == ARCHITECTURE) {
          {
            {
              setState(40);
              unit();
            }
          }
          setState(45);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(46);
        match(EOF);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class UnitContext extends ParserRuleContext {
    public Entity_declarationContext entity_declaration() {
      return getRuleContext(Entity_declarationContext.class, 0);
    }

    public ArchitectureContext architecture() {
      return getRuleContext(ArchitectureContext.class, 0);
    }

    public UnitContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_unit;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).enterUnit(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).exitUnit(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof VHDLVisitor) return ((VHDLVisitor<? extends T>) visitor).visitUnit(this);
      else return visitor.visitChildren(this);
    }
  }

  public final UnitContext unit() throws RecognitionException {
    UnitContext _localctx = new UnitContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_unit);
    try {
      setState(50);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case ENTITY:
          enterOuterAlt(_localctx, 1);
        {
          setState(48);
          entity_declaration();
        }
        break;
        case ARCHITECTURE:
          enterOuterAlt(_localctx, 2);
        {
          setState(49);
          architecture();
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Entity_declarationContext extends ParserRuleContext {
    public TerminalNode ENTITY() {
      return getToken(VHDLParser.ENTITY, 0);
    }

    public List<IdentifierContext> identifier() {
      return getRuleContexts(IdentifierContext.class);
    }

    public IdentifierContext identifier(int i) {
      return getRuleContext(IdentifierContext.class, i);
    }

    public TerminalNode IS() {
      return getToken(VHDLParser.IS, 0);
    }

    public Port_declarationContext port_declaration() {
      return getRuleContext(Port_declarationContext.class, 0);
    }

    public TerminalNode END() {
      return getToken(VHDLParser.END, 0);
    }

    public TerminalNode SEMI() {
      return getToken(VHDLParser.SEMI, 0);
    }

    public Entity_declarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_entity_declaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).enterEntity_declaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).exitEntity_declaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof VHDLVisitor) return ((VHDLVisitor<? extends T>) visitor).visitEntity_declaration(this);
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
        setState(52);
        match(ENTITY);
        setState(53);
        identifier();
        setState(54);
        match(IS);
        setState(55);
        port_declaration();
        setState(56);
        match(END);
        setState(58);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == BASIC_IDENTIFIER) {
          {
            setState(57);
            identifier();
          }
        }

        setState(60);
        match(SEMI);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Port_declarationContext extends ParserRuleContext {
    public TerminalNode PORT() {
      return getToken(VHDLParser.PORT, 0);
    }

    public TerminalNode LPARENT() {
      return getToken(VHDLParser.LPARENT, 0);
    }

    public Port_listContext port_list() {
      return getRuleContext(Port_listContext.class, 0);
    }

    public TerminalNode RPARENT() {
      return getToken(VHDLParser.RPARENT, 0);
    }

    public TerminalNode SEMI() {
      return getToken(VHDLParser.SEMI, 0);
    }

    public Port_declarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_port_declaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).enterPort_declaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).exitPort_declaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof VHDLVisitor) return ((VHDLVisitor<? extends T>) visitor).visitPort_declaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Port_declarationContext port_declaration() throws RecognitionException {
    Port_declarationContext _localctx = new Port_declarationContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_port_declaration);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(62);
        match(PORT);
        setState(63);
        match(LPARENT);
        setState(64);
        port_list();
        setState(65);
        match(RPARENT);
        setState(66);
        match(SEMI);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Port_listContext extends ParserRuleContext {
    public Interface_declarationsContext interface_declarations() {
      return getRuleContext(Interface_declarationsContext.class, 0);
    }

    public Port_listContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_port_list;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).enterPort_list(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).exitPort_list(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof VHDLVisitor) return ((VHDLVisitor<? extends T>) visitor).visitPort_list(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Port_listContext port_list() throws RecognitionException {
    Port_listContext _localctx = new Port_listContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_port_list);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(68);
        interface_declarations();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Interface_declarationsContext extends ParserRuleContext {
    public List<Interface_declarationContext> interface_declaration() {
      return getRuleContexts(Interface_declarationContext.class);
    }

    public Interface_declarationContext interface_declaration(int i) {
      return getRuleContext(Interface_declarationContext.class, i);
    }

    public List<TerminalNode> SEMI() {
      return getTokens(VHDLParser.SEMI);
    }

    public TerminalNode SEMI(int i) {
      return getToken(VHDLParser.SEMI, i);
    }

    public Interface_declarationsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_interface_declarations;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).enterInterface_declarations(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).exitInterface_declarations(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof VHDLVisitor) return ((VHDLVisitor<? extends T>) visitor).visitInterface_declarations(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Interface_declarationsContext interface_declarations() throws RecognitionException {
    Interface_declarationsContext _localctx = new Interface_declarationsContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_interface_declarations);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(70);
        interface_declaration();
        setState(75);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == SEMI) {
          {
            {
              setState(71);
              match(SEMI);
              setState(72);
              interface_declaration();
            }
          }
          setState(77);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Interface_declarationContext extends ParserRuleContext {
    public Identifier_listContext identifier_list() {
      return getRuleContext(Identifier_listContext.class, 0);
    }

    public TerminalNode COLON() {
      return getToken(VHDLParser.COLON, 0);
    }

    public In_outContext in_out() {
      return getRuleContext(In_outContext.class, 0);
    }

    public Interface_declarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_interface_declaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).enterInterface_declaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).exitInterface_declaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof VHDLVisitor) return ((VHDLVisitor<? extends T>) visitor).visitInterface_declaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Interface_declarationContext interface_declaration() throws RecognitionException {
    Interface_declarationContext _localctx = new Interface_declarationContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_interface_declaration);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(78);
        identifier_list();
        setState(79);
        match(COLON);
        setState(80);
        in_out();
        setState(81);
        match(T__0);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Identifier_listContext extends ParserRuleContext {
    public List<IdentifierContext> identifier() {
      return getRuleContexts(IdentifierContext.class);
    }

    public IdentifierContext identifier(int i) {
      return getRuleContext(IdentifierContext.class, i);
    }

    public List<TerminalNode> COMMA() {
      return getTokens(VHDLParser.COMMA);
    }

    public TerminalNode COMMA(int i) {
      return getToken(VHDLParser.COMMA, i);
    }

    public Identifier_listContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_identifier_list;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).enterIdentifier_list(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).exitIdentifier_list(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof VHDLVisitor) return ((VHDLVisitor<? extends T>) visitor).visitIdentifier_list(this);
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
        setState(83);
        identifier();
        setState(88);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == COMMA) {
          {
            {
              setState(84);
              match(COMMA);
              setState(85);
              identifier();
            }
          }
          setState(90);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class In_outContext extends ParserRuleContext {
    public TerminalNode IN() {
      return getToken(VHDLParser.IN, 0);
    }

    public TerminalNode OUT() {
      return getToken(VHDLParser.OUT, 0);
    }

    public In_outContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_in_out;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).enterIn_out(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).exitIn_out(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof VHDLVisitor) return ((VHDLVisitor<? extends T>) visitor).visitIn_out(this);
      else return visitor.visitChildren(this);
    }
  }

  public final In_outContext in_out() throws RecognitionException {
    In_outContext _localctx = new In_outContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_in_out);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(91);
        _la = _input.LA(1);
        if (!(_la == IN || _la == OUT)) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class IdentifierContext extends ParserRuleContext {
    public TerminalNode BASIC_IDENTIFIER() {
      return getToken(VHDLParser.BASIC_IDENTIFIER, 0);
    }

    public IdentifierContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_identifier;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).enterIdentifier(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).exitIdentifier(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof VHDLVisitor) return ((VHDLVisitor<? extends T>) visitor).visitIdentifier(this);
      else return visitor.visitChildren(this);
    }
  }

  public final IdentifierContext identifier() throws RecognitionException {
    IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_identifier);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(93);
        match(BASIC_IDENTIFIER);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ArchitectureContext extends ParserRuleContext {
    public TerminalNode ARCHITECTURE() {
      return getToken(VHDLParser.ARCHITECTURE, 0);
    }

    public List<IdentifierContext> identifier() {
      return getRuleContexts(IdentifierContext.class);
    }

    public IdentifierContext identifier(int i) {
      return getRuleContext(IdentifierContext.class, i);
    }

    public TerminalNode OF() {
      return getToken(VHDLParser.OF, 0);
    }

    public TerminalNode IS() {
      return getToken(VHDLParser.IS, 0);
    }

    public TerminalNode SIGNAL() {
      return getToken(VHDLParser.SIGNAL, 0);
    }

    public Identifier_listContext identifier_list() {
      return getRuleContext(Identifier_listContext.class, 0);
    }

    public TerminalNode COLON() {
      return getToken(VHDLParser.COLON, 0);
    }

    public List<TerminalNode> SEMI() {
      return getTokens(VHDLParser.SEMI);
    }

    public TerminalNode SEMI(int i) {
      return getToken(VHDLParser.SEMI, i);
    }

    public TerminalNode BEGIN() {
      return getToken(VHDLParser.BEGIN, 0);
    }

    public Architecture_detailsContext architecture_details() {
      return getRuleContext(Architecture_detailsContext.class, 0);
    }

    public TerminalNode END() {
      return getToken(VHDLParser.END, 0);
    }

    public ArchitectureContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_architecture;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).enterArchitecture(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).exitArchitecture(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof VHDLVisitor) return ((VHDLVisitor<? extends T>) visitor).visitArchitecture(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ArchitectureContext architecture() throws RecognitionException {
    ArchitectureContext _localctx = new ArchitectureContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_architecture);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(95);
        match(ARCHITECTURE);
        setState(96);
        identifier();
        setState(97);
        match(OF);
        setState(98);
        identifier();
        setState(99);
        match(IS);
        setState(100);
        match(SIGNAL);
        setState(101);
        identifier_list();
        setState(102);
        match(COLON);
        setState(103);
        match(T__0);
        setState(104);
        match(SEMI);
        setState(105);
        match(BEGIN);
        setState(106);
        architecture_details();
        setState(107);
        match(END);
        setState(109);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == BASIC_IDENTIFIER) {
          {
            setState(108);
            identifier();
          }
        }

        setState(111);
        match(SEMI);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Architecture_detailsContext extends ParserRuleContext {
    public List<Assignment_expressionContext> assignment_expression() {
      return getRuleContexts(Assignment_expressionContext.class);
    }

    public Assignment_expressionContext assignment_expression(int i) {
      return getRuleContext(Assignment_expressionContext.class, i);
    }

    public List<Entity_workContext> entity_work() {
      return getRuleContexts(Entity_workContext.class);
    }

    public Entity_workContext entity_work(int i) {
      return getRuleContext(Entity_workContext.class, i);
    }

    public Architecture_detailsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_architecture_details;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).enterArchitecture_details(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).exitArchitecture_details(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof VHDLVisitor) return ((VHDLVisitor<? extends T>) visitor).visitArchitecture_details(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Architecture_detailsContext architecture_details() throws RecognitionException {
    Architecture_detailsContext _localctx = new Architecture_detailsContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_architecture_details);
    int _la;
    try {
      setState(125);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
        {
          setState(116);
          _errHandler.sync(this);
          _la = _input.LA(1);
          while (_la == BASIC_IDENTIFIER) {
            {
              {
                setState(113);
                assignment_expression();
              }
            }
            setState(118);
            _errHandler.sync(this);
            _la = _input.LA(1);
          }
        }
        break;
        case 2:
          enterOuterAlt(_localctx, 2);
        {
          setState(122);
          _errHandler.sync(this);
          _la = _input.LA(1);
          while (_la == BASIC_IDENTIFIER) {
            {
              {
                setState(119);
                entity_work();
              }
            }
            setState(124);
            _errHandler.sync(this);
            _la = _input.LA(1);
          }
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Assignment_expressionContext extends ParserRuleContext {
    public IdentifierContext identifier() {
      return getRuleContext(IdentifierContext.class, 0);
    }

    public TerminalNode LE() {
      return getToken(VHDLParser.LE, 0);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public TerminalNode SEMI() {
      return getToken(VHDLParser.SEMI, 0);
    }

    public Assignment_expressionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_assignment_expression;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).enterAssignment_expression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).exitAssignment_expression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof VHDLVisitor) return ((VHDLVisitor<? extends T>) visitor).visitAssignment_expression(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Assignment_expressionContext assignment_expression() throws RecognitionException {
    Assignment_expressionContext _localctx = new Assignment_expressionContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_assignment_expression);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(127);
        identifier();
        setState(128);
        match(LE);
        setState(129);
        expression();
        setState(130);
        match(SEMI);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class ExpressionContext extends ParserRuleContext {
    public IdentifierContext identifier() {
      return getRuleContext(IdentifierContext.class, 0);
    }

    public Unary_operatorContext unary_operator() {
      return getRuleContext(Unary_operatorContext.class, 0);
    }

    public Binary_operatorContext binary_operator() {
      return getRuleContext(Binary_operatorContext.class, 0);
    }

    public ExpressionContext expression() {
      return getRuleContext(ExpressionContext.class, 0);
    }

    public TerminalNode LPARENT() {
      return getToken(VHDLParser.LPARENT, 0);
    }

    public TerminalNode RPARENT() {
      return getToken(VHDLParser.RPARENT, 0);
    }

    public ExpressionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_expression;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).enterExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).exitExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof VHDLVisitor) return ((VHDLVisitor<? extends T>) visitor).visitExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ExpressionContext expression() throws RecognitionException {
    ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
    enterRule(_localctx, 26, RULE_expression);
    int _la;
    try {
      setState(145);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case NOT:
        case BASIC_IDENTIFIER:
          enterOuterAlt(_localctx, 1);
        {
          setState(133);
          _errHandler.sync(this);
          _la = _input.LA(1);
          if (_la == NOT) {
            {
              setState(132);
              unary_operator();
            }
          }

          setState(135);
          identifier();
          setState(139);
          _errHandler.sync(this);
          _la = _input.LA(1);
          if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << XOR) | (1L << AND) | (1L << NAND) | (1L << OR) | (1L << NOR))) != 0)) {
            {
              setState(136);
              binary_operator();
              setState(137);
              expression();
            }
          }

        }
        break;
        case LPARENT:
          enterOuterAlt(_localctx, 2);
        {
          setState(141);
          match(LPARENT);
          setState(142);
          expression();
          setState(143);
          match(RPARENT);
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Unary_operatorContext extends ParserRuleContext {
    public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_unary_operator;
    }

    public Unary_operatorContext() {
    }

    public void copyFrom(Unary_operatorContext ctx) {
      super.copyFrom(ctx);
    }
  }

  public static class NOTContext extends Unary_operatorContext {
    public TerminalNode NOT() {
      return getToken(VHDLParser.NOT, 0);
    }

    public NOTContext(Unary_operatorContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).enterNOT(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).exitNOT(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof VHDLVisitor) return ((VHDLVisitor<? extends T>) visitor).visitNOT(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Unary_operatorContext unary_operator() throws RecognitionException {
    Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
    enterRule(_localctx, 28, RULE_unary_operator);
    try {
      _localctx = new NOTContext(_localctx);
      enterOuterAlt(_localctx, 1);
      {
        setState(147);
        match(NOT);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Binary_operatorContext extends ParserRuleContext {
    public Binary_operatorContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_binary_operator;
    }

    public Binary_operatorContext() {
    }

    public void copyFrom(Binary_operatorContext ctx) {
      super.copyFrom(ctx);
    }
  }

  public static class NORContext extends Binary_operatorContext {
    public TerminalNode NOR() {
      return getToken(VHDLParser.NOR, 0);
    }

    public NORContext(Binary_operatorContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).enterNOR(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).exitNOR(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof VHDLVisitor) return ((VHDLVisitor<? extends T>) visitor).visitNOR(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ORContext extends Binary_operatorContext {
    public TerminalNode OR() {
      return getToken(VHDLParser.OR, 0);
    }

    public ORContext(Binary_operatorContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).enterOR(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).exitOR(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof VHDLVisitor) return ((VHDLVisitor<? extends T>) visitor).visitOR(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class ANDContext extends Binary_operatorContext {
    public TerminalNode AND() {
      return getToken(VHDLParser.AND, 0);
    }

    public ANDContext(Binary_operatorContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).enterAND(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).exitAND(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof VHDLVisitor) return ((VHDLVisitor<? extends T>) visitor).visitAND(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class XORContext extends Binary_operatorContext {
    public TerminalNode XOR() {
      return getToken(VHDLParser.XOR, 0);
    }

    public XORContext(Binary_operatorContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).enterXOR(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).exitXOR(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof VHDLVisitor) return ((VHDLVisitor<? extends T>) visitor).visitXOR(this);
      else return visitor.visitChildren(this);
    }
  }

  public static class NANDContext extends Binary_operatorContext {
    public TerminalNode NAND() {
      return getToken(VHDLParser.NAND, 0);
    }

    public NANDContext(Binary_operatorContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).enterNAND(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).exitNAND(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof VHDLVisitor) return ((VHDLVisitor<? extends T>) visitor).visitNAND(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Binary_operatorContext binary_operator() throws RecognitionException {
    Binary_operatorContext _localctx = new Binary_operatorContext(_ctx, getState());
    enterRule(_localctx, 30, RULE_binary_operator);
    try {
      setState(154);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case AND:
          _localctx = new ANDContext(_localctx);
          enterOuterAlt(_localctx, 1);
        {
          setState(149);
          match(AND);
        }
        break;
        case OR:
          _localctx = new ORContext(_localctx);
          enterOuterAlt(_localctx, 2);
        {
          setState(150);
          match(OR);
        }
        break;
        case NAND:
          _localctx = new NANDContext(_localctx);
          enterOuterAlt(_localctx, 3);
        {
          setState(151);
          match(NAND);
        }
        break;
        case NOR:
          _localctx = new NORContext(_localctx);
          enterOuterAlt(_localctx, 4);
        {
          setState(152);
          match(NOR);
        }
        break;
        case XOR:
          _localctx = new XORContext(_localctx);
          enterOuterAlt(_localctx, 5);
        {
          setState(153);
          match(XOR);
        }
        break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Entity_workContext extends ParserRuleContext {
    public List<IdentifierContext> identifier() {
      return getRuleContexts(IdentifierContext.class);
    }

    public IdentifierContext identifier(int i) {
      return getRuleContext(IdentifierContext.class, i);
    }

    public TerminalNode COLON() {
      return getToken(VHDLParser.COLON, 0);
    }

    public TerminalNode ENTITY() {
      return getToken(VHDLParser.ENTITY, 0);
    }

    public TerminalNode PORT() {
      return getToken(VHDLParser.PORT, 0);
    }

    public TerminalNode MAP() {
      return getToken(VHDLParser.MAP, 0);
    }

    public TerminalNode LPARENT() {
      return getToken(VHDLParser.LPARENT, 0);
    }

    public Port_specContext port_spec() {
      return getRuleContext(Port_specContext.class, 0);
    }

    public TerminalNode RPARENT() {
      return getToken(VHDLParser.RPARENT, 0);
    }

    public TerminalNode SEMI() {
      return getToken(VHDLParser.SEMI, 0);
    }

    public Entity_workContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_entity_work;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).enterEntity_work(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).exitEntity_work(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof VHDLVisitor) return ((VHDLVisitor<? extends T>) visitor).visitEntity_work(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Entity_workContext entity_work() throws RecognitionException {
    Entity_workContext _localctx = new Entity_workContext(_ctx, getState());
    enterRule(_localctx, 32, RULE_entity_work);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(156);
        identifier();
        setState(157);
        match(COLON);
        setState(158);
        match(ENTITY);
        setState(159);
        match(T__1);
        setState(160);
        identifier();
        setState(161);
        match(PORT);
        setState(162);
        match(MAP);
        setState(163);
        match(LPARENT);
        setState(164);
        port_spec();
        setState(165);
        match(RPARENT);
        setState(166);
        match(SEMI);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Port_specContext extends ParserRuleContext {
    public Identifier_listContext identifier_list() {
      return getRuleContext(Identifier_listContext.class, 0);
    }

    public Assignment_listContext assignment_list() {
      return getRuleContext(Assignment_listContext.class, 0);
    }

    public Port_specContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_port_spec;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).enterPort_spec(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).exitPort_spec(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof VHDLVisitor) return ((VHDLVisitor<? extends T>) visitor).visitPort_spec(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Port_specContext port_spec() throws RecognitionException {
    Port_specContext _localctx = new Port_specContext(_ctx, getState());
    enterRule(_localctx, 34, RULE_port_spec);
    try {
      setState(170);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
        {
          setState(168);
          identifier_list();
        }
        break;
        case 2:
          enterOuterAlt(_localctx, 2);
        {
          setState(169);
          assignment_list();
        }
        break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class Assignment_listContext extends ParserRuleContext {
    public List<AssignmentContext> assignment() {
      return getRuleContexts(AssignmentContext.class);
    }

    public AssignmentContext assignment(int i) {
      return getRuleContext(AssignmentContext.class, i);
    }

    public List<TerminalNode> COMMA() {
      return getTokens(VHDLParser.COMMA);
    }

    public TerminalNode COMMA(int i) {
      return getToken(VHDLParser.COMMA, i);
    }

    public Assignment_listContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_assignment_list;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).enterAssignment_list(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).exitAssignment_list(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof VHDLVisitor) return ((VHDLVisitor<? extends T>) visitor).visitAssignment_list(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Assignment_listContext assignment_list() throws RecognitionException {
    Assignment_listContext _localctx = new Assignment_listContext(_ctx, getState());
    enterRule(_localctx, 36, RULE_assignment_list);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(172);
        assignment();
        setState(177);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == COMMA) {
          {
            {
              setState(173);
              match(COMMA);
              setState(174);
              assignment();
            }
          }
          setState(179);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static class AssignmentContext extends ParserRuleContext {
    public List<IdentifierContext> identifier() {
      return getRuleContexts(IdentifierContext.class);
    }

    public IdentifierContext identifier(int i) {
      return getRuleContext(IdentifierContext.class, i);
    }

    public TerminalNode GE() {
      return getToken(VHDLParser.GE, 0);
    }

    public AssignmentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_assignment;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).enterAssignment(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof VHDLListener) ((VHDLListener) listener).exitAssignment(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof VHDLVisitor) return ((VHDLVisitor<? extends T>) visitor).visitAssignment(this);
      else return visitor.visitChildren(this);
    }
  }

  public final AssignmentContext assignment() throws RecognitionException {
    AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
    enterRule(_localctx, 38, RULE_assignment);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(180);
        identifier();
        setState(181);
        match(GE);
        setState(182);
        identifier();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public static final String _serializedATN =
      "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00bb\4\2\t\2\4" +
          "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
          "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
          "\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\3" +
          "\3\3\5\3\65\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4=\n\4\3\4\3\4\3\5\3\5\3\5\3" +
          "\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\7\7L\n\7\f\7\16\7O\13\7\3\b\3\b\3\b\3\b" +
          "\3\b\3\t\3\t\3\t\7\tY\n\t\f\t\16\t\\\13\t\3\n\3\n\3\13\3\13\3\f\3\f\3" +
          "\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fp\n\f\3\f\3\f\3\r\7" +
          "\ru\n\r\f\r\16\rx\13\r\3\r\7\r{\n\r\f\r\16\r~\13\r\5\r\u0080\n\r\3\16" +
          "\3\16\3\16\3\16\3\16\3\17\5\17\u0088\n\17\3\17\3\17\3\17\3\17\5\17\u008e" +
          "\n\17\3\17\3\17\3\17\3\17\5\17\u0094\n\17\3\20\3\20\3\21\3\21\3\21\3\21" +
          "\3\21\5\21\u009d\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22" +
          "\3\22\3\22\3\23\3\23\5\23\u00ad\n\23\3\24\3\24\3\24\7\24\u00b2\n\24\f" +
          "\24\16\24\u00b5\13\24\3\25\3\25\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20" +
          "\22\24\26\30\32\34\36 \"$&(\2\3\3\2\r\16\2\u00b8\2-\3\2\2\2\4\64\3\2\2" +
          "\2\6\66\3\2\2\2\b@\3\2\2\2\nF\3\2\2\2\fH\3\2\2\2\16P\3\2\2\2\20U\3\2\2" +
          "\2\22]\3\2\2\2\24_\3\2\2\2\26a\3\2\2\2\30\177\3\2\2\2\32\u0081\3\2\2\2" +
          "\34\u0093\3\2\2\2\36\u0095\3\2\2\2 \u009c\3\2\2\2\"\u009e\3\2\2\2$\u00ac" +
          "\3\2\2\2&\u00ae\3\2\2\2(\u00b6\3\2\2\2*,\5\4\3\2+*\3\2\2\2,/\3\2\2\2-" +
          "+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\7\2\2\3\61\3\3\2\2\2\62" +
          "\65\5\6\4\2\63\65\5\26\f\2\64\62\3\2\2\2\64\63\3\2\2\2\65\5\3\2\2\2\66" +
          "\67\7\5\2\2\678\5\24\13\289\7\6\2\29:\5\b\5\2:<\7\t\2\2;=\5\24\13\2<;" +
          "\3\2\2\2<=\3\2\2\2=>\3\2\2\2>?\7!\2\2?\7\3\2\2\2@A\7\7\2\2AB\7\31\2\2" +
          "BC\5\n\6\2CD\7\32\2\2DE\7!\2\2E\t\3\2\2\2FG\5\f\7\2G\13\3\2\2\2HM\5\16" +
          "\b\2IJ\7!\2\2JL\5\16\b\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\r\3" +
          "\2\2\2OM\3\2\2\2PQ\5\20\t\2QR\7\33\2\2RS\5\22\n\2ST\7\3\2\2T\17\3\2\2" +
          "\2UZ\5\24\13\2VW\7\30\2\2WY\5\24\13\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z" +
          "[\3\2\2\2[\21\3\2\2\2\\Z\3\2\2\2]^\t\2\2\2^\23\3\2\2\2_`\7#\2\2`\25\3" +
          "\2\2\2ab\7\n\2\2bc\5\24\13\2cd\7\13\2\2de\5\24\13\2ef\7\6\2\2fg\7\f\2" +
          "\2gh\5\20\t\2hi\7\33\2\2ij\7\3\2\2jk\7!\2\2kl\7\b\2\2lm\5\30\r\2mo\7\t" +
          "\2\2np\5\24\13\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7!\2\2r\27\3\2\2\2su" +
          "\5\32\16\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\u0080\3\2\2\2xv\3" +
          "\2\2\2y{\5\"\22\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0080\3\2\2" +
          "\2~|\3\2\2\2\177v\3\2\2\2\177|\3\2\2\2\u0080\31\3\2\2\2\u0081\u0082\5" +
          "\24\13\2\u0082\u0083\7\37\2\2\u0083\u0084\5\34\17\2\u0084\u0085\7!\2\2" +
          "\u0085\33\3\2\2\2\u0086\u0088\5\36\20\2\u0087\u0086\3\2\2\2\u0087\u0088" +
          "\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008d\5\24\13\2\u008a\u008b\5 \21\2" +
          "\u008b\u008c\5\34\17\2\u008c\u008e\3\2\2\2\u008d\u008a\3\2\2\2\u008d\u008e" +
          "\3\2\2\2\u008e\u0094\3\2\2\2\u008f\u0090\7\31\2\2\u0090\u0091\5\34\17" +
          "\2\u0091\u0092\7\32\2\2\u0092\u0094\3\2\2\2\u0093\u0087\3\2\2\2\u0093" +
          "\u008f\3\2\2\2\u0094\35\3\2\2\2\u0095\u0096\7\25\2\2\u0096\37\3\2\2\2" +
          "\u0097\u009d\7\22\2\2\u0098\u009d\7\24\2\2\u0099\u009d\7\23\2\2\u009a" +
          "\u009d\7\27\2\2\u009b\u009d\7\21\2\2\u009c\u0097\3\2\2\2\u009c\u0098\3" +
          "\2\2\2\u009c\u0099\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d" +
          "!\3\2\2\2\u009e\u009f\5\24\13\2\u009f\u00a0\7\33\2\2\u00a0\u00a1\7\5\2" +
          "\2\u00a1\u00a2\7\4\2\2\u00a2\u00a3\5\24\13\2\u00a3\u00a4\7\7\2\2\u00a4" +
          "\u00a5\7\17\2\2\u00a5\u00a6\7\31\2\2\u00a6\u00a7\5$\23\2\u00a7\u00a8\7" +
          "\32\2\2\u00a8\u00a9\7!\2\2\u00a9#\3\2\2\2\u00aa\u00ad\5\20\t\2\u00ab\u00ad" +
          "\5&\24\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad%\3\2\2\2\u00ae" +
          "\u00b3\5(\25\2\u00af\u00b0\7\30\2\2\u00b0\u00b2\5(\25\2\u00b1\u00af\3" +
          "\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4" +
          "\'\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\5\24\13\2\u00b7\u00b8\7 \2" +
          "\2\u00b8\u00b9\5\24\13\2\u00b9)\3\2\2\2\21-\64<MZov|\177\u0087\u008d\u0093" +
          "\u009c\u00ac\u00b3";
  public static final ATN _ATN =
      new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
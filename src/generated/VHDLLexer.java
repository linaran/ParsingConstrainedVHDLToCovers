package generated;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VHDLLexer extends Lexer {
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
  public static String[] channelNames = {
      "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
  };

  public static String[] modeNames = {
      "DEFAULT_MODE"
  };

  public static final String[] ruleNames = {
      "T__0", "T__1", "ENTITY", "IS", "PORT", "BEGIN", "END", "ARCHITECTURE",
      "OF", "SIGNAL", "IN", "OUT", "MAP", "STD_LOGIC", "XOR", "AND", "NAND",
      "OR", "NOT", "XNOR", "NOR", "A", "B", "C", "D", "E", "F", "G", "H", "I",
      "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W",
      "X", "Y", "Z", "UNDER", "COMMA", "LPARENT", "RPARENT", "COLON", "EQ",
      "MUL", "DIV", "LE", "GE", "SEMI", "UNDERSCORE", "BASIC_IDENTIFIER", "DIGIT",
      "LETTER", "WS"
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


  public VHDLLexer(CharStream input) {
    super(input);
    _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
  public String[] getChannelNames() {
    return channelNames;
  }

  @Override
  public String[] getModeNames() {
    return modeNames;
  }

  @Override
  public ATN getATN() {
    return _ATN;
  }

  public static final String _serializedATN =
      "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0159\b\1\4\2\t" +
          "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
          "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
          "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
          "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
          "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
          ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t" +
          "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t=" +
          "\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3" +
          "\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3" +
          "\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t" +
          "\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13" +
          "\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3" +
          "\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3" +
          "\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3" +
          "\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3" +
          "\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"" +
          "\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-" +
          "\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65" +
          "\3\65\3\66\3\66\3\67\3\67\38\38\39\39\39\3:\3:\3:\3;\3;\3<\3<\3=\3=\3" +
          "=\3=\5=\u0146\n=\3=\3=\7=\u014a\n=\f=\16=\u014d\13=\3>\3>\3?\3?\3@\6@" +
          "\u0154\n@\r@\16@\u0155\3@\3@\2\2A\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23" +
          "\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\2/\2\61" +
          "\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[" +
          "\2]\2_\2a\2c\30e\31g\32i\33k\34m\35o\36q\37s u!w\"y#{$}%\177&\3\2\36\4" +
          "\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKk" +
          "k\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2" +
          "TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\|" +
          "|\4\2C\\c|\5\2\13\f\17\17\"\"\2\u0142\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2" +
          "\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2" +
          "\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3" +
          "\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3" +
          "\2\2\2\2+\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2" +
          "\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2" +
          "y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\3\u0081\3\2\2\2\5\u008b" +
          "\3\2\2\2\7\u0091\3\2\2\2\t\u0098\3\2\2\2\13\u009b\3\2\2\2\r\u00a0\3\2" +
          "\2\2\17\u00a6\3\2\2\2\21\u00aa\3\2\2\2\23\u00b7\3\2\2\2\25\u00ba\3\2\2" +
          "\2\27\u00c1\3\2\2\2\31\u00c4\3\2\2\2\33\u00c8\3\2\2\2\35\u00cc\3\2\2\2" +
          "\37\u00d6\3\2\2\2!\u00da\3\2\2\2#\u00de\3\2\2\2%\u00e3\3\2\2\2\'\u00e6" +
          "\3\2\2\2)\u00ea\3\2\2\2+\u00ef\3\2\2\2-\u00f3\3\2\2\2/\u00f5\3\2\2\2\61" +
          "\u00f7\3\2\2\2\63\u00f9\3\2\2\2\65\u00fb\3\2\2\2\67\u00fd\3\2\2\29\u00ff" +
          "\3\2\2\2;\u0101\3\2\2\2=\u0103\3\2\2\2?\u0105\3\2\2\2A\u0107\3\2\2\2C" +
          "\u0109\3\2\2\2E\u010b\3\2\2\2G\u010d\3\2\2\2I\u010f\3\2\2\2K\u0111\3\2" +
          "\2\2M\u0113\3\2\2\2O\u0115\3\2\2\2Q\u0117\3\2\2\2S\u0119\3\2\2\2U\u011b" +
          "\3\2\2\2W\u011d\3\2\2\2Y\u011f\3\2\2\2[\u0121\3\2\2\2]\u0123\3\2\2\2_" +
          "\u0125\3\2\2\2a\u0127\3\2\2\2c\u0129\3\2\2\2e\u012b\3\2\2\2g\u012d\3\2" +
          "\2\2i\u012f\3\2\2\2k\u0131\3\2\2\2m\u0133\3\2\2\2o\u0135\3\2\2\2q\u0137" +
          "\3\2\2\2s\u013a\3\2\2\2u\u013d\3\2\2\2w\u013f\3\2\2\2y\u0141\3\2\2\2{" +
          "\u014e\3\2\2\2}\u0150\3\2\2\2\177\u0153\3\2\2\2\u0081\u0082\7u\2\2\u0082" +
          "\u0083\7v\2\2\u0083\u0084\7f\2\2\u0084\u0085\7a\2\2\u0085\u0086\7n\2\2" +
          "\u0086\u0087\7q\2\2\u0087\u0088\7i\2\2\u0088\u0089\7k\2\2\u0089\u008a" +
          "\7e\2\2\u008a\4\3\2\2\2\u008b\u008c\7y\2\2\u008c\u008d\7q\2\2\u008d\u008e" +
          "\7t\2\2\u008e\u008f\7m\2\2\u008f\u0090\7\60\2\2\u0090\6\3\2\2\2\u0091" +
          "\u0092\5\65\33\2\u0092\u0093\5G$\2\u0093\u0094\5S*\2\u0094\u0095\5=\37" +
          "\2\u0095\u0096\5S*\2\u0096\u0097\5]/\2\u0097\b\3\2\2\2\u0098\u0099\5=" +
          "\37\2\u0099\u009a\5Q)\2\u009a\n\3\2\2\2\u009b\u009c\5K&\2\u009c\u009d" +
          "\5I%\2\u009d\u009e\5O(\2\u009e\u009f\5S*\2\u009f\f\3\2\2\2\u00a0\u00a1" +
          "\5/\30\2\u00a1\u00a2\5\65\33\2\u00a2\u00a3\59\35\2\u00a3\u00a4\5=\37\2" +
          "\u00a4\u00a5\5G$\2\u00a5\16\3\2\2\2\u00a6\u00a7\5\65\33\2\u00a7\u00a8" +
          "\5G$\2\u00a8\u00a9\5\63\32\2\u00a9\20\3\2\2\2\u00aa\u00ab\5-\27\2\u00ab" +
          "\u00ac\5O(\2\u00ac\u00ad\5\61\31\2\u00ad\u00ae\5;\36\2\u00ae\u00af\5=" +
          "\37\2\u00af\u00b0\5S*\2\u00b0\u00b1\5\65\33\2\u00b1\u00b2\5\61\31\2\u00b2" +
          "\u00b3\5S*\2\u00b3\u00b4\5U+\2\u00b4\u00b5\5O(\2\u00b5\u00b6\5\65\33\2" +
          "\u00b6\22\3\2\2\2\u00b7\u00b8\5I%\2\u00b8\u00b9\5\67\34\2\u00b9\24\3\2" +
          "\2\2\u00ba\u00bb\5Q)\2\u00bb\u00bc\5=\37\2\u00bc\u00bd\59\35\2\u00bd\u00be" +
          "\5G$\2\u00be\u00bf\5-\27\2\u00bf\u00c0\5C\"\2\u00c0\26\3\2\2\2\u00c1\u00c2" +
          "\5=\37\2\u00c2\u00c3\5G$\2\u00c3\30\3\2\2\2\u00c4\u00c5\5I%\2\u00c5\u00c6" +
          "\5U+\2\u00c6\u00c7\5S*\2\u00c7\32\3\2\2\2\u00c8\u00c9\5E#\2\u00c9\u00ca" +
          "\5-\27\2\u00ca\u00cb\5K&\2\u00cb\34\3\2\2\2\u00cc\u00cd\5Q)\2\u00cd\u00ce" +
          "\5S*\2\u00ce\u00cf\5\63\32\2\u00cf\u00d0\5a\61\2\u00d0\u00d1\5C\"\2\u00d1" +
          "\u00d2\5I%\2\u00d2\u00d3\59\35\2\u00d3\u00d4\5=\37\2\u00d4\u00d5\5\61" +
          "\31\2\u00d5\36\3\2\2\2\u00d6\u00d7\5[.\2\u00d7\u00d8\5I%\2\u00d8\u00d9" +
          "\5O(\2\u00d9 \3\2\2\2\u00da\u00db\5-\27\2\u00db\u00dc\5G$\2\u00dc\u00dd" +
          "\5\63\32\2\u00dd\"\3\2\2\2\u00de\u00df\5G$\2\u00df\u00e0\5-\27\2\u00e0" +
          "\u00e1\5G$\2\u00e1\u00e2\5\63\32\2\u00e2$\3\2\2\2\u00e3\u00e4\5I%\2\u00e4" +
          "\u00e5\5O(\2\u00e5&\3\2\2\2\u00e6\u00e7\5G$\2\u00e7\u00e8\5I%\2\u00e8" +
          "\u00e9\5S*\2\u00e9(\3\2\2\2\u00ea\u00eb\5[.\2\u00eb\u00ec\5G$\2\u00ec" +
          "\u00ed\5I%\2\u00ed\u00ee\5O(\2\u00ee*\3\2\2\2\u00ef\u00f0\5G$\2\u00f0" +
          "\u00f1\5I%\2\u00f1\u00f2\5O(\2\u00f2,\3\2\2\2\u00f3\u00f4\t\2\2\2\u00f4" +
          ".\3\2\2\2\u00f5\u00f6\t\3\2\2\u00f6\60\3\2\2\2\u00f7\u00f8\t\4\2\2\u00f8" +
          "\62\3\2\2\2\u00f9\u00fa\t\5\2\2\u00fa\64\3\2\2\2\u00fb\u00fc\t\6\2\2\u00fc" +
          "\66\3\2\2\2\u00fd\u00fe\t\7\2\2\u00fe8\3\2\2\2\u00ff\u0100\t\b\2\2\u0100" +
          ":\3\2\2\2\u0101\u0102\t\t\2\2\u0102<\3\2\2\2\u0103\u0104\t\n\2\2\u0104" +
          ">\3\2\2\2\u0105\u0106\t\13\2\2\u0106@\3\2\2\2\u0107\u0108\t\f\2\2\u0108" +
          "B\3\2\2\2\u0109\u010a\t\r\2\2\u010aD\3\2\2\2\u010b\u010c\t\16\2\2\u010c" +
          "F\3\2\2\2\u010d\u010e\t\17\2\2\u010eH\3\2\2\2\u010f\u0110\t\20\2\2\u0110" +
          "J\3\2\2\2\u0111\u0112\t\21\2\2\u0112L\3\2\2\2\u0113\u0114\t\22\2\2\u0114" +
          "N\3\2\2\2\u0115\u0116\t\23\2\2\u0116P\3\2\2\2\u0117\u0118\t\24\2\2\u0118" +
          "R\3\2\2\2\u0119\u011a\t\25\2\2\u011aT\3\2\2\2\u011b\u011c\t\26\2\2\u011c" +
          "V\3\2\2\2\u011d\u011e\t\27\2\2\u011eX\3\2\2\2\u011f\u0120\t\30\2\2\u0120" +
          "Z\3\2\2\2\u0121\u0122\t\31\2\2\u0122\\\3\2\2\2\u0123\u0124\t\32\2\2\u0124" +
          "^\3\2\2\2\u0125\u0126\t\33\2\2\u0126`\3\2\2\2\u0127\u0128\7/\2\2\u0128" +
          "b\3\2\2\2\u0129\u012a\7.\2\2\u012ad\3\2\2\2\u012b\u012c\7*\2\2\u012cf" +
          "\3\2\2\2\u012d\u012e\7+\2\2\u012eh\3\2\2\2\u012f\u0130\7<\2\2\u0130j\3" +
          "\2\2\2\u0131\u0132\7?\2\2\u0132l\3\2\2\2\u0133\u0134\7,\2\2\u0134n\3\2" +
          "\2\2\u0135\u0136\7\61\2\2\u0136p\3\2\2\2\u0137\u0138\7>\2\2\u0138\u0139" +
          "\7?\2\2\u0139r\3\2\2\2\u013a\u013b\7?\2\2\u013b\u013c\7@\2\2\u013ct\3" +
          "\2\2\2\u013d\u013e\7=\2\2\u013ev\3\2\2\2\u013f\u0140\7/\2\2\u0140x\3\2" +
          "\2\2\u0141\u014b\5}?\2\u0142\u0145\7a\2\2\u0143\u0146\5}?\2\u0144\u0146" +
          "\5{>\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146\u014a\3\2\2\2\u0147" +
          "\u014a\5}?\2\u0148\u014a\5{>\2\u0149\u0142\3\2\2\2\u0149\u0147\3\2\2\2" +
          "\u0149\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c" +
          "\3\2\2\2\u014cz\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\4\62;\2\u014f" +
          "|\3\2\2\2\u0150\u0151\t\34\2\2\u0151~\3\2\2\2\u0152\u0154\t\35\2\2\u0153" +
          "\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2" +
          "\2\2\u0156\u0157\3\2\2\2\u0157\u0158\b@\2\2\u0158\u0080\3\2\2\2\7\2\u0145" +
          "\u0149\u014b\u0155\3\b\2\2";
  public static final ATN _ATN =
      new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
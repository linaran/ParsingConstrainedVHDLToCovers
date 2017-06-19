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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ENTITY=3, IS=4, PORT=5, BEGIN=6, END=7, ARCHITECTURE=8, 
		OF=9, SIGNAL=10, IN=11, OUT=12, MAP=13, STD_LOGIC=14, XOR=15, AND=16, 
		NAND=17, OR=18, NOT=19, XNOR=20, NOR=21, COMMA=22, LPARENT=23, RPARENT=24, 
		COLON=25, EQ=26, MUL=27, DIV=28, LE=29, GE=30, SEMI=31, UNDERSCORE=32, 
		BASIC_IDENTIFIER=33, DIGIT=34, LETTER=35, BOOLEAN_CONST=36, WS=37;
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
		"LETTER", "BOOLEAN_CONST", "WS"
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
		"LETTER", "BOOLEAN_CONST", "WS"
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
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "VHDL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u0163\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3"+
		",\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3"+
		"\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\39\3:\3:\3:\3;\3;\3<\3<"+
		"\3=\3=\3=\3=\5=\u0148\n=\3=\3=\7=\u014c\n=\f=\16=\u014f\13=\3>\3>\3?\3"+
		"?\3@\3@\3@\3@\3@\3@\5@\u015b\n@\3A\6A\u015e\nA\rA\16A\u015f\3A\3A\2\2"+
		"B\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2"+
		"A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2a\2c\30e\31g\32i\33k\34"+
		"m\35o\36q\37s u!w\"y#{$}%\177&\u0081\'\3\2\36\4\2CCcc\4\2DDdd\4\2EEee"+
		"\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2N"+
		"Nnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4"+
		"\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2C\\c|\5\2\13\f\17"+
		"\17\"\"\2\u014d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2"+
		"\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}"+
		"\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\3\u0083\3\2\2\2\5\u008d\3\2\2\2"+
		"\7\u0093\3\2\2\2\t\u009a\3\2\2\2\13\u009d\3\2\2\2\r\u00a2\3\2\2\2\17\u00a8"+
		"\3\2\2\2\21\u00ac\3\2\2\2\23\u00b9\3\2\2\2\25\u00bc\3\2\2\2\27\u00c3\3"+
		"\2\2\2\31\u00c6\3\2\2\2\33\u00ca\3\2\2\2\35\u00ce\3\2\2\2\37\u00d8\3\2"+
		"\2\2!\u00dc\3\2\2\2#\u00e0\3\2\2\2%\u00e5\3\2\2\2\'\u00e8\3\2\2\2)\u00ec"+
		"\3\2\2\2+\u00f1\3\2\2\2-\u00f5\3\2\2\2/\u00f7\3\2\2\2\61\u00f9\3\2\2\2"+
		"\63\u00fb\3\2\2\2\65\u00fd\3\2\2\2\67\u00ff\3\2\2\29\u0101\3\2\2\2;\u0103"+
		"\3\2\2\2=\u0105\3\2\2\2?\u0107\3\2\2\2A\u0109\3\2\2\2C\u010b\3\2\2\2E"+
		"\u010d\3\2\2\2G\u010f\3\2\2\2I\u0111\3\2\2\2K\u0113\3\2\2\2M\u0115\3\2"+
		"\2\2O\u0117\3\2\2\2Q\u0119\3\2\2\2S\u011b\3\2\2\2U\u011d\3\2\2\2W\u011f"+
		"\3\2\2\2Y\u0121\3\2\2\2[\u0123\3\2\2\2]\u0125\3\2\2\2_\u0127\3\2\2\2a"+
		"\u0129\3\2\2\2c\u012b\3\2\2\2e\u012d\3\2\2\2g\u012f\3\2\2\2i\u0131\3\2"+
		"\2\2k\u0133\3\2\2\2m\u0135\3\2\2\2o\u0137\3\2\2\2q\u0139\3\2\2\2s\u013c"+
		"\3\2\2\2u\u013f\3\2\2\2w\u0141\3\2\2\2y\u0143\3\2\2\2{\u0150\3\2\2\2}"+
		"\u0152\3\2\2\2\177\u015a\3\2\2\2\u0081\u015d\3\2\2\2\u0083\u0084\7u\2"+
		"\2\u0084\u0085\7v\2\2\u0085\u0086\7f\2\2\u0086\u0087\7a\2\2\u0087\u0088"+
		"\7n\2\2\u0088\u0089\7q\2\2\u0089\u008a\7i\2\2\u008a\u008b\7k\2\2\u008b"+
		"\u008c\7e\2\2\u008c\4\3\2\2\2\u008d\u008e\7y\2\2\u008e\u008f\7q\2\2\u008f"+
		"\u0090\7t\2\2\u0090\u0091\7m\2\2\u0091\u0092\7\60\2\2\u0092\6\3\2\2\2"+
		"\u0093\u0094\5\65\33\2\u0094\u0095\5G$\2\u0095\u0096\5S*\2\u0096\u0097"+
		"\5=\37\2\u0097\u0098\5S*\2\u0098\u0099\5]/\2\u0099\b\3\2\2\2\u009a\u009b"+
		"\5=\37\2\u009b\u009c\5Q)\2\u009c\n\3\2\2\2\u009d\u009e\5K&\2\u009e\u009f"+
		"\5I%\2\u009f\u00a0\5O(\2\u00a0\u00a1\5S*\2\u00a1\f\3\2\2\2\u00a2\u00a3"+
		"\5/\30\2\u00a3\u00a4\5\65\33\2\u00a4\u00a5\59\35\2\u00a5\u00a6\5=\37\2"+
		"\u00a6\u00a7\5G$\2\u00a7\16\3\2\2\2\u00a8\u00a9\5\65\33\2\u00a9\u00aa"+
		"\5G$\2\u00aa\u00ab\5\63\32\2\u00ab\20\3\2\2\2\u00ac\u00ad\5-\27\2\u00ad"+
		"\u00ae\5O(\2\u00ae\u00af\5\61\31\2\u00af\u00b0\5;\36\2\u00b0\u00b1\5="+
		"\37\2\u00b1\u00b2\5S*\2\u00b2\u00b3\5\65\33\2\u00b3\u00b4\5\61\31\2\u00b4"+
		"\u00b5\5S*\2\u00b5\u00b6\5U+\2\u00b6\u00b7\5O(\2\u00b7\u00b8\5\65\33\2"+
		"\u00b8\22\3\2\2\2\u00b9\u00ba\5I%\2\u00ba\u00bb\5\67\34\2\u00bb\24\3\2"+
		"\2\2\u00bc\u00bd\5Q)\2\u00bd\u00be\5=\37\2\u00be\u00bf\59\35\2\u00bf\u00c0"+
		"\5G$\2\u00c0\u00c1\5-\27\2\u00c1\u00c2\5C\"\2\u00c2\26\3\2\2\2\u00c3\u00c4"+
		"\5=\37\2\u00c4\u00c5\5G$\2\u00c5\30\3\2\2\2\u00c6\u00c7\5I%\2\u00c7\u00c8"+
		"\5U+\2\u00c8\u00c9\5S*\2\u00c9\32\3\2\2\2\u00ca\u00cb\5E#\2\u00cb\u00cc"+
		"\5-\27\2\u00cc\u00cd\5K&\2\u00cd\34\3\2\2\2\u00ce\u00cf\5Q)\2\u00cf\u00d0"+
		"\5S*\2\u00d0\u00d1\5\63\32\2\u00d1\u00d2\5a\61\2\u00d2\u00d3\5C\"\2\u00d3"+
		"\u00d4\5I%\2\u00d4\u00d5\59\35\2\u00d5\u00d6\5=\37\2\u00d6\u00d7\5\61"+
		"\31\2\u00d7\36\3\2\2\2\u00d8\u00d9\5[.\2\u00d9\u00da\5I%\2\u00da\u00db"+
		"\5O(\2\u00db \3\2\2\2\u00dc\u00dd\5-\27\2\u00dd\u00de\5G$\2\u00de\u00df"+
		"\5\63\32\2\u00df\"\3\2\2\2\u00e0\u00e1\5G$\2\u00e1\u00e2\5-\27\2\u00e2"+
		"\u00e3\5G$\2\u00e3\u00e4\5\63\32\2\u00e4$\3\2\2\2\u00e5\u00e6\5I%\2\u00e6"+
		"\u00e7\5O(\2\u00e7&\3\2\2\2\u00e8\u00e9\5G$\2\u00e9\u00ea\5I%\2\u00ea"+
		"\u00eb\5S*\2\u00eb(\3\2\2\2\u00ec\u00ed\5[.\2\u00ed\u00ee\5G$\2\u00ee"+
		"\u00ef\5I%\2\u00ef\u00f0\5O(\2\u00f0*\3\2\2\2\u00f1\u00f2\5G$\2\u00f2"+
		"\u00f3\5I%\2\u00f3\u00f4\5O(\2\u00f4,\3\2\2\2\u00f5\u00f6\t\2\2\2\u00f6"+
		".\3\2\2\2\u00f7\u00f8\t\3\2\2\u00f8\60\3\2\2\2\u00f9\u00fa\t\4\2\2\u00fa"+
		"\62\3\2\2\2\u00fb\u00fc\t\5\2\2\u00fc\64\3\2\2\2\u00fd\u00fe\t\6\2\2\u00fe"+
		"\66\3\2\2\2\u00ff\u0100\t\7\2\2\u01008\3\2\2\2\u0101\u0102\t\b\2\2\u0102"+
		":\3\2\2\2\u0103\u0104\t\t\2\2\u0104<\3\2\2\2\u0105\u0106\t\n\2\2\u0106"+
		">\3\2\2\2\u0107\u0108\t\13\2\2\u0108@\3\2\2\2\u0109\u010a\t\f\2\2\u010a"+
		"B\3\2\2\2\u010b\u010c\t\r\2\2\u010cD\3\2\2\2\u010d\u010e\t\16\2\2\u010e"+
		"F\3\2\2\2\u010f\u0110\t\17\2\2\u0110H\3\2\2\2\u0111\u0112\t\20\2\2\u0112"+
		"J\3\2\2\2\u0113\u0114\t\21\2\2\u0114L\3\2\2\2\u0115\u0116\t\22\2\2\u0116"+
		"N\3\2\2\2\u0117\u0118\t\23\2\2\u0118P\3\2\2\2\u0119\u011a\t\24\2\2\u011a"+
		"R\3\2\2\2\u011b\u011c\t\25\2\2\u011cT\3\2\2\2\u011d\u011e\t\26\2\2\u011e"+
		"V\3\2\2\2\u011f\u0120\t\27\2\2\u0120X\3\2\2\2\u0121\u0122\t\30\2\2\u0122"+
		"Z\3\2\2\2\u0123\u0124\t\31\2\2\u0124\\\3\2\2\2\u0125\u0126\t\32\2\2\u0126"+
		"^\3\2\2\2\u0127\u0128\t\33\2\2\u0128`\3\2\2\2\u0129\u012a\7/\2\2\u012a"+
		"b\3\2\2\2\u012b\u012c\7.\2\2\u012cd\3\2\2\2\u012d\u012e\7*\2\2\u012ef"+
		"\3\2\2\2\u012f\u0130\7+\2\2\u0130h\3\2\2\2\u0131\u0132\7<\2\2\u0132j\3"+
		"\2\2\2\u0133\u0134\7?\2\2\u0134l\3\2\2\2\u0135\u0136\7,\2\2\u0136n\3\2"+
		"\2\2\u0137\u0138\7\61\2\2\u0138p\3\2\2\2\u0139\u013a\7>\2\2\u013a\u013b"+
		"\7?\2\2\u013br\3\2\2\2\u013c\u013d\7?\2\2\u013d\u013e\7@\2\2\u013et\3"+
		"\2\2\2\u013f\u0140\7=\2\2\u0140v\3\2\2\2\u0141\u0142\7/\2\2\u0142x\3\2"+
		"\2\2\u0143\u014d\5}?\2\u0144\u0147\7a\2\2\u0145\u0148\5}?\2\u0146\u0148"+
		"\5{>\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148\u014c\3\2\2\2\u0149"+
		"\u014c\5}?\2\u014a\u014c\5{>\2\u014b\u0144\3\2\2\2\u014b\u0149\3\2\2\2"+
		"\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e"+
		"\3\2\2\2\u014ez\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\4\62;\2\u0151"+
		"|\3\2\2\2\u0152\u0153\t\34\2\2\u0153~\3\2\2\2\u0154\u0155\7)\2\2\u0155"+
		"\u0156\7\62\2\2\u0156\u015b\7)\2\2\u0157\u0158\7)\2\2\u0158\u0159\7\63"+
		"\2\2\u0159\u015b\7)\2\2\u015a\u0154\3\2\2\2\u015a\u0157\3\2\2\2\u015b"+
		"\u0080\3\2\2\2\u015c\u015e\t\35\2\2\u015d\u015c\3\2\2\2\u015e\u015f\3"+
		"\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0162\bA\2\2\u0162\u0082\3\2\2\2\b\2\u0147\u014b\u014d\u015a\u015f\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
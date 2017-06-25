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
		T__0=1, ENTITY=2, IS=3, PORT=4, BEGIN=5, END=6, ARCHITECTURE=7, OF=8, 
		SIGNAL=9, IN=10, OUT=11, MAP=12, STDLOGIC=13, XOR=14, AND=15, NAND=16, 
		OR=17, NOT=18, XNOR=19, NOR=20, COMMA=21, LPARENT=22, RPARENT=23, COLON=24, 
		EQ=25, MUL=26, DIV=27, LE=28, GE=29, SEMI=30, BASIC_IDENTIFIER=31, DIGIT=32, 
		LETTER=33, BOOLEAN_CONST=34, WS=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "ENTITY", "IS", "PORT", "BEGIN", "END", "ARCHITECTURE", "OF", 
		"SIGNAL", "IN", "OUT", "MAP", "STDLOGIC", "XOR", "AND", "NAND", "OR", 
		"NOT", "XNOR", "NOR", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", 
		"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", 
		"Y", "Z", "COMMA", "LPARENT", "RPARENT", "COLON", "EQ", "MUL", "DIV", 
		"LE", "GE", "SEMI", "BASIC_IDENTIFIER", "DIGIT", "LETTER", "BOOLEAN_CONST", 
		"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u014f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)"+
		"\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\3:\3"+
		":\3:\3:\5:\u0134\n:\3:\3:\7:\u0138\n:\f:\16:\u013b\13:\3;\3;\3<\3<\3="+
		"\3=\3=\3=\3=\3=\5=\u0147\n=\3>\6>\u014a\n>\r>\16>\u014b\3>\3>\2\2?\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2?\2A\2C\2E"+
		"\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\27a\30c\31e\32g\33i\34k\35m\36"+
		"o\37q s!u\"w#y${%\3\2\36\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2H"+
		"Hhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4"+
		"\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYy"+
		"y\4\2ZZzz\4\2[[{{\4\2\\\\||\4\2C\\c|\5\2\13\f\17\17\"\"\2\u013a\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\3}\3\2\2\2\5"+
		"\u0083\3\2\2\2\7\u008a\3\2\2\2\t\u008d\3\2\2\2\13\u0092\3\2\2\2\r\u0098"+
		"\3\2\2\2\17\u009c\3\2\2\2\21\u00a9\3\2\2\2\23\u00ac\3\2\2\2\25\u00b3\3"+
		"\2\2\2\27\u00b6\3\2\2\2\31\u00ba\3\2\2\2\33\u00be\3\2\2\2\35\u00c8\3\2"+
		"\2\2\37\u00cc\3\2\2\2!\u00d0\3\2\2\2#\u00d5\3\2\2\2%\u00d8\3\2\2\2\'\u00dc"+
		"\3\2\2\2)\u00e1\3\2\2\2+\u00e5\3\2\2\2-\u00e7\3\2\2\2/\u00e9\3\2\2\2\61"+
		"\u00eb\3\2\2\2\63\u00ed\3\2\2\2\65\u00ef\3\2\2\2\67\u00f1\3\2\2\29\u00f3"+
		"\3\2\2\2;\u00f5\3\2\2\2=\u00f7\3\2\2\2?\u00f9\3\2\2\2A\u00fb\3\2\2\2C"+
		"\u00fd\3\2\2\2E\u00ff\3\2\2\2G\u0101\3\2\2\2I\u0103\3\2\2\2K\u0105\3\2"+
		"\2\2M\u0107\3\2\2\2O\u0109\3\2\2\2Q\u010b\3\2\2\2S\u010d\3\2\2\2U\u010f"+
		"\3\2\2\2W\u0111\3\2\2\2Y\u0113\3\2\2\2[\u0115\3\2\2\2]\u0117\3\2\2\2_"+
		"\u0119\3\2\2\2a\u011b\3\2\2\2c\u011d\3\2\2\2e\u011f\3\2\2\2g\u0121\3\2"+
		"\2\2i\u0123\3\2\2\2k\u0125\3\2\2\2m\u0127\3\2\2\2o\u012a\3\2\2\2q\u012d"+
		"\3\2\2\2s\u012f\3\2\2\2u\u013c\3\2\2\2w\u013e\3\2\2\2y\u0146\3\2\2\2{"+
		"\u0149\3\2\2\2}~\7y\2\2~\177\7q\2\2\177\u0080\7t\2\2\u0080\u0081\7m\2"+
		"\2\u0081\u0082\7\60\2\2\u0082\4\3\2\2\2\u0083\u0084\5\63\32\2\u0084\u0085"+
		"\5E#\2\u0085\u0086\5Q)\2\u0086\u0087\5;\36\2\u0087\u0088\5Q)\2\u0088\u0089"+
		"\5[.\2\u0089\6\3\2\2\2\u008a\u008b\5;\36\2\u008b\u008c\5O(\2\u008c\b\3"+
		"\2\2\2\u008d\u008e\5I%\2\u008e\u008f\5G$\2\u008f\u0090\5M\'\2\u0090\u0091"+
		"\5Q)\2\u0091\n\3\2\2\2\u0092\u0093\5-\27\2\u0093\u0094\5\63\32\2\u0094"+
		"\u0095\5\67\34\2\u0095\u0096\5;\36\2\u0096\u0097\5E#\2\u0097\f\3\2\2\2"+
		"\u0098\u0099\5\63\32\2\u0099\u009a\5E#\2\u009a\u009b\5\61\31\2\u009b\16"+
		"\3\2\2\2\u009c\u009d\5+\26\2\u009d\u009e\5M\'\2\u009e\u009f\5/\30\2\u009f"+
		"\u00a0\59\35\2\u00a0\u00a1\5;\36\2\u00a1\u00a2\5Q)\2\u00a2\u00a3\5\63"+
		"\32\2\u00a3\u00a4\5/\30\2\u00a4\u00a5\5Q)\2\u00a5\u00a6\5S*\2\u00a6\u00a7"+
		"\5M\'\2\u00a7\u00a8\5\63\32\2\u00a8\20\3\2\2\2\u00a9\u00aa\5G$\2\u00aa"+
		"\u00ab\5\65\33\2\u00ab\22\3\2\2\2\u00ac\u00ad\5O(\2\u00ad\u00ae\5;\36"+
		"\2\u00ae\u00af\5\67\34\2\u00af\u00b0\5E#\2\u00b0\u00b1\5+\26\2\u00b1\u00b2"+
		"\5A!\2\u00b2\24\3\2\2\2\u00b3\u00b4\5;\36\2\u00b4\u00b5\5E#\2\u00b5\26"+
		"\3\2\2\2\u00b6\u00b7\5G$\2\u00b7\u00b8\5S*\2\u00b8\u00b9\5Q)\2\u00b9\30"+
		"\3\2\2\2\u00ba\u00bb\5C\"\2\u00bb\u00bc\5+\26\2\u00bc\u00bd\5I%\2\u00bd"+
		"\32\3\2\2\2\u00be\u00bf\5O(\2\u00bf\u00c0\5Q)\2\u00c0\u00c1\5\61\31\2"+
		"\u00c1\u00c2\7a\2\2\u00c2\u00c3\5A!\2\u00c3\u00c4\5G$\2\u00c4\u00c5\5"+
		"\67\34\2\u00c5\u00c6\5;\36\2\u00c6\u00c7\5/\30\2\u00c7\34\3\2\2\2\u00c8"+
		"\u00c9\5Y-\2\u00c9\u00ca\5G$\2\u00ca\u00cb\5M\'\2\u00cb\36\3\2\2\2\u00cc"+
		"\u00cd\5+\26\2\u00cd\u00ce\5E#\2\u00ce\u00cf\5\61\31\2\u00cf \3\2\2\2"+
		"\u00d0\u00d1\5E#\2\u00d1\u00d2\5+\26\2\u00d2\u00d3\5E#\2\u00d3\u00d4\5"+
		"\61\31\2\u00d4\"\3\2\2\2\u00d5\u00d6\5G$\2\u00d6\u00d7\5M\'\2\u00d7$\3"+
		"\2\2\2\u00d8\u00d9\5E#\2\u00d9\u00da\5G$\2\u00da\u00db\5Q)\2\u00db&\3"+
		"\2\2\2\u00dc\u00dd\5Y-\2\u00dd\u00de\5E#\2\u00de\u00df\5G$\2\u00df\u00e0"+
		"\5M\'\2\u00e0(\3\2\2\2\u00e1\u00e2\5E#\2\u00e2\u00e3\5G$\2\u00e3\u00e4"+
		"\5M\'\2\u00e4*\3\2\2\2\u00e5\u00e6\t\2\2\2\u00e6,\3\2\2\2\u00e7\u00e8"+
		"\t\3\2\2\u00e8.\3\2\2\2\u00e9\u00ea\t\4\2\2\u00ea\60\3\2\2\2\u00eb\u00ec"+
		"\t\5\2\2\u00ec\62\3\2\2\2\u00ed\u00ee\t\6\2\2\u00ee\64\3\2\2\2\u00ef\u00f0"+
		"\t\7\2\2\u00f0\66\3\2\2\2\u00f1\u00f2\t\b\2\2\u00f28\3\2\2\2\u00f3\u00f4"+
		"\t\t\2\2\u00f4:\3\2\2\2\u00f5\u00f6\t\n\2\2\u00f6<\3\2\2\2\u00f7\u00f8"+
		"\t\13\2\2\u00f8>\3\2\2\2\u00f9\u00fa\t\f\2\2\u00fa@\3\2\2\2\u00fb\u00fc"+
		"\t\r\2\2\u00fcB\3\2\2\2\u00fd\u00fe\t\16\2\2\u00feD\3\2\2\2\u00ff\u0100"+
		"\t\17\2\2\u0100F\3\2\2\2\u0101\u0102\t\20\2\2\u0102H\3\2\2\2\u0103\u0104"+
		"\t\21\2\2\u0104J\3\2\2\2\u0105\u0106\t\22\2\2\u0106L\3\2\2\2\u0107\u0108"+
		"\t\23\2\2\u0108N\3\2\2\2\u0109\u010a\t\24\2\2\u010aP\3\2\2\2\u010b\u010c"+
		"\t\25\2\2\u010cR\3\2\2\2\u010d\u010e\t\26\2\2\u010eT\3\2\2\2\u010f\u0110"+
		"\t\27\2\2\u0110V\3\2\2\2\u0111\u0112\t\30\2\2\u0112X\3\2\2\2\u0113\u0114"+
		"\t\31\2\2\u0114Z\3\2\2\2\u0115\u0116\t\32\2\2\u0116\\\3\2\2\2\u0117\u0118"+
		"\t\33\2\2\u0118^\3\2\2\2\u0119\u011a\7.\2\2\u011a`\3\2\2\2\u011b\u011c"+
		"\7*\2\2\u011cb\3\2\2\2\u011d\u011e\7+\2\2\u011ed\3\2\2\2\u011f\u0120\7"+
		"<\2\2\u0120f\3\2\2\2\u0121\u0122\7?\2\2\u0122h\3\2\2\2\u0123\u0124\7,"+
		"\2\2\u0124j\3\2\2\2\u0125\u0126\7\61\2\2\u0126l\3\2\2\2\u0127\u0128\7"+
		">\2\2\u0128\u0129\7?\2\2\u0129n\3\2\2\2\u012a\u012b\7?\2\2\u012b\u012c"+
		"\7@\2\2\u012cp\3\2\2\2\u012d\u012e\7=\2\2\u012er\3\2\2\2\u012f\u0139\5"+
		"w<\2\u0130\u0133\7a\2\2\u0131\u0134\5w<\2\u0132\u0134\5u;\2\u0133\u0131"+
		"\3\2\2\2\u0133\u0132\3\2\2\2\u0134\u0138\3\2\2\2\u0135\u0138\5w<\2\u0136"+
		"\u0138\5u;\2\u0137\u0130\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2"+
		"\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013at"+
		"\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\4\62;\2\u013dv\3\2\2\2\u013e"+
		"\u013f\t\34\2\2\u013fx\3\2\2\2\u0140\u0141\7)\2\2\u0141\u0142\7\62\2\2"+
		"\u0142\u0147\7)\2\2\u0143\u0144\7)\2\2\u0144\u0145\7\63\2\2\u0145\u0147"+
		"\7)\2\2\u0146\u0140\3\2\2\2\u0146\u0143\3\2\2\2\u0147z\3\2\2\2\u0148\u014a"+
		"\t\35\2\2\u0149\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0149\3\2\2\2"+
		"\u014b\u014c\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\b>\2\2\u014e|\3\2"+
		"\2\2\b\2\u0133\u0137\u0139\u0146\u014b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
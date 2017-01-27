// Generated from /Users/hasan/Desktop/Projects/University/Term 7/Compiler/Phase2/src/grammer/X.g4 by ANTLR 4.5.3
package grammer;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IntegerConstant=1, CharacterConstant=2, Typedef=3, Return=4, If=5, Else=6, 
		Size=7, Void=8, Int=9, Char=10, String=11, While=12, Break=13, Nil=14, 
		NumberSign=15, Of=16, In=17, As=18, List=19, Foreach=20, Head=21, Tail=22, 
		DollarSign=23, LeftParen=24, RightParen=25, LeftBracket=26, RightBracket=27, 
		LeftBrace=28, RightBrace=29, Less=30, Greater=31, Plus=32, Minus=33, Star=34, 
		Div=35, AndAnd=36, OrOr=37, Not=38, Colon=39, Semi=40, Comma=41, Assign=42, 
		Equal=43, NotEqual=44, Arrow=45, Dot=46, StringLiteral=47, NotPermittedCharacterConstant=48, 
		Identifier=49, Whitespace=50, Newline=51, BlockComment=52, LineComment=53;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"Nondigit", "IdentifierNondigit", "IntegerConstant", "NonzeroDigit", "Digit", 
		"CharacterConstant", "CCharSequence", "CChar", "EscapeSequence", "SCharSequence", 
		"SChar", "Typedef", "Return", "If", "Else", "Size", "Void", "Int", "Char", 
		"String", "While", "Break", "Nil", "NumberSign", "Of", "In", "As", "List", 
		"Foreach", "Head", "Tail", "DollarSign", "LeftParen", "RightParen", "LeftBracket", 
		"RightBracket", "LeftBrace", "RightBrace", "Less", "Greater", "Plus", 
		"Minus", "Star", "Div", "AndAnd", "OrOr", "Not", "Colon", "Semi", "Comma", 
		"Assign", "Equal", "NotEqual", "Arrow", "Dot", "StringLiteral", "NotPermittedCharacterConstant", 
		"Identifier", "Whitespace", "Newline", "BlockComment", "LineComment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'typedef'", "'return'", "'if'", "'else'", "'size'", 
		"'void'", "'int'", "'char'", "'string'", "'while'", "'break'", "'nil'", 
		"'#'", "'of'", "'in'", "'as'", "'list'", "'foreach'", "'head'", "'tail'", 
		"'$'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<'", "'>'", "'+'", 
		"'-'", "'*'", "'/'", "'&&'", "'||'", "'!'", "':'", "';'", "','", "'='", 
		"'=='", "'!='", "'->'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IntegerConstant", "CharacterConstant", "Typedef", "Return", "If", 
		"Else", "Size", "Void", "Int", "Char", "String", "While", "Break", "Nil", 
		"NumberSign", "Of", "In", "As", "List", "Foreach", "Head", "Tail", "DollarSign", 
		"LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
		"RightBrace", "Less", "Greater", "Plus", "Minus", "Star", "Div", "AndAnd", 
		"OrOr", "Not", "Colon", "Semi", "Comma", "Assign", "Equal", "NotEqual", 
		"Arrow", "Dot", "StringLiteral", "NotPermittedCharacterConstant", "Identifier", 
		"Whitespace", "Newline", "BlockComment", "LineComment"
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


	public XLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "X.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\67\u017c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\3\2\3\2\3\3\3\3\3\4\3\4\7\4\u0086\n\4\f\4\16\4\u0089\13"+
		"\4\3\4\5\4\u008c\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\5"+
		"\t\u009a\n\t\3\n\3\n\3\n\3\13\6\13\u00a0\n\13\r\13\16\13\u00a1\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u00ab\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3("+
		"\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\38\38\39\39\59\u0147\n9\39\39\3:\3:\5:\u014d\n:\3:\3:\3;\3;\3;\7"+
		";\u0154\n;\f;\16;\u0157\13;\3<\6<\u015a\n<\r<\16<\u015b\3<\3<\3=\3=\3"+
		"=\3=\3>\3>\3>\3>\7>\u0168\n>\f>\16>\u016b\13>\3>\3>\3>\3>\3>\3?\3?\3?"+
		"\3?\7?\u0176\n?\f?\16?\u0179\13?\3?\3?\3\u0169\2@\3\2\5\2\7\3\t\2\13\2"+
		"\r\4\17\2\21\2\23\2\25\2\27\2\31\5\33\6\35\7\37\b!\t#\n%\13\'\f)\r+\16"+
		"-\17/\20\61\21\63\22\65\23\67\249\25;\26=\27?\30A\31C\32E\33G\34I\35K"+
		"\36M\37O Q!S\"U#W$Y%[&]\'_(a)c*e+g,i-k.m/o\60q\61s\62u\63w\64y\65{\66"+
		"}\67\3\2\n\5\2C\\aac|\3\2\63;\3\2\62;\6\2\f\f\17\17))^^\f\2$$))AA^^cd"+
		"hhppttvvxx\6\2\f\f\17\17$$^^\4\2\13\13\"\"\4\2\f\f\17\17\u0180\2\7\3\2"+
		"\2\2\2\r\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k"+
		"\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2"+
		"\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\3\177\3\2\2\2\5\u0081\3\2\2\2\7"+
		"\u008b\3\2\2\2\t\u008d\3\2\2\2\13\u008f\3\2\2\2\r\u0091\3\2\2\2\17\u0095"+
		"\3\2\2\2\21\u0099\3\2\2\2\23\u009b\3\2\2\2\25\u009f\3\2\2\2\27\u00aa\3"+
		"\2\2\2\31\u00ac\3\2\2\2\33\u00b4\3\2\2\2\35\u00bb\3\2\2\2\37\u00be\3\2"+
		"\2\2!\u00c3\3\2\2\2#\u00c8\3\2\2\2%\u00cd\3\2\2\2\'\u00d1\3\2\2\2)\u00d6"+
		"\3\2\2\2+\u00dd\3\2\2\2-\u00e3\3\2\2\2/\u00e9\3\2\2\2\61\u00ed\3\2\2\2"+
		"\63\u00ef\3\2\2\2\65\u00f2\3\2\2\2\67\u00f5\3\2\2\29\u00f8\3\2\2\2;\u00fd"+
		"\3\2\2\2=\u0105\3\2\2\2?\u010a\3\2\2\2A\u010f\3\2\2\2C\u0111\3\2\2\2E"+
		"\u0113\3\2\2\2G\u0115\3\2\2\2I\u0117\3\2\2\2K\u0119\3\2\2\2M\u011b\3\2"+
		"\2\2O\u011d\3\2\2\2Q\u011f\3\2\2\2S\u0121\3\2\2\2U\u0123\3\2\2\2W\u0125"+
		"\3\2\2\2Y\u0127\3\2\2\2[\u0129\3\2\2\2]\u012c\3\2\2\2_\u012f\3\2\2\2a"+
		"\u0131\3\2\2\2c\u0133\3\2\2\2e\u0135\3\2\2\2g\u0137\3\2\2\2i\u0139\3\2"+
		"\2\2k\u013c\3\2\2\2m\u013f\3\2\2\2o\u0142\3\2\2\2q\u0144\3\2\2\2s\u014a"+
		"\3\2\2\2u\u0150\3\2\2\2w\u0159\3\2\2\2y\u015f\3\2\2\2{\u0163\3\2\2\2}"+
		"\u0171\3\2\2\2\177\u0080\t\2\2\2\u0080\4\3\2\2\2\u0081\u0082\5\3\2\2\u0082"+
		"\6\3\2\2\2\u0083\u0087\5\t\5\2\u0084\u0086\5\13\6\2\u0085\u0084\3\2\2"+
		"\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008c"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008c\7\62\2\2\u008b\u0083\3\2\2\2"+
		"\u008b\u008a\3\2\2\2\u008c\b\3\2\2\2\u008d\u008e\t\3\2\2\u008e\n\3\2\2"+
		"\2\u008f\u0090\t\4\2\2\u0090\f\3\2\2\2\u0091\u0092\7)\2\2\u0092\u0093"+
		"\5\17\b\2\u0093\u0094\7)\2\2\u0094\16\3\2\2\2\u0095\u0096\5\21\t\2\u0096"+
		"\20\3\2\2\2\u0097\u009a\n\5\2\2\u0098\u009a\5\23\n\2\u0099\u0097\3\2\2"+
		"\2\u0099\u0098\3\2\2\2\u009a\22\3\2\2\2\u009b\u009c\7^\2\2\u009c\u009d"+
		"\t\6\2\2\u009d\24\3\2\2\2\u009e\u00a0\5\27\f\2\u009f\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\26\3\2\2"+
		"\2\u00a3\u00ab\n\7\2\2\u00a4\u00ab\5\23\n\2\u00a5\u00a6\7^\2\2\u00a6\u00ab"+
		"\7\f\2\2\u00a7\u00a8\7^\2\2\u00a8\u00a9\7\17\2\2\u00a9\u00ab\7\f\2\2\u00aa"+
		"\u00a3\3\2\2\2\u00aa\u00a4\3\2\2\2\u00aa\u00a5\3\2\2\2\u00aa\u00a7\3\2"+
		"\2\2\u00ab\30\3\2\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7{\2\2\u00ae\u00af"+
		"\7r\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7f\2\2\u00b1\u00b2\7g\2\2\u00b2"+
		"\u00b3\7h\2\2\u00b3\32\3\2\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7g\2\2\u00b6"+
		"\u00b7\7v\2\2\u00b7\u00b8\7w\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7p\2\2"+
		"\u00ba\34\3\2\2\2\u00bb\u00bc\7k\2\2\u00bc\u00bd\7h\2\2\u00bd\36\3\2\2"+
		"\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2"+
		"\7g\2\2\u00c2 \3\2\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6"+
		"\7|\2\2\u00c6\u00c7\7g\2\2\u00c7\"\3\2\2\2\u00c8\u00c9\7x\2\2\u00c9\u00ca"+
		"\7q\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7f\2\2\u00cc$\3\2\2\2\u00cd\u00ce"+
		"\7k\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7v\2\2\u00d0&\3\2\2\2\u00d1\u00d2"+
		"\7e\2\2\u00d2\u00d3\7j\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7t\2\2\u00d5"+
		"(\3\2\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7v\2\2\u00d8\u00d9\7t\2\2\u00d9"+
		"\u00da\7k\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7i\2\2\u00dc*\3\2\2\2\u00dd"+
		"\u00de\7y\2\2\u00de\u00df\7j\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7n\2\2"+
		"\u00e1\u00e2\7g\2\2\u00e2,\3\2\2\2\u00e3\u00e4\7d\2\2\u00e4\u00e5\7t\2"+
		"\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7c\2\2\u00e7\u00e8\7m\2\2\u00e8.\3\2"+
		"\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7n\2\2\u00ec\60"+
		"\3\2\2\2\u00ed\u00ee\7%\2\2\u00ee\62\3\2\2\2\u00ef\u00f0\7q\2\2\u00f0"+
		"\u00f1\7h\2\2\u00f1\64\3\2\2\2\u00f2\u00f3\7k\2\2\u00f3\u00f4\7p\2\2\u00f4"+
		"\66\3\2\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7u\2\2\u00f78\3\2\2\2\u00f8"+
		"\u00f9\7n\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fc\7v\2\2"+
		"\u00fc:\3\2\2\2\u00fd\u00fe\7h\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7t\2"+
		"\2\u0100\u0101\7g\2\2\u0101\u0102\7c\2\2\u0102\u0103\7e\2\2\u0103\u0104"+
		"\7j\2\2\u0104<\3\2\2\2\u0105\u0106\7j\2\2\u0106\u0107\7g\2\2\u0107\u0108"+
		"\7c\2\2\u0108\u0109\7f\2\2\u0109>\3\2\2\2\u010a\u010b\7v\2\2\u010b\u010c"+
		"\7c\2\2\u010c\u010d\7k\2\2\u010d\u010e\7n\2\2\u010e@\3\2\2\2\u010f\u0110"+
		"\7&\2\2\u0110B\3\2\2\2\u0111\u0112\7*\2\2\u0112D\3\2\2\2\u0113\u0114\7"+
		"+\2\2\u0114F\3\2\2\2\u0115\u0116\7]\2\2\u0116H\3\2\2\2\u0117\u0118\7_"+
		"\2\2\u0118J\3\2\2\2\u0119\u011a\7}\2\2\u011aL\3\2\2\2\u011b\u011c\7\177"+
		"\2\2\u011cN\3\2\2\2\u011d\u011e\7>\2\2\u011eP\3\2\2\2\u011f\u0120\7@\2"+
		"\2\u0120R\3\2\2\2\u0121\u0122\7-\2\2\u0122T\3\2\2\2\u0123\u0124\7/\2\2"+
		"\u0124V\3\2\2\2\u0125\u0126\7,\2\2\u0126X\3\2\2\2\u0127\u0128\7\61\2\2"+
		"\u0128Z\3\2\2\2\u0129\u012a\7(\2\2\u012a\u012b\7(\2\2\u012b\\\3\2\2\2"+
		"\u012c\u012d\7~\2\2\u012d\u012e\7~\2\2\u012e^\3\2\2\2\u012f\u0130\7#\2"+
		"\2\u0130`\3\2\2\2\u0131\u0132\7<\2\2\u0132b\3\2\2\2\u0133\u0134\7=\2\2"+
		"\u0134d\3\2\2\2\u0135\u0136\7.\2\2\u0136f\3\2\2\2\u0137\u0138\7?\2\2\u0138"+
		"h\3\2\2\2\u0139\u013a\7?\2\2\u013a\u013b\7?\2\2\u013bj\3\2\2\2\u013c\u013d"+
		"\7#\2\2\u013d\u013e\7?\2\2\u013el\3\2\2\2\u013f\u0140\7/\2\2\u0140\u0141"+
		"\7@\2\2\u0141n\3\2\2\2\u0142\u0143\7\60\2\2\u0143p\3\2\2\2\u0144\u0146"+
		"\7$\2\2\u0145\u0147\5\25\13\2\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2"+
		"\u0147\u0148\3\2\2\2\u0148\u0149\7$\2\2\u0149r\3\2\2\2\u014a\u014c\7)"+
		"\2\2\u014b\u014d\5\25\13\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e\u014f\7)\2\2\u014ft\3\2\2\2\u0150\u0155\5\5\3\2\u0151"+
		"\u0154\5\5\3\2\u0152\u0154\5\13\6\2\u0153\u0151\3\2\2\2\u0153\u0152\3"+
		"\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"v\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u015a\t\b\2\2\u0159\u0158\3\2\2\2"+
		"\u015a\u015b\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d"+
		"\3\2\2\2\u015d\u015e\b<\2\2\u015ex\3\2\2\2\u015f\u0160\t\t\2\2\u0160\u0161"+
		"\3\2\2\2\u0161\u0162\b=\2\2\u0162z\3\2\2\2\u0163\u0164\7\61\2\2\u0164"+
		"\u0165\7,\2\2\u0165\u0169\3\2\2\2\u0166\u0168\13\2\2\2\u0167\u0166\3\2"+
		"\2\2\u0168\u016b\3\2\2\2\u0169\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a"+
		"\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d\7,\2\2\u016d\u016e\7\61"+
		"\2\2\u016e\u016f\3\2\2\2\u016f\u0170\b>\2\2\u0170|\3\2\2\2\u0171\u0172"+
		"\7\61\2\2\u0172\u0173\7\61\2\2\u0173\u0177\3\2\2\2\u0174\u0176\n\t\2\2"+
		"\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178"+
		"\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\b?\2\2\u017b"+
		"~\3\2\2\2\17\2\u0087\u008b\u0099\u00a1\u00aa\u0146\u014c\u0153\u0155\u015b"+
		"\u0169\u0177\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
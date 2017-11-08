// Generated from /Users/qiaoyize/eclipse-workspace/HipChat/src/main/antlr4/Msg.g4 by ANTLR 4.5.3
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
public class MsgLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, AT=12, WORD=13, LEFT_PAREN=14, RIGHT_PAREN=15, NUMBER=16, 
		ANYCHAR=17, STRING=18, HEX=19, WS=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "AT", "WORD", "LEFT_PAREN", "RIGHT_PAREN", "NUMBER", 
		"LETTER", "DIGIT", "ANYCHAR", "STRING", "HEX", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'://'", "':'", "'http'", "'https'", "'/'", "'.'", "'#'", 
		"'?'", "'&'", "'='", "'@'", null, "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"AT", "WORD", "LEFT_PAREN", "RIGHT_PAREN", "NUMBER", "ANYCHAR", "STRING", 
		"HEX", "WS"
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


	public MsgLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Msg.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26{\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\6\16R\n\16\r\16\16\16"+
		"S\3\17\3\17\3\20\3\20\3\21\6\21[\n\21\r\21\16\21\\\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\5\25g\n\25\3\25\3\25\7\25k\n\25\f\25\16\25n\13\25"+
		"\3\26\3\26\3\26\6\26s\n\26\r\26\16\26t\3\27\6\27x\n\27\r\27\16\27y\2\2"+
		"\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\2%\2\'\23)\24+\25-\26\3\2\7\4\2C\\c|\6\2\62;C\\c|\u0080"+
		"\u0080\6\2/\60\62;C\\c|\5\2\62;CHch\4\2\f\f\17\17\177\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3\2\2\2\7\65\3\2\2\2\t\67\3\2\2\2"+
		"\13<\3\2\2\2\rB\3\2\2\2\17D\3\2\2\2\21F\3\2\2\2\23H\3\2\2\2\25J\3\2\2"+
		"\2\27L\3\2\2\2\31N\3\2\2\2\33Q\3\2\2\2\35U\3\2\2\2\37W\3\2\2\2!Z\3\2\2"+
		"\2#^\3\2\2\2%`\3\2\2\2\'b\3\2\2\2)f\3\2\2\2+r\3\2\2\2-w\3\2\2\2/\60\7"+
		"\"\2\2\60\4\3\2\2\2\61\62\7<\2\2\62\63\7\61\2\2\63\64\7\61\2\2\64\6\3"+
		"\2\2\2\65\66\7<\2\2\66\b\3\2\2\2\678\7j\2\289\7v\2\29:\7v\2\2:;\7r\2\2"+
		";\n\3\2\2\2<=\7j\2\2=>\7v\2\2>?\7v\2\2?@\7r\2\2@A\7u\2\2A\f\3\2\2\2BC"+
		"\7\61\2\2C\16\3\2\2\2DE\7\60\2\2E\20\3\2\2\2FG\7%\2\2G\22\3\2\2\2HI\7"+
		"A\2\2I\24\3\2\2\2JK\7(\2\2K\26\3\2\2\2LM\7?\2\2M\30\3\2\2\2NO\7B\2\2O"+
		"\32\3\2\2\2PR\5#\22\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\34\3\2"+
		"\2\2UV\7*\2\2V\36\3\2\2\2WX\7+\2\2X \3\2\2\2Y[\5%\23\2ZY\3\2\2\2[\\\3"+
		"\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\"\3\2\2\2^_\t\2\2\2_$\3\2\2\2`a\4\62;\2"+
		"a&\3\2\2\2bc\13\2\2\2c(\3\2\2\2dg\t\3\2\2eg\5+\26\2fd\3\2\2\2fe\3\2\2"+
		"\2gl\3\2\2\2hk\t\4\2\2ik\5+\26\2jh\3\2\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2"+
		"\2lm\3\2\2\2m*\3\2\2\2nl\3\2\2\2op\7\'\2\2pq\t\5\2\2qs\t\5\2\2ro\3\2\2"+
		"\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u,\3\2\2\2vx\t\6\2\2wv\3\2\2\2xy\3\2\2"+
		"\2yw\3\2\2\2yz\3\2\2\2z.\3\2\2\2\n\2S\\fjlty\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
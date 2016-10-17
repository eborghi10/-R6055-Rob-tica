// $ANTLR 3.5-rc-2 D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g 2015-08-31 20:12:16

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class HexapodRobotLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int ALTURA=4;
	public static final int AYUDA=5;
	public static final int DIGIT=6;
	public static final int GAIT=7;
	public static final int ID=8;
	public static final int MOVE=9;
	public static final int NUEVO_HEXAPOD=10;
	public static final int NUMBER=11;
	public static final int PARAMETROS=12;
	public static final int RUN=13;
	public static final int SIGNO=14;
	public static final int WS=15;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public HexapodRobotLexer() {} 
	public HexapodRobotLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public HexapodRobotLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g"; }

	// $ANTLR start "ALTURA"
	public final void mALTURA() throws RecognitionException {
		try {
			int _type = ALTURA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:2:8: ( 'Altura' )
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:2:10: 'Altura'
			{
			match("Altura"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALTURA"

	// $ANTLR start "AYUDA"
	public final void mAYUDA() throws RecognitionException {
		try {
			int _type = AYUDA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:3:7: ( 'help' )
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:3:9: 'help'
			{
			match("help"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AYUDA"

	// $ANTLR start "GAIT"
	public final void mGAIT() throws RecognitionException {
		try {
			int _type = GAIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:4:6: ( 'SetGait' )
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:4:8: 'SetGait'
			{
			match("SetGait"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GAIT"

	// $ANTLR start "MOVE"
	public final void mMOVE() throws RecognitionException {
		try {
			int _type = MOVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:5:6: ( 'Move' )
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:5:8: 'Move'
			{
			match("Move"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOVE"

	// $ANTLR start "NUEVO_HEXAPOD"
	public final void mNUEVO_HEXAPOD() throws RecognitionException {
		try {
			int _type = NUEVO_HEXAPOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:6:15: ( 'new Hexapod' )
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:6:17: 'new Hexapod'
			{
			match("new Hexapod"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUEVO_HEXAPOD"

	// $ANTLR start "PARAMETROS"
	public final void mPARAMETROS() throws RecognitionException {
		try {
			int _type = PARAMETROS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:7:12: ( 'Parameters' )
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:7:14: 'Parameters'
			{
			match("Parameters"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PARAMETROS"

	// $ANTLR start "RUN"
	public final void mRUN() throws RecognitionException {
		try {
			int _type = RUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:8:5: ( 'Run' )
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:8:7: 'Run'
			{
			match("Run"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RUN"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:9:7: ( '(' )
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:9:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:10:7: ( ')' )
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:10:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:11:7: ( ',' )
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:11:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:12:7: ( '.' )
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:12:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:231:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | ' ' )+ )
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:231:9: ( 'a' .. 'z' | 'A' .. 'Z' | ' ' )+
			{
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:231:9: ( 'a' .. 'z' | 'A' .. 'Z' | ' ' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==' '||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:
					{
					if ( input.LA(1)==' '||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:233:8: ( ( SIGNO )? DIGIT )
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:233:10: ( SIGNO )? DIGIT
			{
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:233:10: ( SIGNO )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='+'||LA2_0=='-') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			mDIGIT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:235:4: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:235:6: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
			{
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:235:6: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||(LA3_0 >= '\f' && LA3_0 <= '\r')||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:237:16: ( ( '0' .. '9' )+ )
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:237:18: ( '0' .. '9' )+
			{
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:237:18: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "SIGNO"
	public final void mSIGNO() throws RecognitionException {
		try {
			int _type = SIGNO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:239:8: ( '+' | '-' )
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:
			{
			if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SIGNO"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:1:8: ( ALTURA | AYUDA | GAIT | MOVE | NUEVO_HEXAPOD | PARAMETROS | RUN | T__16 | T__17 | T__18 | T__19 | ID | NUMBER | WS | SIGNO )
		int alt5=15;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:1:10: ALTURA
				{
				mALTURA(); 

				}
				break;
			case 2 :
				// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:1:17: AYUDA
				{
				mAYUDA(); 

				}
				break;
			case 3 :
				// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:1:23: GAIT
				{
				mGAIT(); 

				}
				break;
			case 4 :
				// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:1:28: MOVE
				{
				mMOVE(); 

				}
				break;
			case 5 :
				// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:1:33: NUEVO_HEXAPOD
				{
				mNUEVO_HEXAPOD(); 

				}
				break;
			case 6 :
				// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:1:47: PARAMETROS
				{
				mPARAMETROS(); 

				}
				break;
			case 7 :
				// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:1:58: RUN
				{
				mRUN(); 

				}
				break;
			case 8 :
				// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:1:62: T__16
				{
				mT__16(); 

				}
				break;
			case 9 :
				// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:1:68: T__17
				{
				mT__17(); 

				}
				break;
			case 10 :
				// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:1:74: T__18
				{
				mT__18(); 

				}
				break;
			case 11 :
				// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:1:80: T__19
				{
				mT__19(); 

				}
				break;
			case 12 :
				// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:1:86: ID
				{
				mID(); 

				}
				break;
			case 13 :
				// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:1:89: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 14 :
				// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:1:96: WS
				{
				mWS(); 

				}
				break;
			case 15 :
				// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:1:99: SIGNO
				{
				mSIGNO(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\1\uffff\7\17\4\uffff\1\17\1\30\3\uffff\7\17\1\uffff\6\17\1\46\1\17\1"+
		"\50\1\17\1\52\2\17\1\uffff\1\17\1\uffff\1\17\1\uffff\2\17\1\61\3\17\1"+
		"\uffff\1\65\2\17\1\uffff\5\17\1\75\1\76\2\uffff";
	static final String DFA5_eofS =
		"\77\uffff";
	static final String DFA5_minS =
		"\1\11\1\154\2\145\1\157\1\145\1\141\1\165\4\uffff\1\11\1\60\3\uffff\1"+
		"\164\1\154\1\164\1\166\1\167\1\162\1\156\1\uffff\1\165\1\160\1\107\1\145"+
		"\1\40\1\141\1\40\1\162\1\40\1\141\1\40\1\110\1\155\1\uffff\1\141\1\uffff"+
		"\1\151\1\uffff\2\145\1\40\1\164\1\170\1\164\1\uffff\1\40\1\141\1\145\1"+
		"\uffff\1\160\1\162\1\157\1\163\1\144\2\40\2\uffff";
	static final String DFA5_maxS =
		"\1\172\1\154\2\145\1\157\1\145\1\141\1\165\4\uffff\1\40\1\71\3\uffff\1"+
		"\164\1\154\1\164\1\166\1\167\1\162\1\156\1\uffff\1\165\1\160\1\107\1\145"+
		"\1\40\1\141\1\172\1\162\1\172\1\141\1\172\1\110\1\155\1\uffff\1\141\1"+
		"\uffff\1\151\1\uffff\2\145\1\172\1\164\1\170\1\164\1\uffff\1\172\1\141"+
		"\1\145\1\uffff\1\160\1\162\1\157\1\163\1\144\2\172\2\uffff";
	static final String DFA5_acceptS =
		"\10\uffff\1\10\1\11\1\12\1\13\2\uffff\1\15\1\14\1\16\7\uffff\1\17\15\uffff"+
		"\1\7\1\uffff\1\2\1\uffff\1\4\6\uffff\1\1\3\uffff\1\3\7\uffff\1\6\1\5";
	static final String DFA5_specialS =
		"\77\uffff}>";
	static final String[] DFA5_transitionS = {
			"\2\20\1\uffff\2\20\22\uffff\1\14\7\uffff\1\10\1\11\1\uffff\1\15\1\12"+
			"\1\15\1\13\1\uffff\12\16\7\uffff\1\1\13\17\1\4\2\17\1\6\1\17\1\7\1\3"+
			"\7\17\6\uffff\7\17\1\2\5\17\1\5\14\17",
			"\1\21",
			"\1\22",
			"\1\23",
			"\1\24",
			"\1\25",
			"\1\26",
			"\1\27",
			"",
			"",
			"",
			"",
			"\2\20\1\uffff\2\20\22\uffff\1\14",
			"\12\16",
			"",
			"",
			"",
			"\1\31",
			"\1\32",
			"\1\33",
			"\1\34",
			"\1\35",
			"\1\36",
			"\1\37",
			"",
			"\1\40",
			"\1\41",
			"\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\17\40\uffff\32\17\6\uffff\32\17",
			"\1\47",
			"\1\17\40\uffff\32\17\6\uffff\32\17",
			"\1\51",
			"\1\17\40\uffff\32\17\6\uffff\32\17",
			"\1\53",
			"\1\54",
			"",
			"\1\55",
			"",
			"\1\56",
			"",
			"\1\57",
			"\1\60",
			"\1\17\40\uffff\32\17\6\uffff\32\17",
			"\1\62",
			"\1\63",
			"\1\64",
			"",
			"\1\17\40\uffff\32\17\6\uffff\32\17",
			"\1\66",
			"\1\67",
			"",
			"\1\70",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\74",
			"\1\17\40\uffff\32\17\6\uffff\32\17",
			"\1\17\40\uffff\32\17\6\uffff\32\17",
			"",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( ALTURA | AYUDA | GAIT | MOVE | NUEVO_HEXAPOD | PARAMETROS | RUN | T__16 | T__17 | T__18 | T__19 | ID | NUMBER | WS | SIGNO );";
		}
	}

}

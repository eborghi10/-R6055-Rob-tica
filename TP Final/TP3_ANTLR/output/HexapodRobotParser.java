// $ANTLR 3.5-rc-2 D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g 2015-08-31 20:12:15

import java.util.HashMap;
import java.io.*;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class HexapodRobotParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ALTURA", "AYUDA", "DIGIT", "GAIT", 
		"ID", "MOVE", "NUEVO_HEXAPOD", "NUMBER", "PARAMETROS", "RUN", "SIGNO", 
		"WS", "'('", "')'", "','", "'.'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "rule1", "rule3", "rule7", "comp", "expr", "rule2", "rule4", 
		"rule5", "rule6"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public HexapodRobotParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public HexapodRobotParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public HexapodRobotParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return HexapodRobotParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g"; }


	// Variables externas
	    public static String path = "C:\\Users\\Emiliano Borghi\\Desktop\\Robotica TP Final\\";	 
	    public static File file = new File(path + "HexapodOutputFile.dat");
	    // http://www.mkyong.com/java/how-to-write-to-file-in-java-bufferedwriter-example/
	    public FileWriter fw;
	    public BufferedWriter bw;
	    
	    public int I;	// Gait variable
	    
	    // Flags para saber si se ejecutó la regla
	    public boolean fRule1=false, fRule2=false, fRule3=false, fRule4=false, fRule5=false;
	    
	    HashMap variables = new HashMap();
		
	    public static void main(String[] args) throws Exception {
	        HexapodRobotLexer lex = new HexapodRobotLexer(new ANTLRFileStream(args[0]));
	       	CommonTokenStream tokens = new CommonTokenStream(lex);

	        HexapodRobotParser parser = new HexapodRobotParser(tokens);

	        try {
	            parser.expr();
	        } catch (RecognitionException e)  {
	            e.printStackTrace();
	        }
	    }



	// $ANTLR start "expr"
	// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:60:1: expr : rule1 comp rule6 ;
	public final void expr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(60, 0);

		try {
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:60:6: ( rule1 comp rule6 )
			dbg.enterAlt(1);

			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:60:8: rule1 comp rule6
			{
			dbg.location(60,8);
			pushFollow(FOLLOW_rule1_in_expr96);
			rule1();
			state._fsp--;
			dbg.location(60,14);
			pushFollow(FOLLOW_comp_in_expr98);
			comp();
			state._fsp--;
			dbg.location(60,19);
			pushFollow(FOLLOW_rule6_in_expr100);
			rule6();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(60, 23);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expr"



	// $ANTLR start "comp"
	// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:63:1: comp : ( rule2 | rule3 | rule4 | rule5 )+ ;
	public final void comp() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "comp");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(63, 0);

		try {
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:63:6: ( ( rule2 | rule3 | rule4 | rule5 )+ )
			dbg.enterAlt(1);

			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:63:8: ( rule2 | rule3 | rule4 | rule5 )+
			{
			dbg.location(63,8);
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:63:8: ( rule2 | rule3 | rule4 | rule5 )+
			int cnt1=0;
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=5;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				switch ( input.LA(1) ) {
				case MOVE:
					{
					alt1=1;
					}
					break;
				case ALTURA:
					{
					alt1=2;
					}
					break;
				case PARAMETROS:
					{
					alt1=3;
					}
					break;
				case GAIT:
					{
					alt1=4;
					}
					break;
				}
				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:63:10: rule2
					{
					dbg.location(63,10);
					pushFollow(FOLLOW_rule2_in_comp111);
					rule2();
					state._fsp--;

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:63:18: rule3
					{
					dbg.location(63,18);
					pushFollow(FOLLOW_rule3_in_comp115);
					rule3();
					state._fsp--;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:63:26: rule4
					{
					dbg.location(63,26);
					pushFollow(FOLLOW_rule4_in_comp119);
					rule4();
					state._fsp--;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:63:34: rule5
					{
					dbg.location(63,34);
					pushFollow(FOLLOW_rule5_in_comp123);
					rule5();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					dbg.recognitionException(eee);

					throw eee;
				}
				cnt1++;
			}
			} finally {dbg.exitSubRule(1);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(63, 40);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "comp");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "comp"



	// $ANTLR start "rule1"
	// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:65:1: rule1 : NUEVO_HEXAPOD '(' ID ')' ;
	public final void rule1() throws RecognitionException {
		Token ID1=null;

		try { dbg.enterRule(getGrammarFileName(), "rule1");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(65, 0);

		try {
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:66:2: ( NUEVO_HEXAPOD '(' ID ')' )
			dbg.enterAlt(1);

			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:66:5: NUEVO_HEXAPOD '(' ID ')'
			{
			dbg.location(66,5);
			match(input,NUEVO_HEXAPOD,FOLLOW_NUEVO_HEXAPOD_in_rule1136); dbg.location(66,19);
			match(input,16,FOLLOW_16_in_rule1138); dbg.location(66,24);
			ID1=(Token)match(input,ID,FOLLOW_ID_in_rule1141); dbg.location(66,27);
			match(input,17,FOLLOW_17_in_rule1143); dbg.location(66,31);
				// | NUEVO_HEXAPOD '(' ')' { // ID ')' {

					System.out.println("NUEVO HEXAPODO CREADO");
				
				try {   
						// Si el archivo no existe, lo crea
						if (!file.exists()) 	file.createNewFile();
						fw = new FileWriter(file.getAbsoluteFile());
						bw = new BufferedWriter(fw);
						bw.write("% HEXAPOD OUTPUT FILE \n");
						
						if( (ID1!=null?ID1.getText():null).equals(" ") || (ID1!=null?ID1.getText():null).equals("Phoenix") ){
						
						   if((ID1!=null?ID1.getText():null).equals(" "))	bw.write("% Cargando valores por defecto \n"); 
						   else bw.write("% PhantomX Hexapod Mark II \n");
						   
						   bw.write("l1 3.9 \n");
						   bw.write("l2 6.5 \n");
						   bw.write("l3 14.2 \n");
						   bw.write("half_length 14 \n");
						   bw.write("half_width1 4.45 \n");
						   bw.write("half_width2 7.2 \n");
						   bw.write("legdist 12.5 \n");
						   bw.write("h 2 \n");
						}
						else if( (ID1!=null?ID1.getText():null).equals("Mark II") || (ID1!=null?ID1.getText():null).equals("Phantom X") || (ID1!=null?ID1.getText():null).equals(-1) ){
						    System.out.println("Error Hexapodo no implementado aun.");
						}
						else System.out.println("Error pasando parametro a Hexapod()");
				
					bw.flush();
				 } catch (IOException e) {
				   		e.printStackTrace();
					}
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(100, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rule1");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rule1"



	// $ANTLR start "rule2"
	// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:102:1: rule2 : MOVE '(' xPos= NUMBER ',' yPos= NUMBER ')' ;
	public final void rule2() throws RecognitionException {
		Token xPos=null;
		Token yPos=null;

		try { dbg.enterRule(getGrammarFileName(), "rule2");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(102, 0);

		try {
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:103:2: ( MOVE '(' xPos= NUMBER ',' yPos= NUMBER ')' )
			dbg.enterAlt(1);

			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:103:4: MOVE '(' xPos= NUMBER ',' yPos= NUMBER ')'
			{
			dbg.location(103,4);
			match(input,MOVE,FOLLOW_MOVE_in_rule2155); dbg.location(103,9);
			match(input,16,FOLLOW_16_in_rule2157); dbg.location(103,18);
			xPos=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_rule2162); dbg.location(103,26);
			match(input,18,FOLLOW_18_in_rule2164); dbg.location(103,34);
			yPos=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_rule2168); dbg.location(103,42);
			match(input,17,FOLLOW_17_in_rule2170); dbg.location(103,46);

					// MUEVE AL ROBOT EN X e Y
					try{
						bw.write( "X " +  (xPos!=null?Integer.valueOf(xPos.getText()):0) + '\n');
						bw.write( "Y " + (yPos!=null?Integer.valueOf(yPos.getText()):0) + '\n');
						bw.flush();
						fRule2=true;
					}catch(IOException e){
						e.printStackTrace();
					}
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(113, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rule2");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rule2"



	// $ANTLR start "rule3"
	// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:115:1: rule3 : ALTURA '(' parteEntera= NUMBER '.' parteDecimal= NUMBER ')' ;
	public final void rule3() throws RecognitionException {
		Token parteEntera=null;
		Token parteDecimal=null;

		try { dbg.enterRule(getGrammarFileName(), "rule3");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(115, 0);

		try {
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:116:2: ( ALTURA '(' parteEntera= NUMBER '.' parteDecimal= NUMBER ')' )
			dbg.enterAlt(1);

			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:116:4: ALTURA '(' parteEntera= NUMBER '.' parteDecimal= NUMBER ')'
			{
			dbg.location(116,4);
			match(input,ALTURA,FOLLOW_ALTURA_in_rule3183); dbg.location(116,11);
			match(input,16,FOLLOW_16_in_rule3185); dbg.location(116,27);
			parteEntera=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_rule3191); dbg.location(116,36);
			match(input,19,FOLLOW_19_in_rule3193); dbg.location(116,53);
			parteDecimal=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_rule3199); dbg.location(116,62);
			match(input,17,FOLLOW_17_in_rule3201); dbg.location(116,66);

			// TODO: Considerar no agregar parte decimal
					try{
						bw.write("Z " + (parteEntera!=null?Integer.valueOf(parteEntera.getText()):0) + '.' + (parteDecimal!=null?Integer.valueOf(parteDecimal.getText()):0) + '\n');
						bw.flush();
						fRule3=true;
					}
					catch (IOException e){
						e.printStackTrace();
					}
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(126, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rule3");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rule3"



	// $ANTLR start "rule4"
	// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:128:1: rule4 : PARAMETROS '(' dt= NUMBER ',' tick= NUMBER ',' stepCount= NUMBER ')' ;
	public final void rule4() throws RecognitionException {
		Token dt=null;
		Token tick=null;
		Token stepCount=null;

		try { dbg.enterRule(getGrammarFileName(), "rule4");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(128, 0);

		try {
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:129:2: ( PARAMETROS '(' dt= NUMBER ',' tick= NUMBER ',' stepCount= NUMBER ')' )
			dbg.enterAlt(1);

			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:129:5: PARAMETROS '(' dt= NUMBER ',' tick= NUMBER ',' stepCount= NUMBER ')'
			{
			dbg.location(129,5);
			match(input,PARAMETROS,FOLLOW_PARAMETROS_in_rule4213); dbg.location(129,16);
			match(input,16,FOLLOW_16_in_rule4215); dbg.location(129,23);
			dt=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_rule4221); dbg.location(129,32);
			match(input,18,FOLLOW_18_in_rule4223); dbg.location(129,41);
			tick=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_rule4229); dbg.location(129,50);
			match(input,18,FOLLOW_18_in_rule4231); dbg.location(129,64);
			stepCount=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_rule4237); dbg.location(129,73);
			match(input,17,FOLLOW_17_in_rule4239); dbg.location(129,77);

					try{
						bw.write("dt " + (dt!=null?Integer.valueOf(dt.getText()):0) + '\n');
						bw.write("tick " + (tick!=null?Integer.valueOf(tick.getText()):0) + '\n');
						bw.write("stepCount " + (stepCount!=null?Integer.valueOf(stepCount.getText()):0) + '\n');
						bw.flush();
						fRule4=true;
					}
					catch (IOException e){
						e.printStackTrace();
					}
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(140, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rule4");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rule4"



	// $ANTLR start "rule5"
	// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:142:1: rule5 : GAIT '(' ID ')' ;
	public final void rule5() throws RecognitionException {
		Token ID2=null;

		try { dbg.enterRule(getGrammarFileName(), "rule5");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(142, 0);

		try {
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:143:2: ( GAIT '(' ID ')' )
			dbg.enterAlt(1);

			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:143:4: GAIT '(' ID ')'
			{
			dbg.location(143,4);
			match(input,GAIT,FOLLOW_GAIT_in_rule5252); dbg.location(143,9);
			match(input,16,FOLLOW_16_in_rule5254); dbg.location(143,13);
			ID2=(Token)match(input,ID,FOLLOW_ID_in_rule5256); dbg.location(143,16);
			match(input,17,FOLLOW_17_in_rule5258); dbg.location(143,20);

					try{
						switch( (ID2!=null?ID2.getText():null) ){
							case "Tripod":
								I = 1;
								break;
							case "Ripple":
								I = 2;
								break;
							case "Wave":
								I = 3;
								break;
						}
						bw.write("gait " + Integer.toString(I) + '\n');
						bw.flush();
						fRule5=true;
					}
					catch (IOException e){
						e.printStackTrace();
					}
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(163, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rule5");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rule5"



	// $ANTLR start "rule6"
	// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:165:1: rule6 : RUN '(' ')' ;
	public final void rule6() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "rule6");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(165, 0);

		try {
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:166:2: ( RUN '(' ')' )
			dbg.enterAlt(1);

			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:166:4: RUN '(' ')'
			{
			dbg.location(166,4);
			match(input,RUN,FOLLOW_RUN_in_rule6269); dbg.location(166,8);
			match(input,16,FOLLOW_16_in_rule6271); dbg.location(166,12);
			match(input,17,FOLLOW_17_in_rule6273); dbg.location(166,16);

				// TODO: Implementar la comunicación en MATLAB acá - NO CREO QUE PUEDA EJECUTARSE UN SCRIPT DESDE ACÁ
					try{
						if( fRule2 == false ){
							bw.write("X 1 \n");
							bw.write("Y 0 \n");
						}
						if( fRule3 == false ){
							bw.write("Z 10.0 \n");
						}
						if( fRule4 == false ){
							bw.write("dt 10 \n");
							bw.write("tick 1 \n");
							bw.write("stepCount 5 \n");
						}
						if( fRule5 == false ){
							bw.write("gait 1 \n");
						}
						bw.write("% END OF HEXAPOD OUTPUT FILE");
						bw.flush();
						bw.close();
					}
					catch (IOException e){
						e.printStackTrace();
					}
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(191, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rule6");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rule6"



	// $ANTLR start "rule7"
	// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:193:1: rule7 : AYUDA ID ;
	public final void rule7() throws RecognitionException {
		Token ID3=null;

		try { dbg.enterRule(getGrammarFileName(), "rule7");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(193, 0);

		try {
			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:194:2: ( AYUDA ID )
			dbg.enterAlt(1);

			// D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\HexapodRobot.g:194:4: AYUDA ID
			{
			dbg.location(194,4);
			match(input,AYUDA,FOLLOW_AYUDA_in_rule7285); dbg.location(194,10);
			ID3=(Token)match(input,ID,FOLLOW_ID_in_rule7287); dbg.location(194,13);

				// Help Manual del programa
					switch( (ID3!=null?ID3.getText():null) ){
						case "new Hexapod":
							System.out.println(
								"%%%%%%%%%%%%%%%\n" +
								"=========New Hexapod=========\n" +
								"Setea parámetros físicos del robot\n" +
								"Modo de uso:\n" +
								"new Hexapod(*) \n" +
								" * Espacio en blanco" +
								" * Nombres reservados:" +
								"\t PhantomX" +
								"\t Mark II"
							);
							break;
						case "Move":
							System.out.println("\nMOVE FUNCTION HELP\n");
							break;
						case "Altura":
							break;
						case "Parameters":
							break;
						case "SetGait":
							break;
						case "Run":
							break;
						default:
							System.out.println("\nFunción no encontrada\n");
							break;
					}
				
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(225, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "rule7");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "rule7"

	// Delegated rules



	public static final BitSet FOLLOW_rule1_in_expr96 = new BitSet(new long[]{0x0000000000001290L});
	public static final BitSet FOLLOW_comp_in_expr98 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_rule6_in_expr100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rule2_in_comp111 = new BitSet(new long[]{0x0000000000001292L});
	public static final BitSet FOLLOW_rule3_in_comp115 = new BitSet(new long[]{0x0000000000001292L});
	public static final BitSet FOLLOW_rule4_in_comp119 = new BitSet(new long[]{0x0000000000001292L});
	public static final BitSet FOLLOW_rule5_in_comp123 = new BitSet(new long[]{0x0000000000001292L});
	public static final BitSet FOLLOW_NUEVO_HEXAPOD_in_rule1136 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_rule1138 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_rule1141 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_rule1143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MOVE_in_rule2155 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_rule2157 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_NUMBER_in_rule2162 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_rule2164 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_NUMBER_in_rule2168 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_rule2170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ALTURA_in_rule3183 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_rule3185 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_NUMBER_in_rule3191 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_rule3193 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_NUMBER_in_rule3199 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_rule3201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PARAMETROS_in_rule4213 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_rule4215 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_NUMBER_in_rule4221 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_rule4223 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_NUMBER_in_rule4229 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_rule4231 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_NUMBER_in_rule4237 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_rule4239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GAIT_in_rule5252 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_rule5254 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_rule5256 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_rule5258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RUN_in_rule6269 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_rule6271 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_rule6273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AYUDA_in_rule7285 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_rule7287 = new BitSet(new long[]{0x0000000000000002L});
}

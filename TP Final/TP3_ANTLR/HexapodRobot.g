grammar HexapodRobot;

///////////////////////////////////////////////////////////////////////
// Simbolos reconocidos por el compilador
//

tokens {
	NUEVO_HEXAPOD	= 'new Hexapod';
	MOVE	= 'Move';	
	ALTURA = 'Altura';
	PARAMETROS = 'Parameters';
	GAIT = 'SetGait';
	RUN = 'Run';
	AYUDA = 'help';
}

///////////////////////////////////////////////////////////////////////
// Librerias y clases utilizadas dentro del compilador
//

@header {
import java.util.HashMap;
import java.io.*;

}

@members {
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
}

///////////////////////////////////////////////////////////////////////
// LEXER RULES
//

expr	:	rule1 comp rule6;
// TODO: Agregar regla de ayuda (help).

comp	:	( rule2 | rule3 | rule4 | rule5)+;

rule1 
	: 	NUEVO_HEXAPOD '('  ID ')' {	// | NUEVO_HEXAPOD '(' ')' { // ID ')' {

		System.out.println("NUEVO HEXAPODO CREADO");
	
	try {   
			// Si el archivo no existe, lo crea
			if (!file.exists()) 	file.createNewFile();
			fw = new FileWriter(file.getAbsoluteFile());
			bw = new BufferedWriter(fw);
			bw.write("\% HEXAPOD OUTPUT FILE \n");
			
			if( $ID.text.equals(" ") || $ID.text.equals("Phoenix") ){
			
			   if($ID.text.equals(" "))	bw.write("\% Cargando valores por defecto \n"); 
			   else bw.write("\% PhantomX Hexapod Mark II \n");
			   
			   bw.write("l1 3.9 \n");
			   bw.write("l2 6.5 \n");
			   bw.write("l3 14.2 \n");
			   bw.write("half_length 14 \n");
			   bw.write("half_width1 4.45 \n");
			   bw.write("half_width2 7.2 \n");
			   bw.write("legdist 12.5 \n");
			   bw.write("h 2 \n");
			}
			else if( $ID.text.equals("Mark II") || $ID.text.equals("Phantom X") || $ID.text.equals(-1) ){
			    System.out.println("Error Hexapodo no implementado aun.");
			}
			else System.out.println("Error pasando parametro a Hexapod()");
	
		bw.flush();
	 } catch (IOException e) {
	   		e.printStackTrace();
		}
	};

rule2	
	:	MOVE '('  xPos=NUMBER ',' yPos=NUMBER ')' {
		// MUEVE AL ROBOT EN X e Y
		try{
			bw.write( "X " +  $xPos.int + '\n');
			bw.write( "Y " + $yPos.int + '\n');
			bw.flush();
			fRule2=true;
		}catch(IOException e){
			e.printStackTrace();
		}
	};

rule3	 
	:	ALTURA '(' parteEntera = NUMBER '.' parteDecimal = NUMBER ')' {
// TODO: Considerar no agregar parte decimal
		try{
			bw.write("Z " + $parteEntera.int + '.' + $parteDecimal.int + '\n');
			bw.flush();
			fRule3=true;
		}
		catch (IOException e){
			e.printStackTrace();
		}
	};

rule4
	:	 PARAMETROS '(' dt = NUMBER ',' tick = NUMBER ',' stepCount = NUMBER ')' {
		try{
			bw.write("dt " + $dt.int + '\n');
			bw.write("tick " + $tick.int + '\n');
			bw.write("stepCount " + $stepCount.int + '\n');
			bw.flush();
			fRule4=true;
		}
		catch (IOException e){
			e.printStackTrace();
		}
	};
	
rule5 
	:	GAIT '(' ID ')' {
		try{
			switch( $ID.text ){
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
	};

rule6
	:	RUN '(' ')' {
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
			bw.write("\% END OF HEXAPOD OUTPUT FILE");
			bw.flush();
			bw.close();
		}
		catch (IOException e){
			e.printStackTrace();
		}
	};
	
rule7
	:	AYUDA ID {
	// Help Manual del programa
		switch( $ID.text ){
			case "new Hexapod":
				System.out.println(
					"\%\%\%\%\%\%\%\%\%\%\%\%\%\%\%\n" +
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
	};

/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

ID  :   ('a'..'z'|'A'..'Z'|' ')+ ;

NUMBER	: SIGNO? DIGIT ;

WS : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ 	{ $channel = HIDDEN; } ;	// WhiteSpace

fragment DIGIT	: ('0'..'9')+ ;

SIGNO 	: '+' | '-';

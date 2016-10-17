import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        HexapodRobotLexer lex = new HexapodRobotLexer(new ANTLRFileStream("D:\\UTN\\Robótica\\TP Final\\TP3_ANTLR\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        HexapodRobotParser g = new HexapodRobotParser(tokens, 49100, null);
        try {
            g.expr();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}
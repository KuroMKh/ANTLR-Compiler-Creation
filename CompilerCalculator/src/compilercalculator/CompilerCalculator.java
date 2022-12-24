/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compilercalculator;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author KaizerXeno
 */
public class CompilerCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            //CharStream input = CharStreams.fromString("1+3");
            String fn="C:\\MyCalculator\\samplecode.txt";
            CharStream input = CharStreams.fromFileName(fn);
            CalcGrammarLexer lexer = new CalcGrammarLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CalcGrammarParser parser = new CalcGrammarParser(tokens);
            parser.prog();
        } catch (Exception ex) {
            
        } 

        
    }
    
}

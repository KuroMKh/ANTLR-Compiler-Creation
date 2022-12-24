// Generated from java-escape by ANTLR 4.11.1

	package compilercalculator;
	import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcGrammarParser}.
 */
public interface CalcGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CalcGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CalcGrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CalcGrammarParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CalcGrammarParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CalcGrammarParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CalcGrammarParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcGrammarParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(CalcGrammarParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcGrammarParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(CalcGrammarParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(CalcGrammarParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(CalcGrammarParser.AtomContext ctx);
}
// Generated from GPP.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GPPParser}.
 */
public interface GPPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GPPParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GPPParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GPPParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GPPParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GPPParser#constante}.
	 * @param ctx the parse tree
	 */
	void enterConstante(GPPParser.ConstanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link GPPParser#constante}.
	 * @param ctx the parse tree
	 */
	void exitConstante(GPPParser.ConstanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link GPPParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(GPPParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GPPParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(GPPParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GPPParser#uop}.
	 * @param ctx the parse tree
	 */
	void enterUop(GPPParser.UopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GPPParser#uop}.
	 * @param ctx the parse tree
	 */
	void exitUop(GPPParser.UopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GPPParser#bop}.
	 * @param ctx the parse tree
	 */
	void enterBop(GPPParser.BopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GPPParser#bop}.
	 * @param ctx the parse tree
	 */
	void exitBop(GPPParser.BopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GPPParser#target}.
	 * @param ctx the parse tree
	 */
	void enterTarget(GPPParser.TargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link GPPParser#target}.
	 * @param ctx the parse tree
	 */
	void exitTarget(GPPParser.TargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link GPPParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(GPPParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link GPPParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(GPPParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link GPPParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(GPPParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GPPParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(GPPParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GPPParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(GPPParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link GPPParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(GPPParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link GPPParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(GPPParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GPPParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(GPPParser.InstructionContext ctx);
}
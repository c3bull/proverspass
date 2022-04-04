// Generated from C:/Users/Kuba/Desktop/spasspr/Spass-Prover9-converter-master/src/grammar\prover9Parser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link prover9ParserParser}.
 */
public interface prover9ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link prover9ParserParser#top_level_formula}.
	 * @param ctx the parse tree
	 */
	void enterTop_level_formula(prover9ParserParser.Top_level_formulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link prover9ParserParser#top_level_formula}.
	 * @param ctx the parse tree
	 */
	void exitTop_level_formula(prover9ParserParser.Top_level_formulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link prover9ParserParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(prover9ParserParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link prover9ParserParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(prover9ParserParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link prover9ParserParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(prover9ParserParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link prover9ParserParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(prover9ParserParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link prover9ParserParser#formula}.
	 * @param ctx the parse tree
	 */
	void enterFormula(prover9ParserParser.FormulaContext ctx);
	/**
	 * Exit a parse tree produced by {@link prover9ParserParser#formula}.
	 * @param ctx the parse tree
	 */
	void exitFormula(prover9ParserParser.FormulaContext ctx);
	/**
	 * Enter a parse tree produced by {@link prover9ParserParser#problem}.
	 * @param ctx the parse tree
	 */
	void enterProblem(prover9ParserParser.ProblemContext ctx);
	/**
	 * Exit a parse tree produced by {@link prover9ParserParser#problem}.
	 * @param ctx the parse tree
	 */
	void exitProblem(prover9ParserParser.ProblemContext ctx);
	/**
	 * Enter a parse tree produced by {@link prover9ParserParser#logical_part}.
	 * @param ctx the parse tree
	 */
	void enterLogical_part(prover9ParserParser.Logical_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link prover9ParserParser#logical_part}.
	 * @param ctx the parse tree
	 */
	void exitLogical_part(prover9ParserParser.Logical_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link prover9ParserParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(prover9ParserParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link prover9ParserParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(prover9ParserParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link prover9ParserParser#term_list}.
	 * @param ctx the parse tree
	 */
	void enterTerm_list(prover9ParserParser.Term_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link prover9ParserParser#term_list}.
	 * @param ctx the parse tree
	 */
	void exitTerm_list(prover9ParserParser.Term_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link prover9ParserParser#quant_sym}.
	 * @param ctx the parse tree
	 */
	void enterQuant_sym(prover9ParserParser.Quant_symContext ctx);
	/**
	 * Exit a parse tree produced by {@link prover9ParserParser#quant_sym}.
	 * @param ctx the parse tree
	 */
	void exitQuant_sym(prover9ParserParser.Quant_symContext ctx);
	/**
	 * Enter a parse tree produced by {@link prover9ParserParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(prover9ParserParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link prover9ParserParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(prover9ParserParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link prover9ParserParser#cnf_clause_body}.
	 * @param ctx the parse tree
	 */
	void enterCnf_clause_body(prover9ParserParser.Cnf_clause_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link prover9ParserParser#cnf_clause_body}.
	 * @param ctx the parse tree
	 */
	void exitCnf_clause_body(prover9ParserParser.Cnf_clause_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link prover9ParserParser#binary_operation}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operation(prover9ParserParser.Binary_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link prover9ParserParser#binary_operation}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operation(prover9ParserParser.Binary_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link prover9ParserParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(prover9ParserParser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link prover9ParserParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(prover9ParserParser.QuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link prover9ParserParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(prover9ParserParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link prover9ParserParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(prover9ParserParser.IdentifierContext ctx);
}
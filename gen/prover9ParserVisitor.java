// Generated from C:/Users/Kuba/Desktop/spasspr/Spass-Prover9-converter-master/src/grammar\prover9Parser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link prover9ParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface prover9ParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link prover9ParserParser#top_level_formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_level_formula(prover9ParserParser.Top_level_formulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link prover9ParserParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(prover9ParserParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link prover9ParserParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(prover9ParserParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link prover9ParserParser#formula}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormula(prover9ParserParser.FormulaContext ctx);
	/**
	 * Visit a parse tree produced by {@link prover9ParserParser#problem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProblem(prover9ParserParser.ProblemContext ctx);
	/**
	 * Visit a parse tree produced by {@link prover9ParserParser#logical_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_part(prover9ParserParser.Logical_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link prover9ParserParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(prover9ParserParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link prover9ParserParser#term_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm_list(prover9ParserParser.Term_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link prover9ParserParser#quant_sym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuant_sym(prover9ParserParser.Quant_symContext ctx);
	/**
	 * Visit a parse tree produced by {@link prover9ParserParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(prover9ParserParser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link prover9ParserParser#cnf_clause_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCnf_clause_body(prover9ParserParser.Cnf_clause_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link prover9ParserParser#binary_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operation(prover9ParserParser.Binary_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link prover9ParserParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier(prover9ParserParser.QuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link prover9ParserParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(prover9ParserParser.IdentifierContext ctx);
}
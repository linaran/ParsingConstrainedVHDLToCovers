package generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VHDLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VHDLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VHDLParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(VHDLParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#entity_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_declaration(VHDLParser.Entity_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#port_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_declaration(VHDLParser.Port_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#port_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_list(VHDLParser.Port_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#interface_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_declarations(VHDLParser.Interface_declarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#input_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_declaration(VHDLParser.Input_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#output_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_declaration(VHDLParser.Output_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_list(VHDLParser.Identifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(VHDLParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#architecture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArchitecture(VHDLParser.ArchitectureContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#architecture_details}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArchitecture_details(VHDLParser.Architecture_detailsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#assignment_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_expression(VHDLParser.Assignment_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionIdentifier}
	 * labeled alternative in {@link VHDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionIdentifier(VHDLParser.ExpressionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionParentheses}
	 * labeled alternative in {@link VHDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionParentheses(VHDLParser.ExpressionParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionBinaryOperator}
	 * labeled alternative in {@link VHDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionBinaryOperator(VHDLParser.ExpressionBinaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionUnaryOperator}
	 * labeled alternative in {@link VHDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionUnaryOperator(VHDLParser.ExpressionUnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(VHDLParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andOp}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOp(VHDLParser.AndOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orOp}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOp(VHDLParser.OrOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nandOp}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNandOp(VHDLParser.NandOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code norOp}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNorOp(VHDLParser.NorOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xorOp}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorOp(VHDLParser.XorOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#entity_work}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_work(VHDLParser.Entity_workContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#port_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_spec(VHDLParser.Port_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#assignment_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_list(VHDLParser.Assignment_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VHDLParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(VHDLParser.AssignmentContext ctx);
}
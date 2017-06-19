package generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VHDLParser}.
 */
public interface VHDLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VHDLParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(VHDLParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(VHDLParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#entity_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEntity_declaration(VHDLParser.Entity_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#entity_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEntity_declaration(VHDLParser.Entity_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#port_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPort_declaration(VHDLParser.Port_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#port_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPort_declaration(VHDLParser.Port_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#port_list}.
	 * @param ctx the parse tree
	 */
	void enterPort_list(VHDLParser.Port_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#port_list}.
	 * @param ctx the parse tree
	 */
	void exitPort_list(VHDLParser.Port_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#interface_declarations}.
	 * @param ctx the parse tree
	 */
	void enterInterface_declarations(VHDLParser.Interface_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#interface_declarations}.
	 * @param ctx the parse tree
	 */
	void exitInterface_declarations(VHDLParser.Interface_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#input_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInput_declaration(VHDLParser.Input_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#input_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInput_declaration(VHDLParser.Input_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#output_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOutput_declaration(VHDLParser.Output_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#output_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOutput_declaration(VHDLParser.Output_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_list(VHDLParser.Identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_list(VHDLParser.Identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(VHDLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(VHDLParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#architecture}.
	 * @param ctx the parse tree
	 */
	void enterArchitecture(VHDLParser.ArchitectureContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#architecture}.
	 * @param ctx the parse tree
	 */
	void exitArchitecture(VHDLParser.ArchitectureContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#architecture_details}.
	 * @param ctx the parse tree
	 */
	void enterArchitecture_details(VHDLParser.Architecture_detailsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#architecture_details}.
	 * @param ctx the parse tree
	 */
	void exitArchitecture_details(VHDLParser.Architecture_detailsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expression(VHDLParser.Assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expression(VHDLParser.Assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionIdentifier}
	 * labeled alternative in {@link VHDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionIdentifier(VHDLParser.ExpressionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionIdentifier}
	 * labeled alternative in {@link VHDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionIdentifier(VHDLParser.ExpressionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionParentheses}
	 * labeled alternative in {@link VHDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionParentheses(VHDLParser.ExpressionParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionParentheses}
	 * labeled alternative in {@link VHDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionParentheses(VHDLParser.ExpressionParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionBooleanConst}
	 * labeled alternative in {@link VHDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionBooleanConst(VHDLParser.ExpressionBooleanConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionBooleanConst}
	 * labeled alternative in {@link VHDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionBooleanConst(VHDLParser.ExpressionBooleanConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionBinaryOperator}
	 * labeled alternative in {@link VHDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionBinaryOperator(VHDLParser.ExpressionBinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionBinaryOperator}
	 * labeled alternative in {@link VHDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionBinaryOperator(VHDLParser.ExpressionBinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionUnaryOperator}
	 * labeled alternative in {@link VHDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionUnaryOperator(VHDLParser.ExpressionUnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionUnaryOperator}
	 * labeled alternative in {@link VHDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionUnaryOperator(VHDLParser.ExpressionUnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(VHDLParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(VHDLParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andOp}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterAndOp(VHDLParser.AndOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andOp}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitAndOp(VHDLParser.AndOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orOp}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterOrOp(VHDLParser.OrOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orOp}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitOrOp(VHDLParser.OrOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nandOp}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterNandOp(VHDLParser.NandOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nandOp}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitNandOp(VHDLParser.NandOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code norOp}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterNorOp(VHDLParser.NorOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code norOp}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitNorOp(VHDLParser.NorOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xorOp}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterXorOp(VHDLParser.XorOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xorOp}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitXorOp(VHDLParser.XorOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#entity_work}.
	 * @param ctx the parse tree
	 */
	void enterEntity_work(VHDLParser.Entity_workContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#entity_work}.
	 * @param ctx the parse tree
	 */
	void exitEntity_work(VHDLParser.Entity_workContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#port_spec}.
	 * @param ctx the parse tree
	 */
	void enterPort_spec(VHDLParser.Port_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#port_spec}.
	 * @param ctx the parse tree
	 */
	void exitPort_spec(VHDLParser.Port_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#assignment_list}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_list(VHDLParser.Assignment_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#assignment_list}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_list(VHDLParser.Assignment_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VHDLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(VHDLParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(VHDLParser.AssignmentContext ctx);
}
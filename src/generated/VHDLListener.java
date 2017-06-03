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
	 * Enter a parse tree produced by {@link VHDLParser#unit}.
	 * @param ctx the parse tree
	 */
	void enterUnit(VHDLParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#unit}.
	 * @param ctx the parse tree
	 */
	void exitUnit(VHDLParser.UnitContext ctx);
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
	 * Enter a parse tree produced by the {@code interfaceDeclarationIn}
	 * labeled alternative in {@link VHDLParser#interface_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclarationIn(VHDLParser.InterfaceDeclarationInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code interfaceDeclarationIn}
	 * labeled alternative in {@link VHDLParser#interface_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclarationIn(VHDLParser.InterfaceDeclarationInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code interfaceDeclarationOut}
	 * labeled alternative in {@link VHDLParser#interface_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclarationOut(VHDLParser.InterfaceDeclarationOutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code interfaceDeclarationOut}
	 * labeled alternative in {@link VHDLParser#interface_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclarationOut(VHDLParser.InterfaceDeclarationOutContext ctx);
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
	 * Enter a parse tree produced by {@link VHDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(VHDLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VHDLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(VHDLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOT}
	 * labeled alternative in {@link VHDLParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterNOT(VHDLParser.NOTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOT}
	 * labeled alternative in {@link VHDLParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitNOT(VHDLParser.NOTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AND}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterAND(VHDLParser.ANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AND}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitAND(VHDLParser.ANDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OR}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterOR(VHDLParser.ORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OR}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitOR(VHDLParser.ORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NAND}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterNAND(VHDLParser.NANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NAND}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitNAND(VHDLParser.NANDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOR}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterNOR(VHDLParser.NORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOR}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitNOR(VHDLParser.NORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XOR}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterXOR(VHDLParser.XORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XOR}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitXOR(VHDLParser.XORContext ctx);
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
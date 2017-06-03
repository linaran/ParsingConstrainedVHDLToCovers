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
	 * Visit a parse tree produced by {@link VHDLParser#unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnit(VHDLParser.UnitContext ctx);
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
	 * Visit a parse tree produced by the {@code interfaceDeclarationIn}
	 * labeled alternative in {@link VHDLParser#interface_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclarationIn(VHDLParser.InterfaceDeclarationInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interfaceDeclarationOut}
	 * labeled alternative in {@link VHDLParser#interface_declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclarationOut(VHDLParser.InterfaceDeclarationOutContext ctx);
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
	 * Visit a parse tree produced by {@link VHDLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(VHDLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NOT}
	 * labeled alternative in {@link VHDLParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOT(VHDLParser.NOTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AND}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAND(VHDLParser.ANDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OR}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOR(VHDLParser.ORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NAND}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNAND(VHDLParser.NANDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NOR}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOR(VHDLParser.NORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XOR}
	 * labeled alternative in {@link VHDLParser#binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXOR(VHDLParser.XORContext ctx);
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
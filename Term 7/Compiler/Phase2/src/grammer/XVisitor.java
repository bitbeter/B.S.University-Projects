// Generated from /Users/hasan/Desktop/Projects/University/Term 7/Compiler/Phase2/src/grammer/X.g4 by ANTLR 4.5.3
package grammer;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link XParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(XParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal(XParser.GlobalContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#variableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinition(XParser.VariableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#variableNaming}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableNaming(XParser.VariableNamingContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(XParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(XParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#equivalentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquivalentExpression(XParser.EquivalentExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#compareExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpression(XParser.CompareExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#plusAndMinusExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusAndMinusExpression(XParser.PlusAndMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#mulAndDivExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulAndDivExpression(XParser.MulAndDivExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(XParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#endPointOfExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndPointOfExpression(XParser.EndPointOfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#arithmeticConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticConstants(XParser.ArithmeticConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(XParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#listOrFunctionAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListOrFunctionAccess(XParser.ListOrFunctionAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#leftPositionOfAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftPositionOfAccess(XParser.LeftPositionOfAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#rightPositionOfAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightPositionOfAccess(XParser.RightPositionOfAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#identifierAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierAccess(XParser.IdentifierAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#indexAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexAccess(XParser.IndexAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#functionAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionAccess(XParser.FunctionAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#listConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListConstant(XParser.ListConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#typeForwardDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeForwardDeclaration(XParser.TypeForwardDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#typeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinition(XParser.TypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#pointerToFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerToFunction(XParser.PointerToFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#ptfInputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPtfInputs(XParser.PtfInputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#normalListDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalListDefinition(XParser.NormalListDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#specialListDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialListDefinition(XParser.SpecialListDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#listDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDefinition(XParser.ListDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#listAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListAttributes(XParser.ListAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#listAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListAttribute(XParser.ListAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#functionForwardDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionForwardDeclaration(XParser.FunctionForwardDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(XParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#functionHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionHeader(XParser.FunctionHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#functionDeclarationHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarationHeader(XParser.FunctionDeclarationHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(XParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#functionInputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionInputs(XParser.FunctionInputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#functionInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionInput(XParser.FunctionInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#functionDeclarationInputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarationInputs(XParser.FunctionDeclarationInputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#functionDeclarationInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarationInput(XParser.FunctionDeclarationInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(XParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive(XParser.PrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(XParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#typedefName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefName(XParser.TypedefNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(XParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#simpleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStatement(XParser.SimpleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#statementWitIfElseNotIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWitIfElseNotIf(XParser.StatementWitIfElseNotIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(XParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(XParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#ifElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(XParser.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#ifGeneral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfGeneral(XParser.IfGeneralContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(XParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link XParser#foreachStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeachStatement(XParser.ForeachStatementContext ctx);
}
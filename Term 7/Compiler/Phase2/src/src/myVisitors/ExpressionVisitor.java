package src.myVisitors;

import grammer.XBaseVisitor;
import grammer.XParser;
import org.antlr.v4.runtime.misc.Interval;
import src.ErrorLogger;
import src.XParts.*;
import src.XParts.Types.Array;
import src.XParts.Types.MultiplePossibleType;
import src.XParts.Types.PtF;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by hasan on 12/13/2016 AD.
 */
public class ExpressionVisitor extends XBaseVisitor<Type> {
    static Global global;
    Scope scope;
    AccessVisitor accessVisitor;

    public ExpressionVisitor(Scope scope) {
        this.scope = scope;
        this.accessVisitor = new AccessVisitor(this);
    }

    static void setGlobal(Global g) {
        global = g;
    }

    @Override
    public Type visitExpression(XParser.ExpressionContext ctx) {
        switch (ctx.path) {
            case 0: {
                return ctx.assignment().accept(this);
            }
            case 1: {
                return checkType(
                        ctx.getSourceInterval(),
                        ctx.andExpression().accept(this),
                        checkType(ctx.getSourceInterval(),
                                ctx.expression().accept(this),
                                DefaultType.INT
                        )
                );
            }
            case 2: {
                return ctx.andExpression().accept(this);
            }
        }
        return null;
    }

    @Override
    public Type visitAssignment(XParser.AssignmentContext ctx) {
        switch (ctx.path) {
            case 0: {
                return checkType(ctx.getSourceInterval(),
                        ctx.listOrFunctionAccess().accept(this),
                        ctx.expression().accept(this)
                );
            }
            case 1: {
                return checkType(ctx.getSourceInterval(),
                        getAllPossibleTypesWithIdentifier(ctx.getSourceInterval(), ctx.Identifier().getText()),
                        ctx.expression().accept(this)
                );
            }
        }
        return null;
    }

    @Override
    public Type visitAndExpression(XParser.AndExpressionContext ctx) {
        switch (ctx.path) {
            case 0: {
                return checkType(
                        ctx.getSourceInterval(),
                        ctx.equivalentExpression().accept(this),
                        checkType(ctx.getSourceInterval(),
                                ctx.andExpression().accept(this),
                                DefaultType.INT
                        )
                );
            }
            case 1: {
                return ctx.equivalentExpression().accept(this);
            }
        }
        return null;
    }

    @Override
    public Type visitEquivalentExpression(XParser.EquivalentExpressionContext ctx) {
        switch (ctx.path) {
            case 0: {
                return checkType(
                        ctx.getSourceInterval(),
                        ctx.compareExpression().accept(this),
                        checkType(ctx.getSourceInterval(),
                                ctx.equivalentExpression().accept(this),
                                DefaultType.INT
                        )
                );
            }
            case 1: {
                return ctx.compareExpression().accept(this);
            }
        }
        return null;
    }

    @Override
    public Type visitCompareExpression(XParser.CompareExpressionContext ctx) {
        switch (ctx.path) {
            case 0: {
                return checkType(
                        ctx.getSourceInterval(),
                        ctx.plusAndMinusExpression().accept(this),
                        checkType(ctx.getSourceInterval(),
                                ctx.compareExpression().accept(this),
                                DefaultType.INT
                        )
                );
            }
            case 1: {
                return ctx.plusAndMinusExpression().accept(this);
            }
        }
        return null;
    }

    @Override
    public Type visitPlusAndMinusExpression(XParser.PlusAndMinusExpressionContext ctx) {
        switch (ctx.path) {
            case 0: {
                return checkType(
                        ctx.getSourceInterval(),
                        ctx.mulAndDivExpression().accept(this),
                        checkType(ctx.getSourceInterval(),
                                ctx.plusAndMinusExpression().accept(this),
                                DefaultType.INT
                        )
                );
            }
            case 1: {
                return ctx.mulAndDivExpression().accept(this);
            }
        }
        return null;
    }

    @Override
    public Type visitMulAndDivExpression(XParser.MulAndDivExpressionContext ctx) {
        switch (ctx.path) {
            case 0: {
                return checkType(
                        ctx.getSourceInterval(),
                        ctx.unaryExpression().accept(this),
                        checkType(ctx.getSourceInterval(),
                                ctx.mulAndDivExpression().accept(this),
                                DefaultType.INT
                        )
                );
            }
            case 1: {
                return ctx.unaryExpression().accept(this);
            }
        }
        return null;
    }

    @Override
    public Type visitUnaryExpression(XParser.UnaryExpressionContext ctx) {
        switch (ctx.path) {
            case 0: {
                return checkType(
                        ctx.getSourceInterval(),
                        ctx.unaryExpression().accept(this),
                        DefaultType.INT
                );
            }
            case 1: {
                return ctx.endPointOfExpression().accept(this);
            }
        }
        return null;
    }

    @Override
    public Type visitEndPointOfExpression(XParser.EndPointOfExpressionContext ctx) {
        switch (ctx.path) {
            case 0: {
                return ctx.expression().accept(this);
            }
            case 1: {
                return getAllPossibleTypesWithIdentifier(ctx.getSourceInterval(), ctx.Identifier().getText());
            }
            case 2: {
                return ctx.listOrFunctionAccess().accept(this);
            }
            case 3: {
                return ctx.listConstant().accept(this);
            }
            case 4: {
                return getStringLiteralTypeWithStringLiteral(ctx.StringLiteral().getText());
            }
            case 5: {
                return DefaultType.INT;
            }
            case 6: {
                return DefaultType.CHAR;
            }
            case 7: {
                return DefaultType.NIL;
            }
            case 8: {
                ErrorLogger.error(ctx.getSourceInterval() , "character.with.longer.than.one.char.is.not.permitted");
                return DefaultType.NO_TYPE;
            }
        }
        return null;
    }

    private Type getAllPossibleTypesWithIdentifier(Interval sourceInterval, String identifierText) {
        List<Variable> possibleVariables = scope.findAllPossibleVariables(identifierText);
        List<Type> possibleFunctionTypes = addPossibleFunctions(identifierText);
        if (possibleVariables.isEmpty() && possibleFunctionTypes.isEmpty()) {
            ErrorLogger.error(sourceInterval, "variable.not.declared.before", identifierText);
            return DefaultType.NO_TYPE;
        }
        Set<Type> possibleTypedefs = new HashSet<Type>();
        possibleVariables.stream().forEach(variable -> possibleTypedefs.add(variable.getType()));
        possibleTypedefs.addAll(possibleFunctionTypes);
        return new MultiplePossibleType(possibleTypedefs);
    }

    private List<Type> addPossibleFunctions(String identifierText) {
        List<Type> possibleFunctionTypes = new ArrayList<Type>();
        for (Function function : global.functionList) {
            if(function.getName().equals(identifierText)){
                List<Type> functionInputTypes = new ArrayList<Type>();
                for (Variable variable : function.getInputs()) {
                    functionInputTypes.add(variable.getType());
                }
                PtF ptf = new PtF(functionInputTypes , function.getOutput());
                possibleFunctionTypes.add(ptf);
            }
        }
        return possibleFunctionTypes;
    }


    private Type getStringLiteralTypeWithStringLiteral(String stringLiteral) {
        List<ListAttribute> listAttributes = new ArrayList<ListAttribute>();
        for (int i = 0; i < stringLiteral.length() - 2; i++) {
            listAttributes.add(new ListAttribute(null, DefaultType.CHAR));
        }
        return new Array(listAttributes);
    }

    @Override
    public Type visitListOrFunctionAccess(XParser.ListOrFunctionAccessContext ctx) {
        Type type = DefaultType.NO_TYPE;
        switch (ctx.path) {
            case 0: {
                type = ctx.listOrFunctionAccess().accept(this);
                break;
            }
            case 1: {
                type = ctx.leftPositionOfAccess().accept(this);
                break;
            }
        }
        List<Access> accesses = ctx.rightPositionOfAccess().stream()
                .map(rightPositionOfAccessContext -> rightPositionOfAccessContext.accept(accessVisitor))
                .collect(Collectors.toList());
        for (Access access : accesses) {
            type = access.prune(type);
        }
        return type;
    }

    @Override
    public Type visitLeftPositionOfAccess(XParser.LeftPositionOfAccessContext ctx) {
        switch (ctx.path) {
            case 0: {
                return getAllPossibleTypesWithIdentifier(ctx.getSourceInterval(), ctx.Identifier().getText());
            }
            case 1: {
                return getStringLiteralTypeWithStringLiteral(ctx.StringLiteral().getText());
            }
            case 2: {
                return ctx.listConstant().accept(this);
            }
        }
        return null;
    }

    @Override
    public Type visitListConstant(XParser.ListConstantContext ctx) {
        List<ListAttribute> listAttributes = ctx.expression().stream()
                .map(expressionContext -> new ListAttribute(null, expressionContext.accept(this)))
                .collect(Collectors.toList());
        return new Array(listAttributes);
    }

    public Type checkType(Interval sourceInterval, Type type1, Type type2) {
        if (type1.castable(type2))
            return type1;
        ErrorLogger.error(sourceInterval, "expression.type.not.equal", type1.toString(), type2.toString());
        return DefaultType.NO_TYPE;
    }

}

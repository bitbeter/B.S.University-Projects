package src.myVisitors;

import grammer.XBaseVisitor;
import grammer.XParser;
import org.antlr.v4.runtime.misc.Interval;
import src.ErrorLogger;
import src.XParts.*;
import src.XParts.Types.Array;
import src.XParts.Types.MultiplePossibleType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by hasan on 12/14/2016 AD.
 */
public class ScopeVisitor extends XBaseVisitor<Object> {
    static Global global;
    Local local;
    int numberOfLastLocal = 0;
    ExpressionVisitor expressionVisitor;
    TypeVisitor typeVisitor;

    public ScopeVisitor(Local local) {
        this.local = local;
        this.expressionVisitor = new ExpressionVisitor(local);
        this.typeVisitor = new TypeVisitor();
    }

    static void setGlobal(Global g) {
        global = g;
    }

    @Override
    public Object visitBlock(XParser.BlockContext ctx) {
        ctx.statement().stream()
                .map(statement -> statement.accept(this))
                .collect(Collectors.toList());
        return null;
    }

    @Override
    public Object visitStatement(XParser.StatementContext ctx) {
        switch (ctx.path) {
            case 0: {
                return ctx.simpleStatement().accept(this);
            }
            case 1: {
                return ctx.ifStatement().accept(this);
            }
            case 2: {
                Local newLocal = new Local(local.getName() + "-local" + String.valueOf(numberOfLastLocal++),
                        local, local.isBreakable(), local.getReturnValueType()
                );
                local.children.add(newLocal);
                return ctx.block().accept(new ScopeVisitor(newLocal));
            }
        }
        return null;
    }

    @Override
    public Object visitSimpleStatement(XParser.SimpleStatementContext ctx) {
        switch (ctx.path) {
            case 0: {
                ctx.expression().accept(expressionVisitor);
                return null;
            }
            case 1: {
                ctx.variableDefinition().accept(this);
                return null;
            }
            case 2: {
                return ctx.whileStatement().accept(this);
            }
            case 3: {
                return ctx.foreachStatement().accept(this);
            }
            case 4: {
                local.setReturned(true);
                if (ctx.expression() != null) {
                    if (local.getReturnValueType().equals(DefaultType.VOID)
                            ||
                            !local.getReturnValueType().castable(ctx.expression().accept(expressionVisitor))) {
                        ErrorLogger.error(ctx.getSourceInterval(), "wrong.return.value", local.getReturnValueType().toString());
                    }
                }
                if(ctx.expression() == null && !local.getReturnValueType().equals(DefaultType.VOID)){
                    ErrorLogger.error(ctx.getSourceInterval(), "wrong.return.value", local.getReturnValueType().toString());
                }
                return null;
            }
            case 5: {
                return null;
            }
            case 6: {
                if (!local.isBreakable())
                    ErrorLogger.error(ctx.getSourceInterval(), "break.is.not.acceptable.in.this.scope");
                return null;
            }
        }
        return null;
    }

    @Override
    public Void visitVariableDefinition(XParser.VariableDefinitionContext ctx) {
        Type type = ctx.type().accept(typeVisitor);
        List<Variable> variableList = ctx.variableNaming()
                .stream()
                .map(variableNamingContext -> variableNamingContext.accept(new VariableNamingVisitor(local, type)))
                .filter(variable -> variable != null)
                .collect(Collectors.toList());
        local.variableList.addAll(variableList);
        return null;
    }

    @Override
    public Object visitStatementWitIfElseNotIf(XParser.StatementWitIfElseNotIfContext ctx) {
        switch (ctx.path) {
            case 0: {
                return ctx.simpleStatement().accept(this);
            }
            case 1: {
                return ctx.ifElse().accept(this);
            }
            case 2: {
                Local newLocal = new Local(local.getName() + "-local" + String.valueOf(numberOfLastLocal++),
                        local, local.isBreakable(), local.getReturnValueType()
                );
                local.children.add(newLocal);
                return ctx.block().accept(new ScopeVisitor(newLocal));
            }
        }
        return null;
    }

    @Override
    public Object visitIfStatement(XParser.IfStatementContext ctx) {
        switch (ctx.path) {
            case 0: {
                return ctx.ifElse().accept(this);
            }
            case 1: {
                return ctx.ifGeneral().accept(this);
            }
        }
        return null;
    }

    @Override
    public Object visitIfElse(XParser.IfElseContext ctx) {
        checkType(ctx.getSourceInterval(), ctx.expression().accept(expressionVisitor), DefaultType.INT);
        Local newLocal1 = new Local(local.getName() + "-if'" + String.valueOf(numberOfLastLocal) + "'(local " + String.valueOf(numberOfLastLocal++) + ")",
                local, local.isBreakable(), local.getReturnValueType()
        );
        local.children.add(newLocal1);
        if (ctx.statementWitIfElseNotIf().block() == null)
            ctx.statementWitIfElseNotIf().accept(new ScopeVisitor(newLocal1));
        else
            ctx.statementWitIfElseNotIf().block().accept(new ScopeVisitor(newLocal1));

        Local newLocal2 = new Local(local.getName() + "-else'" + String.valueOf(numberOfLastLocal - 1) + "'(local " + String.valueOf(numberOfLastLocal++) + ")",
                local, local.isBreakable(), local.getReturnValueType()
        );
        local.children.add(newLocal2);
        if (ctx.statement().block() == null)
            return ctx.statement().accept(new ScopeVisitor(newLocal2));
        else
            return ctx.statement().block().accept(new ScopeVisitor(newLocal2));
    }

    @Override
    public Object visitIfGeneral(XParser.IfGeneralContext ctx) {
        checkType(ctx.getSourceInterval(), ctx.expression().accept(expressionVisitor), DefaultType.INT);
        Local newLocal2 = new Local(local.getName() + "-if'" + String.valueOf(numberOfLastLocal) + "'(local " + String.valueOf(numberOfLastLocal++) + ")",
                local, local.isBreakable(), local.getReturnValueType()
        );
        local.children.add(newLocal2);
        if (ctx.statement().block() == null)
            return ctx.statement().accept(new ScopeVisitor(newLocal2));
        else
            return ctx.statement().block().accept(new ScopeVisitor(newLocal2));
    }

    @Override
    public Object visitWhileStatement(XParser.WhileStatementContext ctx) {
        checkType(ctx.getSourceInterval(), ctx.expression().accept(expressionVisitor), DefaultType.INT);
        Local newLocal = new Local(local.getName() + "-while(local " + String.valueOf(numberOfLastLocal++) + ")",
                local, true, local.getReturnValueType()
        );
        local.children.add(newLocal);
        if (ctx.statement().block() == null)
            return ctx.statement().accept(new ScopeVisitor(newLocal));
        return ctx.statement().block().accept(new ScopeVisitor(newLocal));
    }

    @Override
    public Object visitForeachStatement(XParser.ForeachStatementContext ctx) {
        Type type = ctx.type().accept(typeVisitor);
        Type expression = ctx.expression().accept(expressionVisitor);
        type = checkTypeOfTypeAndExpressionInForEach(ctx.getSourceInterval(), type, expression);
        Local newLocal = new Local(local.getName() + "-foreach(local " + String.valueOf(numberOfLastLocal++) + ")",
                local, true, local.getReturnValueType()
        );
        local.children.add(newLocal);
        newLocal.variableList.add(new Variable(ctx.Identifier().getText(), type));
        if (ctx.statement().block() == null)
            return ctx.statement().accept(new ScopeVisitor(newLocal));
        return ctx.statement().block().accept(new ScopeVisitor(newLocal));
    }

    private Type checkTypeOfTypeAndExpressionInForEach(Interval sourceInterval, Type type, Type expression) {
        if (expression instanceof MultiplePossibleType) {
            MultiplePossibleType mpt = ((MultiplePossibleType) expression);
            mpt.allPossibleTypes.removeAll(
                    mpt.allPossibleTypes.stream().filter(m -> !(m instanceof Array)).collect(Collectors.toList())
            );
            if (mpt.allPossibleTypes.size() == 0) {
                ErrorLogger.error(sourceInterval, "array.needed.here");
            } else {
                mpt.allPossibleTypes.removeAll(
                        mpt.allPossibleTypes.stream().filter(m -> !((Array) m).isHomogeneous()).collect(Collectors.toList())
                );
                if (mpt.allPossibleTypes.size() == 0) {
                    ErrorLogger.error(sourceInterval, "array.must.be.homogeneous");
                }
            }
        } else if (expression instanceof Array) {
            if (!((Array) expression).isHomogeneous())
                ErrorLogger.error(sourceInterval, "array.must.be.homogeneous");
            else {
                if (!type.castable(((Array) expression).getWithIndex(0))) {
                    ErrorLogger.error(sourceInterval, "type.is.not.castable.to.attributes.of.List", type, ((Array) expression).getWithIndex(0));
                    type = DefaultType.NO_TYPE;
                }
            }
        } else {
            ErrorLogger.error(sourceInterval, "array.needed.here");
        }
        return type;
    }

    private Type checkType(Interval sourceInterval, Type type1, Type type2) {
        if (type1.castable(type2))
            return type1;
        ErrorLogger.error(sourceInterval, "expression.type.not.equal", type1.toString(), type2.toString());
        return DefaultType.NO_TYPE;
    }
}

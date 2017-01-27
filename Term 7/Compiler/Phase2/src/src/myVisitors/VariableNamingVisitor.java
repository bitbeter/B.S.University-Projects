package src.myVisitors;

import grammer.XBaseVisitor;
import grammer.XParser;
import org.antlr.v4.runtime.misc.Interval;
import src.ErrorLogger;
import src.XParts.*;
import src.XParts.Types.PtF;

/**
 * Created by hasan on 12/10/2016 AD.
 */
public class VariableNamingVisitor extends XBaseVisitor<Variable> {
    Scope scope;
    ExpressionVisitor expressionVisitor;
    Type lValueType;

    public VariableNamingVisitor(Scope scope, Type lValueType) {
        this.scope = scope;
        this.lValueType = lValueType;
        this.expressionVisitor = new ExpressionVisitor(scope);
    }

    @Override
    public Variable visitVariableNaming(XParser.VariableNamingContext ctx) {
        String variableName = ctx.Identifier().getText();
        if (isErrorInNewVariableDefinition(ctx.getSourceInterval(), variableName)) return null;
        expressionTypeCheckingWithLValueType(ctx);
        return new Variable(variableName, lValueType);
    }

    private boolean isErrorInNewVariableDefinition(Interval sourceInterval, String variableName) {
        if (isExistVariableIflValueTypeIsNotPtF(sourceInterval, variableName)) return true;
        if (isExistPtFWithSameSignatureIflValueTypeIsPtF(sourceInterval, variableName)) return true;
        if (isExistPtFAndFunctionWithSameSignatureInGlobalScope(sourceInterval, variableName)) return true;
        return false;
    }

    private boolean isExistVariableIflValueTypeIsNotPtF(Interval sourceInterval, String variableName) {
        Variable foundedFirstVariable = this.scope.findFirstVariable(variableName);
        if (foundedFirstVariable == null)
            return false;
        if (!(foundedFirstVariable.getType() instanceof PtF) ||
                (!(lValueType instanceof PtF) && (foundedFirstVariable.getType() instanceof PtF))) {
            ErrorLogger.error(sourceInterval,
                    "variable.already.defined",
                    variableName, foundedFirstVariable.getType().toString());
            return true;
        }
        return false;
    }

    private boolean isExistPtFWithSameSignatureIflValueTypeIsPtF(Interval sourceInterval, String variableName) {
        if (!(lValueType instanceof PtF))
            return false;
        Variable foundedPtFVariable = this.scope.findPtFVariable(variableName, ((PtF) lValueType).toInputSign());
        if (foundedPtFVariable != null && (foundedPtFVariable.getType() instanceof PtF)) {
            ErrorLogger.error(sourceInterval,
                    "one.pointer.to.function.variable.with.same.name.and.same.signature.defined.before",
                    variableName, ((PtF) foundedPtFVariable.getType()).toInputSign());
            return true;
        }
        return false;
    }

    private boolean isExistPtFAndFunctionWithSameSignatureInGlobalScope(Interval sourceInterval, String variableName) {
        if (lValueType instanceof PtF && scope instanceof Global) {
            PtF ptf = (PtF) lValueType;
            Function function = ((Global) scope).findFunction(variableName, ptf.toInputSign());
            if (function != null) {
                ErrorLogger.error(sourceInterval
                        , "one.function.with.same.name.and.same.signature.defined.before"
                        , variableName, function.toInputSign()
                );
                return true;
            }
        }
        return false;
    }

    private void expressionTypeCheckingWithLValueType(XParser.VariableNamingContext ctx) {
        if (ctx.expression() != null) {
            Type expressionType = ctx.expression().accept(expressionVisitor);
            if (!lValueType.castable(expressionType))
                ErrorLogger.error(ctx.getSourceInterval(),
                        "type.inconsistency.between.lValue.and.expression",
                        lValueType.toSign(),
                        expressionType.toSign()
                );
        }
    }
}

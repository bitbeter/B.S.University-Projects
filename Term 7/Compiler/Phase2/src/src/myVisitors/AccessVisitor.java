package src.myVisitors;

import grammer.XBaseVisitor;
import grammer.XParser;
import src.ErrorLogger;
import src.XParts.*;
import src.XParts.Accesses.FunctionAccess;
import src.XParts.Accesses.IndexAccess;
import src.XParts.Accesses.ListAttributeNameAccess;
import src.XParts.Types.PtF;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by hasan on 12/13/2016 AD.
 */
public class AccessVisitor extends XBaseVisitor<Access> {
    ExpressionVisitor expressionVisitor;

    public AccessVisitor(ExpressionVisitor expressionVisitor) {
        this.expressionVisitor = expressionVisitor;
    }

    @Override
    public Access visitRightPositionOfAccess(XParser.RightPositionOfAccessContext ctx) {
        switch (ctx.path) {
            case 0: {
                String listAttributeName = ctx.identifierAccess().Identifier().getText();
                return new ListAttributeNameAccess(ctx.getSourceInterval(), listAttributeName);
            }
            case 1: {
                if (ctx.indexAccess().path == 0) {
                    String indexAccessByIdentifier = ctx.indexAccess().Identifier().getText();
                    return new IndexAccess(ctx.getSourceInterval(), indexAccessByIdentifier);
                } else if (ctx.indexAccess().path == 1) {
                    return new IndexAccess(ctx.getSourceInterval(), Integer.valueOf(ctx.indexAccess().IntegerConstant().getText()));
                } else {
                    int num = 0;
                    String arithmeticConstants = ctx.indexAccess().arithmeticConstants().getText();
                    try {
                        ScriptEngineManager manager = new ScriptEngineManager();
                        ScriptEngine engine = manager.getEngineByName("js");
                        num = (int) engine.eval(arithmeticConstants);
                    } catch (Exception e){
                        ErrorLogger.error(ctx.getSourceInterval(),"constant.expression.is.invalid" , arithmeticConstants);
                    }
                    return new IndexAccess(ctx.getSourceInterval(), num);
                }
            }
            case 2: {
                List<Type> inputs = ctx.functionAccess().expression().stream()
                        .map(expressionContext -> expressionContext.accept(expressionVisitor))
                        .collect(Collectors.toList());
                return new FunctionAccess(ctx.getSourceInterval(), new PtF(inputs, DefaultType.VOID));
            }
        }
        return null;
    }
}

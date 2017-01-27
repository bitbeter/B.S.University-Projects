package src.myVisitors;

import grammer.XBaseVisitor;
import grammer.XParser;
import src.ErrorLogger;
import src.XParts.Function;
import src.XParts.Global;
import src.XParts.Types.Typedef;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by hasan on 12/9/2016 AD.
 */
public class ProgramVisitor extends XBaseVisitor<Global> {
    @Override
    public Global visitProgram(XParser.ProgramContext ctx) {
        Global global = new Global();
        ExpressionVisitor.setGlobal(global);
        TypeVisitor.setGlobal(global);
        ScopeVisitor.setGlobal(global);
        GlobalVisitor globalVisitor = new GlobalVisitor(global);
        ctx.global().stream().map(globalContext -> globalContext.accept(globalVisitor)).collect(Collectors.toList());
        for (Typedef typedef : global.typedefList) {
            if(!typedef.isDefined())
                ErrorLogger.error(ctx.getSourceInterval(), "typedef.not.defined" , typedef.getTypeName());
        }
        for (Function typedef : global.functionList) {
            if(!typedef.isDefined())
                ErrorLogger.error(ctx.getSourceInterval(), "function.not.defined" , typedef.getName());
        }
        return global;
    }
}

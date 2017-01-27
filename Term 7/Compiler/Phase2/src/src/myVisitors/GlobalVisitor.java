package src.myVisitors;

import grammer.XBaseVisitor;
import grammer.XParser;
import org.antlr.v4.runtime.misc.Interval;
import src.ErrorLogger;
import src.XParts.*;
import src.XParts.Types.PtF;
import src.XParts.Types.Typedef;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by hasan on 12/9/2016 AD.
 */
public class GlobalVisitor extends XBaseVisitor<Object> {
    Global global;
    TypeVisitor typeVisitor;

    public GlobalVisitor(Global global) {
        this.global = global;
        typeVisitor = new TypeVisitor();
    }

    @Override
    public Void visitTypeForwardDeclaration(XParser.TypeForwardDeclarationContext ctx) {
        String typedefName = ctx.typedefName().getText();
        if (isErrorInTypeForwardDeclaration(ctx.getSourceInterval(), typedefName)) return null;
        global.typedefList.add(new Typedef(typedefName));
        return null;
    }

    private boolean isErrorInTypeForwardDeclaration(Interval sourceInterval, String typedefName) {
        Typedef foundedTypedef = global.findTypedef(typedefName);
        if (isExtraDeclared(sourceInterval, foundedTypedef)) return true;
        if (isExtraDefined(sourceInterval, foundedTypedef)) return true;
        return false;
    }

    private boolean isExtraDefined(Interval sourceInterval, Typedef typedef) {
        if (typedef != null && typedef.isDefined()) {
            ErrorLogger.error(sourceInterval, "type.already.defined", typedef.getTypeName(), typedef.toString());
            return true;
        }
        return false;
    }

    private boolean isExtraDeclared(Interval sourceInterval, Typedef typedef) {
        if (typedef != null && !typedef.isDefined()) {
            ErrorLogger.error(sourceInterval, "type.already.declared", typedef.getTypeName(), "a forward declaration");
            return true;
        }
        return false;
    }

    @Override
    public Void visitTypeDefinition(XParser.TypeDefinitionContext ctx) {
        String typedefName = ctx.typedefName().getText();
        if (isErrorInTypeDefinition(ctx, typedefName)) return null;
        Type type = ctx.type().accept(typeVisitor);
        Typedef newTypedef = new Typedef(type, typedefName);
        if (isVoid(ctx, type)) {
            newTypedef = new Typedef(DefaultType.NO_TYPE, typedefName, true, false);
        }
        global.typedefList.add(newTypedef);
        return null;
    }

    private boolean isErrorInTypeDefinition(XParser.TypeDefinitionContext ctx, String typedefName) {
        Typedef foundedTypedef = global.findTypedef(typedefName);
        if (isExtraDefined(ctx.getSourceInterval(), foundedTypedef)) return true;
        if (isDeclaredBeforeButNotDefined(ctx, typedefName, foundedTypedef)) return true;
        return false;
    }

    private boolean isDeclaredBeforeButNotDefined(XParser.TypeDefinitionContext ctx, String typedefName, Typedef typedef) {
        if (typedef != null && !typedef.isDefined()) {
            Type type = ctx.type().accept(typeVisitor);
            Typedef newTypedef = new Typedef(type, typedefName);
            if (isCircularDependency(ctx.getSourceInterval(), typedefName, type))
                newTypedef = new Typedef(DefaultType.NO_TYPE, typedefName, true, false);
            int index = global.findTypedefIndex(typedefName);
            global.typedefList.remove(index);
            global.updateNamedTypeListWithType(newTypedef);
            global.typedefList.add(newTypedef);
            return true;
        }
        return false;
    }

    private boolean isCircularDependency(Interval sourceInterval, String typeName, Type newType) {
        if (newType.getAllUsedTypedef().stream().filter(usedTypedef -> usedTypedef.equals(typeName)).count() > 0) {
            ErrorLogger.error(sourceInterval, "type.circle.definition", typeName);
            return true;
        }
        return false;
    }

    private boolean isVoid(XParser.TypeDefinitionContext ctx, Type type) {
        if (type.equals(DefaultType.VOID)) {
            ErrorLogger.error(ctx.getSourceInterval(), "void.type.not.permitted");
            return true;
        }
        return false;
    }

    @Override
    public Void visitVariableDefinition(XParser.VariableDefinitionContext ctx) {
        Type type = ctx.type().accept(typeVisitor);
        List<Variable> variableList = ctx.variableNaming()
                .stream()
                .map(variableNamingContext -> variableNamingContext.accept(new VariableNamingVisitor(global, type)))
                .filter(variable -> variable != null)
                .collect(Collectors.toList());
        global.variableList.addAll(variableList);
        return null;
    }

    @Override
    public Void visitFunctionDeclarationHeader(XParser.FunctionDeclarationHeaderContext ctx) {
        Type output = ctx.type().accept(typeVisitor);
        String functionName = ctx.functionName().getText();
        if (isDeclarationOfMain(ctx.getSourceInterval(), functionName)) return null;
        List<Variable> inputs = new ArrayList<Variable>();
        if (ctx.functionDeclarationInputs() != null)
            inputs = (List<Variable>) ctx.functionDeclarationInputs().accept(this);
        if (inputs.size() > 1 && inputs.stream().filter(variable -> variable.getType().equals(DefaultType.VOID)).count() != 0)
            ErrorLogger.error(ctx.getSourceInterval(), "void.type.not.permitted");
        Function function = new Function(functionName, inputs, output);
        Function foundedFunction = global.findFunction(functionName, function.toInputSign());
        if (isFunctionDeclaredOrDefinedBefore(ctx.getSourceInterval(), functionName, function, foundedFunction))
            return null;
        if (isExistSameNameAndSignaturePtF(ctx.getSourceInterval(), functionName, function)) return null;
        global.functionList.add(function);
        return null;
    }

    private boolean isDeclarationOfMain(Interval sourceInterval, String functionName) {
        if (functionName.equals("main")) {
            ErrorLogger.error(sourceInterval, "main.function.not.declarable");
            return true;
        }
        return false;
    }

    private boolean isFunctionDeclaredOrDefinedBefore(Interval sourceInterval, String functionName, Function function, Function foundedFunction) {
        if (foundedFunction != null) {
            if (!foundedFunction.isDefined()) {
                ErrorLogger.error(sourceInterval,
                        "function.already.declared.with.same.signature"
                        , functionName, function.toString(), foundedFunction.toInputSign());
            } else {
                ErrorLogger.error(sourceInterval,
                        "function.already.defined"
                        , functionName, function.toString());
            }
            return true;
        }
        return false;
    }

    private boolean isExistSameNameAndSignaturePtF(Interval sourceInterval, String functionName, Function function) {
        Variable variableWithSignature = global.findVariable(functionName, function.toInputSign());
        if (variableWithSignature != null && ((PtF) variableWithSignature.getType()).toInputSign().equals(function.toInputSign())) {
            ErrorLogger.error(sourceInterval,
                    "one.pointer.to.function.variable.with.same.name.and.same.signature.defined.before",
                    functionName, function.toInputSign()
            );
            return true;
        }
        return false;
    }

    @Override
    public List<Variable> visitFunctionDeclarationInputs(XParser.FunctionDeclarationInputsContext ctx) {
        return ctx.functionDeclarationInput().stream()
                .map(functionDeclarationInputContext -> (Variable) functionDeclarationInputContext.accept(this))
                .collect(Collectors.toList());
    }

    @Override
    public Object visitFunctionDeclarationInput(XParser.FunctionDeclarationInputContext ctx) {
        String variableName = null;
        if(ctx.Identifier() != null && ctx.Identifier().getText() != null)
            variableName = ctx.Identifier().getText();
        return new Variable(variableName, ctx.type().accept(typeVisitor));
    }

    @Override
    public Object visitFunctionDefinition(XParser.FunctionDefinitionContext ctx) {
        Function function = (Function) ctx.functionHeader().accept(this);
        if (function == null) return null;
        Local functionScope = new Local("(function scope)" + function.getName() + function.toInputSign(), global, false, function.getOutput());
        for (Variable variable : function.getInputs()) {
            functionScope.variableList.add(variable);
        }
        global.children.add(functionScope);
        function.setScope(functionScope);
        ctx.functionBody().accept(new ScopeVisitor(functionScope));
        if(!functionScope.isReturned() && !functionScope.getReturnValueType().equals(DefaultType.VOID))
            ErrorLogger.error(ctx.getSourceInterval() , "return.value.needed");
        return null;
    }

    @Override
    public Object visitFunctionHeader(XParser.FunctionHeaderContext ctx) {
        String functionName = ctx.functionName().getText();
        Type output = ctx.type().accept(typeVisitor);
        List<Variable> inputs = new ArrayList<Variable>();
        if (ctx.functionInputs() != null)
            inputs = (List<Variable>) ctx.functionInputs().accept(this);
        if (isImplementationOfMainWrong(ctx, functionName, output, inputs)) return null;
        if (inputs.size() > 1 && inputs.stream().filter(variable -> variable.getType().equals(DefaultType.VOID)).count() != 0)
            ErrorLogger.error(ctx.getSourceInterval(), "void.type.not.permitted");
        Function function = new Function(functionName, inputs, output , true);
        Function foundedFunction = global.findFunction(functionName, function.toInputSign());
        if (isFunctionDefinedBefore(ctx.getSourceInterval(), functionName, function, foundedFunction)) return null;
        if (isExistSameNameAndSignaturePtF(ctx.getSourceInterval(), functionName, function)) return null;
        removeFunctionFromFunctionListIfDeclaredButNotDefined(foundedFunction);
        global.functionList.add(function);
        return function;
    }

    private boolean isImplementationOfMainWrong(XParser.FunctionHeaderContext ctx, String functionName, Type output, List<Variable> inputs) {
        if (functionName.equals("main") && (inputs.size() > 0 || !output.equals(DefaultType.VOID))) {
            ErrorLogger.error(ctx.getSourceInterval(), "wrong.main.function.implementation");
            return true;
        }
        return false;
    }

    @Override
    public Object visitFunctionInputs(XParser.FunctionInputsContext ctx) {
        return ctx.functionInput().stream()
                .map(functionInputContext -> (Variable) functionInputContext.accept(this))
                .collect(Collectors.toList());
    }

    @Override
    public Object visitFunctionInput(XParser.FunctionInputContext ctx) {
        return new Variable(ctx.Identifier().getText(), ctx.type().accept(typeVisitor));
    }

    private void removeFunctionFromFunctionListIfDeclaredButNotDefined(Function foundedFunction) {
        if (foundedFunction != null && !foundedFunction.isDefined()) {
            global.functionList.remove(foundedFunction);
        }
    }

    private boolean isFunctionDefinedBefore(Interval sourceInterval, String functionName, Function function, Function foundedFunction) {
        if (foundedFunction != null && foundedFunction.isDefined()) {
            ErrorLogger.error(sourceInterval,
                    "function.already.defined"
                    , functionName, function.toString());
            return true;
        }
        return false;
    }
}

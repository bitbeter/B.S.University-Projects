package src.myVisitors;

import grammer.XBaseVisitor;
import grammer.XParser;
import src.ErrorLogger;
import src.XParts.*;
import org.antlr.v4.runtime.misc.Interval;
import src.XParts.Types.Array;
import src.XParts.Types.PtF;
import src.XParts.Types.Typedef;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by hasan on 12/9/2016 AD.
 */
public class TypeVisitor extends XBaseVisitor<Type> {
    static Global global;
    private static ListAttributeVisitor listAttributeVisitor;

    static void setGlobal(Global g) {
        global = g;
        listAttributeVisitor = new ListAttributeVisitor(new TypeVisitor());
    }

    @Override
    public Type visitPrimitive(XParser.PrimitiveContext ctx) {
        if (ctx.primitiveType.equals("char"))
            return DefaultType.CHAR;
        else if (ctx.primitiveType.equals("int"))
            return DefaultType.INT;
        else
            return DefaultType.VOID;
    }

    @Override
    public Type visitTypedefName(XParser.TypedefNameContext ctx) {
        String typedefName = ctx.Identifier().getText();
        Typedef foundedTypedef = this.global.findTypedef(typedefName);
        if (notDeclaredBefore(ctx, typedefName, foundedTypedef))
            foundedTypedef = new Typedef(DefaultType.NO_TYPE, typedefName, true, false);
        return foundedTypedef;
    }

    private boolean notDeclaredBefore(XParser.TypedefNameContext ctx, String typedefName, Typedef typedef) {
        if (typedef == null) {
            ErrorLogger.error(ctx.getSourceInterval(), "type.not.declared.before", typedefName);
            return true;
        }
        return false;
    }

    @Override
    public Type visitNormalListDefinition(XParser.NormalListDefinitionContext ctx) {
        List<ListAttribute> listAttributes = ctx.listAttributes().listAttribute()
                .stream()
                .map(listAttributeContext -> listAttributeContext.accept(listAttributeVisitor))
                .collect(Collectors.toList());
        isVoidUsedInArray(ctx.getSourceInterval(), listAttributes);
        isAllAttributesNamesUnique(ctx.getSourceInterval(), listAttributes);
        return new Array(listAttributes);
    }

    private void isAllAttributesNamesUnique(Interval sourceInterval, List<ListAttribute> listAttributes) {
        for (ListAttribute listAttribute : listAttributes) {
            if (numberOfUsedSomeNameAttributeInArray(listAttributes, listAttribute.name) > 1) {
                ErrorLogger.error(sourceInterval, "name.of.attribute.is.not.unique", listAttribute.name);
                eliminateSomeNameInArray(listAttributes, listAttribute.name);
            }
        }
    }

    private int numberOfUsedSomeNameAttributeInArray(List<ListAttribute> listAttributes, String name) {
        int numberOfUse = 0;
        for (ListAttribute listAttribute : listAttributes) {
            if (listAttribute.name != null && listAttribute.name.equals(name))
                numberOfUse++;
        }
        return numberOfUse;
    }

    private void eliminateSomeNameInArray(List<ListAttribute> listAttributes, String name) {
        for (ListAttribute listAttribute : listAttributes) {
            if (listAttribute.name.equals(name))
                listAttribute.name = null;
        }
    }

    private boolean isVoidUsedInArray(Interval sourceInterval, List<ListAttribute> listAttributes) {
        if (listAttributes.stream().filter(listAttribute -> listAttribute.type.equals(DefaultType.VOID)).count() != 0) {
            ErrorLogger.error(sourceInterval, "void.type.not.permitted");
            listAttributes.stream()
                    .filter(listAttribute -> listAttribute.type.equals(DefaultType.VOID))
                    .forEach(listAttribute -> listAttribute.type = DefaultType.NO_TYPE);
            return true;
        }
        return false;
    }

    @Override
    public Type visitSpecialListDefinition(XParser.SpecialListDefinitionContext ctx) {
        int num = 0;
        String arithmeticConstants = ctx.arithmeticConstants().getText();
        try {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("js");
            num = (int) engine.eval(arithmeticConstants);
        } catch (Exception e){
            ErrorLogger.error(ctx.getSourceInterval(),"constant.expression.is.invalid" , arithmeticConstants);
            return DefaultType.NO_TYPE;
        }
        if(num <= 0){
            ErrorLogger.error(ctx.getSourceInterval(),"constant.expression.should.be.bigger.than.zero" , arithmeticConstants);
            return DefaultType.NO_TYPE;
        }
        List<ListAttribute> listAttributes = new ArrayList<ListAttribute>();
        if (ctx.isString) {
            for (int i = 0; i < num; i++) {
                listAttributes.add(new ListAttribute(null, DefaultType.CHAR));
            }
        } else {
            Type type = ctx.type().accept(this);
            if (type.equals(DefaultType.VOID)) {
                ErrorLogger.error(ctx.getSourceInterval(), "void.type.not.permitted");
                type = DefaultType.NO_TYPE;
            }
            for (int i = 0; i < num; i++) {
                listAttributes.add(new ListAttribute(null, type));
            }
        }
        return new Array(listAttributes);
    }

    @Override
    public Type visitPointerToFunction(XParser.PointerToFunctionContext ctx) {
        List<Type> inputs = ctx.ptfInputs().type()
                .stream()
                .map(typeContext -> typeContext.accept(this))
                .collect(Collectors.toList());
        Type output = ctx.type().accept(this);
        if (inputs.size() > 1 && inputs.stream().filter(input -> input.equals(DefaultType.VOID)).count() != 0) {
            ErrorLogger.error(ctx.getSourceInterval(), "void.type.not.permitted");
            int index = 0;
            for (Type input : inputs) {
                if (input.equals(DefaultType.VOID))
                    inputs.set(index, DefaultType.NO_TYPE);
                index++;
            }
        }
        return new PtF(inputs, output);
    }


}

package src;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Interval;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hasan on 12/8/2016 AD.
 */
public class ErrorLogger {

    static CommonTokenStream tokens;
    static boolean errorOccurred = false;

    public ErrorLogger(CommonTokenStream tokens) {
        this.tokens = tokens;
    }

    public ErrorLogger() {
    }

    public static boolean isErrorOccurred() {
        return errorOccurred;
    }

    private static Map<String, String> errorList = new HashMap<String, String>() {{
        // Typedefs
        put("type.not.convertible"
                , "\'%s\' cannot be converted to \'%s\'");
        put("type.already.declared"
                , "type \'%s\' already declared as \'%s\'");
        put("type.already.defined"
                , "type \'%s\' already defined as \'%s\'");
        put("type.not.declared.before"
                , "type \'%s\' is not declared before");
        put("void.type.not.permitted"
                , "void type is not permitted");
        put("type.circle.definition"
                , "there are a circle definition on \'%s\'");

        // Variables
        put("variable.with.invalid.type"
                , "variable \'%s\' has not a valid type it's type is");
        put("variable.already.defined"
                , "variable \'%s\' already defined as \'%s\'");
        put("variable.not.declared.before"
                , "variable \'%s\' not declared before");

        // PtFs and Functions
        put("one.pointer.to.function.variable.with.same.name.and.same.signature.defined.before"
                , "One pointer to function variable with same name(\'%s\') and same signature(input(s):\'%s\') defined before");
        put("one.function.with.same.name.and.same.signature.defined.before"
                , "One function with same name(\'%s\') and same signature(input(s):\'%s\') defined before");

        // Functions
        put("function.already.declared.with.same.signature"
                , "function \'%s%s\' already defined with same signature(input(s):\'%s\')");
        put("function.already.defined"
                , "function \'%s%s\' already defined");
        put("main.function.not.declarable"
                , "main function not declarable");
        put("main.function.not.defined"
                , "main function not defined");
        put("wrong.main.function.implementation"
                , "wrong main function implementation. main function must declare as <void->void>");

        // Scope
        put("wrong.return.value"
                , "wrong return value. '%s' needed");
        put("return.value.needed"
                , "return value needed.");

        // foreach
        put("array.needed.here"
                , "array needed here");
        put("array.must.be.homogeneous"
                , "array must be homogeneous");
        put("type.is.not.castable.to.attributes.of.List"
                , "type of '%s' is not castable to attributes of List with '%s' type");
        // Statements
        put("break.is.not.acceptable.in.this.scope"
                , "break is not acceptable in this scope");
        // Types Inconsistency
        put("expression.type.not.equal"
                , "expression types not equals. '%s' is not castable to '%s'");
        put("type.inconsistency.between.lValue.and.expression"
                , "type inconsistency between lValue and expression - lValue(\'%s\') expression(\'%s\')");
        put("list.needed.for.index.access"
                , "list needed for index access here");
        put("PtF.needed.for.function.call.here"
                , "PtF needed for function call here with \'%s\' signature");
        // Array
        put("name.of.attribute.is.not.unique"
                , "\'%s\' is not a unique name in attributes of this List");
        put("name.of.attribute.is.not.found.in.List"
                , "\'%s\' is not found as named attribute of this List");
        put("out.of.bound.list.access"
                , "out of bound list access");
        put("homogeneous.list.needed.for.not.constant.index.access"
                , "homogeneous list needed for not constant index access here");

        //Special Lists
        put("constant.expression.is.invalid"
                , "constant expression is invalid '%s'");
        put("constant.expression.should.be.bigger.than.zero"
                , "constant expression should be bigger than zero");

        // character
        put("character.with.longer.than.one.char.is.not.permitted"
                , "character with longer than one char is not permitted");
        put("typedef.not.defined"
                , "typedef not defined %s");
        put("function.not.defined"
                , "function not defined %s");
    }};

    public static void error(Interval sourceInterval, String key, Object... extra) {
        errorOccurred = true;
        Token firstToken = tokens.get(sourceInterval.a);
        int line = firstToken.getLine();
        int position = firstToken.getCharPositionInLine();
        System.out.print(Color.ANSI_RED + String.format("Error [%-3d:%3d] : ", line, position));
        System.out.println(String.format(errorList.get(key), extra) + Color.ANSI_RESET);
    }

}

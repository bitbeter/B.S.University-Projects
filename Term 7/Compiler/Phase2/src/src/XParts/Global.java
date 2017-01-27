package src.XParts;

import src.Color;
import src.ErrorLogger;
import src.TableList;
import src.XParts.Types.PtF;
import src.XParts.Types.Typedef;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hasan on 12/8/2016 AD.
 */
public class Global extends Scope {
    public static ErrorLogger errorLogger = new ErrorLogger();

    public List<Function> functionList = new ArrayList<Function>();
    public List<Typedef> typedefList = new ArrayList<Typedef>();

    public Global() {
        super("Global", null);
    }

    public Typedef findTypedef(String s) {
        int index = 0;
        for (Typedef t : typedefList) {
            if (t.getTypeName().equals(s))
                return typedefList.get(index);
            index++;
        }
        return null;
    }

    public int findTypedefIndex(String s) {
        int index = 0;
        for (Typedef t : typedefList) {
            if (t.getTypeName().equals(s))
                return index;
            index++;
        }
        return -1;
    }

    public void updateNamedTypeListWithType(Typedef nt){
        typedefList.stream().forEach(namedType -> namedType.updateWithTypedef(nt));
    }

    public Function findFunction(String functionName, String inputSign) {
        int index = 0;
        for (Function function : functionList) {
            if (function.getName().equals(functionName) && function.toInputSign().equals(inputSign))
                return functionList.get(index);
            index++;
        }
        return null;
    }

    public Variable findVariable(String name, String signature) {
        int index = 0;
        for (Variable variable : variableList) {
            if (variable.getName().equals(name) && variable.getType() instanceof PtF && ((PtF) variable.getType()).toInputSign().equals(signature))
                return variableList.get(index);
            index++;
        }
        return null;
    }

    protected void printTable() {
        printTypedefTable();
        printVariableTable();
        printFunctionTable();
    }

    private void printVariableTable() {
        System.out.println(Color.ANSI_BLUE + "\nGlobal Variable Symbol Table");
        TableList tl = new TableList(3, "Name", "Type/structure", "size").withUnicode(true);
        for (Variable variable : variableList) {
            tl.addRow(variable.getName(), variable.getType().toString(), String.valueOf(variable.getType().getSize()));
        }
        tl.print();
    }

    private void printFunctionTable() {
        System.out.println(Color.ANSI_BLUE + "\nFunction Symbol Table");
        TableList tl = new TableList(2, "Name", "Type/structure").withUnicode(true);
        for (Function function : functionList) {
            tl.addRow(function.getName(), function.toString());
        }
        tl.print();
    }

    private void printTypedefTable() {
        System.out.println(Color.ANSI_BLUE + "\nTypedef Symbol Table");
        TableList tl = new TableList(3, "Name", "Type/structure", "size").withUnicode(true);
        for (Typedef typedef : typedefList) {
            tl.addRow(typedef.getTypeName(), typedef.toString(), String.valueOf(typedef.getSize()));
        }
        tl.print();
    }
}

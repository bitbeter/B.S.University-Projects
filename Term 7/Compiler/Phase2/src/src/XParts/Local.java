package src.XParts;

import src.Color;
import src.TableList;

/**
 * Created by hasan on 12/10/2016 AD.
 */
public class Local extends Scope {

    private boolean isBreakable;
    private Type returnValueType;
    private boolean isReturned = false;

    public boolean isReturned() {
        return isReturned;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }

    public Local(String name, Scope parent, boolean isBreakable, Type returnValueType) {
        super(name, parent);
        this.isBreakable = isBreakable;
        this.returnValueType = returnValueType;
    }

    public boolean isBreakable() {
        return isBreakable;
    }

    public Type getReturnValueType() {
        return returnValueType;
    }

    public void setReturnValueType(Type returnValueType) {
        this.returnValueType = returnValueType;
    }

    public void printTable() {
        int address = 0;
        System.out.println(Color.ANSI_BLUE + String.format("\n%s Scope Variable Symbol Table", name));
        TableList tl = new TableList(4, "Name", "Type/structure", "size", "address").withUnicode(true);
        for (Variable variable : variableList) {
            tl.addRow(variable.getName(), variable.getType().toString(), String.valueOf(variable.getType().getSize()), String.valueOf(address));
            address += variable.getType().getSize();
        }
        tl.print();
    }
}

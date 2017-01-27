package src.XParts;

import src.XParts.Types.Typedef;

/**
 * Created by hasan on 12/8/2016 AD.
 */
public class Variable {
    private String name;
    private Type type;

    public Variable(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public void setVariable(Variable variable) {
        this.name = variable.name;
        this.type = variable.type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Typedef type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}

package src.XParts;

import src.XParts.Types.Typedef;

import java.util.List;

/**
 * Created by hasan on 12/8/2016 AD.
 */
public class Function {

    private String name;
    private Type output;
    private List<Variable> inputs;
    private boolean isDefined = false;
    private Scope scope;

    public Function(String name, List<Variable> inputs, Type output) {
        this.name = name;
        this.output = output;
        this.inputs = inputs;
    }

    public Function(String name, List<Variable> inputs, Type output, boolean isDefined) {
        this.name = name;
        this.output = output;
        this.inputs = inputs;
        this.isDefined = isDefined;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getOutput() {
        return output;
    }

    public void setOutput(Typedef output) {
        this.output = output;
    }

    public List<Variable> getInputs() {
        return inputs;
    }

    public void setInputs(List<Variable> inputs) {
        this.inputs = inputs;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public String toString() {
        int index = 1;
        String inputStr = new String("");
        for (Variable input : inputs) {
            inputStr = inputStr.concat(input.getType().toString());
            if (index++ != inputs.size())
                inputStr = inputStr.concat("*");
        }
        if (inputs.isEmpty())
            inputStr = "void";
        return String.format("<%s->%s>", inputStr, output.toString());
    }

    public String toInputSign() {
        int index = 1;
        String inputStr = new String("");
        for (Variable input : inputs) {
            inputStr = inputStr.concat(input.getType().toString());
            if (index++ != inputs.size())
                inputStr = inputStr.concat("*");
        }
        if (inputs.isEmpty())
            inputStr = "void";
        return String.format("<%s>", inputStr);
    }

    public boolean isDefined() {
        return isDefined;
    }
}

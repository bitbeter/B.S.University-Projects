package src.XParts.Types;

import src.XParts.DefaultType;
import src.XParts.Type;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by hasan on 12/10/2016 AD.
 */
public class PtF implements Type {
    private List<Type> inputs;
    private Type output;

    public PtF(List<Type> inputs, Type output) {
        this.inputs = inputs;
        this.output = output;
    }

    public Type getOutputType() {
        return output;
    }

    @Override
    public void updateWithTypedef(Typedef typedef) {
        inputs.stream().forEach(input -> input.updateWithTypedef(typedef));
        output.updateWithTypedef(typedef);
    }

    @Override
    public int getSize() {
        return DefaultType.INT_SIZE;
    }

    @Override
    public String toString() {
        int index = 0;
        String structStr = new String("");
        for (Type type : inputs) {
            structStr = structStr.concat(type.toString());
            if (index++ < inputs.size() - 1)
                structStr = structStr.concat("*");
        }
        if (inputs.isEmpty())
            structStr = "void";
        return String.format("<%s->%s>", structStr, output.toString());
    }

    @Override
    public String toSign() {
        return this.toString();
    }

    @Override
    public boolean equals(Type type) {
        if (!(type instanceof PtF))
            return false;
        PtF ptF = (PtF) type;
        if (ptF.inputs.size() != this.inputs.size())
            return false;
        for (int i = 0; i < inputs.size(); i++) {
            if (inputs.get(i).castable(ptF.inputs.get(i)))
                return false;
        }
        if (ptF.output.castable(output))
            return false;
        return true;
    }

    @Override
    public boolean castable(Type type) {
        if (type.equals(DefaultType.NO_TYPE))
            return true;
        if(type instanceof Typedef)
            return castable(((Typedef)type).getType());
        if (type instanceof MultiplePossibleType)
            return type.castable(this);
        return this.equals(type);
    }

    @Override
    public Set<String> getAllUsedTypedef() {
        Set<String> res = new HashSet<String>();
        inputs.stream().forEach(input -> res.addAll(input.getAllUsedTypedef()));
        return res;
    }

    public String toInputSign() {
        int index = 0;
        String structStr = new String("");
        for (Type type : inputs) {
            structStr = structStr.concat(type.toString());
            if (index++ < inputs.size() - 1)
                structStr = structStr.concat("*");
        }
        return String.format("<%s>", structStr);
    }
}

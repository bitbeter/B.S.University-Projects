package src.XParts.Types;


import src.XParts.DefaultType;
import src.XParts.Type;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hasan on 12/11/2016 AD.
 */
public class Typedef implements Type {
    private Type type;
    private String typeName;
    private boolean isValid = false;
    private boolean isDefined = false;

    public Typedef(String typeName) {
        this.typeName = typeName;
    }

    public Typedef(Type type, String typeName, boolean isDefined, boolean isValid) {
        this.type = type;
        this.typeName = typeName;
        this.isDefined = isDefined;
        this.isValid = isValid;
    }

    public Typedef(Type type, String typeName) {
        this.type = type;
        this.typeName = typeName;
        this.isValid = true;
        this.isDefined = true;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public boolean isDefined() {
        return isDefined;
    }

    public void setDefined(boolean defined) {
        isDefined = defined;
    }

    @Override
    public int getSize() {
        if (this.type != null)
            return this.type.getSize();
        return 0;
    }

    @Override
    public String toString() {
        if (this.type != null)
            return String.format("%s", this.type.toString());
        return typeName;
    }

    @Override
    public String toSign() {
        return this.type.toSign();
    }

    @Override
    public boolean equals(Type type) {
        if (type instanceof Typedef)
            return (this.typeName.equals(((Typedef) type).typeName));
        return false;
    }

    @Override
    public boolean castable(Type type) {
        if (this.type.equals(DefaultType.NO_TYPE) || type.equals(DefaultType.NO_TYPE))
            return true;
        if (type instanceof MultiplePossibleType)
            return type.castable(this);
        if(type instanceof Typedef)
            return ((Typedef) type).getType().castable(this.getType());
        return type.castable(this.getType());
    }

    @Override
    public void updateWithTypedef(Typedef typedef) {
        if (!this.isDefined && typedef.isDefined() && this.typeName.equals(typedef.getTypeName())) {
            this.type = typedef;
        }
        this.type.updateWithTypedef(typedef);
    }

    @Override
    public Set<String> getAllUsedTypedef() {
        Set<String> res = new HashSet<String>();
        if (typeName != null)
            res.add(typeName);
        if (this.type != null)
            res.addAll(this.type.getAllUsedTypedef());
        return res;
    }

}

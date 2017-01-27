package src.XParts.Types;

import src.ErrorLogger;
import src.XParts.DefaultType;
import src.XParts.ListAttribute;
import src.XParts.Type;
import src.XParts.Types.Typedef;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by hasan on 12/10/2016 AD.
 */
public class Array implements Type {
    private List<ListAttribute> listAttributes;

    public Array(List<ListAttribute> listAttributes) {
        this.listAttributes = listAttributes;
    }

    public Type getWithName(String name) {
        for (ListAttribute listAttribute : listAttributes) {
            if (listAttribute.name != null && listAttribute.name.equals(name))
                return listAttribute.type;
        }
        return null;
    }

    public Type getWithIndex(int index) {
        if (index >= listAttributes.size())
            return null;
        return listAttributes.get(index).type;
    }

    public boolean isHomogeneous() {
        Type type = listAttributes.get(0).type;
        for (int i = 1; i < listAttributes.size(); i++) {
            if (!type.equals(listAttributes.get(i).type))
                return false;
        }
        return true;
    }

    public int getLengthOfList() {
        return listAttributes.size();
    }

    @Override
    public int getSize() {
        int size = 0;
        for (ListAttribute listAttribute : listAttributes) {
            size += listAttribute.type.getSize();
        }
        return size;
    }

    @Override
    public String toString() {
        int index = 1;
        String structStr = new String("");
        for (ListAttribute listAttribute : listAttributes) {
            if (listAttribute.name != null)
                structStr = structStr.concat(String.format("%s:", listAttribute.name));
            if (listAttribute.type instanceof Typedef)
                structStr = structStr.concat(String.format("\"%s\"", ((Typedef) listAttribute.type).getTypeName()));
            structStr = structStr.concat(listAttribute.type.toString());
            if (index++ != listAttributes.size())
                structStr = structStr.concat(",");
        }
        return String.format("[%s]", structStr);
    }

    @Override
    public String toSign() {
        int index = 1;
        String structStr = new String("");
        for (ListAttribute listAttribute : listAttributes) {
            structStr = structStr.concat(listAttribute.type.toString());
            if (index++ != listAttributes.size())
                structStr = structStr.concat(",");
        }
        return String.format("[%s]", structStr);
    }

    @Override
    public boolean equals(Type type) {
        if (!(type instanceof Array))
            return false;
        List<ListAttribute> typeListAttributes = ((Array) type).listAttributes;
        if (typeListAttributes.size() != listAttributes.size())
            return false;
        for (int i = 0; i < listAttributes.size(); i++) {
            if (!listAttributes.get(i).castable(typeListAttributes.get(i)))
                return false;
        }
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
    public void updateWithTypedef(Typedef typedef) {
        listAttributes.stream()
                .forEach(listAttribute -> listAttribute.type.updateWithTypedef(typedef));
    }

    @Override
    public Set<String> getAllUsedTypedef() {
        Set<String> res = new HashSet<String>();
        listAttributes.stream().forEach(listAttribute -> res.addAll(listAttribute.type.getAllUsedTypedef()));
        return res;
    }
}

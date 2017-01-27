package src.XParts;

import src.XParts.Types.Typedef;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hasan on 12/13/2016 AD.
 */
public class DefaultType implements Type {
    public final static int INT_SIZE = 4;
    public final static int CHAR_SIZE = 2;
    public final static int VOID_SIZE = 0;
    public final static int NIL_SIZE = 0;
    public final static int NO_TYPE_SIZE = 0;
    public final static DefaultType CHAR = new DefaultType("char", CHAR_SIZE);
    public final static DefaultType INT = new DefaultType("int", INT_SIZE);
    public final static DefaultType VOID = new DefaultType("void", VOID_SIZE);
    public final static DefaultType NIL = new DefaultType("nil", NIL_SIZE);
    public final static DefaultType NO_TYPE = new DefaultType("no_type", NO_TYPE_SIZE);

    private String typeName;
    private int size;

    private DefaultType(String typeName, int size) {
        this.typeName = typeName;
        this.size = size;
    }

    public String getTypeName() {
        return typeName;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return typeName;
    }

    @Override
    public String toSign() {
        return typeName;
    }

    @Override
    public boolean equals(Type type) {
        if (type instanceof DefaultType) {
            return typeName.equals(((DefaultType) type).typeName);
        }
        return false;
    }

    @Override
    public boolean castable(Type type) {
        if (!(type instanceof DefaultType))
            return type.castable(this);
        if (this.equals(DefaultType.NO_TYPE) || type.equals(DefaultType.NO_TYPE))
            return true;
        return this.equals(type);
    }

    @Override
    public void updateWithTypedef(Typedef typedef) {
        return;
    }

    @Override
    public Set<String> getAllUsedTypedef() {
        return new HashSet<String>();
    }
}

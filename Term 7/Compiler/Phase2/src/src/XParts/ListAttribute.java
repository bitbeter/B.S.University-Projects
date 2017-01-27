package src.XParts;

/**
 * Created by hasan on 12/12/2016 AD.
 */
public class ListAttribute {
    public String name;
    public Type type;

    public ListAttribute(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public boolean castable(ListAttribute listAttribute) {
        return this.type.castable(listAttribute.type);
    }
}

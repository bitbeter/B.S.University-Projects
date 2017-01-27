package src.XParts.Types;

import src.XParts.DefaultType;
import src.XParts.Type;
import src.XParts.Types.Typedef;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hasan on 12/13/2016 AD.
 */
public class MultiplePossibleType implements Type {
    public Set<Type> allPossibleTypes;

    public MultiplePossibleType(Set<Type> allPossibleTypes) {
        this.allPossibleTypes = allPossibleTypes;
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public String toString() {
        String possibleChoices = "";
        int index = 0;
        for (Type allPossibleType : allPossibleTypes) {
            possibleChoices = possibleChoices.concat(allPossibleType.toString());
            if (index++ < allPossibleTypes.size() - 1)
                possibleChoices = possibleChoices.concat(" - ");
        }
        return possibleChoices;
    }

    @Override
    public String toSign() {
        return toString();
    }

    @Override
    public boolean equals(Type type) {
        for (Type allPossibleType : allPossibleTypes) {
            if (type.equals(allPossibleType))
                return true;
        }
        return false;
    }

    @Override
    public boolean castable(Type type) {
        if (type.equals(DefaultType.NO_TYPE))
            return true;
        for (Type allPossibleType : allPossibleTypes) {
            if (type.castable(allPossibleType))
                return true;
        }
        return false;
    }

    @Override
    public void updateWithTypedef(Typedef typedef) {
        return;
    }

    @Override
    public Set<String> getAllUsedTypedef() {
        Set<String> res = new HashSet<String>();
        allPossibleTypes.stream().forEach(type -> res.addAll(type.getAllUsedTypedef()));
        return res;
    }
}

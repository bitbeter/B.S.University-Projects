package src.XParts.Accesses;

import org.antlr.v4.runtime.misc.Interval;
import src.XParts.Access;
import src.XParts.DefaultType;
import src.XParts.Types.MultiplePossibleType;
import src.XParts.Type;
import src.XParts.Types.Array;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by hasan on 12/14/2016 AD.
 */
public class ListAttributeNameAccess extends Access {
    String listAttributeName;

    public ListAttributeNameAccess(Interval sourceInterval, String listAttributeName) {
        super(sourceInterval);
        this.listAttributeName = listAttributeName;
    }

    @Override
    public Type prune(Type type) {
        Type multiplePossibleType = multiplePossibleTypePruning(type);
        if (multiplePossibleType != null) return multiplePossibleType;
        if (!(type instanceof Array)) {
            errorLogger.error(sourceInterval, "list.needed.for.index.access");
            return DefaultType.NO_TYPE;
        }
        if (((Array) type).getWithName(listAttributeName) == null) {
            errorLogger.error(sourceInterval, "name.of.attribute.is.not.found.in.List", listAttributeName);
            return DefaultType.NO_TYPE;
        }
        return finalPrune((Array) type);
    }

    private Type multiplePossibleTypePruning(Type type) {
        if (type instanceof MultiplePossibleType) {
            MultiplePossibleType multiplePossibleType = (MultiplePossibleType) type;
            multiplePossibleType.allPossibleTypes.removeAll(
                    multiplePossibleType.allPossibleTypes.stream()
                            .filter(possibleType -> !(possibleType instanceof Array))
                            .collect(Collectors.toList())
            );
            if (multiplePossibleType.allPossibleTypes.size() == 0) {
                errorLogger.error(sourceInterval, "list.needed.for.index.access");
                return DefaultType.NO_TYPE;
            }
            multiplePossibleType.allPossibleTypes.removeAll(
                    multiplePossibleType.allPossibleTypes.stream()
                            .filter(possibleType -> ((Array) possibleType).getWithName(listAttributeName) == null)
                            .collect(Collectors.toList())
            );
            if (multiplePossibleType.allPossibleTypes.size() > 0) {
                return new MultiplePossibleType(
                        multiplePossibleType.allPossibleTypes.stream().map(t -> finalPrune((Array) t)).collect(Collectors.toSet())
                );
            }
            errorLogger.error(sourceInterval, "name.of.attribute.is.not.found.in.List", listAttributeName);
            return DefaultType.NO_TYPE;
        }
        return null;
    }

    private Type finalPrune(Array array) {
        return array.getWithName(listAttributeName);
    }
}

package src.XParts.Accesses;

import org.antlr.v4.runtime.misc.Interval;
import src.XParts.Access;
import src.XParts.DefaultType;
import src.XParts.Types.MultiplePossibleType;
import src.XParts.Type;
import src.XParts.Types.Array;
import src.XParts.Types.PtF;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by hasan on 12/14/2016 AD.
 */
public class IndexAccess extends Access {
    Integer indexAccessByConstant;
    String indexAccessByIdentifier;

    public IndexAccess(Interval sourceInterval, String indexAccessByIdentifier) {
        super(sourceInterval);
        this.indexAccessByIdentifier = indexAccessByIdentifier;
    }

    public IndexAccess(Interval sourceInterval, Integer indexAccessByConstant) {
        super(sourceInterval);
        this.indexAccessByConstant = indexAccessByConstant;
    }

    @Override
    public Type prune(Type type) {
        if (indexAccessByConstant != null && indexAccessByConstant < 0) {
            errorLogger.error(sourceInterval, "out.of.bound.list.access");
            return DefaultType.NO_TYPE;
        }
        Type multiplePossibleType = multiplePossibleTypePruning(type);
        if (multiplePossibleType != null) return multiplePossibleType;
        if (!(type instanceof Array)) {
            errorLogger.error(sourceInterval, "list.needed.for.index.access");
            return DefaultType.NO_TYPE;
        }
        if (indexAccessByConstant != null) {
            if (((Array) type).getLengthOfList() <= indexAccessByConstant) {
                errorLogger.error(sourceInterval, "out.of.bound.list.access");
                return DefaultType.NO_TYPE;
            }
        } else {
            if (!((Array) type).isHomogeneous()) {
                errorLogger.error(sourceInterval, "homogeneous.list.needed.for.not.constant.index.access");
                return DefaultType.NO_TYPE;
            }
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
            if (indexAccessByConstant != null) {
                multiplePossibleType.allPossibleTypes.removeAll(
                        multiplePossibleType.allPossibleTypes.stream()
                                .filter(possibleType -> ((Array) possibleType).getLengthOfList() <= indexAccessByConstant)
                                .collect(Collectors.toList())
                );
            } else {
                multiplePossibleType.allPossibleTypes.removeAll(
                        multiplePossibleType.allPossibleTypes.stream()
                                .filter(possibleType -> !((Array) possibleType).isHomogeneous())
                                .collect(Collectors.toList())
                );
            }
            if (multiplePossibleType.allPossibleTypes.size() > 0) {
                return new MultiplePossibleType(
                        multiplePossibleType.allPossibleTypes.stream().map(t -> finalPrune((Array) t)).collect(Collectors.toSet())
                );
            }
            if (indexAccessByConstant != null) {
                errorLogger.error(sourceInterval, "out.of.bound.list.access");
                return DefaultType.NO_TYPE;
            } else {
                errorLogger.error(sourceInterval, "homogeneous.list.needed.for.not.constant.index.access");
                return DefaultType.NO_TYPE;
            }

        }
        return null;
    }

    private Type finalPrune(Array array) {
        if (indexAccessByConstant != null) {
            return array.getWithIndex(indexAccessByConstant);
        } else {
            return array.getWithIndex(0);
        }
    }
}

package src.XParts.Accesses;

import org.antlr.v4.runtime.misc.Interval;
import src.XParts.*;
import src.XParts.Types.MultiplePossibleType;
import src.XParts.Types.PtF;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by hasan on 12/14/2016 AD.
 */
public class FunctionAccess extends Access {
    PtF function;

    public FunctionAccess(Interval sourceInterval, PtF function) {
        super(sourceInterval);
        this.function = function;
    }

    @Override
    public Type prune(Type type) {
        Type multiplePossibleType = multiplePossibleTypePruning(type);
        if (multiplePossibleType != null) return multiplePossibleType;
        if (!(type instanceof PtF)) {
            errorLogger.error(sourceInterval, "PtF.needed.for.function.call.here", function.toInputSign());
            return DefaultType.NO_TYPE;
        }
        if (!((PtF) type).toInputSign().equals(function.toInputSign())) {
            errorLogger.error(sourceInterval, "PtF.needed.for.function.call.here", function.toInputSign());
            return DefaultType.NO_TYPE;
        }
        return finalPrune((PtF) type);
    }

    private Type multiplePossibleTypePruning(Type type) {
        if (type instanceof MultiplePossibleType) {
            MultiplePossibleType multiplePossibleType = (MultiplePossibleType) type;
            multiplePossibleType.allPossibleTypes.removeAll(
                    multiplePossibleType.allPossibleTypes.stream()
                            .filter(possibleType -> !(possibleType instanceof PtF))
                            .collect(Collectors.toList())
            );
            multiplePossibleType.allPossibleTypes.removeAll(
                    multiplePossibleType.allPossibleTypes.stream()
                            .filter(possibleType -> !((PtF) possibleType).toInputSign().equals(function.toInputSign()))
                            .collect(Collectors.toList())
            );
            if (multiplePossibleType.allPossibleTypes.size() > 0) {
                return new MultiplePossibleType(
                        multiplePossibleType.allPossibleTypes.stream().map(t -> finalPrune((PtF) t)).collect(Collectors.toSet())
                );
            }
            errorLogger.error(sourceInterval, "PtF.needed.for.function.call.here", function.toInputSign());
            return DefaultType.NO_TYPE;
        }
        return null;
    }

    private Type finalPrune(PtF ptF) {
        return ptF.getOutputType();
    }
}

package src.XParts;

import org.antlr.v4.runtime.misc.Interval;
import src.ErrorLogger;

/**
 * Created by hasan on 12/13/2016 AD.
 */
public abstract class Access {
    public static ErrorLogger errorLogger = new ErrorLogger();
    protected Interval sourceInterval;

    public Access(Interval sourceInterval){
        this.sourceInterval = sourceInterval;
    }

    public abstract Type prune(Type type);
}

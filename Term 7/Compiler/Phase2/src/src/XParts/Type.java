package src.XParts;

import src.XParts.Types.Typedef;

import java.util.Set;

/**
 * Created by hasan on 12/8/2016 AD.
 */
public interface Type {

    public int getSize();

    public String toString();

    public String toSign();

    public boolean equals(Type type);

    public boolean castable(Type type);

    public void updateWithTypedef(Typedef typedef);

    public Set<String> getAllUsedTypedef();

}

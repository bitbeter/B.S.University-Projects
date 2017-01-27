package src.XParts;

import src.ErrorLogger;
import src.XParts.Types.PtF;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hasan on 12/8/2016 AD.
 */
public abstract class Scope {
    public static ErrorLogger errorLogger = new ErrorLogger();

    protected String name;
    protected Scope parent;
    public List<Scope> children = new ArrayList<Scope>();
    public List<Variable> variableList = new ArrayList<Variable>();

    public Scope(String name, Scope parent) {
        this.name = name;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    // @TODO : extra!!!
    public List<Variable> findAllPossibleVariables(String variableName){
        List<Variable> possibleVariable = new ArrayList<Variable>();
        for (Variable variable : variableList) {
            if(variable.getName().equals(variableName))
                possibleVariable.add(variable);
        }
        if(parent != null && possibleVariable.size() == 0){
            List<Variable> parentPossibleVariables = parent.findAllPossibleVariables(variableName);
            if(!parentPossibleVariables.isEmpty())
                possibleVariable.addAll(parentPossibleVariables);
        }
        return possibleVariable;
    }

    public Variable findFirstVariable(String s){
        int index = 0;
        for (Variable variable : variableList) {
            if (variable.getName().equals(s))
                return variableList.get(index);
            index++;
        }
        return null;
    }

    public Variable findPtFVariable(String s , String inputSignature){
        int index = 0;
        for (Variable variable : variableList) {
            if (variable.getName().equals(s) && (variable.getType() instanceof PtF)){
                if(((PtF)variable.getType()).toInputSign().equals(inputSignature))
                    return variableList.get(index);
            }
            index++;
        }
        return null;
    }

    public void print() {
        printTable();
        children.forEach(Scope::print);
    }

    protected abstract void printTable();

}
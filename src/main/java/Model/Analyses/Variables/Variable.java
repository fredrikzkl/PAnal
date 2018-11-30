package Model.Analyses.Variables;

public interface Variable<T> {
    public T getVariable();
    public boolean variableEquals(Variable variable);
}

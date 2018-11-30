package Model.Analyses;

import Model.Analyses.Variables.Variable;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Result {
    private List<Variable> variables;

    public Result() {
        this(new ArrayList<>());
    }

    public Result(List<Variable> variables) {
        this.variables = variables;
    }

    public Result(Result result) {
        this.variables = new ArrayList<>(result.getVariables());
    }

    public List<Variable> getVariables() {
        return variables;
    }

    public void addResult(Result other) {
        for (Variable variable : other.getVariables()) {
            if (!this.variables.contains(variable))
                this.variables.add(variable);
        }
    }

    public void addVariable(Variable variable) {
        variables.add(variable);
    }

    public boolean removeVariable(Variable variable) {
        return variables.remove(variable);
    }

    public void clearVariables() {
        this.variables.clear();
    }

    public boolean isSubsetOf(Result other) {
        return CollectionUtils.containsAll(other.getVariables(), this.variables);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return CollectionUtils.isEqualCollection(this.variables, result.variables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variables);
    }

    @Override
    public String toString() {
        return "{" + variables.stream().map(Object::toString).collect(Collectors.joining(", ")) + "}";
    }
}

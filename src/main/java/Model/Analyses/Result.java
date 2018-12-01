package Model.Analyses;

import Model.Analyses.Variables.Variable;
import org.apache.commons.collections4.CollectionUtils;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Result {
    private Set<Variable> variables;

    public Result() {
        this(new HashSet<>());
    }

    public Result(Set<Variable> variables) {
        this.variables = variables;
    }

    public Set<Variable> getVariables() {
        return variables;
    }

    public void addResult(Result other) {
        this.variables.addAll(other.getVariables());
    }

    public void intersectResult(Result other) {
        this.variables.retainAll(other.getVariables());
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

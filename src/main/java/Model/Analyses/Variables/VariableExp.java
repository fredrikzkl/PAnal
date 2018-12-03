package Model.Analyses.Variables;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Objects;
import java.util.Set;

public class VariableExp implements Variable<Set<String>> {
    private Set<String> variables;
    private String expression;

    public VariableExp(Set<String> variables, String expression) {
        this.variables = variables;
        this.expression = expression;
    }

    @Override
    public Set<String> getVariable() {
        return variables;
    }

    public String getExpression() {
        return expression;
    }

    @Override
    public boolean variableEquals(Variable variable) {
        return variable instanceof VariableExp &&
                CollectionUtils.containsAny(this.variables, ((VariableExp) variable).variables);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VariableExp that = (VariableExp) o;
        return Objects.equals(variables, that.variables) &&
                Objects.equals(expression, that.expression);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variables, expression);
    }

    @Override
    public String toString() {
        return "(" + expression + ")";
    }
}

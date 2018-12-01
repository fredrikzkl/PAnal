package Model.Analyses.Variables;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Objects;
import java.util.Set;

public class VariableAE implements Variable<Set<String>> {
    private Set<String> variables;
    private String expression;

    public VariableAE(Set<String> variables, String expression) {
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
        return variable instanceof VariableAE &&
                CollectionUtils.containsAny(this.variables, ((VariableAE) variable).variables);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VariableAE that = (VariableAE) o;
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

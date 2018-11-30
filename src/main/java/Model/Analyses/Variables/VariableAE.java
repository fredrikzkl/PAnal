package Model.Analyses.Variables;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.Objects;

public class VariableAE implements Variable<List<String>> {
    private List<String> variables;
    private String expression;

    public VariableAE(List<String> variables, String expression) {
        this.variables = variables;
        this.expression = expression;
    }

    @Override
    public List<String> getVariable() {
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

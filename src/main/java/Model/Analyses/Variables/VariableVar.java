package Model.Analyses.Variables;

import java.util.Objects;

public class VariableVar implements Variable<String> {
    private String variable;

    public VariableVar(String variable) {
        this.variable = variable;
    }

    public String getVariable() {
        return variable;
    }

    @Override
    public boolean variableEquals(Variable LVVariable) {
        return this.variable != null && this.variable.equals(LVVariable.getVariable());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VariableVar rdResult = (VariableVar) o;
        if (variable == null) {
            System.out.println();
        }
        return variable.equals(rdResult.variable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variable);
    }

    @Override
    public String toString() {
        return "(" + this.variable + ")";
    }
}

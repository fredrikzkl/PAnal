package Model.Analyses.Variables;

import java.util.Objects;

public class VariableLV implements Variable {
    private String variable;

    public VariableLV(String variable) {
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
        VariableLV rdResult = (VariableLV) o;
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

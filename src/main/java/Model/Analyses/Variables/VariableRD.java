package Model.Analyses.Variables;

import java.util.Objects;

public class VariableRD implements Variable {
    private String variable;
    private int nodeId;

    public VariableRD(String variable, int id) {
        this.variable = variable;
        this.nodeId = id;
    }

    public String getVariable() {
        return variable;
    }

    public int getNodeId() {
        return nodeId;
    }

    @Override
    public boolean variableEquals(Variable rdVariable) {
        return this.variable != null && this.variable.equals(rdVariable.getVariable());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VariableRD rdResult = (VariableRD) o;
        return nodeId == rdResult.nodeId &&
                variable.equals(rdResult.variable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(variable, nodeId);
    }

    @Override
    public String toString() {
        return "(" + this.variable + ", " + this.nodeId + ")";
    }
}

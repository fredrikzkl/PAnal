package Model.AST;

public class Variable extends Node {
    private String variable;

    public Variable(String variable) {
        this.variable = variable;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    @Override
    public String getType() {
        return this.variable;
    }

    @Override
    public String toString() {
        return this.variable;
    }
}

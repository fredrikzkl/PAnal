package Model.AST;

public class Statement extends Node {
    private StatementType statementType;

    public Statement(StatementType statementType) {
        this.statementType = statementType;
    }

    public StatementType getStatementType() {
        return statementType;
    }

    public void setStatementType(StatementType statementType) {
        this.statementType = statementType;
    }

    @Override
    public String getType() {
        return this.statementType.toString();
    }

    @Override
    public String toString() {
        switch (this.statementType) {
            case ASSIGN:
                return this.getEdges().get(0).toString() + " := " + this.getEdges().get(1).toString();
            case READ:
            case WRITE:
                return this.statementType.toString().toLowerCase() + " " + this.getEdges().get(0).toString();
            case DECLARATION:
                return this.getEdges().get(0).toString() + " " + this.getEdges().get(1).toString();
            default:
                return "";
        }
    }

    public enum StatementType {
        ASSIGN,
        IF,
        ELSE,
        WHILE,
        READ,
        WRITE,
        DECLARATION,
        BRANCH
    }
}

package Model;

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
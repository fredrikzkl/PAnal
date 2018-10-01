package Model.AST;

public class BinaryOp extends Node {
    private BinaryOperator binaryOperator;

    public BinaryOp(BinaryOperator binaryOperator) {
        this.binaryOperator = binaryOperator;
    }

    public BinaryOperator getBinaryOperator() {
        return binaryOperator;
    }

    public void setBinaryOperator(BinaryOperator binaryOperator) {
        this.binaryOperator = binaryOperator;
    }

    @Override
    public String getType() {
        return this.binaryOperator.toString();
    }

    @Override
    public String toString() {
        return this.getEdges().get(0).toString() + this.mapType() + this.getEdges().get(1).toString();
    }

    private String mapType() {
        switch (this.binaryOperator) {
            case PLUS:
                return "+";
            case MINUS:
                return "-";
            case MULTIPLY:
                return "*";
            case DIVIDE:
                return "/";
            case MODULO:
                return "%";
            case LESSTHEN:
                return "<";
            case GREATERTHEN:
                return ">";
            case LESSTHENOREQUAL:
                return "<=";
            case GREATERTHENOREQUAL:
                return ">=";
            case EQUAL:
                return "==";
            case NOTEQUAL:
                return "!=";
            case NOT:
                return "!";
            case AND:
                return "&";
            case OR:
                return "|";
            default:
                return "--SYMBOL NOT FOUND--"
        }

    }

    public enum BinaryOperator {
        PLUS,
        MINUS,
        MULTIPLY,
        DIVIDE,
        MODULO,
        LESSTHEN,
        GREATERTHEN,
        LESSTHENOREQUAL,
        GREATERTHENOREQUAL,
        EQUAL,
        NOTEQUAL,
        NOT,
        AND,
        OR
    }
}

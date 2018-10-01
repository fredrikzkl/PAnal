package Model;

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

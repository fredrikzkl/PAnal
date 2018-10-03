package Model.AST;

public class Declaration extends Node {
    private DeclarationType declarationType;

    public Declaration(DeclarationType declarationType) {
        this.declarationType = declarationType;
    }

    public DeclarationType getDeclarationType() {
        return declarationType;
    }

    public void setDeclarationType(DeclarationType declarationType) {
        this.declarationType = declarationType;
    }

    @Override
    public String getType() {
        return this.declarationType.toString();
    }

    @Override
    public String toString() {
        switch (this.declarationType) {
            case INT:
                return "int";
            case ARRAY:
                return "int[]";
            case RECORD:
                return "{int fst; int snd}";
            default:
                return "";
        }
    }

    public enum DeclarationType {
        INT,
        ARRAY,
        RECORD
    }
}

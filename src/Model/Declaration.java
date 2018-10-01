package Model;

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

    public enum DeclarationType {
        INT,
        ARRAY,
        RECORD
    }
}

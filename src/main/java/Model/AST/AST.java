package Model.AST;

public class AST {
    public MCProgram program;

    public AST() {
    }

    public AST(MCProgram program) {
        this.program = program;
    }

    public MCProgram getProgram() {
        return program;
    }
}

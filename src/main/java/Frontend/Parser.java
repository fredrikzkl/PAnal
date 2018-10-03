package Frontend;

import Model.AST.Node;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    private String program;

    public Parser(String program) {
        this.program = program;
    }

    public Node parse() {
        if (this.program == null) {
            throw new IllegalArgumentException("Program not initialized");
        }
        if (!this.program.startsWith("{") || !this.program.endsWith("}")) {
            throw new IllegalArgumentException("Program not formatted properly");
        }

        String[] lines = this.program.split("\n");

        System.out.println(lines);




        Node root = new Node();

        return root;
    }
}

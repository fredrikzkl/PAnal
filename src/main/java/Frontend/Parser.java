package Frontend;

import Model.AST.Node;
import antlr.MicroCLexer;
import antlr.MicroCParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;

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

        System.out.println(Arrays.toString(lines));

        return new Node();
    }

    public static void parse(String filename) throws ParseException, IOException {
        CharStream input = CharStreams.fromFileName(filename);
        MicroCLexer lexer = new MicroCLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MicroCParser microCParser = new MicroCParser(tokens);
        ParseTree parseTree = microCParser.program();
        if (microCParser.getNumberOfSyntaxErrors() > 0)
            throw new ParseException("Found more than 0 syntax errors", microCParser.getNumberOfSyntaxErrors());

    }
}

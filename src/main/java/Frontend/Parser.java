package Frontend;

import Model.Flowgraph.FlowNode;
import antlr.MicroCLexer;
import antlr.MicroCParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.text.ParseException;

public class Parser {
    public static FlowNode parse(String filename) throws ParseException, IOException {
        CharStream input = CharStreams.fromFileName(filename);
        MicroCLexer lexer = new MicroCLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MicroCParser microCParser = new MicroCParser(tokens);
        MicroCParser.ProgramContext parseTree = microCParser.program();
        if (microCParser.getNumberOfSyntaxErrors() > 0)
            throw new ParseException("Found more than 0 syntax errors", microCParser.getNumberOfSyntaxErrors());
        FlowNodeVisitor visitor = new FlowNodeVisitor();
        return visitor.visitProgram(parseTree);
    }
}

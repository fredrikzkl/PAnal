import Frontend.Parser;
import Model.Flowgraph.FlowNode;

import java.io.IOException;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        String filename = System.getProperty("user.dir") + "/src/main/resources/exampleProgram1.txt";
        FlowNode flowNode = Parser.parse(filename);
        System.out.println(flowNode.deepToString());
    }
}

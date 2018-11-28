import Frontend.Parser;
import Model.Flowgraph.FlowNode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        String directory = System.getProperty("user.dir") + "/src/main/resources/";
        for (Path file : Files.walk(Paths.get(directory)).filter(Files::isRegularFile).collect(Collectors.toList())) {
            FlowNode flowNode = Parser.parse(file.toString());
            System.out.println(flowNode.deepToString());
        }
    }
}

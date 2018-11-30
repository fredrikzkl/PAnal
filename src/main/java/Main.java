import Analyses.Analysis;
import Analyses.Modules.ModuleLV;
import Analyses.Modules.ModuleRD;
import Frontend.Parser;
import Model.Analyses.Worklist.WorklistFIFO;
import Model.Flowgraph.FlowNode;

import java.io.IOException;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        String directory = System.getProperty("user.dir") + "/src/main/resources/";
        FlowNode flowNode = Parser.parse(directory + "exampleProgram4.txt");
        //RDAnalysis.reachingDefinitions(flowNode);
        //Analysis.worklistAnalysis(flowNode, new ModuleRD(), new WorklistFIFO());
        Analysis.worklistAnalysis(flowNode, new ModuleLV(), new WorklistFIFO());
        //for (Path file : Files.walk(Paths.get(directory)).filter(Files::isRegularFile).collect(Collectors.toList())) {
        //    FlowNode flowNode = Parser.parse(file.toString());
        //    System.out.println(flowNode.deepToString());
        //}
    }
}

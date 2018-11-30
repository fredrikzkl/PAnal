import Analyses.Analysis;
import Analyses.Modules.ModuleAE;
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
        Analysis.worklistAnalysis(flowNode, new ModuleLV(), new WorklistFIFO());
    }
}

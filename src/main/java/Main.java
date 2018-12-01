import Analyses.Analysis;
import Analyses.Modules.ModuleLV;
import Frontend.Parser;
import Model.Analyses.WorkList.WorkListFIFO;
import Model.Flowgraph.FlowNode;

import java.io.IOException;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        String directory = System.getProperty("user.dir") + "/src/main/resources/";
        FlowNode flowNode = Parser.parse(directory + "exampleProgram4.txt");
        Analysis.workListAnalysis(flowNode, new ModuleLV(), new WorkListFIFO());
    }
}

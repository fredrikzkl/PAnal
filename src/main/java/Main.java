import Analyses.Analysis;
import Analyses.Modules.*;
import Frontend.Parser;
import Model.Analyses.WorkList.*;
import Model.Flowgraph.FlowNode;

import java.io.IOException;
import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
        String directory = System.getProperty("user.dir") + "/src/main/resources/";
        FlowNode flowNode = Parser.parse(directory + "exampleProgram1.txt");
        Analysis.workListAnalysis(flowNode, new ModuleDV(), new WorkListFIFO());
    }
}

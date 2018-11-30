package Analyses;

import Analyses.Modules.Module;
import Model.Analyses.Result;
import Model.Analyses.Worklist.Worklist;
import Model.Analyses.Worklist.WorklistElement;
import Model.Analyses.Worklist.WorklistFIFO;
import Model.Flowgraph.FlowNode;

import java.util.Arrays;
import java.util.List;

public class Analysis {
    public static void worklistAnalysis(FlowNode flowGraph, Module analysisModule, Worklist worklist) {
        List<FlowNode> allNodes = flowGraph.getAllFlowNodes();
        Result[] in = new Result[allNodes.size()];
        Result[] out = new Result[allNodes.size()];
        for (int i = 0; i < in.length; i++) {
            in[i] = new Result();
            out[i] = new Result();
        }
        analysisModule.setInitial(flowGraph, in);
        analysisModule.populateWorklist(flowGraph, worklist);

        while (!worklist.empty()) {
            WorklistElement worklistElement = worklist.extract();
            FlowNode first = worklistElement.getFirst();
            FlowNode second = worklistElement.getSecond();

            Result newOut = analysisModule.generateNewOut(first, in[first.getId()]);
            out[first.getId()] = newOut;

            Result otherIn = in[second.getId()];
            if (!newOut.isSubsetOf(otherIn)) {
                analysisModule.join(otherIn, newOut);
                for (FlowNode child : analysisModule.getChildren(second)) {
                    worklist.insert(new WorklistElement(second, child));
                }
            }
        }
        //FlowNode lastFlowNode = allNodes.get(allNodes.size() - 1);
        //out[allNodes.size() - 1] = analysisModule.generateNewOut(lastFlowNode, in[lastFlowNode.getId()]);
        System.out.println("----------------------------");
        Arrays.stream(in).forEach(System.out::println);
        System.out.println("----------------------------");
        Arrays.stream(out).forEach(System.out::println);
    }
}

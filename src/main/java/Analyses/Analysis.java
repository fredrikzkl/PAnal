package Analyses;

import Analyses.Modules.Module;
import Model.Analyses.Result;
import Model.Analyses.WorkList.WorkList;
import Model.Analyses.WorkList.WorkListElement;
import Model.Flowgraph.FlowNode;

import java.util.Arrays;
import java.util.List;

public class Analysis {
    public static void workListAnalysis(FlowNode flowGraph, Module analysisModule, WorkList workList) {
        List<FlowNode> allNodes = flowGraph.getAllFlowNodes();
        Result[] in = new Result[allNodes.size()];
        Result[] out = new Result[allNodes.size()];
        for (int i = 0; i < in.length; i++) {
            in[i] = new Result();
            out[i] = new Result();
        }
        analysisModule.setInitial(flowGraph, in);
        analysisModule.populateWorkList(flowGraph, workList);

        while (!workList.empty()) {
            WorkListElement workListElement = workList.extract();
            FlowNode first = workListElement.getFirst();
            FlowNode second = workListElement.getSecond();

            Result newOut = analysisModule.generateNewOut(first, in[first.getId()]);
            out[first.getId()] = newOut;

            Result otherIn = in[second.getId()];
            if (!newOut.isSubsetOf(otherIn)) {
                analysisModule.join(otherIn, newOut);
                for (FlowNode child : analysisModule.getChildren(second)) {
                    workList.insert(new WorkListElement(second, child));
                }
            }
        }
        FlowNode lastFlowNode = allNodes.get(allNodes.size() - 1);
        out[allNodes.size() - 1] = analysisModule.generateNewOut(lastFlowNode, in[lastFlowNode.getId()]);
        System.out.println("----------------------------");
        Arrays.stream(in).forEach(System.out::println);
        System.out.println("----------------------------");
        Arrays.stream(out).forEach(System.out::println);
    }
}

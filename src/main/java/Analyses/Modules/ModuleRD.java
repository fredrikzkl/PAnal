package Analyses.Modules;

import Model.Analyses.Variables.VariableRD;
import Model.Analyses.Result;
import Model.Analyses.Variables.Variable;
import Model.Analyses.WorkList.WorkList;
import Model.Flowgraph.FlowNode;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ModuleRD extends Module {
    @Override
    public void setInitial(FlowNode flowGraph, Result[] results) {
        Result initial = new Result(flowGraph.getAllUniqueVariables().stream()
                .map(fnVariable -> new VariableRD(fnVariable.getName(), -1))
                .collect(Collectors.toSet()));
        results[0] = initial;
    }

    @Override
    public void populateWorkList(FlowNode flowGraph, WorkList workList) {
        flowGraph.getWorkList().forEach(workList::insert);
    }

    @Override
    public List<FlowNode> getChildren(FlowNode flowNode) {
        return flowNode.getChildren();
    }

    @Override
    public Set<Variable> gen(FlowNode flowNode) {
        return flowNode.getWriteVariables().stream()
                .map(v -> new VariableRD(v.getName(), flowNode.getId()))
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Variable> kill(FlowNode flowNode) {
        return flowNode.getWriteVariables().stream()
                .map(fnVariable -> new VariableRD(fnVariable.getName(), -1))
                .collect(Collectors.toSet());
    }

    @Override
    public Result join(Result in, Result out) {
        in.addResult(out);
        return in;
    }
}

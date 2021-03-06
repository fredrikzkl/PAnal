package Analyses.Modules;

import Model.Analyses.Result;
import Model.Analyses.Variables.Variable;
import Model.Analyses.Variables.VariableVar;
import Model.Analyses.WorkList.WorkList;
import Model.Flowgraph.FlowNode;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ModuleLV extends Module {
    @Override
    public void setInitial(FlowNode flowGraph, Result[] results) { }

    @Override
    public void populateWorkList(FlowNode flowGraph, WorkList workList) {
        flowGraph.getReversedWorkList().forEach(workList::insert);
    }

    @Override
    public List<FlowNode> getChildren(FlowNode flowNode) {
        return flowNode.getParents();
    }

    @Override
    Set<Variable> gen(FlowNode flowNode) {
        return flowNode.getReadVariables().stream()
                .filter(fnVariable -> !fnVariable.isConstant())
                .map(fnVariable -> new VariableVar(fnVariable.getName()))
                .collect(Collectors.toSet());
    }

    @Override
    Set<Variable> kill(FlowNode flowNode) {
        return flowNode.getWriteVariables().stream()
                .map(fnVariable -> new VariableVar(fnVariable.getName()))
                .collect(Collectors.toSet());
    }

    @Override
    public Result join(Result in, Result out) {
        in.addResult(out);
        return in;
    }
}

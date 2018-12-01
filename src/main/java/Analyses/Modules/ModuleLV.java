package Analyses.Modules;

import Model.Analyses.Result;
import Model.Analyses.Variables.Variable;
import Model.Analyses.Variables.VariableLV;
import Model.Analyses.WorkList.WorkList;
import Model.Flowgraph.FlowNode;

import java.util.List;
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
    List<Variable> gen(FlowNode flowNode) {
        return flowNode.getReadVariables().stream()
                .filter(fnVariable -> !fnVariable.isConstant())
                .map(fnVariable -> new VariableLV(fnVariable.getName()))
                .collect(Collectors.toList());
    }

    @Override
    List<Variable> kill(FlowNode flowNode) {
        return flowNode.getWriteVariables().stream()
                .map(fnVariable -> new VariableLV(fnVariable.getName()))
                .collect(Collectors.toList());
    }

    @Override
    public Result join(Result in, Result out) {
        in.addResult(out);
        return in;
    }
}

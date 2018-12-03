package Analyses.Modules;

import Model.Analyses.Result;
import Model.Analyses.Variables.Variable;
import Model.Analyses.WorkList.WorkList;
import Model.Flowgraph.FlowNode;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public abstract class Module {
    public abstract void setInitial(FlowNode flowGraph, Result[] results);

    public abstract void populateWorkList(FlowNode flowGraph, WorkList workList);

    public abstract List<FlowNode> getChildren(FlowNode flowNode);

    abstract Set<Variable> gen(FlowNode flowNode);

    abstract Set<Variable> kill(FlowNode flowNode);

    public abstract Result join(Result in, Result out);

    public Result generateNewOut(FlowNode node, Result in) {
        Set<Variable> variables = this.gen(node);
        variables.addAll(in.getVariables().stream()
                .filter(variable -> this.kill(node).stream()
                        .noneMatch(variable::variableEquals))
                .collect(Collectors.toList()));
        return new Result(variables);
    }

    public Result fillFinal(FlowNode finalFlowNode, Result in) {
        return null;
    }
}

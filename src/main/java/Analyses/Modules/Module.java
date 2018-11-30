package Analyses.Modules;

import Model.Analyses.Result;
import Model.Analyses.Variables.Variable;
import Model.Analyses.Worklist.Worklist;
import Model.Flowgraph.FlowNode;

import java.util.List;
import java.util.stream.Collectors;

public abstract class Module {
    public abstract void setInitial(FlowNode flowGraph, Result[] results);

    public abstract void populateWorklist(FlowNode flowGraph, Worklist worklist);

    public abstract List<FlowNode> getChildren(FlowNode flowNode);

    abstract List<Variable> gen(FlowNode flowNode);

    abstract List<Variable> kill(FlowNode flowNode);

    public Result generateNewOut(FlowNode node, Result in) {
        List<Variable> variables = this.gen(node);
        System.out.println((node.getId() + 1) + " :: gen :: " + variables);
        System.out.println((node.getId() + 1) + " :: gen :: " + this.kill(node));
        variables.addAll(in.getVariables().stream()
                .filter(variable -> this.kill(node).stream()
                        .noneMatch(variable::variableEquals))
                .collect(Collectors.toList()));
        return new Result(variables);
    }
}

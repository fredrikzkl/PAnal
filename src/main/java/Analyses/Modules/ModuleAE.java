package Analyses.Modules;

import Model.Analyses.Result;
import Model.Analyses.Variables.Variable;
import Model.Analyses.Variables.VariableAE;
import Model.Analyses.Worklist.Worklist;
import Model.Flowgraph.FNVariable;
import Model.Flowgraph.FlowNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ModuleAE extends Module {
    @Override
    public void setInitial(FlowNode flowGraph, Result[] results) { }

    @Override
    public void populateWorklist(FlowNode flowGraph, Worklist worklist) {
        flowGraph.getWorklist().forEach(worklist::insert);
    }

    @Override
    public List<FlowNode> getChildren(FlowNode flowNode) {
        return flowNode.getChildren();
    }

    @Override
    List<Variable> gen(FlowNode flowNode) {
        List<String> variables = flowNode.getReadVariables().stream()
                .filter(fnVariable -> !fnVariable.getType().equals(FNVariable.Type.CONSTANT)
                        && flowNode.getWriteVariables().stream().
                        noneMatch(innerFNV -> fnVariable.getName().equals(innerFNV.getName())))
                .map(FNVariable::getName)
                .collect(Collectors.toList());
        return this.createVariables(variables);
    }

    @Override
    List<Variable> kill(FlowNode flowNode) {
        List<String> variables = flowNode.getWriteVariables().stream()
                .map(FNVariable::getName)
                .collect(Collectors.toList());
        return this.createVariables(variables);
    }

    private List<Variable> createVariables(List<String> variables) {
        String expression = String.join(" ", variables);

        List<Variable> result = new ArrayList<>();
        if (variables.size() != 0)
            result.add(new VariableAE(variables, expression));
        return result;
    }

    @Override
    public Result join(Result in, Result out) {
        in.intersectResult(out);
        return in;
    }
}

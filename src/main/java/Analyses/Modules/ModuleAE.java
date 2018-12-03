package Analyses.Modules;

import Model.Analyses.Result;
import Model.Analyses.Variables.Variable;
import Model.Analyses.Variables.VariableExp;
import Model.Analyses.WorkList.WorkList;
import Model.Flowgraph.FNVariable;
import Model.Flowgraph.FlowNode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ModuleAE extends Module {
    @Override
    public void setInitial(FlowNode flowGraph, Result[] results) { }

    @Override
    public void populateWorkList(FlowNode flowGraph, WorkList workList) {
        flowGraph.getWorkList().forEach(workList::insert);
    }

    @Override
    public List<FlowNode> getChildren(FlowNode flowNode) {
        return flowNode.getChildren();
    }

    @Override
    Set<Variable> gen(FlowNode flowNode) {
        Set<String> variables = flowNode.getReadVariables().stream()
                .filter(fnVariable -> !fnVariable.isConstant()
                        && flowNode.getWriteVariables().stream().
                        noneMatch(innerFNV -> fnVariable.getName().equals(innerFNV.getName())))
                .map(FNVariable::getName)
                .collect(Collectors.toSet());
        return this.createVariables(variables);
    }

    @Override
    Set<Variable> kill(FlowNode flowNode) {
        Set<String> variables = flowNode.getWriteVariables().stream()
                .map(FNVariable::getName)
                .collect(Collectors.toSet());
        return this.createVariables(variables);
    }

    private Set<Variable> createVariables(Set<String> variables) {
        String expression = String.join(" ", variables);

        Set<Variable> result = new HashSet<>();
        if (variables.size() != 0)
            result.add(new VariableExp(variables, expression));
        return result;
    }

    @Override
    public Result join(Result in, Result out) {
        in.intersectResult(out);
        return in;
    }
}

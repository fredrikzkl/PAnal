package Analyses.Modules;

import Model.Analyses.Result;
import Model.Analyses.Variables.Variable;
import Model.Analyses.Variables.VariableLab;
import Model.Analyses.Variables.VariableVar;
import Model.Analyses.WorkList.WorkList;
import Model.Flowgraph.FlowNode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ModuleDV extends Module {
    @Override
    public void setInitial(FlowNode flowGraph, Result[] results) {
        Result initial = new Result(flowGraph.getAllUniqueVariables().stream()
                .map(fnVariable -> new VariableVar(fnVariable.getName()))
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
                .map(v -> new VariableVar(v.getName()))
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Variable> kill(FlowNode flowNode) {
        return this.gen(flowNode);
    }

    @Override
    public Result join(Result in, Result out) {
        in.addResult(out);
        return in;
    }

    @Override
    public Result generateNewOut(FlowNode node, Result in) {
        Set<Variable> variables = new HashSet<>();
        if (node.getType().equals(FlowNode.Type.READ) || isAnyVariableInReadVariables(node, in))
            variables = this.gen(node);
        Set<Variable> killSet = this.kill(node);
        variables.addAll(in.getVariables().stream()
                .filter(variable -> killSet.stream()
                        .noneMatch(variable::variableEquals))
                .collect(Collectors.toList()));
        return new Result(variables);
    }

    private boolean isAnyVariableInReadVariables(FlowNode node, Result in) {
        return in.getVariables().stream()
                .anyMatch(variable -> isVariableInReadVariables(node, variable));
    }

    private boolean isVariableInReadVariables(FlowNode node, Variable<String> variable) {
        return node.getReadVariables().stream()
                .filter(fnVariable -> !fnVariable.isConstant())
                .anyMatch(fnVariable -> fnVariable.getName().equals(variable.getVariable()));
    }

    @Override
    public Result fillFinal(FlowNode finalFlowNode, Result in) {
        return this.generateNewOut(finalFlowNode, in);
    }
}

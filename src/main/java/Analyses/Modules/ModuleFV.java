package Analyses.Modules;

import Model.Analyses.Result;
import Model.Analyses.Variables.Variable;
import Model.Flowgraph.FlowNode;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ModuleFV extends ModuleLV {

    @Override
    public Result generateNewOut(FlowNode node, Result in) {
        Set<Variable> variables = new HashSet<>();
        if (node.isAnyVariableUsed() || isAnyVariableInWriteVariables(node, in))
            variables = this.gen(node);
        variables.addAll(in.getVariables().stream()
                .filter(variable -> this.kill(node).stream()
                        .noneMatch(variable::variableEquals))
                .collect(Collectors.toList()));
        return new Result(variables);
    }

    private boolean isAnyVariableInWriteVariables(FlowNode node, Result in) {
        return in.getVariables().stream().anyMatch(variable -> isVariableInWriteVariables(node, variable));
    }

    private boolean isVariableInWriteVariables(FlowNode node, Variable<String> variable) {
        return node.getWriteVariables().stream().anyMatch(fnVariable -> fnVariable.getName().equals(variable.getVariable()));
    }
}

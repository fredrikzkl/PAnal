package Model.AST;

import Model.Flowgraph.FlowNode;

import javax.swing.plaf.nimbus.State;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Statement extends Node {
    private StatementType statementType;

    public Statement(StatementType statementType) {
        this.statementType = statementType;
    }

    public StatementType getStatementType() {
        return statementType;
    }

    public void setStatementType(StatementType statementType) {
        this.statementType = statementType;
    }

    @Override
    public String getType() {
        return this.statementType.toString();
    }

    @Override
    public String toString() {
        switch (this.statementType) {
            case ASSIGN:
                return this.getEdges().get(0).toString() + " := " + this.getEdges().get(1).toString();
            case READ:
            case WRITE:
                return this.statementType.toString().toLowerCase() + " " + this.getEdges().get(0).toString();
            case DECLARATION:
                return this.getEdges().get(0).toString() + " " + this.getEdges().get(1).toString();
            case WHILE:
                return this.getEdges().get(0).toString() + "\n" + this.getEdges().get(1).toString();
            case BRANCH:
                return this.getEdges().stream().map(n -> "[" + n.toString() + "]").collect(Collectors.joining("\n"));
            default:
                return "";
        }
    }

    public List<FlowNode> getFlowNodes() {
        switch (this.statementType) {
            case ASSIGN:
            case READ:
            case WRITE:
            case DECLARATION:
                return Collections.singletonList(new FlowNode());
            case WHILE:
                List<FlowNode> result = new ArrayList<>();
                FlowNode cond = new FlowNode();
                result.add(cond);
                List<FlowNode> temp = new ArrayList<>(((Statement)this.getEdges().get(1)).getFlowNodes());
                result.addAll(temp);
                cond.getEdges().add(temp.get(0));
                temp.get(temp.size() - 1).addEdge(cond);
                return result;
            case BRANCH:
                List<FlowNode> branches = new ArrayList<>();
                List<FlowNode> prev = null;
                for (Node node : this.getEdges()) {
                    List<FlowNode> tempBranches = new ArrayList<>(((Statement)node).getFlowNodes());
                    if (prev != null) {
                        prev.get(prev.size() - 1).addEdge(tempBranches.get(0));
                    }
                    prev = tempBranches;
                    branches.addAll(tempBranches);
                }
                return branches;
            default:
                return Collections.emptyList();
        }
    }

    public enum StatementType {
        ASSIGN,
        IF,
        ELSE,
        WHILE,
        READ,
        WRITE,
        DECLARATION,
        BRANCH
    }
}

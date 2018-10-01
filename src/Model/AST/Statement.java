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
                return Collections.singletonList(new FlowNode(this.toString()));
            case WHILE:
                List<FlowNode> result = new ArrayList<>();
                result.add(new FlowNode(this.getEdges().get(0).toString()));
                result.addAll(((Statement)this.getEdges().get(1)).getFlowNodes());
                return result;
            case BRANCH:
                List<FlowNode> branches = new ArrayList<>();
                for (Node node : this.getEdges()) {
                    branches.addAll(((Statement)node).getFlowNodes());
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

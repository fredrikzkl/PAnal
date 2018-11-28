package Model.Flowgraph;

import java.util.*;
import java.util.stream.Collectors;

public class FlowNode {
    private int id;
    private String statement;
    private List<FlowNode> edges;
    private List<FNVariable> writeVariables;
    private List<FNVariable> readVariables;

    public FlowNode(int id) {
        this(id, new ArrayList<>());
    }

    public FlowNode(int id, List<FlowNode> edges) {
        this(id, "", edges, new ArrayList<>(), new ArrayList<>());
    }

    public FlowNode(int id, String statement, List<FlowNode> edges, List<FNVariable> lhsVariables, List<FNVariable> rhsVariables) {
        this.id = id;
        this.statement = statement;
        this.edges = edges;
        this.writeVariables = lhsVariables;
        this.readVariables = rhsVariables;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<FlowNode> getEdges() {
        if (this.edges == null){
            this.edges = new ArrayList<>();
        }
        return edges;
    }

    public void addEdge(FlowNode edge) {
        if (this.edges == null){
            this.edges = new ArrayList<>();
        }
        if (!this.edges.contains(edge))
            this.edges.add(edge);
    }

    public List<FNVariable> getWriteVariables() {
        if (this.writeVariables == null) {
            this.writeVariables = new ArrayList<>();
        }
        return this.writeVariables;
    }

    public void addWriteVariable(FNVariable variable) {
        if (this.writeVariables == null) {
            this.writeVariables = new ArrayList<>();
        }
        this.writeVariables.add(variable);
    }

    public List<FNVariable> getReadVariables() {
        if (this.readVariables == null) {
            this.readVariables = new ArrayList<>();
        }
        return this.readVariables;
    }

    public void addReadVariable(FNVariable variable) {
        if (this.readVariables == null) {
            this.readVariables = new ArrayList<>();
        }
        this.readVariables.add(variable);
    }

    public boolean isContinueNode() {
        return this.statement != null && this.statement.equals("continue;");
    }

    public boolean isBreakNode() {
        return this.statement != null && this.statement.equals("break;");
    }

    public List<FlowNode> getAllFlowNodes() {
        return this.getAllFlowNodesHelper(new ArrayList<>());
    }

    private List<FlowNode> getAllFlowNodesHelper(List<Integer> visitedNotes) {
        List<FlowNode> allChildren = new ArrayList<>();
        for (FlowNode edge : this.edges) {
            if (!visitedNotes.contains(edge.getId())) {
                allChildren.add(edge);
                visitedNotes.add(edge.getId());
                allChildren.addAll(edge.getAllFlowNodesHelper(visitedNotes));
            }
        }
        if (!visitedNotes.contains(this.getId()))
            allChildren.add(this);
        allChildren.sort(Comparator.comparingInt(FlowNode::getId));
        return allChildren;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlowNode flowNode = (FlowNode) o;
        return id == flowNode.id &&
                statement.equals(flowNode.statement) &&
                edges.equals(flowNode.edges) &&
                writeVariables.equals(flowNode.writeVariables) &&
                readVariables.equals(flowNode.readVariables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, statement, edges, writeVariables, readVariables);
    }

    public String deepToString() {
        return this.getAllFlowNodes().stream().map(FlowNode::toString).collect(Collectors.joining("\n"));
    }

    @Override
    public String toString() {
        return "---------------------------------------------------\n"
            + id + " [" + statement + "]"
            + (this.getEdges().size() > 0
                ? "\n\tEdges \t:: " + this.getEdges().stream().map(f -> String.valueOf(f.getId())).collect(Collectors.joining(", "))
                : "")
            + (this.writeVariables.size() > 0
                ? "\n\tWrite \t:: " + this.writeVariables.stream().map(Object::toString).collect(Collectors.joining(", "))
                : "")
            + (this.readVariables.size() > 0
                ? "\n\tRead \t:: " + this.readVariables.stream().map(Object::toString).collect(Collectors.joining(", "))
                : "");
    }
}

package Model.Flowgraph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlowNode {
    private int id;
    private List<FlowNode> edges;
    private Set<String> lhsVariables;
    private Set<String> rhsVariables;

    public FlowNode() {
    }

    public FlowNode(int id) {
        this(id, new ArrayList<>());
    }

    public FlowNode(int id, List<FlowNode> edges) {
        this.id = id;
        this.edges = edges;
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
        this.edges.add(edge);
    }

    public Set<String> getLhsVariables() {
        if (this.lhsVariables == null) {
            this.lhsVariables = new HashSet<>();
        }
        return this.lhsVariables;
    }

    public void addLhsVariable(String variable) {
        if (this.lhsVariables == null) {
            this.lhsVariables = new HashSet<>();
        }
        this.lhsVariables.add(variable);
    }

    public Set<String> getRhsVariables() {
        if (this.rhsVariables == null) {
            this.rhsVariables = new HashSet<>();
        }
        return this.rhsVariables;
    }

    public void addRhsVariable(String variable) {
        if (this.rhsVariables == null) {
            this.rhsVariables = new HashSet<>();
        }
        this.rhsVariables.add(variable);
    }

    @Override
    public String toString() {
        return "[" + "" + "] " + id + " E: " + this.getEdges().stream().map(n -> String.valueOf(n.getId())).collect(Collectors.joining(", "));
    }
}

package Model.Flowgraph;

import java.util.*;
import java.util.stream.Collectors;

public class FlowNode {
    public static List<Integer> visitedNotes = new ArrayList<>();

    private int id;
    private List<FlowNode> edges;
    private List<FNVariable> lhsVariables;
    private List<FNVariable> rhsVariables;

    public FlowNode(int id) {
        this(id, new ArrayList<>());
    }

    public FlowNode(int id, List<FlowNode> edges) {
        this(id, edges, new ArrayList<>(), new ArrayList<>());
    }

    public FlowNode(int id, List<FlowNode> edges, List<FNVariable> lhsVariables, List<FNVariable> rhsVariables) {
        this.id = id;
        this.edges = edges;
        this.lhsVariables = lhsVariables;
        this.rhsVariables = rhsVariables;
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

    public List<FNVariable> getLhsVariables() {
        if (this.lhsVariables == null) {
            this.lhsVariables = new ArrayList<>();
        }
        return this.lhsVariables;
    }

    public void addLhsVariable(FNVariable variable) {
        if (this.lhsVariables == null) {
            this.lhsVariables = new ArrayList<>();
        }
        this.lhsVariables.add(variable);
    }

    public List<FNVariable> getRhsVariables() {
        if (this.rhsVariables == null) {
            this.rhsVariables = new ArrayList<>();
        }
        return this.rhsVariables;
    }

    public void addRhsVariable(FNVariable variable) {
        if (this.rhsVariables == null) {
            this.rhsVariables = new ArrayList<>();
        }
        this.rhsVariables.add(variable);
    }

    @Override
    public String toString() {
        FlowNode.visitedNotes.add(this.id);
        return "---------------------------------------------------\n"
                + id
                + (this.getEdges().size() > 0
                    ? "\tE: " + this.getEdges().stream().map(f -> String.valueOf(f.getId())).collect(Collectors.joining(", "))
                    : "")
                + (this.lhsVariables.size() > 0
                    ? (this.getEdges().size() > 0
                        ? "\n"
                        : "")
                    + "\tlhs :: " + this.lhsVariables.stream().map(Object::toString).collect(Collectors.joining(", "))
                    : "")
                + (this.rhsVariables.size() > 0
                    ? (this.lhsVariables.size() > 0 || this.getEdges().size() > 0
                        ? "\n"
                        : "")
                    + "\trhs :: " + this.rhsVariables.stream().map(Object::toString).collect(Collectors.joining(", "))
                    : "")
                + (this.getEdges().stream().anyMatch(f -> !FlowNode.visitedNotes.contains(f.id))
                    ? "\n" + this.getEdges().stream().filter(f -> !FlowNode.visitedNotes.contains(f.id)).map(FlowNode::toString).collect(Collectors.joining("\n"))
                    : "");
    }
}

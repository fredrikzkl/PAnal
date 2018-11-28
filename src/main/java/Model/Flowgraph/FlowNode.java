package Model.Flowgraph;

import java.util.*;
import java.util.stream.Collectors;

public class FlowNode {
    public static List<Integer> visitedNotes = new ArrayList<>();

    private int id;
    private List<FlowNode> edges;
    private List<FNVariable> writeVariables;
    private List<FNVariable> readVariables;

    public FlowNode(int id) {
        this(id, new ArrayList<>());
    }

    public FlowNode(int id, List<FlowNode> edges) {
        this(id, edges, new ArrayList<>(), new ArrayList<>());
    }

    public FlowNode(int id, List<FlowNode> edges, List<FNVariable> lhsVariables, List<FNVariable> rhsVariables) {
        this.id = id;
        this.edges = edges;
        this.writeVariables = lhsVariables;
        this.readVariables = rhsVariables;
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

    @Override
    public String toString() {
        FlowNode.visitedNotes.add(this.id);
        return "---------------------------------------------------\n"
                + id
                + (this.getEdges().size() > 0
                    ? "\tEdges \t:: " + this.getEdges().stream().map(f -> String.valueOf(f.getId())).collect(Collectors.joining(", "))
                    : "")
                + (this.writeVariables.size() > 0
                    ? (this.getEdges().size() > 0
                        ? "\n"
                        : "")
                    + "\tWrite \t:: " + this.writeVariables.stream().map(Object::toString).collect(Collectors.joining(", "))
                    : "")
                + (this.readVariables.size() > 0
                    ? (this.writeVariables.size() > 0 || this.getEdges().size() > 0
                        ? "\n"
                        : "")
                    + "\tRead \t:: " + this.readVariables.stream().map(Object::toString).collect(Collectors.joining(", "))
                    : "")
                + (this.getEdges().stream().anyMatch(f -> !FlowNode.visitedNotes.contains(f.id))
                    ? "\n" + this.getEdges().stream().filter(f -> !FlowNode.visitedNotes.contains(f.id)).map(FlowNode::toString).collect(Collectors.joining("\n"))
                    : "");
    }
}

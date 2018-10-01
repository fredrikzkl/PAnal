package Model.AST;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Node {
    private List<Node> edges;

    public Node() {
        this(new ArrayList<>());
    }

    public Node(List<Node> edges) {
        this.edges = edges;
    }

    public List<Node> getEdges() {
        if (this.edges == null) {
            this.edges = new ArrayList<>();
        }
        return edges;
    }

    public void addEdge(Node edge) {
        if (this.edges == null) {
            this.edges = new ArrayList<>();
        }
        this.edges.add(edge);
    }

    public String getType() {
        return "ROOT";
    }

    @Override
    public String toString() {
        return this.getEdges().stream().map(Node::toString).collect(Collectors.joining("\n"));
    }
}

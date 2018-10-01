package Model;

import java.util.ArrayList;
import java.util.List;

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
}

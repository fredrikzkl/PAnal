package Model.AST;

import Model.Flowgraph.FlowNode;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
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
        return this.getEdges().stream().map(n -> "[" + n.toString() + "]").collect(Collectors.joining("\n"));
    }

    public List<FlowNode> convertToFlowNodes() {
        List<FlowNode> result = new ArrayList<>();
        List<FlowNode> prev = null;
        for (Node node : this.getEdges()) {
            List<FlowNode> temp = new ArrayList<>(((Statement) node).getFlowNodes());
            if (prev != null) {
                prev.get(prev.size() - 1).addEdge(temp.get(0));
            }
            prev = temp;
            result.addAll(temp);
        }
        AtomicInteger id = new AtomicInteger();
        result.forEach(n -> n.setId(id.incrementAndGet()));
        return result;
    }
}

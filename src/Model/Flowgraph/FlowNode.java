package Model.Flowgraph;

import java.util.ArrayList;
import java.util.List;

public class FlowNode {
    private int id;
    private String statement;
    private List<FlowNode> edges;

    public FlowNode(int id, String statement) {
        this(id, statement, new ArrayList<>());
    }

    public FlowNode(int id, String statement, List<FlowNode> edges) {
        this.id = id;
        this.statement = statement;
        this.edges = edges;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
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
}

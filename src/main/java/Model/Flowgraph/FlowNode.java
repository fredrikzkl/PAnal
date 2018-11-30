package Model.Flowgraph;

import Model.Analyses.Worklist.WorklistElement;

import java.util.*;
import java.util.stream.Collectors;

public class FlowNode {
    private int id;
    private String statement;
    private List<FlowNode> children;
    private List<FlowNode> parents;
    private List<FNVariable> writeVariables;
    private List<FNVariable> readVariables;

    public FlowNode(int id) {
        this(id, "", new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
    }

    public FlowNode(int id, String statement, List<FlowNode> children, List<FlowNode> parents,
                    List<FNVariable> lhsVariables, List<FNVariable> rhsVariables) {
        this.id = id;
        this.statement = statement;
        this.children = children;
        this.parents = parents;
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

    public List<FlowNode> getChildren() {
        if (this.children == null){
            this.children = new ArrayList<>();
        }
        return children;
    }

    public void addChild(FlowNode edge) {
        if (this.children == null){
            this.children = new ArrayList<>();
        }
        if (!this.children.contains(edge))
            this.children.add(edge);
    }

    public List<FlowNode> getParents() {
        if (this.parents == null){
            this.parents = new ArrayList<>();
        }
        return parents;
    }

    public void addParent(FlowNode edge) {
        if (this.parents == null){
            this.parents = new ArrayList<>();
        }
        if (!this.parents.contains(edge))
            this.parents.add(edge);
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
        List<FlowNode> result = this.getSuccessors();
        if (!result.contains(this))
            result.add(0, this);
        return result;
    }

    public List<FlowNode> getSuccessors() {
        return this.getEdges(new ArrayList<>(), true);
    }

    public List<FlowNode> getPredecessors() {
        return this.getEdges(new ArrayList<>(), false);
    }

    private List<FlowNode> getEdges(List<Integer> visitedNotes, boolean isSuccessors) {
        List<FlowNode> allChildren = new ArrayList<>();
        for (FlowNode edge : (isSuccessors ? this.children : this.parents)) {
            if (!visitedNotes.contains(edge.getId())) {
                allChildren.add(edge);
                visitedNotes.add(edge.getId());
                allChildren.addAll(edge.getEdges(visitedNotes, isSuccessors));
            }
        }
        allChildren.sort(Comparator.comparingInt(FlowNode::getId));
        return allChildren;
    }

    public List<FNVariable> getAllUniqueVariables() {
        return this.getAllUniqueVariables(new ArrayList<>(), new ArrayList<>());
    }

    private List<FNVariable> getAllUniqueVariables(List<Integer> visitedNotes, List<FNVariable> variables) {
        if (!visitedNotes.contains(this.getId())) {
            writeVariables.stream().
                    filter(fnVariable -> variables.stream().noneMatch(fnVariable1 -> fnVariable1.getName().equals(fnVariable.getName()))).
                    forEach(variables::add);
            visitedNotes.add(this.getId());
            this.children.forEach(child -> child.getAllUniqueVariables(visitedNotes, variables));
        }
        return variables;
    }

    public List<WorklistElement> getWorklist() {
        return this.getWorklist(new ArrayList<>(), false);
    }

    public List<WorklistElement> getReversedWorklist() {
        List<FlowNode> allNodes = this.getAllFlowNodes();
        return allNodes.get(allNodes.size() - 1).getWorklist(new ArrayList<>(), true);
    }

    private List<WorklistElement> getWorklist(List<Integer> visitedNotes, boolean isReversed) {
        List<WorklistElement> worklistElements = new ArrayList<>();
        if (!visitedNotes.contains(this.getId())) {
            visitedNotes.add(this.getId());
            for (FlowNode child  : (isReversed ? this.parents : this.children)) {
                worklistElements.add(new WorklistElement(this, child));
                worklistElements.addAll(child.getWorklist(visitedNotes, isReversed));
            }
        }
        return worklistElements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlowNode flowNode = (FlowNode) o;
        return id == flowNode.id &&
                statement.equals(flowNode.statement) &&
                children.equals(flowNode.children) &&
                writeVariables.equals(flowNode.writeVariables) &&
                readVariables.equals(flowNode.readVariables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, statement, children, writeVariables, readVariables);
    }

    public String deepToString() {
        return this.getAllFlowNodes().stream().map(FlowNode::toString).collect(Collectors.joining("\n"));
    }

    @Override
    public String toString() {
        return "---------------------------------------------------\n"
            + id + " [" + statement + "]"
            + (this.getChildren().size() > 0
                ? "\n\tEdges \t:: " + this.getChildren().stream().map(f -> String.valueOf(f.getId())).collect(Collectors.joining(", "))
                : "")
            + (this.getParents().size() > 0
                ? "\n\tParents \t:: " + this.getParents().stream().map(f -> String.valueOf(f.getId())).collect(Collectors.joining(", "))
                : "")
            + (this.writeVariables.size() > 0
                ? "\n\tWrite \t:: " + this.writeVariables.stream().map(Object::toString).collect(Collectors.joining(", "))
                : "")
            + (this.readVariables.size() > 0
                ? "\n\tRead \t:: " + this.readVariables.stream().map(Object::toString).collect(Collectors.joining(", "))
                : "");
    }
}

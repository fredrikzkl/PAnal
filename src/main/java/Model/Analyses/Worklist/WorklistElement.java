package Model.Analyses.Worklist;

import Model.Flowgraph.FlowNode;

import java.util.Objects;

public class WorklistElement {
    private FlowNode first;
    private FlowNode second;

    public WorklistElement() {
    }

    public WorklistElement(FlowNode first, FlowNode second) {
        this.first = first;
        this.second = second;
    }

    public FlowNode getFirst() {
        return first;
    }

    public void setFirst(FlowNode first) {
        this.first = first;
    }

    public FlowNode getSecond() {
        return second;
    }

    public void setSecond(FlowNode second) {
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorklistElement worklistElement = (WorklistElement) o;
        return Objects.equals(first.getId(), worklistElement.first.getId()) &&
                Objects.equals(second.getId(), worklistElement.second.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(first.getId(), second.getId());
    }

    @Override
    public String toString() {
        return "(" + first.getId() + ", " + second.getId() + ")";
    }
}

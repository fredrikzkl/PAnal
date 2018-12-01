package Model.Analyses.WorkList;

import Model.Flowgraph.FlowNode;

import java.util.Objects;

public class WorkListElement {
    private FlowNode first;
    private FlowNode second;

    public WorkListElement(FlowNode first, FlowNode second) {
        this.first = first;
        this.second = second;
    }

    public FlowNode getFirst() {
        return first;
    }

    public FlowNode getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkListElement workListElement = (WorkListElement) o;
        return Objects.equals(first.getId(), workListElement.first.getId()) &&
                Objects.equals(second.getId(), workListElement.second.getId());
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

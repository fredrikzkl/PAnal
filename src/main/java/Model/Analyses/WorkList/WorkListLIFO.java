package Model.Analyses.WorkList;

import java.util.Stack;

public class WorkListLIFO implements WorkList {
    private Stack<WorkListElement> workListElements = new Stack<>();

    @Override
    public boolean empty() {
        return workListElements.empty();
    }

    @Override
    public void insert(WorkListElement workListElement) {
        if (!workListElements.contains(workListElement))
            workListElements.push(workListElement);
    }

    @Override
    public WorkListElement extract() {
        if (!workListElements.isEmpty())
            return workListElements.pop();
        else
            return null;
    }
}

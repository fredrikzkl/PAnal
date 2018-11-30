package Model.Analyses.Worklist;

import java.util.Stack;

public class WorklistLIFO implements Worklist {
    private Stack<WorklistElement> worklistElements = new Stack<>();

    @Override
    public boolean empty() {
        return worklistElements.empty();
    }

    @Override
    public void insert(WorklistElement worklistElement) {
        if (!worklistElements.contains(worklistElement))
            worklistElements.push(worklistElement);
    }

    @Override
    public WorklistElement extract() {
        if (!worklistElements.isEmpty())
            return worklistElements.pop();
        else
            return null;
    }
}

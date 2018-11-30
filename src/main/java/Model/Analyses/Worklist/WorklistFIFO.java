package Model.Analyses.Worklist;

import java.util.ArrayList;
import java.util.List;

public class WorklistFIFO implements Worklist {
    private List<WorklistElement> worklistElements = new ArrayList<>();

    @Override
    public boolean empty() {
        return worklistElements.isEmpty();
    }

    @Override
    public void insert(WorklistElement worklistElement) {
        if (!worklistElements.contains(worklistElement))
            worklistElements.add(worklistElement);
    }

    @Override
    public WorklistElement extract() {
        if (worklistElements.isEmpty())
            return null;
        WorklistElement worklistElement = worklistElements.get(0);
        worklistElements.remove(worklistElement);
        return worklistElement;
    }
}

package Model.Analyses.WorkList;

import java.util.ArrayList;
import java.util.List;

public class WorkListFIFO implements WorkList {
    private List<WorkListElement> workListElements = new ArrayList<>();

    @Override
    public boolean empty() {
        return workListElements.isEmpty();
    }

    @Override
    public void insert(WorkListElement workListElement) {
        if (!workListElements.contains(workListElement))
            workListElements.add(workListElement);
    }

    @Override
    public WorkListElement extract() {
        if (workListElements.isEmpty())
            return null;
        WorkListElement workListElement = workListElements.get(0);
        workListElements.remove(workListElement);
        return workListElement;
    }
}

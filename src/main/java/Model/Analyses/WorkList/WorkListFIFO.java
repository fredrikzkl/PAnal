package Model.Analyses.WorkList;

import java.util.HashSet;
import java.util.Set;

public class WorkListFIFO implements WorkList {
    private Set<WorkListElement> workListElements = new HashSet<>();

    @Override
    public boolean empty() {
        return workListElements.isEmpty();
    }

    @Override
    public void insert(WorkListElement workListElement) {
        workListElements.add(workListElement);
    }

    @Override
    public WorkListElement extract() {
        if (workListElements.isEmpty())
            return null;
        WorkListElement workListElement = workListElements.iterator().next();
        workListElements.remove(workListElement);
        return workListElement;
    }
}

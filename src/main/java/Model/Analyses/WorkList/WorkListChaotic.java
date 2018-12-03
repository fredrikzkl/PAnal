package Model.Analyses.WorkList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class WorkListChaotic implements WorkList {
    private List<WorkListElement> workListElementList = new ArrayList<>();

    @Override
    public boolean empty() {
        return workListElementList.isEmpty();
    }

    @Override
    public void insert(WorkListElement workListElement) {
        if (!workListElementList.contains(workListElement))
            workListElementList.add(workListElement);
    }

    @Override
    public WorkListElement extract() {
        if (workListElementList.isEmpty())
            return null;
        WorkListElement workListElement = workListElementList.get(ThreadLocalRandom.current().nextInt(workListElementList.size()));
        workListElementList.remove(workListElement);
        return workListElement;
    }
}

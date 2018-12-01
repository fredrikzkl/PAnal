package Model.Analyses.WorkList;

public interface WorkList {
    public boolean empty();

    public void insert(WorkListElement workListElement);

    public WorkListElement extract();
}

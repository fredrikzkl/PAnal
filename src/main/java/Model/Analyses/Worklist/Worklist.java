package Model.Analyses.Worklist;

public interface Worklist {
    public boolean empty();

    public void insert(WorklistElement worklistElement);

    public WorklistElement extract();
}

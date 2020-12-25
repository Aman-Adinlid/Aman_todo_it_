package lexicon.se.model;

public class Todo {

    private int id;
    private String description;
    private boolean done;
    private Person assignee;

    public Todo(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public Todo(int id, String description, boolean done, Person assignee) {
        this.id = id;
        this.description = description;
        this.done = done;
        this.assignee = assignee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }
}
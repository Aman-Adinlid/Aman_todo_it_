package lexicon.se.model;

import lexicon.se.data.TodoSequencer;

public class Todo {


    private final int TodoId;
    private String description;
    private boolean done;
    private Person assignee;

    public Todo(){
       TodoId  = TodoSequencer.NextTodoId();

    }


    public Todo(String description) {
        this.description = description;
        TodoId = TodoSequencer.NextTodoId();

    }

    public int getTodoId() {
        return TodoId;
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

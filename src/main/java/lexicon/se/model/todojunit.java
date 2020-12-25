package lexicon.se.model;

public class todojunit {
    public static void main(String[] args) {


        Person person = new Person(222,"AMAN","Adinlid");

        Todo todo = new Todo(89765, "Good");
        System.out.println(todo.getId());
        System.out.println(todo.getDescription());

Todo todo1 = new Todo(23445,"Bad",true,person);

        System.out.println(todo1.getId());
        System.out.println(todo1.getDescription());
        System.out.println(todo1.isDone());
        System.out.println(todo1.getAssignee());
    }

}

package lexicon.se.data;

import lexicon.se.model.Todo;

import java.util.Arrays;


public class TodoItems {
    private static Todo[] todoItemsArray = new Todo[0];


    public static int Size() {
        return todoItemsArray.length;
    }

    public static Todo[] FindAll() {
        return todoItemsArray;
    }

    public static Todo FindById(int TodoId) {

        return null;
    }

    public void addTodo(Todo newTodo) {

        Todo[] newtodoItemsArray = Arrays.copyOf(todoItemsArray,todoItemsArray.length + 1);
        newtodoItemsArray[newtodoItemsArray.length - 1] = newTodo;
        todoItemsArray = newtodoItemsArray;
    }

    public void clear() {
        todoItemsArray = null;

    }
}

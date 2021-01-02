package lexicon.se.data;

import lexicon.se.model.Todo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TodoItems {
    private static Todo[] todoItemsArray = new Todo[0];

    public int size() {
        return todoItemsArray.length;
    }

    public Todo[] findAllThingsTodo() {
        return todoItemsArray;
    }

    public Todo findByTodoId(int todo_Id) {
        Todo findTodo = new Todo();
        int tempTodoId = 0;
        for (int i = 0; i < todoItemsArray.length; i++) {
            tempTodoId = todoItemsArray[i].getTodoId();
            if (tempTodoId == todo_Id) {
                findTodo = todoItemsArray[i];
            }
        }
        return findTodo;
    }

    public void addTodo(Todo newThingTodo) {
        Todo[] newtodoItemsArray = Arrays.copyOf(todoItemsArray, todoItemsArray.length + 1);
        newtodoItemsArray[newtodoItemsArray.length - 1] = newThingTodo;
        todoItemsArray = newtodoItemsArray;
    }

    public void clear() {
        todoItemsArray = null;
    }



}



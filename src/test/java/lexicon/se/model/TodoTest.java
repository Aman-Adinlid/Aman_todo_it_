package lexicon.se.model;

import org.junit.Assert;
import org.junit.Test;

public class TodoTest {
   @Test

    public void test_createdTodo(){

       int id = 367;
       String description = "Not bad";
       Todo todo = new Todo(367,"Not bad");
       Assert.assertEquals(367,todo.getId());
       Assert.assertEquals("Not bad",todo.getDescription());
   }
}


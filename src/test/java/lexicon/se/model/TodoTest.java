package lexicon.se.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TodoTest {
   private Todo testTodo1;
   private Todo testTodo2;

   @Before

   public void setupTestTodo() {
      testTodo1 = new Todo();
      testTodo1.setDescription("Description1");
      testTodo1.setDone(false);
      Person assignee1 = new Person();
      assignee1.setFirstName("Aman");
      assignee1.setLastName("Adinlid");
      testTodo1.setAssignee(assignee1);
      testTodo2 = new Todo("Description2");
   }

}


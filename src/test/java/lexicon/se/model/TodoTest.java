package lexicon.se.model;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TodoTest {
    private Todo testTodo;
    @Before

    public void setupTestTodo() {
        testTodo = new Todo();
        testTodo.setDescription("Description1");
        testTodo.setDone(false);
        Person assignee1 = new Person();
        assignee1.setFirstName("Anna");
        assignee1.setLastName("Ross");
        testTodo.setAssignee(assignee1);

    }

    @Test
    public void test_TODOID() {
        int expectedTODOID = 1;
        int actualTODOID = testTodo.getTodoId();
        Assert.assertEquals(expectedTODOID, actualTODOID);
    }


    @Test
    public void test_Boolean () {
        boolean expectedBoolean = false;
        boolean actualBoolean = testTodo.isDone();
        Assert.assertEquals(expectedBoolean, actualBoolean);
    }
    @Test
    public void test_Assignee (){
        Person expectedAssignee = new Person();
        expectedAssignee.getPersonId();
        expectedAssignee.setFirstName("Anna");
        expectedAssignee.setLastName("Ross");
        Person actualAssignee = testTodo.getAssignee();
        Assert.assertEquals(expectedAssignee.getFirstName(), testTodo.getAssignee().getFirstName());
    }
}


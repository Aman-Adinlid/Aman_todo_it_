package lexicon.se.data;
import lexicon.se.model.Todo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TodoItemsTest {
    private Todo[] testItAll = new Todo[2];
    private Todo testIt1 = new Todo();
    private Todo testIt2 = new Todo();

        @Before
        public void setupTodo() {
            testIt1.getTodoId();
            testIt1.setDescription("It is good");
            testIt1.setDone(true);
            testIt1.setAssignee(testIt1.getAssignee());
            testIt2.getTodoId();
            testIt2.setDescription("Say goodbye");
            testIt2.setDone(false);
            testIt2.setAssignee(testIt2.getAssignee());
            testItAll[0] = testIt1;
            testItAll[1] = testIt2;
        }

        @Test
        public void test_AddTodo() {
            TodoItems testTodoItems = new TodoItems();
            testTodoItems.addTodo(testIt1);
            testTodoItems.addTodo(testIt2);
            Todo[] expectedTestArray = testItAll;
            Todo[] actualTestArray = testItAll;
            Assert.assertEquals(expectedTestArray[0].getTodoId(), actualTestArray[0].getTodoId());

        }

        @Test
        public void test_ClearTodo() {
        assert true;
        }

}
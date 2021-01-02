package lexicon.se.model;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {


@Test
    public void test_createdPerson(){

    int personId = 1765;
    String firstName = "Aman";
    String lastName = "Adam";
    Person person = new Person();

    Assert.assertEquals(1765,person.getPersonId());
    Assert.assertEquals("Aman",person.getFirstName());
    Assert.assertEquals("Adam",person.getLastName());
}

}



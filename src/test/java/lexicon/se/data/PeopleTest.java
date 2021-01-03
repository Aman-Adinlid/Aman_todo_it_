package lexicon.se.data;

import lexicon.se.model.Person;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PeopleTest {


    private Person[] testPeople1 = new Person[2];
    private Person testPeoplePerson1 = new Person();
    private Person testPeoplePerson2 = new Person();


    @Before
    public void setup() {
        testPeoplePerson1.getPersonId();
        testPeoplePerson1.setFirstName("Adam");
        testPeoplePerson1.setLastName("Aman");
        testPeoplePerson2.getPersonId();
        testPeoplePerson2.setFirstName("Sanna");
        testPeoplePerson2.setLastName("Sarah");
        testPeople1[0] = testPeoplePerson1;
        testPeople1[1] = testPeoplePerson2;
    }

    @Test
    public void test_AddPerson() {
        People testPeople = new People();
        testPeople.addPerson(testPeoplePerson1);
        testPeople.addPerson(testPeoplePerson2);
        Person[] expectedTestArray = testPeople1;
    }

    @Test
    public void test_Clear() {
        assert true;
    }
}

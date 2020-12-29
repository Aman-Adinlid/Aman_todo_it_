package lexicon.se.model;

public class PersonTest {

    public static void main(String[] args) {


        Person person = new Person(12367,"Aman","Adinlid");

        System.out.println(person.getPersonId());
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());

    }
}

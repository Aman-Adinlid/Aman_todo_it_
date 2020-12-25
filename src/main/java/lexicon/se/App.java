package lexicon.se;

import lexicon.se.model.Person;

public class App
{
    public static void main( String[] args )
    {
        Person person = new Person(12367,"Aman","Adinlid");

        System.out.println(person.getId());
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());




    }
}

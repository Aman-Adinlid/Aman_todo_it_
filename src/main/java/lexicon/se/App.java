package lexicon.se;

import lexicon.se.model.Person;

public class App
{
    public static void main( String[] args )
    {
        Person person = new Person("Amman","Adam",25);

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());



    }
}

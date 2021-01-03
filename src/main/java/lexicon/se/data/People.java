package lexicon.se.data;
import lexicon.se.model.Person;
import java.util.Arrays;


public class People {
    private static Person[] personArray = new Person[0];


    public static int Size() {
        return personArray.length;
    }

    public static Person[] FindAll() {
        return personArray;
    }

    public static Person FindById(int personId) {
        return null;
    }

    public void addPerson(Person newPerson) {
        Person[] newPeopleArray = Arrays.copyOf(personArray, personArray.length + 1);
        newPeopleArray[newPeopleArray.length - 1] = newPerson;
        personArray = newPeopleArray;
    }


    public static void Clear() {
            personArray = null;
    }


}





















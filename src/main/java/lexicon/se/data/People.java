package lexicon.se.data;

import lexicon.se.model.Person;

import java.sql.Array;
import java.util.Arrays;

public class People {


    private static Person[] peopleArray = new Person[0];

    public int size() {
        return peopleArray.length;

    }

    public Person[] findAll() {
        return peopleArray;

    }


    public Person findById(int personId) {
        Person findPerson = new Person();
        int tempPersonId = 0;
        for (int i = 0; i < peopleArray.length; i++) {
            tempPersonId = peopleArray[i].getPersonId();
            if (tempPersonId == personId) {
                findPerson = peopleArray[i];
            }
        }
        return findPerson;
    }


    public void addPerson(Person newPerson) {

        Person[] newPeopleArray = Arrays.copyOf(peopleArray, peopleArray.length + 1);
        newPeopleArray[newPeopleArray.length - 1] = newPerson;
        peopleArray = newPeopleArray;
    }


    public void clear() {

        peopleArray = null;
    }




}

















package lexicon.se.data;

import lexicon.se.model.Person;

import java.sql.Array;

public class People {


    private static Person[] personArray = new Person[0];


    public static int Size() {

        return personArray.length;
    }


    public static Person[] findAll() {

        return personArray;
    }








    }



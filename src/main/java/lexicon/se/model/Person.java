package lexicon.se.model;

import lexicon.se.data.PersonSequencer;

public class Person {
    private final int personId;

    private String firstName;
    private String lastName;
    public Person(){
        personId = PersonSequencer.nextPersonId();

    }




    public int getPersonId() {
        return personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}


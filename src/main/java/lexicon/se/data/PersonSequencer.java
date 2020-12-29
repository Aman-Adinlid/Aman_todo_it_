package lexicon.se.data;

public class PersonSequencer {

private static int personId;

public static int nextPersonId(){

    return ++personId;
    }

    public static int Reset() {
        return personId = 0;
    }


}











package lexicon.se.data;

public class TodoSequencer {

    private static int personId;

    public static int NextTodoId(){

        return ++personId;


    }

    public static int Reset(){
        return personId = 0;
    }

}

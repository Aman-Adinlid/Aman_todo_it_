package lexicon.se.data;

public class TodoSequencer {


    private static int personId= 0;

    public static int NextTodoId(){

        return ++personId;


    }

    public static void Reset() {
        personId = 0;

    }
}

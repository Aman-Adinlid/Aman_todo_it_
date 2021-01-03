package lexicon.se.data;

public class TodoSequencer {


    private static int todoId = 0;

    public static int NextTodoId(){

        return ++todoId;


    }

  public static void Reset(int sequencer) {
       todoId = 0;

    }
}

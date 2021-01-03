package lexicon.se.data;

public class TodoSequencer {


    private static int sequencer= 0;

    public static int NextTodoId(){

        return ++sequencer;


    }

    public static void Reset(int sequencer) {
        sequencer = 0;

    }
}

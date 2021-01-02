package lexicon.se.data;

public class PersonSequencer {

    private static int sequencer= 0;

    public static int nextPersonId() {

        return ++sequencer;
    }

    public static void Reset() {
        sequencer = 0;


    }
}












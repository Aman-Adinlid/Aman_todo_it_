package lexicon.se.data;


import org.junit.Assert;
import org.junit.Assert.*;

import org.junit.Test;

public class TodoSequencerTest {


    @Test
    public void test_TodoSequencer(){

        int expected = 0;
        int actual = TodoSequencer.NextTodoId();
    }
    @Test
    public void reset() {
        int personId = 1;
        int countPerson = TodoSequencer.NextTodoId();

        assert (true);
    }


}
package junitprograms;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RepeatCharactersTest  {
    @Test
    public void trueCase(){
        assertEquals(new char[]{'s'},RepeatCharacters.repeatCharacters("suresh"));
    }

    @Test
    public void zeroFactorial(){
        assertEquals(1,Factorial.fact(0));
    }

    @Test
    public void falseCase(){
        assertNotEquals(100,Factorial.fact(5));
    }
}
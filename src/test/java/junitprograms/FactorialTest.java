package junitprograms;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FactorialTest {

    @Test
    public void trueCase(){
        assertEquals(120,Factorial.fact(5));
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
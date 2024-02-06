package exceptionHandlingtest;

import exceptionHandling.StringToInt;
import junitprograms.Factorial;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class StringToIntTest {


    @Test
    public void passedInteger(){
        assertEquals((Integer)23,StringToInt.convertStringToInt("23"));
    }

    @Test
    public void passedDecimal(){
        try {
            StringToInt.convertStringToInt("45.67");
        } catch (NumberFormatException e) {
            assertEquals("For input string: \"45.67\"", e.getMessage());
        }
    }

    @Test
    public void passedFloat(){
        try {
            StringToInt.convertStringToInt("123f");
        } catch (NumberFormatException e) {
            assertEquals("For input string: \"123f\"", e.getMessage());
        }
    }

    @Test
    public void passedString(){
          try {
            StringToInt.convertStringToInt("test");
        } catch (NumberFormatException e) {
            assertEquals("For input string: \"test\"", e.getMessage());
        }
    }
}

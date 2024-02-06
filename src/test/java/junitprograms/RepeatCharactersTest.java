package junitprograms;


import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RepeatCharactersTest  {
    @Test
    public void trueCase(){
        char[] ch=new char[]{'s','b','u'};
        char[] c=RepeatCharacters.repeatCharacters("suresh babu");
        /*
        for (char i:c
             ) {
            System.out.println(i);
        }
        for (char i:ch
        ) {
            System.out.println(i);
        }
        see the below testcase to under the assertArrayEquals
         */
        System.out.println(Arrays.equals(c,ch));
        assertTrue(Arrays.equals(c,ch));
    }

    @Test
    public void emptyString(){

//        char[] c=RepeatCharacters.repeatCharacters("");
//        for (char i:c
//        ) {
//            System.out.println(i);
//        }
        assertArrayEquals(new char[]{},RepeatCharacters.repeatCharacters(""));
    }

    @Test
    public void falseCase(){
//        char[] c=RepeatCharacters.repeatCharacters("suresh babu");
//        for (char i:c
//        ) {
//            System.out.println(i);
//        }
//        assert();
        assert !Arrays.equals(new char[]{'s','u'},RepeatCharacters.repeatCharacters("suresh babu")) : "Arrays are equal!";

        System.out.println("Arrays are not equal.");
    }
}
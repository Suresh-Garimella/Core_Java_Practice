package junitprograms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class UniqueWordsHashMapTest
{
    @Test
    public void positiveTest(){
        assertEquals(7,UniqueWordsHashMap.uniqueWords("Hello this is suresh, what he does is nothing"));
    }


    @Test
    public void flaseTest(){
        assertFalse(6==UniqueWordsHashMap.uniqueWords("Hello this is suresh, what he does is nothing"));
    }

    @Test
    public void emptyStringTest(){
        assertEquals(0,UniqueWordsHashMap.uniqueWords(""));
    }
    @Test
    public void nullTest(){
        assertEquals(0,UniqueWordsHashMap.uniqueWords(null));
    }
}

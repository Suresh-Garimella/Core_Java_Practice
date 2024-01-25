package String_functionTest;

import org.junit.Assert;
import org.junit.Test;

import string_functions.AnagramCheck;
import string_functions.ReverseWords;

public class ReverseWordsTest {
    @Test
    public void reverseWordTest() {
        ReverseWords obj = new ReverseWords();
        Assert.assertEquals("avaJ EE2J esreveR eM",obj.reverseWords("Java J2EE Reverse Me"));
        Assert.assertEquals("",obj.reverseWords(""));
//        obj = null;
    }
    @Test
    public void reverseWordTest1(){
        ReverseWords obj = new ReverseWords();
        Assert.assertEquals("",obj.reverseWords(""));
        Assert.assertEquals("",obj.reverseWords(null));
        Assert.assertEquals("4321 321",obj.reverseWords("1234 123"));

    }
}

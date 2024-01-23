import org.junit.Assert;
import org.junit.Test;
import string_functions.AnagramCheck;

public class AnagramCheckTest {

    @Test
    public void anagramcheckerTest(){
        AnagramCheck obj = new AnagramCheck();
        Assert.assertEquals(true,obj.anagramchecker("suresh babu","ubabs uresh"));

        Assert.assertEquals(false,obj.anagramchecker("suresh babu","ubab uresh"));

        Assert.assertEquals(false,obj.anagramchecker("123","ubabs123"));
    }

    @Test
    public void anagramcheckerTest1(){
        AnagramCheck obj = new AnagramCheck();
        Assert.assertEquals(false,obj.anagramchecker("",""));
        Assert.assertEquals(false,obj.anagramchecker(null,""));
        Assert.assertEquals(false,obj.anagramchecker("",null));
        Assert.assertEquals(false,obj.anagramchecker(null,null));


        Assert.assertEquals(false,obj.anagramchecker("suresh babu","ubab uresh"));

    }
}

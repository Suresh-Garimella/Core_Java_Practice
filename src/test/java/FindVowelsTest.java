import org.junit.Assert;
import org.junit.Test;
import string_functions.FindVowels;

public class FindVowelsTest {
@Test
    public void coutVowelsTest() {
    FindVowels obj = new FindVowels();
    int cnt = obj.coutVowels("Suresh");
    Assert.assertEquals(2,cnt);
    Assert.assertEquals(5,obj.coutVowels("aeiou"));
    Assert.assertEquals(1,obj.coutVowels("abcd fgh"));
    }
@Test
    public void coutVowelsTest1() {
        FindVowels obj = new FindVowels();
        Assert.assertEquals(0,obj.coutVowels(""));
        Assert.assertEquals(0,obj.coutVowels(null));
        Assert.assertEquals(0,obj.coutVowels("12345"));
    }




}

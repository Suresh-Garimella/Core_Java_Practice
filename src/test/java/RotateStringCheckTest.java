import org.junit.Assert;
import org.junit.Test;
import string_functions.RotateStringsCheck;

public class RotateStringCheckTest {
    @Test
public void rotateStringsTest(){
    RotateStringsCheck obj = new RotateStringsCheck();
    Assert.assertEquals(true,obj.rotateStrings("JavaJ2eeStrutsHibernate", "StrutsHibernateJavaJ2ee"));

    Assert.assertEquals(true,obj.rotateStrings("suresh babu","busuresh ba"));

    Assert.assertEquals(false,obj.rotateStrings("suresh babu","sureshbu ba"));

    Assert.assertEquals(false,obj.rotateStrings("123","123123"));
}

    @Test
    public void rotateStringsTest1(){
        RotateStringsCheck obj = new RotateStringsCheck();
        Assert.assertEquals(true,obj.rotateStrings("",""));
        Assert.assertEquals(false,obj.rotateStrings(null,""));
        Assert.assertEquals(false,obj.rotateStrings("",null));
        Assert.assertEquals(false,obj.rotateStrings(null,null));


        Assert.assertEquals(true,obj.rotateStrings("suresh babu"," babusuresh"));

    }

}

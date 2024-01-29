package collectionsTest;
import collections.ArrayList_Concept;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ArrayList_ConceptTest
{
    @Test
    public void Test1(){
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("suresh");
        arrList.add("manoj");
        ArrayList<String> empty= new ArrayList<>();
        boolean check= empty.equals(arrList);
//        boolean check = arrList.isEmpty();
//        try {
//            Assert.assertNotNull(arrList);
//
//            ArrayList_Concept.display(arrList);
//        }
//        catch(AssertionError assertionError){
//            System.err.println("Assertion failed: " + assertionError.getMessage());
//
//        }


    }


    @Test
    public void Test2(){
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("suresh");
        arrList.add("loves to");
        arrList.add("code");
        ArrayList<String> anotherArray =  new ArrayList<>();
        anotherArray.add("suresh");
        anotherArray.add("loves to");
        arrList=ArrayList_Concept.removeLastElement(arrList);

        Assert.assertEquals(arrList,anotherArray);

    }

    @Test
    public void Test3(){
        ArrayList<String> arrList = new ArrayList<String>();
//        arrList.add("suresh");
        boolean isEmpty = arrList.size()>0?true:false;
        Assert.assertFalse("ArrayList of Strings is not Empty",isEmpty);

    }
    @Test
    public void Test4(){
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("suresh");
        boolean isEmpty = arrList.size()>0?true:false;
        Assert.assertTrue("ArrayList of Strings is not Empty",isEmpty);

    }
}

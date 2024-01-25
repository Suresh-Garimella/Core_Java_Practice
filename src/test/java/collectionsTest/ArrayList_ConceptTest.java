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

        ArrayList_Concept.display(arrList);
        Assert.assertNotNull(arrList);

    }

    @Test
    public void Test3(){
        ArrayList<String> arrList = null;

        Assert.assertNotNull(String.valueOf(arrList),"object Should not be null");

    }
    @Test
    public void Test2(){
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("suresh");
        arrList.add("manoj");
        arrList.add("prasanth");
        arrList.add("madhan");
        arrList.add("revanth");
        arrList.add("coding");
        ArrayList_Concept.display(arrList);
        System.out.println("-------------------");
        System.out.println("Removing the last element in the array list");
        arrList=ArrayList_Concept.removeLastElement(arrList);
        ArrayList_Concept.display(arrList);

        //converting the Array List into Array.
        String[] arr = arrList.toArray(new String[0]);
        System.out.println("--------------------------");
        System.out.println("Printing the Array");
        for (int i=0;i< arr.length;i++){
            System.out.print(" "+arr[i]);
        }


    }

}

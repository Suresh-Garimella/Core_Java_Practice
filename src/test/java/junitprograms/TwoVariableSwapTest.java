package junitprograms;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TwoVariableSwapTest{

    private TwoVariableSwap obj;
    public static int a,b,neg_a,neg_b;
    @Before
    public void beforeTest(){
        obj = new TwoVariableSwap();
        a =15;b=25;
        neg_a=-15;neg_b=-10;
    }

    public static boolean compare(int[] arr){
        if(arr[0]<0||arr[1]<0) return false;
        if (arr[0]==b && arr[1]==a){
            return true;
        }
        else{
            return false;
        }
    }
    @Test
    public void testPositiveNumbers(){
        int arr[]= obj.swap(a,b);
        assertTrue(TwoVariableSwapTest.compare(arr));

    }
    @Test
    public void testNegativeNumbers(){
        int arr[]= obj.swap(neg_a,neg_b);
        assertFalse(TwoVariableSwapTest.compare(arr));

    }



}
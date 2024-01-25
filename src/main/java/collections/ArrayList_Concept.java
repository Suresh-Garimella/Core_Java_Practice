package collections;

import java.util.ArrayList;
import java.util.Arrays;

//        Given an ArrayList of Strings, write a program to convert ArrayList into an Array.
public class ArrayList_Concept {

    public static void display(ArrayList<String> arrList){
        System.out.println("Using the For loop:");
        for(int i=0;i<arrList.size();i++){
            System.out.println(arrList.get(i));
        }
        System.out.println("----------------");
        System.out.println("Using the Foreach loop:");
        for (String str: arrList
             ) {
            System.out.println(str);
        }
    }

    public static ArrayList<String> removeLastElement(ArrayList<String> arrList){
        arrList.remove(arrList.size()-1);
        return arrList;
    }
    public static void main(String[] args) {

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

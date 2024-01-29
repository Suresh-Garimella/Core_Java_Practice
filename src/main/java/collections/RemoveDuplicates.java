package collections;

import java.util.TreeSet;

//    Given a string, write a program to remove all the duplicate characters in the String and print the resulting string.
public class RemoveDuplicates {

    public static void main(String[] args) {
        String str = "SureshBabuGarimella";
        str = str.toLowerCase();
        TreeSet<Character> tset = new TreeSet<>();
        for (Character ch: str.toCharArray()
             ) {
            tset.add(ch);
        }
        for (Character ch:tset) {
            System.out.print(ch+" ");
        }
    }
}

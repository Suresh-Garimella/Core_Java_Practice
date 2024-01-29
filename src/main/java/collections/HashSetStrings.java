package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetStrings {


//    Create an HashSet and add 10 strings to it. Iterate HashSet using
//            Iterator
//             for loop
//             enhanced for loop
//    Given a string, write a program to remove all the duplicate characters in the String and print the resulting string.
    public static void main(String[] args) {
        HashSet<String> set= new HashSet<>();

        set.add("suresh");
        set.add("prakash");

        set.add("sathwika");
        set.add("vamsi");

        set.add("Anirudh");
        set.add("Aravindh");
        set.add("Arif");
        set.add("siva");
        set.add("Munna");
        set.add("vani");
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-----------------------");
        ArrayList<String> arrayList = new ArrayList<>(set);
        for(int i=0;i< arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
        System.out.println("-----------------------");

        for (String word: set
             ) {
            System.out.println(word);
        }
    }
}

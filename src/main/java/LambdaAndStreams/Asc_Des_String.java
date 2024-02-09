package LambdaAndStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Given an array of strings, write a program to sort the array based on the following criteria:
        First, sort the strings based on their lengths in ascending order.
        If two strings have the same length, sort them in descending order based on the their last characters.*/
public class Asc_Des_String {
    public List<String> sortBasedOnLength(String[] stringArray) {
        return Arrays.stream(stringArray)
                .sorted((stringOne, stringTwo) -> {
                    if(stringOne.length() == stringTwo.length())
                        return stringOne.charAt(stringOne.length() - 1)
                                - stringTwo.charAt(stringTwo.length() - 1);
                    else
                        return stringOne.length() - stringTwo.length();
                })
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        Asc_Des_String stringSort = new Asc_Des_String();

        List<String> s = stringSort.sortBasedOnLength(new String[]{"maple", "birch", "oak", "pine", "elm", "spruce", "ash"});
        System.out.println(s);
    }

}

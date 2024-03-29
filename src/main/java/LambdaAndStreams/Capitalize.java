package LambdaAndStreams;

import java.util.Arrays;
import java.util.stream.Stream;

/*
Use Streams and Lambdas for all the below programs.
        Given an array of Strings, write a program to Capitalize the first letter of the each String, and print the strings in alphabetical order.
        Given an array of strings, write a program to print the strings that contains a vowels. Print string and number of Vowels.
        Given an array of Integers, write a program to find the average of squares of all the odd numbers.
        Given an array of strings, write a program to sort the array based on the following criteria:
        First, sort the strings based on their lengths in ascending order.
        If two strings have the same length, sort them in descending order based on the their last characters.*/
public class Capitalize {

    public static String firstLetterCapitalize(String[] strArr){



        Stream st = Arrays.stream(strArr)
                .map(str -> Character.toUpperCase(str.charAt(0))+str.substring(1))
                .sorted();
        st.forEach(s-> System.out.println(s));


//        Stream st = Arrays.stream(strArr) .map(str -> Character.toUpperCase(str.charAt(0)) + str.substring(1))
//                .collect(Collectors.joining(" "));

        return "";
    }

    public static void main(String[] args) {
        Capitalize.firstLetterCapitalize(new String[]{"suresh","babu","garimella"});

    }
}
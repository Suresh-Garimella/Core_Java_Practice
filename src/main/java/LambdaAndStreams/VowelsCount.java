package LambdaAndStreams;

import java.util.Arrays;
import java.util.stream.Stream;

// Given an array of strings, write a program to print the strings that contains a vowels.
// Print string and number of Vowels.
public class VowelsCount {

    public static void vowels_count(String[] arr){

//        Stream  st= Arrays.stream(arr).filter(word->word.toLowerCase().matches(".*[aeiou].*"));
//        Stream a = st.map(s->Character.());
        Arrays.stream(arr)
                .filter(str -> containsVowels(str))
                .forEach(str -> {
                    System.out.println("Word: " + str);
                    System.out.println("Number of Vowels: " + countVowels(str));
                    System.out.println();
                });
    }

    private static boolean containsVowels(String str) {
        return str.toLowerCase().matches(".*[aeiou].*");
    }

    private static long countVowels(String str) {
        return str.toLowerCase().chars().filter(ch -> "aeiou".indexOf(ch) != -1).count();
    }

    public static void main(String[] args) {
//        Capitalize.firstLetterCapitalize(new String[]{"suresh","babu","garimella"});
    VowelsCount.vowels_count(new String[]{"suresh","babu","garimella"});
    }
    }


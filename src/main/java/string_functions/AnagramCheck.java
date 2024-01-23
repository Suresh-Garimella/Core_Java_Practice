package string_functions;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
     public boolean anagramchecker(String sentence, String sentence2){

         if(sentence=="" || sentence2 ==""|| sentence==null|| sentence2 == null){
             return false;
         }
        char arr1[] = sentence.toLowerCase().replaceAll("\\s","").toCharArray();
        Arrays.sort(arr1);
        char arr2[] = sentence2.toLowerCase().replaceAll("\\s","").toCharArray();
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            return true;
        }
        else{
            return false;
          }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String/Sentence: ");
        String sentence = sc.nextLine();


        System.out.println("Enter another String/Sentence: ");
        String sentence2 = sc.nextLine();
        sc.close();

//        for (char var: arr2
//        ) {
//            System.out.print(var);
//        }
        AnagramCheck obj = new AnagramCheck();
        if(obj.anagramchecker(sentence,sentence2)){
            System.out.println("Yes, two strings are anagram of each other ");
        }
        else{
            System.out.println("No, two strings are not anagram of each other ");
        }


    }
}

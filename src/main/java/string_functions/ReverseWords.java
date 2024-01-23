package string_functions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseWords {

    public String reverseWords(String str){
        if(str==""|| str==null){
            return "";
       }
        else{
            String[] words= str.split("\\s");
            String sentence="";
            for (String word: words) {
//                System.out.println(word);
                StringBuilder reverseWord = new StringBuilder(word);
                reverseWord.reverse();
                sentence+=reverseWord+" ";
            }

            String s =sentence.substring(0,sentence.length() - 1);
//            System.out.println(sentence.substring(sentence.length() - 1));
            return s;
        }

    }

    public static void main(String[] args) {
        ReverseWords obj = new ReverseWords();
        System.out.println("Enter a Sentence :");
        Scanner sc= new Scanner(System.in);
        //Java J2EE Reverse Me
        String str = sc.nextLine();
//        System.out.println("length is :"+str.length());
        System.out.println(obj.reverseWords(str));
//        System.out.println(obj.reverseWords(str).length());


//        StringBuilder sb = new StringBuilder(str);
//        String rev= String.valueOf(sb.reverse());
//        System.out.println(rev);
//        char[] c = rev.toCharArray();
//        String n="";
//        for (int i=rev.length()-1;i>=0;i--) {
//
//            n+=c[i];
//        }
//        System.out.println(n);

    }
}

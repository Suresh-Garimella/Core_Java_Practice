package junitprograms;

import java.util.Scanner;

public class StringRotation {
    public static Boolean rotateStrings(String sentence,String sentence2){
        if(  sentence2==null|| sentence==null){
            return false;
        } else if (sentence==""||sentence2=="") {
            return true;

        } else if(sentence.length()!=sentence2.length())
            return false;
        else{
            String doubleSentence= sentence+sentence;
            if(doubleSentence.contains(sentence2)){
                return true;
            }
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

        System.out.println(StringRotation.rotateStrings("JavaJ2eeStrutsHibernate","StrutsHibernateJavaJ2ee"));

    }
}

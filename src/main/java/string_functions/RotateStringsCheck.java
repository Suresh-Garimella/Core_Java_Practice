package string_functions;

//Given two strings, write a program to check if one string is rotation of another string

//        output - true

import java.util.Scanner;

public class RotateStringsCheck {
    public Boolean rotateStrings(String sentence,String sentence2){
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
        RotateStringsCheck obj = new RotateStringsCheck()
                ;
        //        input - "JavaJ2eeStrutsHibernate", "StrutsHibernateJavaJ2ee"


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String/Sentence: ");
        String sentence = sc.nextLine();


        System.out.println("Enter another String/Sentence: ");
        String sentence2 = sc.nextLine();
        sc.close();
        System.out.println(obj.rotateStrings(sentence,sentence2));

        System.out.println(obj.rotateStrings("JavaJ2eeStrutsHibernate","StrutsHibernateJavaJ2ee"));


    }

}

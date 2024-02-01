package junitprograms;

//Write a Java Program to calculate the factorial of any given number.
public class Factorial {

    public static int fact(int num){
        if (num==0){
            return 1;
        }
        if (num==1){
            return 1;
        }
        return num*fact(num-1);
    }

//    public static void main(String[] args) {
//        System.out.println(Factorial.fact(5));
//    }

}

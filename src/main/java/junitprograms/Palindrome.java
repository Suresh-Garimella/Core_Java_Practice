package junitprograms;

public class Palindrome {

    static Boolean checkIntegerPalindrome(int num) {
        if (num<0) return false;
        int output = 0,input=num;
        // 54321
        while (num != 0) {
            int temp = num % 10;
            num = num / 10;
            // System.out.println(num);

            output += temp;
            output *= 10;
        }
        output /=10;

        return input==output?true:false;
    }
    public static Boolean checkPalindrome(Integer num){
        System.out.println(num);
        StringBuilder str = new StringBuilder(num);
        System.out.println(str);
        int startIdx=0, lastidx= str.length()-1;
        while(startIdx<=lastidx){
            if(str.charAt(startIdx)==str.charAt(lastidx)) {
                System.out.println(".");
                startIdx+=1;
                lastidx-=1;
                continue;
            }
            else return false;
        }
        return true;
    }

//    public static void main(String[] args) {
//                System.out.println(Palindrome.checkPalindrome(12231));
//
}

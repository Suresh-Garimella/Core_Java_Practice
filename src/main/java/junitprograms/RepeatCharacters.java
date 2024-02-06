package junitprograms;

import java.util.HashSet;

//Write a Program to identify and print all repeated characters of a string.
public class RepeatCharacters {
    public static char[] repeatCharacters(String str){
        str=str.replaceAll(" ","");
        HashSet<Character> set = new HashSet<>();
        String out="";
        for(Character ch: str.toCharArray()){
            if(set.contains(ch)){
                out+=ch;
            }
            else{
                set.add(ch);
            }
        }
        return out.toCharArray();
    }

    public static void main(String[] args) {
        char[] ch = RepeatCharacters.repeatCharacters("suresh babu");
        for(char c : ch ){
            System.out.println(c);
        }
    }
}

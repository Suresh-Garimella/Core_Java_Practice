package junitprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

//Write a Java Program to count the number of unique words in a string using HashMap.
public class UniqueWordsHashMap {
    public static int uniqueWords(String str){
        if(str==""||str==null){
            return 0;
        }
        String[] words=str.split(" ");
        HashMap<String,Integer> map= new HashMap<>();

//        Stream<String> stream = Arrays.stream(words);
//        stream.forEach(s-> map.put(s, Arrays.stream(words).count()));
        for (String word:words
             ) {
            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            }
            else{
                map.put(word,1);
            }
        }
        Stream<Integer> stream = map.values().stream();

        return (int) stream.filter(s->s==1).count();
    }

    public static void main(String[] args) {
        System.out.println(UniqueWordsHashMap.uniqueWords("Hello this is suresh, what he does is nothing"));
        System.out.println(UniqueWordsHashMap.uniqueWords("he he he"));

    }
}

package collections;

import java.util.HashMap;

public class FindDistinctCharacters {
    public static void distinctCharacters(String word){
        HashMap<Character, Integer> map= new HashMap<>();
        for (Character ch: word.toLowerCase().replaceAll(" ","").toCharArray()
        ) {
            if(map.containsKey(ch)){
                Integer cnt = map.get(ch);
                cnt++;
                map.put(ch,cnt);
            }
            else{
                map.put(ch,1);
            }
        }
        String sentence="";
        for (Character ch: map.keySet()
        ) {
            sentence+=ch+"-"+map.get(ch)+",";
//            System.out.print(ch+"-"+map.get(ch)+",");
        }
        System.out.println(sentence.substring(0,sentence.length()-1));
    }

    public static void main(String[] args) {

        FindDistinctCharacters.distinctCharacters("test string");
    }
}

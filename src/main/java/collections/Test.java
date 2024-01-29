package collections;

import java.util.HashMap;
import java.util.Set;

public class Test {

    public void distinctCharacters(String word){
        HashMap<Character, Integer> map= new HashMap<>();
        for (Character ch: word.toLowerCase().toCharArray()
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
        for (Character ch: map.keySet()
             ) {
            System.out.println(ch+" :"+map.get(ch));
        }


    }
    public void map(){
        HashMap<String, Student> map = new HashMap<>();
        Student s1= new Student("Suresh","Garimella",2.5f);
        Student s5= new Student("Suresh1","Garimella",2.5f);
        Student s3= new Student("Suresh2","Garimella",2.5f);
        Student s4= new Student("Suresh3","Garimella",2.5f);


        map.put(s1.getFirstName(),s1);
        map.put(s5.getFirstName(),s5);
        map.put(s3.getFirstName(),s3);
        map.put(s4.getFirstName(),s4);
        Student s2 = map.get(s1.getFirstName());
        System.out.println(s1.equals(s2));

//        String[] array =new String[](map.keySet());
        Set<String> keys= map.keySet();
        for (String key:keys
             ) {
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }

    public static void main(String[] args) {
        Test a = new Test();
        a.map();
        HashMap<String, Student> map = new HashMap<>();
        Student s1= new Student("Suresh","Garimella",2.5f);
        Student s5= new Student("Suresh1","Garimella",2.5f);

        a.distinctCharacters("sureshbabugarimellA");
    }
}

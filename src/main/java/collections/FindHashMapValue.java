package collections;

import java.util.HashMap;

public class FindHashMapValue {

    static HashMap<String,Student> map = new HashMap<>();
    static Student getRespectiveStudent(String s){
        return map.get(s);
    }

    public static void main(String[] args) {
    Student s1 = new Student("suresh1","Garimella1",3.1f);
        Student s2 = new Student("suresh2","Garimella2",3.2f);
        Student s3 = new Student("suresh3","Garimella3",3.3f);
        Student s4 = new Student("suresh4","Garimella4",3.4f);
        Student s5 = new Student("suresh5","Garimella5",3.5f);
        Student s6 = new Student("suresh6","Garimella6",3.6f);
        Student s7 = new Student("suresh7","Garimella7",3.7f);
        Student s8 = new Student("suresh8","Garimella8",3.8f);
        HashMap<String,Student> map = new HashMap<>();
        map.put(s1.getFirstName(),s1);
        map.put(s2.getFirstName(),s2);
        map.put(s3.getFirstName(),s3);
        map.put(s4.getFirstName(),s4);
        map.put(s5.getFirstName(),s5);
        map.put(s6.getFirstName(),s6);
        map.put(s7.getFirstName(),s7);
        map.put(s8.getFirstName(),s8);
        FindHashMapValue.map=map;
        Student output =FindHashMapValue.getRespectiveStudent("suresh3");
        System.out.println(output);

    }
}

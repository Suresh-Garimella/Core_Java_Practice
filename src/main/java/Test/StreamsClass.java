package Test;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamsClass {

    public static void operations(){
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=0;i<100;i++) nums.add(i);

        Stream st =  nums.stream();
        //before
        for(Integer num: nums) System.out.println(num);

        //after Java8
        st.forEach(s-> System.out.println(s));

    }

    public static void main(String[] args) {
        StreamsClass.operations();
    }
}

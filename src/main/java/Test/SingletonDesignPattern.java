package Test;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SingletonDesignPattern {
  static SingletonDesignPattern obj= null;
  public int x =10;
  private SingletonDesignPattern(){

  }
  static  public SingletonDesignPattern getInstance(){
    if(obj==null){
        obj = new SingletonDesignPattern();
    }
    return obj;
  }
    public static void main(String[] args) {
      //we need to Synchroize Keyword
      SingletonDesignPattern ob= new SingletonDesignPattern();

        System.out.println("");
        String[] arr= new String[]{"a","b","c"};
        Stream<String> stream= Arrays.stream(arr);
        stream.forEach(s-> System.out.println(s));
        Stream<String> stream1 = Stream.of("d","e","g");
        stream1.forEach(s-> System.out.println(s));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(19);
        list.add(10);
        list.add(15);

        Stream<Integer> st = list.stream();
        st.forEach(s-> System.out.print(s+" "));
        System.out.println();
        list.parallelStream().forEach(element-> System.out.print(element+" "));
        System.out.println("\n_________________________-");
//        st.forEach(s-> System.out.print(s+" "));
        System.out.println("");

        list.stream().forEach(s-> System.out.print(s+" "));
        System.out.println();
//
//        Stream API helps to substitute for,for-each and whileloop.
//        It Allows concentrating on Operation logic,
//        but not on the iteration over the sequesnce of elements.
//        Example:-
        for (String str : arr) {
            if (str.contains("a")) {
                System.out.println(true);
                break;
            }
        }

//        Using Streams this can be used in this situation like
        boolean isExist = Arrays.stream(arr).anyMatch(ele->ele.contains("a"));
        System.out.println(isExist);




//      list.parallelStream().map();

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(1);arr1.add(1);arr1.add(1);arr1.add(1);arr1.add(1);arr1.add(1);arr1.add(1);arr1.add(1);arr1.add(1);arr1.add(1);arr1.add(1);arr1.add(1);arr1.add(1);arr1.add(1);
        arr1.add(0);arr1.add(0);arr1.add(0);arr1.add(0);arr1.add(0);arr1.add(0);arr1.add(0);arr1.add(0);arr1.add(1);
        Stream<Integer> st1 = arr1.stream();

        // Filter is an intermidiate operation which also returns a Stream.
        Stream<Integer> stream2 = arr1.stream().filter(ele->ele.equals(1));


        String abc = "0000000000011101010100";
        abc = abc.replaceAll("^*00*","");
        System.out.println(abc);


//        character Count using the Sreams
            String s = "Suresh Babu Garimella";
//            Stream stvnvn = Arrays.stream(s.toCharArray());
    }
}

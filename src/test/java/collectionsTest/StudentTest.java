package collectionsTest;
import collections.Student;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {



    @Test
    public void Test1() {

        Student obj1 = new Student("Suresh", "Garimella", 2.5f);
        Student obj2 = new Student("Manoj", "Pusala", 3.0f);
        Student obj3 = new Student("Prashanth", "Bokkala", 3.7f);
        Student obj4 = new Student("Madhan", "Mandadi", 4.0f);

        ArrayList<Student> arr = new ArrayList<>();
        arr.add(obj1);
        arr.add(obj2);
        arr.add(obj3);
        arr.add(obj4);

        Student.studentArrayList = arr;
//        Student.addStudent(arr);
        Student.display();

        Assert.assertEquals(arr, Student.studentArrayList);
    }
  @Test
    public void Test2(){

        Student obj1 = new Student("Suresh","Garimella",2.5f);
        Student obj2 = new Student("Manoj","Pusala",3.0f);
        Student obj3 = new Student("Prashanth","Bokkala",3.7f);
        Student obj4 = new Student("Madhan","Mandadi",4.0f);

        ArrayList<Student>  arr = new ArrayList<>();
      arr.add(obj1);
      arr.add(obj2);
      arr.add(obj3);
      arr.add(obj4);

      Student.studentArrayList=arr;

      Student.display();
//      Student.addStudent(arr);
        ArrayList<Student> arr1=Student.belowAverageStudents(arr);
        ArrayList<Student> arr2=new ArrayList<>();
        arr2.add(obj3);
        arr2.add(obj4);
        Assert.assertEquals(arr2,arr1);
    }


    @Test
    public void Test3(){

        Student obj1 = new Student("Suresh","Garimella",2.5f);
        Student obj2 = new Student("Manoj","Pusala",3.0f);
        Student obj3 = new Student("Prashanth","Bokkala",3.7f);
        Student obj4 = new Student("Madhan","Mandadi",4.0f);
        ArrayList<Student>  arr = new ArrayList<>(Arrays.asList(obj1,obj2,obj3,obj4));
        Student.studentArrayList=arr;
        Student.display();
        ArrayList<Student> arr1=Student.belowAverageStudents(arr);
        ArrayList<Student> arr2=new ArrayList<>();
        arr2.add(obj3);
        boolean check = arr1.equals(arr2);
//        arr2.add(obj4);

        Assert.assertFalse(check);

    }

    @Test
    public void Test4(){

        Student obj1 = new Student("Suresh","Garimella",2.5f);
        Student obj2 = new Student("Manoj","Pusala",3.0f);
        Student obj3 = new Student("Prashanth","Bokkala",3.7f);
        Student obj4 = new Student("Madhan","Mandadi",4.0f);
        ArrayList<Student>  arr = new ArrayList<>(Arrays.asList(obj1,obj2,obj3,obj4));
        Student.studentArrayList=arr;
        Student.display();
        ArrayList<Student> arr1=Student.belowAverageStudents(arr);
        ArrayList<Student> emptyArrayList=new ArrayList<>();
        boolean check = arr1.equals(emptyArrayList);
        Assert.assertFalse(check);
    }

    @Test
    public void Test5(){
//
//        Student obj1 = new Student("Suresh","Garimella",2.5f);
//        Student obj2 = new Student("Manoj","Pusala",3.0f);
//        Student obj3 = new Student("Prashanth","Bokkala",3.7f);
//        Student obj4 = new Student("Madhan","Mandadi",4.0f);
        ArrayList<Student>  emptyArray = new ArrayList<>();
        Student.studentArrayList=emptyArray;
        Student.display();
        ArrayList<Student> arr1=Student.belowAverageStudents(emptyArray);
        boolean check = emptyArray.equals(arr1);
        Assert.assertTrue(check);

    }
}

package collections;
//        Given an ArrayList of Students, where each Student class has firstName, LastName and GPA as variables,
//        write a program to remove all the students who has GPA less than the average GPA. Then, print the remaining students.
import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public float getGpa() {
        return gpa;
    }

    private final String firstName;
    private final String lastName;
    private final float gpa;

    Student(String firstName,String lastName, float gpa){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return this.getFirstName()+" "+this.getLastName()+" "+this.getGpa();
    }

    static void display(ArrayList<Student> arrayList){
        for (Student obj: arrayList
             ) {
            System.out.println(obj);
        }
    }

    static ArrayList<Student> belowAverageStudents(ArrayList<Student> arrayList){
        float avg = 0.0f;
        float sum=0;
        for(Student obj :arrayList){
            sum+=obj.getGpa();
        }
        avg= sum/arrayList.size();
        ArrayList<Student> newArrayList = new ArrayList<>();
        for (Student obj: arrayList
             ) {
            if(obj.getGpa()<avg){
                newArrayList.add(obj);
            }
        }
        return newArrayList;
    }

    public static void main(String[] args) {
        Student obj1 = new Student("Suresh","Garimella",2.5f);
        Student obj2 = new Student("Manoj","Pusala",4.0f);
        Student obj3 = new Student("Prashanth","Bokkala",3.7f);
        Student obj4 = new Student("Madhan","Mandadi",3.0f);
        ArrayList<Student> arrayList = new ArrayList<>(Arrays.asList(obj1,obj2,obj3,obj4));
        System.out.println("Printing the Student ArrayList");
        Student.display(arrayList);
//        System.out.println(obj1);
        System.out.println("--------------------------");
        ArrayList<Student> belowAvgStudents =Student.belowAverageStudents(arrayList);
        System.out.println("Printing the below average Students :");
        Student.display(belowAvgStudents);
    }


}

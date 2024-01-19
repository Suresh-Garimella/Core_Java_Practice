package comparable_comparator;

// Create a class named Person with variables like height, weight, ssn and phone number.
//  Override the equals method to match ssn.
public class Person {

    private float height;
    private float weight;
    private long snn;
    private double phoneNumber;

    Person(int height,
            float weight,
            long snn,
            double phoneNumber) {
        this.height = height;
        this.weight = weight;
        this.snn = snn;
        this.phoneNumber = phoneNumber;

    }

    public float getHeight() {
        return this.height;
    }

    public float getWeight() {
        return this.weight;
    }

    public float getSnn() {
        return this.snn;
    }

    public Double getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Person) {
            Person k = (Person) other;
            return this.snn == k.snn;

        }
        return false;
    }

    public static void main(String[] args) {
        Person obj = new Person(166, 70.5f, 12345, 3154212868l);

        Person obj1 = new Person(166, 70.5f, 43345, 1154212868l);

        Person obj2 = new Person(166, 70.5f, 12345, 3154212868l);
        obj.checkSsn(obj1);
        obj.checkSsn(obj2);

        // System.out.println(obj.equals(obj2));

        // System.out.println(obj.equals(obj1));

        System.out.println(obj == obj1);

        System.out.println(obj == obj2);

        Person kk = obj1;
        System.out.println(kk == obj1);

    }

    public void checkSsn(Person o) {
        if (this.equals(o))
            System.out.println("Yes SNN is matched");
        else {

            System.out.println("SNN is Not Matching");
        }

    }

}

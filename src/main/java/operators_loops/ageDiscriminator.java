package operators_loops;

import java.io.InputStreamReader;
import java.util.Scanner;

public class ageDiscriminator {

    // teen if age is between 13 and 19 inclusive.
    // kid if less than 13.
    // adult if more than 19.

    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        sc.close();
        if (age >= 13 && age <= 19) {
            System.out.println("The Person is a Teen");
        } else if (age < 13 && age > 0)
            System.out.println("The person is a Kid");
        else if (age > 19) {
            System.out.println("The person is an Adult");
        } else {
            System.out.println("Not a Valid Input");
        }
    }
}

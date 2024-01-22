package operators_loops;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nVal = sc.nextInt();
        int a = 0;
        int b = 1;
        // int i = 1;
        if (nVal % 2 == 0) {
            for (int i = 0; i < nVal; i = i + 2) {
                System.out.print(" " + a + " " + b);
                // int temp =a;
                a = a + b;
                b = a + b;
            }
        } else {
            System.out.print(" " + a + " " + b);
            for (int i = 2; i < nVal; i++) {
                int c = a + b;
                a = b;
                b = c;

                System.out.print(" " + c);
            }
        }

    }

}

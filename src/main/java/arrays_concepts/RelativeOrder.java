package arrays_concepts;

import java.util.Scanner;

public class RelativeOrder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Items in the Array  :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int outArr[] = new int[n];
        int idx = 0;
        for (int i : arr) {
            if (i != 0) {
                outArr[idx] = i;
                idx += 1;
            }

        }
        System.out.println("\nRelative Order Array\n");
        for (int i : outArr) {
            System.out.print(i + " ");
        }

    }
}

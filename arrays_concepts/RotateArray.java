package arrays_concepts;

import java.util.Scanner;

public class RotateArray {

    void leftRotation(int[] arr, int x, int n) {
        int rotatedArray[] = new int[arr.length];
        for (int i = x; i < n; i++) {

            rotatedArray[i - x] = arr[i];

        }

        for (int j = 0; j < x; j++) {
            int idx = n - x + j;
            rotatedArray[idx] = arr[j];
        }

        for (int item : rotatedArray) {
            System.out.print(item + " ");
        }

    }

    void rightRotation(int[] arr, int x, int n) {
        int rotatedArray[] = new int[arr.length];
        for (int i = x; i < n; i++) {

            rotatedArray[i - x] = arr[i];

        }

        for (int j = x; j > 0; j--) {
            rotatedArray[n - j] = arr[x - j];
        }

        for (int item : rotatedArray) {
            System.out.print(item + " ");
        }

    }

    // void rotateUsingoneForLoop(int[] arr, int x, int n) {
    // }

    // 1 2 3 4
    // x=2
    // 3 4 1 2

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the Items in the Array  :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println("Entered Length is :" + n);
        System.out.println("Enter No of Rotations Needed :");
        int x = sc.nextInt();
        sc.close();
        // int idx = 0;
        RotateArray obj = new RotateArray();
        System.out.println("\nLeft Rotation is :");
        obj.leftRotation(arr, x, n);

        // System.out.println("\nRight Rotation is :");
        // obj.rightRotation(arr, x, n);
    }
}

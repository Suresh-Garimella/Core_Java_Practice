package arrays_concepts;

import java.util.Scanner;

public class RelativeOrder {

    static int[] movingZerosToEnd(int[] arr){
        System.out.println("Function....");
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[j]==0){
                j--;
            }
            if(arr[i]==0){
                arr[i]=arr[j];
                arr[j]=0;
                i++;
                j--;
            }
            else{
                i++;
            }
        }

        for (int idx:arr
             ) {
            System.out.println(" "+idx);
        }
        return arr;
    }
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

        RelativeOrder.movingZerosToEnd(arr);
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

package arrays_concepts;

public class ReverseArray {

    void reverseArray(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[] { 10, 5, 2, 6, 4, 1, 8, 7 };
        // brute force approach
        int reverseArray[] = new int[arr.length];
        int idx = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverseArray[idx] = arr[i];
            idx += 1;
        }

        for (int element : reverseArray) {
            System.out.print(element + " ");
        }
        // Reversing an Array
        ReverseArray obj = new ReverseArray();

        obj.reverseArray(arr);
        System.out.println("\n");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}

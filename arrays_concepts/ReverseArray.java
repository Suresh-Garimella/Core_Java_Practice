package arrays_concepts;

public class ReverseArray {

    public static void main(String[] args) {
        int arr[] = new int[] { 10, 5, 2, 6, 4, 1, 8, 7 };
        int reverseArray[] = new int[arr.length];
        int idx = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverseArray[idx] = arr[i];
            idx += 1;
        }

        for (int element : reverseArray) {
            System.out.print(element + " ");
        }
    }

}

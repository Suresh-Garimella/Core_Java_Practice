package arrays_concepts;

public class BubbleSorting {

    public static void main(String[] args) {

        int arr[] = new int[] { 4, 1, 2, 5, 3, 6 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}

package arrays_concepts;

public class MinMax {
    public static void main(String[] args) {
        int arr[] = new int[] { 10, 5, 2, 6, 4, 1, 8, 7 };
        int largeVal = arr[0];
        int smallVal = arr[0];
        for (int i : arr) {
            // System.out.println(i);

            if (i > largeVal)
                largeVal = i;
            if (i < smallVal)
                smallVal = i;
        }

        System.out.println("Largest Value :" + largeVal);
        System.out.println("Smallest Value :" + smallVal);

    }

}

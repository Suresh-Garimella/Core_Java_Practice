package arrays_concepts;

public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = new int[] { 4, 1, 2, 5, 3, 6 };
        int target = 4; // 8;
        int flag = 0;
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] == target) {
                flag = 1;
                System.out.println("Target Found at Position :" + idx);
                break;
            } else {

                continue;
            }
        }
        if (flag == 0)
            System.out.println("Target Not Found");
    }
}

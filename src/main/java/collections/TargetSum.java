package collections;

import java.util.HashMap;

public class TargetSum {
    public static int[] findTwoSumIndices(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];

            // Check if the number exists in the map
            if (map.containsKey(num)) {
                // Return the indices of the two numbers
                return new int[]{map.get(num), i};
            }

            // Put the current number and its index in the map
            map.put(nums[i], i);
        }

        // If no such pair is found, return an empty array
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {10,20,30,40,50,60};
        int target = 100;

        int[] result = findTwoSumIndices(nums, target);

        if (result.length == 2) {
            System.out.println("Indices of the two numbers: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No such pair found.");
        }
    }
}




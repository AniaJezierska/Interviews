import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumTwoNumbers {

    /**
     * CLASS METHOD SumTwoNumbers...
     *
     * @code changeHighScore() => should return the indices of two numbers
     * so that their sum is equal to the given number.
     * <p>
     * Example:
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */

//Approach 3: One-pass Hash Table
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // current value + x = target
            // x = target - current value
            int complement = target - nums[i];
         
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;
    }

//Approach 1: Brute Force
/*
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }

//Approach 2: Two-pass Hash Table
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }

 */

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int target = 5;
        System.out.println("Using HashMap " + Arrays.toString(twoSum(nums, target)));

        // x = 5 - cur

        // x = 5 - 1 = 4
        // Map -> is empty -> 1 - [0]

        // x = 5 - 2 = 3
        // Map -> 2 - [1]

        // x = 5 - 3 = 2 -> value (2) exist in the map
        // Map -> 3 - [2]
        // that means that 2 & 3 can be added to get (5)
        // answer id -> [1,2]

    }
}

/**
 * 'CanJump' focuses on determining if reaching the last index is possible, 
 * while 'CanJump_II' focuses on finding the minimum number of jumps required 
 * to reach the last index.
 */

public class CanJump_II {
    public int jump(int[] nums) {
        int n = nums.length;
        int jumps = 0;
        int currEnd = 0;
        int farthest = 0;

        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currEnd) {
                jumps++;
                currEnd = farthest;
            }
        }

        return jumps;
    }

    public static void main(String[] args) {
        CanJump_II solution = new CanJump_II();

        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println("Minimum number of jumps for nums1: " + solution.jump(nums1)); // Output: 2

        int[] nums2 = {2, 3, 0, 1, 4};
        System.out.println("Minimum number of jumps for nums2: " + solution.jump(nums2)); // Output: 2
    }
}

//Time complexity: O(n)
//where n is the length of the input array nums
//we iterate through the array once, and for each element, we perform constant-time operations

//Space complexity: O(1)
//regardless of the size of the input array, we only use a fixed amount of extra space to store
//a few variables (jumps, currEnd, farthest)
//the space complexity is constant

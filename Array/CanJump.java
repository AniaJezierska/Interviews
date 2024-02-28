public class CanJump {
    public boolean canJump(int[] nums) {
        int furthest = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (i > furthest) {
                System.out.println("Cannot reach index " + i);
                return false; // If we can't reach the current index, return false
            }
            furthest = Math.max(furthest, i + nums[i]); // Update furthest reachable index
            System.out.println("Furthest index reachable after iteration " + i + ": " + furthest);
            if (furthest >= nums.length - 1) {
                return true; // If furthest index reaches or exceeds the last index, return true
            }
        }
        return false; // If we haven't reached the last index by the end, return false
    }

    public static void main(String[] args) {
        CanJump solution = new CanJump();

        //int[] nums1 = {2, 3, 1, 1, 4};
        //System.out.println("Can reach last index for nums1: " + solution.canJump(nums1));

        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println("Can reach last index for nums2: " + solution.canJump(nums2));
    }
}

//Time complexity: O(n), where n is the length of the nums array
//we iterate through the entire array once.

//Space complexity: O(1)
//regardless of the size of the input array, we only use a fixed amount 
//of extra space to store the furthest variable. We don't use any additional 
//data structures that grow with the size of the input

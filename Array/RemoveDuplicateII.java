public class RemoveDuplicateII {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int slow = 2; // Pointer to keep track of the position for the next unique element
        for (int fast = 2; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow - 2]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};

        RemoveDuplicateII solution = new RemoveDuplicateII();
        int k = solution.removeDuplicates(nums);

        System.out.print("Output: k = " + k + ", nums = [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
            if (i < k - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

//Time complexity: O(n) where n is the length of the nums array
//this is because the algorithm iterates through the array once with the fast pointer,
//and at each iteration, it performs constant time operations.
//
//Space complexity: O(1),
//regardless of the size of the input array, the algorithm only uses a constant amount
//of extra space for storing variables like slow and fast. Therefore, the space complexity
//does not increase with the size of the input array.

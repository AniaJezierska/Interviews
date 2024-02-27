public class RotateArray {
    public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0)
            return;

        int n = nums.length;
        k = k % n; // handle cases where k is greater than the length of the array

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        rotate(nums1, k1);
        System.out.print("Output 1: ");
        printArray(nums1);

        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        rotate(nums2, k2);
        System.out.print("Output 2: ");
        printArray(nums2);
    }

    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

//Time complexity: O(n) where n is the number of elements in the input array nums
//algorithm iterates through the array three times, each time performing a constant
//number of operations on each element. Therefore, the time complexity is linear with
//respect to the size of the input array
//
//Space complexity: O(1),
//algorithm only uses a fixed amount of additional space for variables such as n, k,
//and temp, and does not scale with the size of the input array

import java.util.Arrays;

public class MergeSortedArray {
    public void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        int pointer1 = m - 1;
        int pointer2 = n - 1;
        int pointer = m + n - 1;

        while (pointer1 >= 0 && pointer2 >= 0) {
            if (nums1[pointer1] > nums2[pointer2]) {
                nums1[pointer--] = nums1[pointer1--];
            } else {
                nums1[pointer--] = nums2[pointer2--];
            }
        }

        // Copy remaining elements from nums2 to nums1 if any
        while (pointer2 >= 0) {
            nums1[pointer--] = nums2[pointer2--];
        }
    }


    public static void main(String[] args) {
        MergeSortedArray merger = new MergeSortedArray();

        // Example 1
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merger.mergeSortedArray(nums1, m, nums2, n);
        System.out.println("Merged Array Example 1: " + Arrays.toString(nums1));

        // Example 2
        int[] nums_1 = {1};
        int m_2 = 1;
        int[] nums_2 = {};
        int n_2 = 0;

        merger.mergeSortedArray(nums_1, m_2, nums_2, n_2);
        System.out.println("Merged Array Example 2: " + Arrays.toString(nums_1));
    }
}

//Time complexity: O(m+n)
//the loop executes at most m + n times, so the execution time of the algorithm is
//linear with respect to the sum of the lengths of both arrays

//Space complexity: O(1)
//the algorithm operates on a fixed amount of additional memory regardless of the size 
// of the input arrays, using only auxiliary variables



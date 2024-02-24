public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        // we can ignore the first element, because it's the first time we see that
        int insertIndex = 1;

        for (int i = 1; i < n; i++) {
            // whenever a number is first discover it can be copied to 'insert index'
            if (nums[i] != nums[i -1]) {
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;
    }

    public static void main(String[] args) {
        RemoveDuplicate solution = new RemoveDuplicate();

        int[] nums1 = {1, 1, 2};
        int length1 = solution.removeDuplicates(nums1);
        System.out.println("Length after removing duplicates: " + length1);
        for (int i = 0; i < length1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int length2 = solution.removeDuplicates(nums2);
        System.out.println("Length after removing duplicates: " + length2);
        for (int i = 0; i < length2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }
}

//Time complexity: O(n)
//this is because the algorithm iterates through the array once with a single loop

//Space complexity: O(1)
//this is because the space usage of the algorithm does not increase with the size 
//of the input array. The algorithm only uses a constant number of extra variables 
//(n, insertIndex, i), regardless of the size of the input array.

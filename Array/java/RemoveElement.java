public class RemoveElement {
    //Approach: Two Pointers
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        return n;

    /* 
        int writer = 0;
        int n = nums.length;

        for (int reader = 0; reader < n; reader++) {
            if (nums[reader] != val) {
                nums[writer++] = nums[reader];
            }
        }
        return writer;
    */
    }

    public static void main(String[] args) {
        RemoveElement solution = new RemoveElement();

        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int length1 = solution.removeElement(nums1, val1);
        System.out.println("Length after removing element " + val1 + ": " + length1);
        for (int i = 0; i < length1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
    }
}

//Time complexity: O(n)
//where n is the number of elements in the array nums.
//This is because the algorithm iterates through the array once.

//Space complexity: O(1)
//the space complexity is independent of the size of the input array

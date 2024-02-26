public class MajorityElement {
    public int majorityElement(int[] nums) {
        int majorityElement = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                majorityElement = nums[i];
                count = 1;
            } else if (nums[i] == majorityElement) {
                count++;
            } else {
                count--;
            }
        }

        return majorityElement;
    }


    public static void main(String[] args) {
        MajorityElement solution = new MajorityElement();

        int[] nums1 = {3, 2, 3};
        System.out.println("Majority element of nums1: " + solution.majorityElement(nums1));

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority element of nums2: " + solution.majorityElement(nums2));
    }
}

//Time complexity: O(n) where n is the number of elements in the input array nums
//the algorithm iterates through the array once
//
//Space complexity: O(1),
//he algorithm uses only a constant amount of extra space, regardless of the size
//of the input array. It maintains only two variables (majorityElement and count),
// which are independent of the size of the input array



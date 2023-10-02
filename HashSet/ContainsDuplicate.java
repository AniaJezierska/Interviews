import java.util.HashSet;
import java.util.Set;

/*
Input: nums = [1,2,3,1]
Output: true

Input: nums = [1,2,3,4]
Output: false
 */

public class ContainsDuplicate {
    public boolean ContainsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);

        for (int x: nums) {
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }

    /*
    public boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 1; ++i) {
        if (nums[i] == nums[i + 1]) return true;
    }
    return false;
    }
     */
}

public class JumpGame {
    public boolean canJump(int[] nums) {
        int furthest = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i > furthest) {
                return false;
            }
            furthest = Math.max(furthest, i + nums[i]);
            if (furthest >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        JumpGame jumpGame = new JumpGame();

        int[] nums1 = {2, 3, 1, 1, 4};
        int[] nums2 = {3, 2, 1, 0, 4};

        System.out.println("Can jump (nums1): " + jumpGame.canJump(nums1));
        System.out.println("Can jump (nums2): " + jumpGame.canJump(nums2));
    }
}

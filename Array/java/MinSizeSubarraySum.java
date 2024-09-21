class MinSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int currSum = 0;
        int n = nums.length;
        int start = 0;
        int minLength = Integer.MAX_VALUE;

        for(int end = 0; end < n; end++){
            currSum += nums[end];

            while(currSum >= target){
                minLength = Math.min(minLength, end - start + 1);
                currSum -= nums[start];
                start++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}

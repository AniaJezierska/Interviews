class MinSizeSubarraySum {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int currSum = 0;
        int n = nums.size();
        int start = 0;
        int minLength = INT_MAX;

        for(int end = 0; end < n; end++){
            currSum += nums[end];

            while(currSum >= target){
                minLength = min(minLength, end - start + 1);
                currSum -= nums[start];
                start++;
            }
        }
        return minLength == INT_MAX ? 0 : minLength;
    }
};

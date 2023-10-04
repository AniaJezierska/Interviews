class RemoveDuplicate {
public:
    int removeDuplicate(vector<int>& nums) {
        int n = nums.size();
        if (n == 0) {
            return 0;
        }
        int insertIndex = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;
    }
};

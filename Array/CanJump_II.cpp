#include <iostream>
#include <vector>
#include <algorithm>

int jump(std::vector<int>& nums) {
    int n = nums.size();
    int jumps = 0;
    int currentRangeEnd = 0;
    int farthest = 0;

    for (int i = 0; i < n - 1; ++i) {
        farthest = std::max(farthest, i + nums[i]);
        if (i == currentRangeEnd) {
            ++jumps;
            currentRangeEnd = farthest;
            if (currentRangeEnd >= n - 1) {
                break;
            }
        }
    }

    return jumps;
}

int main() {
    std::vector<int> nums1 = {2,3,1,1,4};
    std::cout << "Minimum number of jumps (nums1): " << jump(nums1) << std::endl;

    std::vector<int> nums2 = {2,3,0,1,4};
    std::cout << "Minimum number of jumps (nums2): " << jump(nums2) << std::endl;

    return 0;
}

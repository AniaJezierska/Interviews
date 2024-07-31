#include <iostream>
#include <vector>
#include <algorithm>

bool canJump(std::vector<int>& nums) {
    int n = nums.size();
    int maxReachable = 0;
    for (int i = 0; i < n; ++i) {
        if (i > maxReachable) {
            return false; // Cannot reach index i
        }
        maxReachable = std::max(maxReachable, i + nums[i]);
        if (maxReachable >= n - 1) {
            return true; // Reachable to the end
        }
    }
    return false;
}

int main() {
    std::vector<int> nums1 = {2,3,1,1,4};
    std::cout << "Can reach the last index (nums1): " << std::boolalpha << canJump(nums1) << std::endl;

    std::vector<int> nums2 = {3,2,1,0,4};
    std::cout << "Can reach the last index (nums2): " << std::boolalpha << canJump(nums2) << std::endl;

    return 0;
}

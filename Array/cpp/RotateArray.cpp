#include <iostream>
#include <vector>

void rotate(std::vector<int>& nums, int k) {
    int n = nums.size();
    k %= n; // To handle cases where k is greater than the size of the array
    std::reverse(nums.begin(), nums.begin() + n - k);
    std::reverse(nums.begin() + n - k, nums.end());
    std::reverse(nums.begin(), nums.end());
}

int main() {
    // Example 1
    std::vector<int> nums1 = {1, 2, 3, 4, 5, 6, 7};
    int k1 = 3;
    rotate(nums1, k1);
    std::cout << "Example 1 Output: ";
    for (int num : nums1) {
        std::cout << num << " ";
    }
    std::cout << std::endl;

    // Example 2
    std::vector<int> nums2 = {-1, -100, 3, 99};
    int k2 = 2;
    rotate(nums2, k2);
    std::cout << "Example 2 Output: ";
    for (int num : nums2) {
        std::cout << num << " ";
    }
    std::cout << std::endl;

    return 0;
}

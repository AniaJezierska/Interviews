#include <iostream>
#include <vector>

class RemoveDuplicateII {
public:
    int removeDuplicates(std::vector<int>& nums) {
        if (nums.size() <= 2) return nums.size();

        int slow = 2; // Pointer to keep track of the position for the next unique element
        for (int fast = 2; fast < nums.size(); fast++) {
            if (nums[fast] != nums[slow - 2]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
};

int main() {
    std::vector<int> nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};

    RemoveDuplicateII solution;
    int k = solution.removeDuplicates(nums);

    std::cout << "Output: k = " << k << ", nums = [";
    for (int i = 0; i < k; i++) {
        std::cout << nums[i];
        if (i < k - 1) {
            std::cout << ", ";
        }
    }
    std::cout << "]" << std::endl;

    return 0;
}

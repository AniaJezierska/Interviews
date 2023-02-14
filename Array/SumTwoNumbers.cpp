#include <iostream>
#include <vector>
#include <unordered_map>

/**
 * CLASS METHOD SumTwoNumbers...
 * @code changeHighScore() => should return the indices of two numbers
 * so that their sum is equal to the given number.
 *
 * Example:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

std::vector<int> twoSum(std::vector<int>& nums, int target) {
    std::unordered_map<int, int> map;
    for (int i = 0; i < nums.size(); ++i) {
        // current value + x = target
        // x = target - current value
        int cur = nums[i];
        int complement = target - cur;
        // if map contains the key value
        if (map.count(complement))
            return {map[complement], i};
        map[cur] = i;
    }
    return {};
}


int main() {
    auto vec = std::vector<int>{1,2,3,4};
    auto target = 5;
    vec = twoSum(vec, target);

    for (auto vector : vec){
        std::cout << vector << ' ';
    }
}

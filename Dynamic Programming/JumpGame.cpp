#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class JumpGame {
public:
    bool canJump(vector<int>& nums) {
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
};

int main() {
    vector<int> nums1 = {2, 3, 1, 1, 4};
    vector<int> nums2 = {3, 2, 1, 0, 4};
    
    JumpGame game;
    
    bool result1 = game.canJump(nums1);
    bool result2 = game.canJump(nums2);
    
    cout << "Test case 1: " << (result1 ? "True" : "False") << endl;
    cout << "Test case 2: " << (result2 ? "True" : "False") << endl;

    return 0;
}

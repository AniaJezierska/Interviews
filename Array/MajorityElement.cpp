#include <iostream>
#include <vector>

using namespace std;

class MajorityElement {
public:
    int majorityElement(vector<int>& nums) {
        int majorityElement = nums[0];
        int count = 1;

        for (int i = 1; i < nums.size(); i++) {
            if (count == 0) {
                majorityElement = nums[i];
                count = 1;
            } else if (nums[i] == majorityElement) {
                count++;
            } else {
                count--;
            }
        }

        return majorityElement;
    }
};

int main() {
    MajorityElement solution;

    vector<int> nums2 = {2, 2, 1, 1, 1, 2, 2};
    cout << "Majority element of nums2: " << solution.majorityElement(nums2) << endl;

    return 0;
}

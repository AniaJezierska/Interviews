#include <iostream>
#include <vector>
#include <unordered_set>

using namespace std;

class ContainsDuplicate {
public:
    bool containsDuplicate(vector<int>& nums) {
        unordered_set<int> set;

        for (int x : nums) {
            if (set.count(x) > 0) return true;
            set.insert(x);
        }
        return false;
    }
};

int main() {
    ContainsDuplicate cd;
    vector<int> nums = {1, 2, 3, 4, 1};

    if (cd.containsDuplicate(nums)) {
        cout << "There are duplicates." << endl;
    } else {
        cout << "There are no duplicates." << endl;
    }

    return 0;
}

#include <vector>

using namespace std;

class MergeSortedArray {
public:
    void mergeSortedArray(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int pointer1 = m - 1;
        int pointer2 = n - 1;

        for (int pointer = m + n - 1; pointer >= 0; pointer--) {
            if (pointer2 < 0) {
                break;
            }
            if (pointer1 >= 0 && nums1[pointer1] > nums2[pointer2]) {
                nums1[pointer] = nums1[pointer1--];
            } else {
                nums1[pointer] = nums2[pointer2--];
            }
        }
    }
};

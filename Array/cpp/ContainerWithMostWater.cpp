#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

class ContainerWithMostWater {
public:
    int maxArea(vector<int>& height) {
        int left = 0;
        int right = height.size() - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = min(height[left], height[right]);
            int currentArea = width * minHeight;
            maxArea = max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
};

int main() {
    ContainerWithMostWater result;
    vector<int> height = {1,20,3,4,5,11,7};
    cout << "The maximum amount of water a container can store is: "
         << result.maxArea(height) << endl;
    return 0;
}


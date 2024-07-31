#include <vector>
#include <algorithm>
#include <iostream>

int hIndex(std::vector<int>& citations) {
    std::sort(citations.begin(), citations.end(), std::greater<int>());
    int hIndex = 0;
    for (int i = 0; i < citations.size(); ++i) {
        if (citations[i] >= i + 1) {
            hIndex = i + 1;
        } else {
            break;
        }
    }
    return hIndex;
}

int main() {
    // Example usage:
    std::vector<int> citations = {3, 0, 6, 1, 5};
    int researcherHIndex = hIndex(citations);
    std::cout << "Researcher's h-index: " << researcherHIndex << std::endl;
    return 0;
}

#include <iostream>
#include <vector>
#include <algorithm>

int maxProfit(std::vector<int>& prices) {
    int minPrice = INT_MAX;
    int maxProfit = 0;

    for (int i = 0; i < prices.size(); ++i) {
        minPrice = std::min(minPrice, prices[i]);
        maxProfit = std::max(maxProfit, prices[i] - minPrice);
    }

    return maxProfit;
}

int main() {
    std::vector<int> prices1 = {7,1,5,3,6,4};
    std::cout << "Max profit for prices1: " << maxProfit(prices1) << std::endl;

    std::vector<int> prices2 = {7,6,4,3,1};
    std::cout << "Max profit for prices2: " << maxProfit(prices2) << std::endl;

    return 0;
}

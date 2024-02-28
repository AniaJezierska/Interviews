#include <iostream>
#include <vector>
#include <algorithm>

int maxProfit2(std::vector<int>& prices) {
    int maxProfit = 0;
    for (int i = 1; i < prices.size(); ++i) {
        if (prices[i] > prices[i - 1]) {
            maxProfit += prices[i] - prices[i - 1];
        }
    }
    return maxProfit;
}

int main() {
    std::vector<int> prices1 = {7,1,5,3,6,4};
    std::cout << "Max profit for prices1: " << maxProfit2(prices1) << std::endl;

    std::vector<int> prices2 = {1,2,3,4,5};
    std::cout << "Max profit for prices2: " << maxProfit2(prices2) << std::endl;

    std::vector<int> prices3 = {7,6,4,3,1};
    std::cout << "Max profit for prices3: " << maxProfit2(prices3) << std::endl;

    return 0;
}

public class MaxProfit {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        MaxProfit maxProfit = new MaxProfit();

        int[] prices1 = {7,1,5,3,6,4};
        System.out.println("Max profit for prices1: " + maxProfit.maxProfit(prices1)); // Output: 5

        int[] prices2 = {7,6,4,3,1};
        System.out.println("Max profit for prices2: " + maxProfit.maxProfit(prices2)); // Output: 0
    }
}

//Time complexity: O(n)
//where n is the number of elements in the prices array. This is because the algorithm
//iterates through the prices array once, performing constant time operations at each iteration.

//Space complexity: O(1)
//the algorithm maintains only a fixed number of variables (minPrice, maxProfit, and loop index i) 
//throughout the execution, independent of the size of the input array


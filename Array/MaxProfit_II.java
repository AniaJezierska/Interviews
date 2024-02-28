public class MaxProfit_II {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        MaxProfit_II solution = new MaxProfit_II();

        int[] prices1 = {7,1,5,3,6,4};
        System.out.println("Max profit for prices1: " + solution.maxProfit(prices1));

        int[] prices2 = {1,2,3,4,5};
        System.out.println("Max profit for prices2: " + solution.maxProfit(prices2));

        int[] prices3 = {7,6,4,3,1};
        System.out.println("Max profit for prices3: " + solution.maxProfit(prices3));
    }
}

//Time complexity: O(n)
//where n is the number of elements in the prices array. This is because we only need
// to iterate through the prices array once to calculate the maximum profit.

//Space complexity: O(1)
// which means it requires constant space. Regardless of the size of the input array, 
//we only use a fixed amount of extra space to store the maxProfit variable. 
//We don't use any additional data structures that grow with the size of the input.

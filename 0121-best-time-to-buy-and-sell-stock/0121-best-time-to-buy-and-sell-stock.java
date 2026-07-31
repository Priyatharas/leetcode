class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];   // lowest price so far
        int maxProfit = 0;          // best profit so far

        for (int i = 1; i < prices.length; i++) {

            // If current price is lower, update buy price
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            }

            // Calculate profit if sold today
            int currentProfit = prices[i] - buyPrice;

            // Update maximum profit
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }
        }

        return maxProfit;
    }
}
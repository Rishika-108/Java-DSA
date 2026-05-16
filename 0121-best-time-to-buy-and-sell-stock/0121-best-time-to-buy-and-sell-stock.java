class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int minCost = prices[0];
        for(int i = 0; i < n; i++){
           minCost = Math.min(minCost, prices[i]);
           profit = Math.max(profit, prices[i] - minCost);
        }
        return profit;
    }
}
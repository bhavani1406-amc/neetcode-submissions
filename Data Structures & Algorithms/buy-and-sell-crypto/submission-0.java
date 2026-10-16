class Solution {
    public int maxProfit(int[] prices) {
       int n = prices.length;
        int[] minPrices = new int[n];
        int[] dp = new int[n];

        minPrices[0] = prices[0];
        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            minPrices[i] = Math.min(minPrices[i - 1], prices[i]);
            dp[i] = Math.max(dp[i - 1], prices[i] - minPrices[i - 1]);
        }

        return dp[n - 1]; 

    }
}

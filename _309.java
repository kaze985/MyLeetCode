public class _309 {
    public int maxProfit(int[] prices) {
        if(prices.length == 1){
            return 0;
        }
        int length = prices.length;
        int[][] dp = new int[length][4];
        dp[0][0] = -prices[0];
        for (int i = 1; i < length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], Math.max(dp[i - 1][3], dp[i - 1][1]) - prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][3]);
            dp[i][2] = dp[i - 1][0] + prices[i];
            dp[i][3] = dp[i - 1][2];
        }
        return Math.max(dp[length - 1][1], Math.max(dp[length - 1][2], dp[length - 1][3]));
    }
}

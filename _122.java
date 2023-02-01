public class _122 {
    public int maxProfit(int[] prices) {
//        贪心解法
//        int result = 0;
//        if (prices.length < 2) {
//            return result;
//        }
//        for (int i = 1; i < prices.length; i++) {
//            int profit = prices[i] - prices[i - 1];
//            if (profit > 0) {
//                result += profit;
//            }
//        }
//        return result;

//        动态规划
        int[][] dp = new int[prices.length][2];
        dp[0][0] -= prices[0];
        dp[0][1] = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] - prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], prices[i] + dp[i - 1][0]);
        }
        return dp[prices.length - 1][1];
    }
}

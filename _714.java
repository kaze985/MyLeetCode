public class _714 {
    public int maxProfit(int[] prices, int fee) {
//        贪心解法
//        int result = 0;
//        int minPrice = prices[0];
//        for (int i = 1; i < prices.length; i++) {
//            if (prices[i] < minPrice) {
//                minPrice = prices[i];
//            }
//            if (prices[i] >= minPrice && prices[i] <= minPrice + fee) {
//                continue;
//            }
//            if (prices[i] > minPrice + fee) {
//                result += prices[i] - minPrice - fee;
//                minPrice = prices[i] - fee;
//            }
//        }
//        return result;

//        动态规划
        int[][] dp = new int[prices.length][2];
        dp[0][0] -= prices[0];
        dp[0][1] = 0;
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] - prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], prices[i] + dp[i - 1][0] - fee);
        }
        return dp[prices.length - 1][1];
    }
}

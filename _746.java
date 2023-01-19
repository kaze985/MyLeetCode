public class _746 {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[2];
        for (int i = 2; i <= cost.length; i++) {
            int min = Math.min(dp[0] + cost[i - 2], dp[1] + cost[i - 1]);
            dp[0] = dp[1];
            dp[1] = min;
        }
        return dp[1];
    }
}

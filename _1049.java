import java.util.Arrays;

public class _1049 {
    public int lastStoneWeightII(int[] stones) {
        int sum = Arrays.stream(stones).sum();
        int bagWeight = sum / 2;
        int[] dp = new int[bagWeight + 1];
        for (int i = 0; i < stones.length; i++) {
            for (int j = bagWeight; j >= stones[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
            }
        }
        return sum - 2 * dp[bagWeight];
    }
}

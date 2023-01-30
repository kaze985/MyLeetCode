public class _213 {
    public int rob(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }
        int result1 = robRange(nums, 0, nums.length - 2);
        int result2 = robRange(nums, 1, nums.length - 1);
        return Math.max(result1, result2);
    }
    public int robRange(int[] nums, int start, int end) {
        if (start == end) {
            return nums[start];
        }
        int[] dp = new int[nums.length];
        dp[start] = nums[start];
        dp[start + 1] = Math.max(nums[start], nums[start + 1]);
        for (int i = start + 2; i <= end; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[end];
    }
}

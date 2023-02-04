public class _53 {
    public int maxSubArray(int[] nums) {
//        贪心解法
//        int result = Integer.MIN_VALUE;
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            count += nums[i];
//            if (count > result) {
//                result = count;
//            }
//            if (count <= 0) {
//                count = 0;
//            }
//        }
//        return result;

//        动态规划
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int result = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
            if (dp[i] > result) result = dp[i];
        }
        return result;
    }
}

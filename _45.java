public class _45 {
    public int jump(int[] nums) {
        int curDistance = 0;
        int ans = 0;
        int nextDistance = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            nextDistance = Math.max(nums[i] + i, nextDistance);
            if (i == curDistance) {
                curDistance = nextDistance;
                ans++;
            }
        }
        return ans;
    }
}

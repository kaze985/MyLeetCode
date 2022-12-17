public class _209 {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int startIndex = 0;
        int subLength = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            subLength++;
            while (sum >= target) {
                result = Math.min(result, subLength);
                subLength--;
                sum -= nums[startIndex++];
            }
        }
        if (result == Integer.MAX_VALUE) {
            return 0;
        }
        return result;
    }
}

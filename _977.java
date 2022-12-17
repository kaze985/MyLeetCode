public class _977 {
    public int[] sortedSquares(int[] nums) {
        int[] after = new int[nums.length];
        int i = 0, j = nums.length - 1;
        for (int i1 = nums.length - 1; i1 >= 0; i1--) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                after[i1] = nums[i] * nums[i];
                i++;
            } else if (nums[i] * nums[i] <= nums[j] * nums[j]) {
                after[i1] = nums[j] * nums[j];
                j--;
            }
        }
        return after;
    }
}

public class _27 {
    public int removeElement(int[] nums, int val) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while (leftIndex <= rightIndex) {
            while (leftIndex <= rightIndex && val != nums[leftIndex]) {
                leftIndex++;
            }
            while (leftIndex <= rightIndex && val == nums[rightIndex]) {
                rightIndex--;
            }
            if (leftIndex < rightIndex) {
                nums[leftIndex++] = nums[rightIndex--];
            }
        }
        return leftIndex;
    }
}

public class _654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return traversal(nums, 0, nums.length);
    }
    public TreeNode traversal(int[] nums, int left, int right) {
        if (right - left == 0) {
            return null;
        }

        int maxValueIndex = left;
        for (int i = left + 1; i < right; i++) {
            if (nums[i] > nums[maxValueIndex]) {
                maxValueIndex = i;
            }
        }

        TreeNode root = new TreeNode(nums[maxValueIndex]);

        root.left = traversal(nums, left, maxValueIndex);
        root.right = traversal(nums, maxValueIndex + 1, right);

        return root;
    }
}

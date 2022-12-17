public class _108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length);
    }
    public TreeNode build(int[] nums, int began, int end) {
        if (began >= end) {
            return null;
        }
        int mid = (began + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = build(nums, began, mid);
        root.right = build(nums, mid + 1, end);
        return root;
    }
}

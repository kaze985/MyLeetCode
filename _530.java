public class _530 {
    int difference = Integer.MAX_VALUE;
    TreeNode pre = null;

    public int getMinimumDifference(TreeNode root) {
        traversal(root);
        return difference;
    }
    public void traversal(TreeNode root) {
        if (root == null) {
            return;
        }
        traversal(root.left);
        if (pre != null) {
            int abs = Math.abs(root.val - pre.val);
            if (abs < difference) {
                difference = abs;
            }
        }
        pre = root;
        traversal(root.right);
    }
}

public class _112 {
    int sum = 0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        sum += root.val;
        if (root.left == null && root.right == null && sum == targetSum) {
            return true;
        }

        if (root.left != null) {
            if (hasPathSum(root.left, targetSum)) {
                return true;
            }
            sum -= root.left.val;
        }
        if (root.right != null) {
            if (hasPathSum(root.right, targetSum)) {
                return true;
            }
            sum -= root.right.val;
        }
        return false;
    }
}

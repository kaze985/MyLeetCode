public class _404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 0;
        }

        int leftValue = sumOfLeftLeaves(root.left);
        if (root.left != null && root.left.left == null && root.left.right == null) {
            leftValue = root.left.val;
        }
        int rightValue = sumOfLeftLeaves(root.right);
        return leftValue + rightValue;
    }
}

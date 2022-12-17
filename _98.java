public class _98 {
    long maxValue = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (!isValidBST(root.left)) {
            return false;
        }

        if (maxValue >= root.val) {
            return false;
        } else {
            maxValue = root.val;
        }

        if (!isValidBST(root.right)) {
            return false;
        }

        return true;
    }
}

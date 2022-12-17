public class _450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (root.val == key) {
            if (root.left == null && root.right == null) {
                root = null;
            } else if (root.left == null) {
                root = root.right;
            } else if (root.right == null) {
                root = root.left;
            } else {
                TreeNode left = searchLeft(root.right);
                left.left = root.left;
                root = root.right;
            }
        } else {
            if (root.val > key) {
                root.left = deleteNode(root.left, key);
            } else {
                root.right = deleteNode(root.right, key);
            }
        }

        return root;
    }
    public TreeNode searchLeft(TreeNode root) {
        if (root != null && root.left == null) {
            return root;
        }
        return searchLeft(root.left);
    }
}

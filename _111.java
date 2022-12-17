import java.util.ArrayDeque;

public class _111 {
    public int minDepth(TreeNode root) {
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        int result = 0;
        if (root == null) {
            return result;
        }
        queue.addLast(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            result++;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.pollFirst();
                if (node.left == null && node.right == null) {
                    return result;
                }
                if (node.left != null) {
                    queue.addLast(node.left);
                }
                if (node.right != null) {
                    queue.addLast(node.right);
                }
            }
        }
        return result;
    }
}

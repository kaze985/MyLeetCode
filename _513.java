import java.util.ArrayDeque;

public class _513 {
    int maxLength = Integer.MIN_VALUE;
    int result = 0;
    public int findBottomLeftValue(TreeNode root) {
//        // 迭代法 层序遍历
//        if (root == null) {
//            return 0;
//        }
//        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
//        int result = 0;
//        queue.add(root);
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                TreeNode node = queue.pollFirst();
//                if (i == 0) {
//                    result = node.val;
//                }
//                if (node.left != null) {
//                    queue.addLast(node.left);
//                }
//                if (node.right != null) {
//                    queue.addLast(node.right);
//                }
//            }
//        }
//        return result;
        traversal(root, 0);
        return result;
    }
    public void traversal(TreeNode root, int depth) {
        if (root.left == null && root.right == null) {
            if (depth > maxLength) {
                maxLength = depth;
                result = root.val;
            }
            return;
        }
        if (root.left != null) {
            traversal(root.left, ++depth);
            depth--;
        }
        if (root.right != null) {
            traversal(root.right, ++depth);
            depth--;
        }
        return;
    }
}

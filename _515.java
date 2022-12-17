import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class _515 {
    public List<Integer> largestValues(TreeNode root) {
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        queue.addLast(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.pollFirst();
                if (node.val > max) {
                    max = node.val;
                }
                if (node.left != null) {
                    queue.addLast(node.left);
                }
                if (node.right != null) {
                    queue.addLast(node.right);
                }
            }
            result.add(max);
        }
        return result;
    }
}

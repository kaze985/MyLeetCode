import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class _637 {
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        List<Double> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        queue.addLast(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            double sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.pollFirst();
                sum += node.val;
                if (node.left != null) {
                    queue.addLast(node.left);
                }
                if (node.right != null) {
                    queue.addLast(node.right);
                }
            }
            result.add(sum / size);
        }
        return result;
    }
}

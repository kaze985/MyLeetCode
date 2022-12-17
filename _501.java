import java.util.ArrayList;
import java.util.List;

public class _501 {
    int maxCount = 0;
    int count = 0;
    TreeNode pre = null;
    List<Integer> result = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        traversal(root);
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    public void traversal(TreeNode root) {
        if (root == null) {
            return;
        }

        traversal(root.left);
        if (pre == null) {
            count = 1;
        } else if (pre.val == root.val) {
            count++;
        } else {
            count = 1;
        }
        pre = root;
        if (count == maxCount) {
            result.add(root.val);
        }
        if (count > maxCount) {
            maxCount = count;
            result.clear();
            result.add(root.val);
        }
        traversal(root.right);
    }
}

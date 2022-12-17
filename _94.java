import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class _94 {
    List<Integer> result = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
//        if (root == null) {
//            return result;
//        }
//        inorderTraversal(root.left);
//        result.add(root.val);
//        inorderTraversal(root.right);
//        return result;
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.addLast(cur);
                cur = cur.left;
            } else {
                cur = stack.pollLast();
                result.add(cur.val);
                cur = cur.right;
            }
        }
        return result;
    }
}

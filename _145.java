import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _145 {

    List<Integer> result = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
//        if (root == null) {
//            return result;
//        }
//        postorderTraversal(root.left);
//        postorderTraversal(root.right);
//        result.add(root.val);
//        return result;
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        if (root == null) {
            return result;
        }
        stack.addLast(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.peekLast();
            stack.pollLast();
            result.add(node.val);
            if (node.left != null) {
                stack.addLast(node.left);
            }
            if (node.right != null) {
                stack.addLast(node.right);
            }
        }
        Collections.reverse(result);
        return result;
    }
}

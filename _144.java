import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

class _144 {

    List<Integer> result = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
//        if (root == null) {
//            return result;
//        }
//        result.add(root.val);
//        preorderTraversal(root.left);
//        preorderTraversal(root.right);
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
            if (node.right != null) {
                stack.addLast(node.right);
            }
            if (node.left != null) {
                stack.addLast(node.left);
            }
        }
        return result;
    }
}
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;this.left = left;
          this.right = right;
      }
}

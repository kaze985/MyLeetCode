import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class _429 {
//    public List<List<Integer>> levelOrder(Node root) {
//        ArrayDeque<Node> queue = new ArrayDeque<>();
//        List<List<Integer>> result = new ArrayList<>();
//        if (root == null) {
//            return result;
//        }
//        queue.addLast(root);
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            List<Integer> subResult = new ArrayList<>();
//            for (int i = 0; i < size; i++) {
//                Node node = queue.pollFirst();
//                subResult.add(node.val);
//                if (node.children != null && !node.children.isEmpty()) {
//                    for (Node child : node.children) {
//                        queue.addLast(child);
//                    }
//                }
//            }
//            result.add(subResult);
//        }
//        return result;
//    }
}
//class Node {
//    public int val;
//    public List<Node> children;
//
//    public Node() {}
//
//    public Node(int _val) {
//        val = _val;
//    }
//
//    public Node(int _val, List<Node> _children) {
//        val = _val;
//        children = _children;
//    }
//};

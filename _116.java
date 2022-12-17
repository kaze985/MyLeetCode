import java.util.ArrayDeque;

//public class _116 {
//    public Node connect(Node root) {
//        ArrayDeque<Node> queue = new ArrayDeque<>();
//        if (root == null) {
//            return root;
//        }
//        queue.addLast(root);
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            Node pre = queue.peekFirst();
//            for (int i = 0; i < size; i++) {
//                Node node = queue.pollFirst();
//                if (i != size - 1) {
//                    pre.next = queue.peekFirst();
//                    pre = queue.peekFirst();
//                }
//                if (node.left != null) {
//                    queue.addLast(node.left);
//                }
//                if (node.right != null) {
//                    queue.addLast(node.right);
//                }
//            }
//        }
//        return root;
//    }
//}
//class Node {
//    public int val;
//    public Node left;
//    public Node right;
//    public Node next;
//
//    public Node() {}
//
//    public Node(int _val) {
//        val = _val;
//    }
//
//    public Node(int _val, Node _left, Node _right, Node _next) {
//        val = _val;
//        left = _left;
//        right = _right;
//        next = _next;
//    }
//};
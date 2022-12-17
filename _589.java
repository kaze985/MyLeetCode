import org.w3c.dom.Node;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class _589 {
//    public List<Integer> preorder(Node root) {
//        ArrayDeque<Node> stack = new ArrayDeque<>();
//        ArrayList<Integer> result = new ArrayList<>();
//        if (root == null) {
//            return result;
//        }
//        stack.addLast(root);
//        while (!stack.isEmpty()) {
//            Node node = stack.peekLast();
//            if (node.val != -1) {
//                stack.pollLast();
//                for (int i = node.children.size() - 1; i >= 0; i--) {
//                    stack.addLast(node.children.get(i));
//                }
//                stack.addLast(node);
//                stack.addLast(new Node(-1));
//            } else {
//                stack.pollLast();
//                Node pending = stack.pollLast();
//                result.add(pending.val);
//            }
//        }
//        return result;
//    }
}

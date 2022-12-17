import java.util.ArrayList;
import java.util.List;

public class _257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> path = new ArrayList<>();
        List<String> result = new ArrayList<>();
        traversal(root, path, result);
        return result;
    }
    public void traversal(TreeNode cur, List<String> path, List<String> result) {
        path.add(String.valueOf(cur.val));
        if (cur.left == null && cur.right == null) {
            String sPath = String.join("->", path);
            result.add(sPath);
            return;
        }
        if (cur.left != null) {
            traversal(cur.left, path, result);
            path.remove(path.size() - 1);
        }
        if (cur.right != null) {
            traversal(cur.right, path, result);
            path.remove(path.size() - 1);
        }

    }
}

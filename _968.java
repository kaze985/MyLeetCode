public class _968 {
    int result = 0;
    public int minCameraCover(TreeNode root) {
        if (traversal(root) == 0) {
            result++;
        }
        return result;
    }
    public int traversal(TreeNode cur) {
        if (cur == null) return 2;
        int left = traversal(cur.left);
        int right = traversal(cur.right);
        if (left == 2 && right == 2) {
            return 0;
        } else if (left == 0 || right == 0) {
            result++;
            return 1;
        } else {
            return 2;
        }
    }
}

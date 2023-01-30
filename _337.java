public class _337 {
    public int rob(TreeNode root) {
        int[] result = robTree(root);
        return Math.max(result[0], result[1]);
    }
    public int[] robTree(TreeNode cur) {
        if (cur == null) return new int[]{0, 0};
        int[] left = robTree(cur.left);
        int[] right = robTree(cur.right);
        int val1 = cur.val + left[0] + right[0];
        int val2 = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return new int[]{val2, val1};
    }
}

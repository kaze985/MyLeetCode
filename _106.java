public class _106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return traversal(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }
    public TreeNode traversal(int[] inorder, int beganInorder, int endInorder, int[] postorder, int beganPostorder, int endPostorder) {
        if (endPostorder - beganPostorder == 0) {
            return null;
        }

        int val = postorder[endPostorder - 1];
        TreeNode root = new TreeNode(val);

        if (endPostorder - beganPostorder == 1) {
            return root;
        }

        int delimiterIndex;
        for (delimiterIndex = beganInorder; delimiterIndex < endInorder; delimiterIndex++) {
            if (inorder[delimiterIndex] == val) {
                break;
            }
        }

        int end = beganPostorder + (delimiterIndex - beganInorder);

        root.left = traversal(inorder, beganInorder, delimiterIndex, postorder, beganPostorder, end);
        root.right = traversal(inorder, delimiterIndex + 1, endInorder, postorder, end, endPostorder - 1);

        return root;
    }

    public static void main(String[] args) {
        new _106().buildTree(new int[]{9,3,15,20,7}, new int[]{9,15,7,20,3});
    }
}

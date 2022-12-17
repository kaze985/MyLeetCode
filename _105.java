public class _105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return traversal(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }
    public TreeNode traversal(int[] preorder, int preBegan, int preEnd, int[] inorder, int inBegan, int inEnd) {
        if (preEnd - preBegan == 0) {
            return null;
        }

        int val = preorder[preBegan];
        TreeNode root = new TreeNode(val);

        if (preEnd - preBegan == 1) {
            return root;
        }

        int delimiterIndex;
        for (delimiterIndex = inBegan; delimiterIndex < inEnd; delimiterIndex++) {
            if (inorder[delimiterIndex] == val) {
                break;
            }
        }

        int began = preBegan + 1;
        int end = began + (delimiterIndex - inBegan);

        root.left = traversal(preorder, began, end, inorder, inBegan, delimiterIndex);
        root.right = traversal(preorder, end, preEnd, inorder, delimiterIndex + 1, inEnd);

        return root;
    }

    public static void main(String[] args) {
        new _105().buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7});
    }
}

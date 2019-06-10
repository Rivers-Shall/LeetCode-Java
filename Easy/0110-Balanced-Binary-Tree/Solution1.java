class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    class Depth {
        int val;
    }

    public boolean isBalanced(TreeNode root) {
        Depth d = new Depth();
        return isBalanced(root, d);
    }

    private boolean isBalanced(TreeNode root, Depth depth) {
        if (root == null) {
            depth.val = 0;
            return true;
        }

        boolean bothBalanced = isBalanced(root.left, depth);
        int leftDepth = depth.val;
        bothBalanced &= isBalanced(root.right, depth);
        int rightDepth = depth.val;
        depth.val = Math.max(leftDepth, rightDepth) + 1;
        return bothBalanced && Math.abs(leftDepth - rightDepth) <= 1;
    }
}
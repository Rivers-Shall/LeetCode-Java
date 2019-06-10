class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution1 {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        return minDepth(root, 1);
    }

    private int minDepth(TreeNode root, int depth) {
        if (root.left == null && root.right == null) return depth;
        if (root.left == null) return minDepth(root.right, depth + 1);
        if (root.right == null) return minDepth(root.left, depth + 1);
        return Math.min(minDepth(root.left, depth + 1), minDepth(root.right, depth + 1));
    }
}
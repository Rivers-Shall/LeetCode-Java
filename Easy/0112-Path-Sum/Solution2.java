class Solution2 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        return hasPathSum(sum, root);
    }

    private boolean hasPathSum(int sum, TreeNode root) {
        if (root == null && sum == 0) return true;
        if (root == null && sum != 0) return false;
        if (root.left == null) return hasPathSum(sum - root.val, root.right);
        if (root.right == null) return hasPathSum(sum - root.val, root.left);
        return hasPathSum(sum - root.val, root.left) || hasPathSum(sum - root.val, root.right);
    }
}
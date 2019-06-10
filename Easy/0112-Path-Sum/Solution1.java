class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution1 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null && sum == root.val) return true;
        boolean hasPath = false;
        if (root.left != null) {
            hasPath |= hasPathSum(root.left, sum - root.val);
        }
        if (hasPath) return hasPath;
        if (root.right != null) {
            hasPath |= hasPathSum(root.right, sum - root.val);
        }
        return hasPath;
    }
}
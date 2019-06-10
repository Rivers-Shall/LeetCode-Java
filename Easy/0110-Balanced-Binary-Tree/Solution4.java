class Solution3 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return heightCheck(root) != -1;
    }

    private int heightCheck(TreeNode root) {
        if (root == null) return 0;
        
        int leftCheck = heightCheck(root.left);
        if (leftCheck < 0) return -1;
        int rightCheck = heightCheck(root.right);
        if (rightCheck < 0) return -1;
        if (Math.abs(leftCheck - rightCheck) > 1) {
            return -1;
        }
        return Math.max(leftCheck, rightCheck) + 1;
    }
}
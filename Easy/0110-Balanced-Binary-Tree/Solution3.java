class Solution3 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return heightCheck(root) != -1;
    }

    private int heightCheck(TreeNode root) {
        if (root == null) return 0;
        
        int leftCheck = heightCheck(root.left);
        int rightCheck = heightCheck(root.right);
        if (leftCheck < 0 || rightCheck < 0) {
            return -1;
        } else if (Math.abs(leftCheck - rightCheck) <= 1) {
            return Math.max(leftCheck, rightCheck) + 1;
        }
        return -1;
    }
}
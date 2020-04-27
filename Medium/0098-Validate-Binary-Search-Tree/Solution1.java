class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution1 {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isValidBST(TreeNode root, int min, int max) {
        if (root == null) {
            return true;
        }
        boolean valid = true;
        valid &= root.val >= min && root.val <= max;
        if (root.left != null) {
            valid &= root.left.val < root.val;
            valid &= isValidBST(root.left, min, Math.min(max, root.val - 1));
        }
        if (root.right != null) {
            valid &= root.right.val > root.val;
            valid &= isValidBST(root.right, Math.max(min, root.val + 1), max);
        }
        return valid;
    }

    public static void main(String[] args) {
        testOne();
        testTwo();
    }

    private static void testOne() {
        Solution1 s = new Solution1();
        TreeNode t1 = new TreeNode(10);
        TreeNode t2 = new TreeNode(5);
        TreeNode t3 = new TreeNode(15);
        TreeNode t4 = new TreeNode(6);
        TreeNode t5 = new TreeNode(20);
        t1.left = t2;
        t1.right = t3;
        t3.left = t4;
        t3.right = t5;
        System.out.println(s.isValidBST(t1));
    }

    private static void testTwo() {
        Solution1 s = new Solution1();
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(5);
        TreeNode t4 = new TreeNode(0);
        TreeNode t5 = new TreeNode(2);
        TreeNode t6 = new TreeNode(4);
        TreeNode t7 = new TreeNode(6);
        TreeNode t8 = new TreeNode(3);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;
        t5.right = t8;
        System.out.println(s.isValidBST(t1));
    }
}
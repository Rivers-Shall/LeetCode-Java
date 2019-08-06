class Solution2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val > q.val) {
            TreeNode tmp = p;
            p = q;
            q = tmp;
        }

        if (root == null) {
            return null;
        }

        if (root.val <= q.val && root.val >= p.val) {
            return root;
        }

        if (root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }

        if (root.val < p.val) {
            return lowestCommonAncestor(root.right, p, q);
        }

        return null;
    }
}
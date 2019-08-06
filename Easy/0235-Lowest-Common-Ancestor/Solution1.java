public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution1 {
    private static class TreeStatus {
        int nOfTarget;
        TreeNode LCA;

        TreeStatus(int nOfTarget, TreeNode LCA) {
            this.nOfTarget = nOfTarget;
            this.LCA       = LCA;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return lowestCommonAncestorStatus(root, p, q).LCA;
    }

    private TreeStatus lowestCommonAncestorStatus(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return new TreeStatus(0, null);
        }

        TreeStatus findInLeft = lowestCommonAncestorStatus(root.left, p, q);
        if (findInLeft.nOfTarget == 2) {
            return findInLeft;
        }

        TreeStatus findInRight = lowestCommonAncestorStatus(root.right, p, q);
        if (findInRight.nOfTarget == 2) {
            return findInRight;
        }

        int rootTarget = (root == q || root == p) ? 1 : 0;
        return new TreeStatus(rootTarget + findInLeft.nOfTarget + findInRight.nOfTarget, root); 
    }
}

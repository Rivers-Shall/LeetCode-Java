
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution1 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetric(root.left, root.right);       
    }

    private boolean isSymmetric(TreeNode p, TreeNode q) {
        Stack<TreeNode> stackP = new Stack<>();
        Stack<TreeNode> stackQ = new Stack<>();

        stackP.push(p);
        stackQ.push(q);
        while (!stackP.empty() && !stackQ.empty()) {
            p = stackP.pop();
            q = stackQ.pop();
            if (p == null && q == null) continue;
            if (p == null || q == null) return false;
            if (p.val != q.val) return false;
            stackP.push(p.left);
            stackP.push(p.right);
            stackQ.push(q.right);
            stackQ.push(q.left);
        }
        return stackP.empty() && stackQ.empty();
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        TreeNode t = new TreeNode(0);
        t.left = new TreeNode(1);
        t.right = new TreeNode(1);
        t.left.left = new TreeNode(2);
        t.left.right = new TreeNode(3);
        t.right.left = new TreeNode(3);
        //t.right.right = new TreeNode(2);
        System.out.println(s.isSymmetric(t));
    }
}
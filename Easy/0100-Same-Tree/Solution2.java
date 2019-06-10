import java.util.Stack;

class Solution2 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> stackP = new Stack<>();
        Stack<TreeNode> stackQ = new Stack<>();
        stackP.push(p);
        stackQ.push(q);
        while (!stackP.empty() && !stackQ.empty()) {
            p = stackP.pop();
            q = stackQ.pop();
            if (p == null && q == null) continue;
            if (p == null || q == null) return false;
            if (p.val != q.val) {
                return false;
            }
            stackP.push(p.left);
            stackP.push(p.right);
            stackQ.push(q.left);
            stackQ.push(q.right);
        }
        return stackP.empty() && stackQ.empty();
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        TreeNode t2 = new TreeNode(1);
        t2.left = new TreeNode(2);
        t2.right = new TreeNode(3);
        System.out.println(s.isSameTree(t1, t2));
    }
}
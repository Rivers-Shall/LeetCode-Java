import java.util.LinkedList;
import java.util.Queue;

class Solution2 {
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if (root != null) q.add(root);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            TreeNode tmp = curr.left;
            curr.left = curr.right;
            curr.right = tmp;
            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }
        return root;
    }
}

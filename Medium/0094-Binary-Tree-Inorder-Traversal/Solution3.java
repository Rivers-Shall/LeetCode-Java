import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution3 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while (!stack.empty()) {
            while (root != null && root.left != null) {
                stack.add(root.left);
                root = root.left;
            }
            if (!stack.empty()) {
                root = stack.pop();
                result.add(root.val);
                if (root.right != null) {
                    stack.add(root.right);
                }
                root = root.right;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        t1.left = t2;
        t1.right = t3;
        System.out.println(s.inorderTraversal(t1));
    }
}
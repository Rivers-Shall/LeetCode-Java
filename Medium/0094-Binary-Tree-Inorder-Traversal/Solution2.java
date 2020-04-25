import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution2 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        Stack<TreeNode> inOrderStack = new Stack<>();
        inOrderStack.add(root);
        while (!inOrderStack.empty()) {
            TreeNode node = inOrderStack.peek();
            if (node.left != null) {
                inOrderStack.add(node.left);
                node.left = null;
            } else {
                inOrderStack.pop();
                result.add(node.val);
                if (node.right != null) {
                    inOrderStack.add(node.right);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        t1.left = t2;
        t1.right = t3;
        System.out.println(s.inorderTraversal(t1));
    }
}
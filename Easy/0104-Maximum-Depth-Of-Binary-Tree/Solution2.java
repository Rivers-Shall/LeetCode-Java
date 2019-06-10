import java.util.Stack;

class Solution2 {
    private class NodeAndDepth {
        TreeNode node;
        int depth;

        NodeAndDepth(TreeNode aNode, int theDepth) {
            node = aNode;
            depth = theDepth;
        }
    }

    public int maxDepth(TreeNode root) {
        int maxDepth = 0;
        Stack<NodeAndDepth> stack = new Stack<>();
        if (root == null) return 0;
        stack.push(new NodeAndDepth(root, 1));
        while (!stack.empty()) {
            NodeAndDepth cur = stack.pop();
            root = cur.node;
            maxDepth = Math.max(maxDepth, cur.depth);
            if (root.left != null) {
                stack.push(new NodeAndDepth(root.left, cur.depth + 1));
            }
            if (root.right != null) {
                stack.push(new NodeAndDepth(root.right, cur.depth + 1));
            }
        }
        return maxDepth;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(s.maxDepth(root));
    }
}
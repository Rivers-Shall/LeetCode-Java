import java.util.LinkedList;

class Solution3 {

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
        LinkedList<NodeAndDepth> queue = new LinkedList<>();
        
        if (root == null) return 0;
        queue.add(new NodeAndDepth(root, 1));
        while (!queue.isEmpty()) {
            NodeAndDepth cur = queue.poll();
            root = cur.node;
            maxDepth = Math.max(maxDepth, cur.depth);
            if (root.left != null) {
                queue.add(new NodeAndDepth(root.left, cur.depth + 1));
            }
            if (root.right != null) {
                queue.add(new NodeAndDepth(root.right, cur.depth + 1));
            }
        }
        return maxDepth;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(s.maxDepth(root));
    }
}
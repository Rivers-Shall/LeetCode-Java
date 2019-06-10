import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    private class NodeAndDepth {
        TreeNode node;
        int depth;

        public NodeAndDepth(TreeNode aNode, int theDepth) {
            node = aNode;
            depth = theDepth;
        }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        final int START_DEPTH = 0;

        LinkedList<NodeAndDepth> queue = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();
        
        if (root == null) return result;
        queue.add(new NodeAndDepth(root, START_DEPTH));
        result.add(new LinkedList<>());
        int curDepth = START_DEPTH;
        while (!queue.isEmpty()) {
            NodeAndDepth cur = queue.poll();
            root = cur.node;
            if (cur.depth != curDepth) {
                result.add(new LinkedList<>());
                curDepth = cur.depth;
            }
            result.get(cur.depth).add(root.val);
            if (root.left != null) queue.add(new NodeAndDepth(root.left, cur.depth + 1));
            if (root.right != null) queue.add(new NodeAndDepth(root.right, cur.depth + 1));
        }
        Collections.reverse(result);
        return result;
    }
}
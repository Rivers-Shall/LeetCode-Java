import java.util.LinkedList;
import java.util.List;

class Solution4 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();
        
        if (root == null) return result;
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            result.add(0, new LinkedList<>());
            for (int i = 0; i < levelNum; ++i) {
                root = queue.poll();
                result.get(0).add(root.val);
                if (root.left != null)
                    queue.add(root.left);
                if (root.right != null)
                    queue.add(root.right);
            }
        }
        return result;
    }
}
import java.util.LinkedList;
import java.util.List;

class Solution3 {
    LinkedList<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return result;
        dfs(root, 0);
        return result;
    }

    private void dfs(TreeNode root, int depth) {
        while (result.size() <= depth) {
            result.add(0, new LinkedList<>());
        }
        result.get(result.size() - depth - 1).add(root.val);
        if (root.left != null) dfs(root.left, depth + 1);
        if (root.right != null) dfs(root.right, depth + 1);
    }
}
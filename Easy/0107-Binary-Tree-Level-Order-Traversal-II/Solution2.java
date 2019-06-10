import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Solution2 {
    LinkedList<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return result;
        dfs(root, 0);
        Collections.reverse(result);
        return result;
    }

    private void dfs(TreeNode root, int depth) {
        while (result.size() <= depth) {
            result.add(new LinkedList<>());
        }
        result.get(depth).add(root.val);
        if (root.left != null) dfs(root.left, depth + 1);
        if (root.right != null) dfs(root.right, depth + 1);
    }
}
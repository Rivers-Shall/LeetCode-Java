import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution2 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        TreeNode markElement = new TreeNode(0);
        List<Integer> vals = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            queue.add(markElement);
            TreeNode t;
            while ((t = queue.poll()) != markElement) {
                vals.add(t.val);
                if (t.left != null) {
                    queue.add(t.left);
                }
                if (t.right != null) {
                    queue.add(t.right);
                }
            }
            result.add(new ArrayList<>(vals));
            vals.clear();
        }
        return result;
    }

    public static void main(String[] args) {
        testOne();
    }

    private static void testOne() {
        Solution2 s = new Solution2();
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(9);
        TreeNode t3 = new TreeNode(20);
        TreeNode t4 = new TreeNode(15);
        TreeNode t5 = new TreeNode(7);
        t1.left = t2;
        t1.right = t3;
        t3.left = t4;
        t3.right = t5;
        System.out.println(s.levelOrder(t1));
    }
}
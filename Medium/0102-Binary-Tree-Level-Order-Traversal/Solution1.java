import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution1 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> level1 = new ArrayDeque<>();
        Queue<TreeNode> level2 = new ArrayDeque<>();
        level1.add(root);
        while (!level1.isEmpty() || !level2.isEmpty()) {
            Queue<TreeNode> curr, next;
            if (!level1.isEmpty()) {
                curr = level1;
                next = level2;
            } else {
                curr = level2;
                next = level1;
            }
            List<Integer> vals = new ArrayList<>();
            while (!curr.isEmpty()) {
                TreeNode t = curr.poll();
                vals.add(t.val);
                if (t.left != null) {
                    next.add(t.left);
                }
                if (t.right != null) {
                    next.add(t.right);
                }
            }
            result.add(vals);
        }
        return result;
    }

    public static void main(String[] args) {
        testOne();
    }

    private static void testOne() {
        Solution1 s = new Solution1();
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
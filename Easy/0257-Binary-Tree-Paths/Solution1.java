import java.util.ArrayList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution1 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> treePaths = new ArrayList<>();
        return binaryTreePaths(root, "", treePaths);
    }

    private List<String> binaryTreePaths(TreeNode root, String prefix, List<String> treePaths) {
        if (root == null) {
            return treePaths;
        }

        String pathUntilCurrent = prefix + root.val;
        if (root.left == null && root.right == null) { // leaf
            treePaths.add(pathUntilCurrent);
        } else {
            String pathWithArrow = pathUntilCurrent + "->";
            binaryTreePaths(root.left, pathWithArrow, treePaths);
            binaryTreePaths(root.right, pathWithArrow, treePaths);
        }

        return treePaths;
    }
}
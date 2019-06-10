# 0111 Minimum Depth of Binary Tree

## Solution1.java

Solution 1 is the basic solution based on DFS and an accumulator passed in the process of DFS.

## Solution2.java

Solution 2 is the basic solution based on DFS without an accumulator.

## Solution3.java

Solution 3 is the basic solution based on BFS.  Under this circumstance, it may be faster than DFS-based solution.

## Note

When using recursive solution, we should think carefully about the property of the recursive call.  For example, the previous wrong version of solution 2 is:
```Java
class Solution2 {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
```

It is a little tricky to tell that it is wrong.  But when the `root` only have one child, this recursive call does not return the minimum depth of tree rooted as `root` any more.
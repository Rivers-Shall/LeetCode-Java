# 0235 Lowest Common Ancestor of a Binary Search Tree

## Solution1.java

Solution 1 is a generic solution for binary trees instead of BST.  It is slower.  The invariant it holds for the function `lowestCommonAncestorStatus` is:

> It returns an instance of `TreeStatus` where `nOfTarget` means the number of targets(`p` and `q`) in tree rooted at `root`.  And if `nOfTarget == 2`, `LCA` will hold the root of the tree which contains both the target.  And it is the lowest common ancestor.  Otherwise, field `LCA` is invalid.

## Solution2.java

Solution 2 is the solution designed for BST.  It searches for the root of the tree which contains both the target.  But it uses the property of BST.

## Solution3.java

Solution 3 is the iterative version for solution 2.

## Note

The time complexity of solution 2 and 3 is $O(n)$ because the whole tree can be a chain with `p` and `q` at the bottom.

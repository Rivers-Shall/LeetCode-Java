# 0110 Balanced Binary Tree

## Solution1.java

Solution 1 is the basic solution which returns a boolean value to suggest whether the whole tree is balanced or not and passes and mutates a wrapped `int` to get the depth.

## Solution2.java

Solution 2 is solution 1 with a little optimization.  With a few more conditional statements, solution 2 can cut off many redundant branches in the searching process, i.e., return false when there is an unbalanced subtree and leave other subtrees out.

## Solution3.java

Solution 3 is the solution which returns `-1` to suggest unbalanced subtree and non-negative numbers as depth.

## Solution4.java

Solution 4 is solution 3 with a little optimization similar to solution 2.
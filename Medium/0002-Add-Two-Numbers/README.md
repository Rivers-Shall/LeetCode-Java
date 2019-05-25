# 0002 Add Two Numbers

## Solution1.java

Solution 1 is the basic iterative solution.

## Solution2.java

Solution 2 is the refined version of solution 1.  With a little change of the loop condition, I can eliminate the ugly special case after the loop.

## Solution3.java

Solution 3 is the basic recursive solution.

## Solution4.java

The first three solutions all construct a new linked list without mutating the original `l1` and `l2`, which is often a desired property in real development.  But solution 4 still gives an iterative version which uses the original lists to save space cost.
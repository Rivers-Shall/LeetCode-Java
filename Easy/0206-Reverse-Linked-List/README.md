# 0206 Reverse Linked List

## Solution1.java

Solution 1 is the iterative solution with three pointers `prev`, `curr` and `next`.

## Solution2.java

Solution 2 is the recursive solution.  It is a tail-recursion and it can be directly transformed into an iteration---just the one in solution 1.

## Note

The basic idea is to split the whole list into two lists, one reversed, the other not reversed.  And expand the reversed one by moving one node from the not-reversed one each loop.

# 0237 Delete Node in a Linked List

## Solution1.java

Solution 1 is an iterative solution.  It is similar to insersion sort, covering the element to delete by moving all nodes after it forward.  But it takes $O(n)$ time.

## Solution2.java

Solution 2 is a simple and clever solution.  It copies the content of the next element into current one and deletes the next node.  It takes only $O(1)$ time.

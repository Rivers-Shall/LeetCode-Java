# 19 Remove Nth Node From End of List

## Solution

Solution 1 is the one-pass-with-two-pointers solution to this problem.  We just maintain two pointers whose distance is $n$ nodes so that when one of them touches the end, the other points to the node to delete.

Of course we can do this with two passes with on pass counting the number of the node and the other finding the node to delete.

## Note

The most important problem is that to delete a node we need to find the node before it.  But when the node to delete is the head, there is no previous node.  The standard solution online uses a dummy node while I change the loop condition into `while (last != null && last.next != null)`.

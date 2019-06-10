# 0141 Linked List Cycle

## Solution1.java

Solution 1 is a simple solution.  It makes every visited node point to the head.  So if there is a cycle, when the `curr` returns to a previous visited node from tail, `curr.next == head`.  Otherwise, `curr.next == head` will never be true.

One thing worth mentioning:

At the end we can use either `return curr != null;` or `return curr.next == head`.  They seem to be the same.  But the latter one may cause `NullPointerException`.
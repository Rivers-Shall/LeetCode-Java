# 0021 Merge Two Sorted List

## Solution1.java

Solution 1 is the basic iterative solution inspired by Merge Sort.

## Solution4.java

Solution 4 is the refined version of Solution 1.  There are two major improvements:

1. When one of `l1, l2` is `null`, there is no need to iterate through the remaining one.  Just assigning the reference will be fine **for linked list**.
2. Instead of assigning `newHead = newHead.next` and then returning `newHead`, just returning `newHead.next` is fine.

## Solution2.java

Solution 2 is the basic recursive solution.

## Solution3.java

Solution 3 is the refined version of Solution 2.  There are two major improvements:

1. Simplify the condition statements at the beginning for basic cases.
2. Instead of using a new variable `newHead`, sticking to `l1, l2` avoids extra assignment.
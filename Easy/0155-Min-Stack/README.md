# 0155 Min Stack

## Solution1.java

Solution 1 is my simple solution with **TWO STACKS**.  `stack` contains all the data and `minStack` contains the min value by storing the min value of first $i$ values in the $i$th position of `minStack`.

## Solution2.java

Solution 2 is a solution with **ONLY ONE STACK**.  But actually it is not much different from solution 1.  It stores the min value of the first $i$ values on the stack only when the $i+1$th value is less than all of them.  It may gain a little more efficiency, but when the workload is bad, the performance is bad.

## Solution3.java

Solution 3 is a real solution with **ONLY ONE STACK**.  The property of the elements on `stack` and `min` is

> If `stack.peek() > 0`, `min + stack.peek()` is the top element.  Otherwise, `min` is the top element.

Or we can say

> The $i$th element on the stack is the *real* $i$th element subtract the min value among the first $i-1$ values.
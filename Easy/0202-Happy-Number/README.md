# 0202 Happy Number

## Solution1.java

Solution 1 is the most elegant solution with Floyd Cycle Detection Algorithm.  The central point of this algorithm is using two pointers and making one of them one step faster than the other every time.  If there is a cycle, the two pointers will meet at last.

## Solution2.java

Solution 2 is the straightforward way to detect cycle, which stores every value visited.  And if a visited value occurs again, there must be a cycle.

## Solution3.java

Solution 3 is the refined version of solution 2 by using `HashSet` instead of `TreeSet` to trade for time at the cost of memory space.

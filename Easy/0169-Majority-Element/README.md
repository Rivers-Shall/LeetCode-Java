# 0169 Majority Element

## Solution1.java

Solution 1 is the basic solution of finding the $\lfloor n/2\rfloor + 1$th element.  It uses the `findRank` function which comes from quick sort.

## Solution2.java

Solution 2 is the refined version of solution 1.  Instead of `nums[lo]`, it uses `nums[mid]` as the pivot to improve the performance.  Of course, the best solution is to use a random element in `nums[lo..hi]`.

## Solution3.java

Solution 3 is the clever way.  The informal explanation of the solution is that the majority element can **cancel** the other elements.
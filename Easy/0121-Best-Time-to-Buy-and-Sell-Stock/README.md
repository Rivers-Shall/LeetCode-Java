# 0121 Best Time to Buy and Sell Stock

## Solution1.java

Solution 1 is the basic dynamic solution.  It transforms the original problem into *Max Subarray* problem.  And to solve *Max Subarry* problem, we define a state `maxProfitEndAt[i]`:

> the maximum sum of the subarrays which end at `diff[i]`

Also, we have this formula

> `maxProfitEndAt[i] = max(maxProfitEndAt[i - 1] + diff[i], diff[i])`

## Solution2.java

Solution 2 is the refined version of solution 1 by separating two subroutines to make the program more clear.

## Solution3.java

Solution 3 is the same as the dynamic-programming solution indeed.  But it exploits a better invariant:

> `minPrice` is the minimum price in `prices[0, i)`.  `maxProfit` is the maximum profit which could be earned by a transaction in `[0, i)`
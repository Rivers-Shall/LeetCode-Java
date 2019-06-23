# 0198 House Robber

## Solution1.java

Solution 1 is the $O(n)$-time DP solution.  The formula for the solution is:
> `firstNMax[i] = max(firstNMax[i - 1], firstNMax[i - 2] + nums[i])`, corresponding to whether you choose `num[i]` in the `firstNMax[i]`.

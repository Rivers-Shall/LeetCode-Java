# 0292 Nim Game

## Solution1.java

Solution 1 is the DP solution to this problem.  I can win with `n` stones if and only if I will lose with `n-1` or `n-2` or `n-3` stones.  It is $O(n)$.

## Solution2.java

Solution 2 is very clever because the formula in solution 1 is equal to `(n % 4) != 0`.  It is $O(1)$.

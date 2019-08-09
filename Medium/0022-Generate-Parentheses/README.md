# 22 Generate Parentheses

## Solution

### Solution1.java

Solution 1 is the recursive solution.  Different from normal recursion, it needs to variable to decide the next step.  Some solutions online need three variables.  They are similar to mine, but I use 0 instead of another variable as a standard.

### Solution2.java

Solution 2 is the iterative solution.  It is also a DP solution.  The fomular it exploits is
> $f(n) = (f(n - 1))f(0) + (f(n-2))f(1) +\cdots+(f(0))f(n-1)$

It is easy to prove this fomular.  First, every combination of parentheses in different sets are different.  Second, all these combinations of parentheses use $n$ pairs of parentheses.  Third, every combination of $n$ parentheses can be found in the right side of the fomular.

The first and second part prove that it is a one-to-one mapping.  The third part proves that it is an onto mapping.

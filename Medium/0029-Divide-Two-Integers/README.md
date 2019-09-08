# 0029 Divide Two Integers

## Solution1.java

Solution 1 solves the problem by computing the binary form of the result.  But there are still some pitfalls.

- `1L << power` instead of `1 << power` since we are dealing with `long` instead of `int`.  Otherwise, there will be sign extension and the result may not be what we want.
- if we want to check whether the result has overflowed considered the range of `int`, we must add the sign to result because the range of `int` is not symmetric.

# 278 First Bad Version

## Solution

The solution is obvious since it is just a binary search.

## Note

In the process of implementing this solution, I have a chance to revise the way of implementing such kind of binary search.  And the most important tip is
> `low + (high - low) / 2` is different from `high + (low - high) / 2` because of the rounding way of Java.

# 0303 Range Sum Query - Immutable

## Solution1.java

Solution 1 is a non-standard prefix-sum solution.  It needs original array and one extra addition every query.

## Solution2.java

Solution 2 is a standard prefix-sum solution.  Instead of the original array, it only needs one extra cell in the prefix-sum array.  And it can save one addition every query compared to solution 1.

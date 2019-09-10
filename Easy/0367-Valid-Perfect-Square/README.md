# 0367 Valid Perfect Square

## Solution1.java

Solution 1 solves the problem by binary search.  There are two important points:

1. Use `long` instead of `int` to store `midSquare` in case of `int` overflow.
2. Use `0` and `num` as the initial value of `left` and `right` instead of `0` and `num - 1`.

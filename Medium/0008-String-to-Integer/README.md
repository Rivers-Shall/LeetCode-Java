# 0008 String to Integer

## Solution1.java

Solution 1 is the basic solution with the overflow-detection done by using `long` instead of `int` to hold the result.

There are a few points worth mentioning:

1. check the index
2. consider the formula carefully

## Solution2.java

Solution 2 is the solution which uses division to detect overflow.
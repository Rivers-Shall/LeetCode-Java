# 0026 Remove Duplicates From Sorted Array

## Solution1.java

Solution 1 is the basic version of double-pointer solution.  One pointer is used to maintain the unique-number array and the other is used to find new numbers.

## Solution2.java

Solution 2 is the refined version of Solution 1.  It finds the key point that a new number shows up only when `numbers[i] != numbers[i - 1]` and `numbers[i]` is the new number.
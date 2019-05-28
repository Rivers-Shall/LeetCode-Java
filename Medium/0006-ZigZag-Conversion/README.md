# 0006 ZigZag Conversion

## Solution1.java

Solution 1 finishes the job by first breaking the whole string into `2 * numRows - 2`-len intervals.  For the first and last row, we only need to append one character.  And for the rows in between, we need to append two characters and the sum of their indices(relative indices, in the interval) is `2 * numRows - 2`.

Careful with the case where `numRows == 1`.

## Solution2.java

Solution 2 finishes the job by simulating the process of constructing a ZigZag string.  It takes more time and space, actually.
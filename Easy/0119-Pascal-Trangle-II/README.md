# 0119 Pascal's Triangle II

## Solution1.java

Solution 1 is the basic solution inspired by and refined from solution 3 of 0118.  It turns out that we can construct the next row from the current row **IN-PLACE** both from beginning to the end and from the end to the beginning.  When we do this from end to the beginning, we can get both concise code and good performance.

## Solution2.java

Solution 2 is the refined version which exploits ordinary array and conversion from ordinary array to `ArrayList`.  This is faster.
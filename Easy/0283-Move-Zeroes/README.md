# 0283 Move Zeroes

## Solution1.java

Solution 1 solves the problem by

1. find the first 0
2. find the next non-zero element **from the position of the first 0**
3. exchange them
4. repeat the previous 3 steps until all the rest are 0

## Solution2.java

To my surprise, solution 1 is a pretty slow solution.  After serious consideration, I improved it

1. find the first 0
2. find the next non-zero element **from the previous position of the next non-zero element**
3. exchange them
4. repeat the previous 3 steps until all the rest are 0

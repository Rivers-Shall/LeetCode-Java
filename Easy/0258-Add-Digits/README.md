# 258 Add Digits

## Solution

Solution 1 is the $O(1)$ time solution to this problem.  Because a number can be viewed as the sum of the product of digits and power of 10, we take the module of 9.  Thus power of 10 becomes 1.  And the result is the sum of digits.  And this simplification will continue until we have only one digit.

Solution 2 is the iterative solution to this problem.  It does not have an $O(1)$ time complexity.  But it is very fast for the scale of the problem shrinks logarithmicly after every loop.

## Note

In solution 1, we need to pay attention to the special case where `num == 0`.

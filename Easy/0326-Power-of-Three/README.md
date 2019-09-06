# 0326 Power of Three

## Solution1.java

Solution 1 is the normal recursive solution.

## Solution2.java

Solution 2 is the normal iterative solution.  Note that `powerOfThree` must be `long`.  Otherwise, `int` will overflow.

## Solution3.java

Solution 3 solves the problem by turning the number into 3-base number and matches it with regular expression `^10*`, which means the 3-base expression must start with 1 and be followed by only zeroes.

## Solution4.java

Solution 4 exploits the limits of `int`.  Since the largest power of 3 `int` can have is $3^{19}$, we only need to check whether `n` divides $3^{19}$.

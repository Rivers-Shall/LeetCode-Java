# 0191 Number of 1 Bits

## Solution1.java

Solution 1 is the normal solution which checks every bit of `n`.

## Solution2.java

Solution 2 is the tricky solution which exploits the property that `n &= n - 1` will eliminate the last 1 bit of `n`.

# 0231 Power of Two

## Solution1.java

---
Q: How does solution 1 solve the problem?

A: Solution 1 exploits the trick `n & (n - 1) == 1` to test whether there is only one `1` in the binary representation of `n`.

## Solution2.java

---
Q: How does solution 2 solve the problem?

A: Solution 2 uses Java API `Integer.bitCount()` instead of `n & (n - 1) == 0` to count bits.

## Solution3.java

---
Q: How does solution 3 solve the problem?

A: Solution 3 exploits this property --- If `n` is a power of 2, it must divide $2^{30}$ since the largest number is $2^{31}-1$.

## Solution4.java

---
Q: How does solution 4 solve the problem?

A: Any number can be uniquely represented in $d2^n$ where $d$ is an odd number.  And for a power of 2, $d=1$.

## Solution5.java

---
Q: How does solution 5 solve the problem?

A: `n` is a power of 2 if and only if `n` is positive and `n == 1` or 2 divides `n` and `n / 2` is a power of 2.


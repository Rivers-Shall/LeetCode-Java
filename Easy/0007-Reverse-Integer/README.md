# 0007 Reverse Integer

## Solution1.java

Basic algorithm by keep dividing and multiplying.

## Solution2.java

Refined version, substitute bit operation with constant like `Integer.MAX_VALUE` and `Integer.MIN_VALUE`.

## Note

If the range of valid number gets bigger, maybe `BigInteger` is a better choice over `long`.

## Solution3.java

The multiple-add-mod-divide process works for both positive and negative numbers in Java!

That is because (Java specs)
> the sign of the result equals the sign of the dividend.

## Solution4.java

Solution4 employs a clever way to detect overflow and thus avoid the use of `long`.  The clever way is:

> If `newResult = result * 10 + digit` overflows, `newResult / 10 != result`.
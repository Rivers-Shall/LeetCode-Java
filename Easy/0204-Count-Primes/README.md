# 0204 Count Primes

## Solution1.java

Solution 1 is the real sieve of Eratosthenes.  The most important thing is that there is no need to move from 2 to `n` and there is no need to eliminate from `i` to `n`.  For every number, if it is a composite, then there is a factor less than `Math.sqrt(n)`.  So move from `2` to `Math.sqrt(n)` and eliminate from `i * i` to `n`.

## Solution2.java

Solution 2 is the refined version of solution 1.  It eliminates an extra loop but it still needs type-casting.

## Note

The extra loop in solution 1 and the type-casting in solution 2 are both the overhead of preventing `int` overflow.

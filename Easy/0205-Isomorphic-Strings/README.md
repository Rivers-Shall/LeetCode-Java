# 0205 Isomorphic Strings

## Solution1.java

Solution 1 maintains the one-to-one correspondence between characters in `s` and `t` and return `false` whenever it becomes invalid.

## Solution2.java

Solution 2 exploits a sufficient and necessary condition of one-to-one correspondence:

1. It is a one-to-one mapping.
2. The domain and codomain has the same size.

## Solution3.java

Solution 3 is the implementation of solution 1 with array instead of `HashMap`.

## Solution4.java

Solution 4 is the implementation of solution 2 with array instead of `HashMap` and `HashSet`.

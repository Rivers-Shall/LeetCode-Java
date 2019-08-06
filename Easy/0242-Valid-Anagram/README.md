# 242 Valid Anagram

## Solution1.java

Solution 1 traverse the `String` by using `charAt`.  Thus it is much slower than solution 2.

## Solution2.java

Solution 2 traverse the `String` by converting it into `char[]` and using `for-every` loop.  It is faster.

## Note

If the problem extends to Unicode characters, we need a `Map`(`HashMap`, `TreeMap`, etc.) instead of an array.  And we should traverse the `String` by **CodePoint** instead of **Character**.  Thus `char` should be substituted by `int`.

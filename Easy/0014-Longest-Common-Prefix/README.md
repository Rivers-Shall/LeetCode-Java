# 0014 Longest Common Prefix

## Solution1.java

Solution 1 is a basic application of binary search.

## Solution2.java

Invariant of loop in solution 2 is
> `string[0].substring(0, prefixLength)` is the longest common prefix of all visited Strings.

## Solution3.java

Solution 3 is based on the statement (or theorem, if you want)

> The longest common prefix of an array of strings is the longest common prefix of the smallest and largest string (alphabetically).

Proof:
> If this statement is false, there exists a string such that it does not have the prefix but it is greater than the smallest string and less than the largest string alphabetically, which is a contradiction.
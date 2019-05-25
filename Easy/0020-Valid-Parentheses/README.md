# 0020 Valid Parentheses

## Solution1.java

Solution 1 turns `()[]{}` into numbers and tests the match by the sum.  It is a little anti-instinct.

## Solution2.java

Solution 2 uses a `HashMap` to represent a mapping from left parentheses to right ones.  This makes the code much easier to read.
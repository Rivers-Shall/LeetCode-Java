# 0345 Reverse Vowels of String

## Solution1.java

Solution 1 is like the solution of "#344 Reverse String".  It just skip all non-vowels.  And it uses Java standard API `HashSet` to store all the vowels.

## Solution2.java

Solution 2 is similar to solution 1 but it uses primitive `char[]` to store vowels.  To my surprise, `contains` of `HashSet` is even slower than traversing the whole `char[]`.

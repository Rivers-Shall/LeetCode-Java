# 0160 Intersection of Two Lists

## Solution1.java

Solution 1 is the solution based on the length difference between two lists.  By proceeding the longer list head for `diff` steps, both of the lists starts at the same situation.

## Solution2.java

Solution 2 is the solution based on traversing both list A and list B.  But one of the pointers traverses from A to B and the other from B to A.  Thus they have a path with the same length.  And if A and B have some intersection, it will be found.
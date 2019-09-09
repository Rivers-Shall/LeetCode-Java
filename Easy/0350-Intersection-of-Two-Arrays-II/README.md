# 0350 Intersection of Two Arrays II

## Solution1.java

Solution 1 solves the problem by counting the occurence times of numbers in `nums1` and checking numbers in `nums2`.

But it uses Java 8 Stream API to do de-boxing and it is very slow;

## Solution2.java

Solution 2 uses native loop to do de-boxing and it ends up much faster than solution 1.

## Solution3.java

Solution 3 first sorts both `nums1` and `nums2`.  And then it finds out the intersection by checking the sorted arrays, which is very similar to `merge` procedure in `mergeSort`.

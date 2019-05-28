# 0088 Merge Sorted Array

## Solution1.java

Solution 1 is the direct implementation inspired by MergeSort.  The defect is that it uses an auxiliary array, i.e., not in-place.

## Solution2.java

Solution 2 is the in-place solution.  I used to believe that there is no in-place solution.  But this problem is different from MergeSort where the original problem gives **no** spare space.  This problem actually gives spare space **after** `nums1`.  So the trick is **filling `nums1` from the end to the beginning**.
# 0031 Next Permutation

## Solution1.java

Solution 1 solves the problem by first finding the `swapIndex` which satisfies `nums[swapIndex + 1..nums.length - 1]` is in descending order and `nums[swapIndex] < nums[swapIndex + 1]`.  Then find the smallest number which is bigger than `nums[swapIndex]` in `nums[swapIndex + 1..nums.length - 1]`.  Swap them.  And reverse `nums[swapIndex + 1..nums.length - 1]` so it is in ascending order.

## Solution2.java

Solution 2 is the improved version of solution 1.  It founds the `swapIndex` by checking `nums[swapIndex] < nums[swapIndex + 1]` instead of checking whether there is a bigger number in `nums[swapIndex + 1..nums.length - 1]`.

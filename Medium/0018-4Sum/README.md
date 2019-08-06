# 18 4Sum

## Solution

Both solutions solve the problem *4Sum* by converting it into a *2Sum* problem.  Of course, we can first convert it into a 3Sum problem and then a 2Sum problem.  But that won't help us from the perspective of time complexity.

## Note

The effort taken to remove duplicates is considerable, including the conditional `continue` in method `fourSum` and the `while` loop in `twoSum`.

To solve the 2Sum problem, we can either use a better data structure---the Java API `HashSet` or use a better algorithm---sorting and two-pointers.  But the former one, Java API, is **far slower** than the latter one, better algorithm.

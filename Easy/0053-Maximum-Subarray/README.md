# 0053 Maximum Subarray

## Solution1.java

Solution 1 is the basic implementation of the DP solution.  I use a boxed type `Integer` and `null` as the special value to mark the uninitialized state.

The DP Solution defines the subproblem as

> `DP(nums, i)` stands for the sum of the max subarray whose last element is `nums[i]`

And then it gets the fomula:

> `DP(nums, i) = nums[i] + ((DP(nums, i - 1) < 0) ? 0 : DP(nums, i - 1))`

This solution clearly takes $O(n)$ time.

## Solution2.java

Solution 2 is the basic implementation of the divide-and-conquer solution.  It defines the subproblem as:

> `DP(nums, i, j)` stands for the sum of the maxx subarray in the range `nums[i]~nums[j]`

Then, the divide-and-conquer strategy is:

> `DP(nums, i, j)=max(DP(nums, i, mid), DP(nums, mid + 1, j), M(nums, i, mid, j))` where `M(nums, i, mid, j)` stands for the sum of the max subarray which crosses `nums[mid]` in the range `nums[i]~nums[j]`.

Since we can find `M(nums, i, mid, j)` in $O(j-i)$ time, the whole algorithm will take $O(n\log n)$ time.

## Solution3.java

Solution 3 is the refined version of Solution 1.  Instead of an `Integer` object, I use `nums[0]` to initialize it, which saves a little space and makes the code clean.  This initialization clearly keeps the solution correct.

## Solution4.java

Solution 4 is the refined version of Solution 3.  It changes the variable name to be more readable.
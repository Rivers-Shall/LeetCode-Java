# 0001 Two Sum

## Soltion.java

Algorithm:

1. Construct a new `indexedValues` array with the elements being the pair of `(i, nums[i])`.
2. Sort `indexedValues` by the second component, i.e., `nums[i]`.
3. Use two indecies to search the sum, one from the start, the other from the end.  Since `indexedValues` is sorted by `nums[i]`, once the current sum is less than `target`, we need to increase the first index, and if the current sum is greater than `target`, we need to decrease the second index.

## Solution2.java

Use a `HashMap` to maintain a value-to-index mapping.  Once we encounter a new value `nums[i]`, if `target - nums[i]` is in the mapping, `(map.get(target-nums[i])), i)` is the solution.  Otherwise, we do `map.put(nums[i], i)` to maintain the mapping.

But there is a tricky point---What if there are repeated values in `nums`?  In that way, we may lose the previous pair when we add the new one.  However, the concern is misplaced since the description states that each input may have **only one** solution.  So if there are repeated values, there are only the following possible circumstances:

1. Exactly two identical values and `target` is twice of it.
2. Multiple indentical values and they does not involve in the solution.

Other circumstances implies multiple solutions.  And our algorithm works well under both of the possible circumstances.

1. On the first occurance, value-to-index pair is stored.  On the second occurance, previous pair is extracted and the solution is returned.
2. The previous pair may get lost.  But no need to care about that since those pairs does not involve in the solution.
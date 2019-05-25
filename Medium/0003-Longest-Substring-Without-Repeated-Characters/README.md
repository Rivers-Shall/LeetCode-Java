# 0003 Longest Substring Without Repeated Characters

## Solution1.java

Solution 1 is the basic version with no optimization.  It owns its poor performance to the `repeat` method.  Its invariant is

> After the inner loop, the substring `[left, right)` is the **local longest substring without repeated characters** (i.e., it cannot extend to any sides).

## Solution2.java

Solution 2 employs the same algorithm as Solution 1.  But it uses a different approach to detect repeated character---a `HashMap`.  By maintaining a mapping between the current characters in the no-repeat-char substring and their indices, we can detect repeated character by `containsKey` and move the `left` pointer by `get`.

This ought to be $O(n)$ time complex.  But its outcome is not positive.  Maybe it's the implementation of `HashMap`.

## Solution3.java

Solution 3 employs the same algorithm and data structure as solution 2.  But it implicitly invalidates the previous mapping by simply using the `Math.max` method to update `left` pointer.  And thus eliminate the ugly use of `remove` and save a lot of time.

## Solution4.java

Solution 4 employs the same algorithm as the previous two solutions.  But instead of `HashMap`, it uses an `int` array to store the mapping.  By setting the default value to `-1` and using `Math.max` to update `left` pointer, it implicitly invalidates both the previous mapping and those invalid mapping.  And thus it is the fastest solution.
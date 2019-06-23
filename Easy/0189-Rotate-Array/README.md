# 0189 Rotate Array

## Solution1.java

Solution 1 is the most elegant way.  It first reverse the whole array to get the first `k` elements and last `nums.length - k` elements in the orginal array in right order.  Then it reverses the order of the first `k` elements and last `nums.length - k` elements of the reversed array to restore it to the original order.

## Solution2.java

Solution 2 is my first $O(n)$ time and $O(1)$ space solution.  It divides the whole array into several cycles, which can be viewed as **independent** when it comes to rotation.  And the number of them is `gcd(stepWidth, nums.length)`.  Thus we only need to rotate every cycle independently.

## Solution3.java

Solution 3 is the $O(n)$ time and $O(n)$ space solution.

## Solution4.java

Solution 4 is the $O(n^2)$ time and $O(1)$ space solution.

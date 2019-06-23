# 0219 Contains Duplicate II

## Solution1.java

---
Q: How does solution 1 tackle the problem?

A: It maintains a mapping from number to index.  It checks whether there are nearby duplicates and update the mapping every round.

---
Q: Is there a pitfall in solution 1?

A: Yes.  We need to update the mapping no matter whether `nums[i]` is contained because we need the largest index instead of the smallest.

---

## Solution2.java

Q: How does solution 2 solve the problem?

A: It first sorts the array by number and index.  Then it checks for nearby duplicates.

## Solution3.java

Q: How does solution 3 solve the problem?

A: It only checks the `k` elements after the current element for duplicates.

## Solution4.java

Q: How does solution 4 solve the problem?

A: It maintains a set of at most `k` adjacent elements and check for duplicates.

## Time

Q: How is the performance of each solution?

A: Solution 4 is the best with $O(n)$ time complexity and the least function calls.  Then there comes solution 1 with $O(n)$ time complexity and a little more function calls.  Then solution 2 with time complexity $O(n\log n)$.  Solution 3 is the slowest with time complexity $O(n^2)$.

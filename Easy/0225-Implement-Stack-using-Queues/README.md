# 0225 Implement Stack using Queue

## Solution1.java

---
Q: How does solution 1 solve the problem?

A: Solution 1 takes $O(n)$ time to `pop` and $O(1)$ to do anything else.  When it `pop`, it needs to move all previously pushed elements back by `q.add(q.poll())` and thus cost $O(n)$ time.

---
Q: Is the variable `top` redundant?

A: No.  Since we cannot view tail of the queue directly, we need this variable to quickly find top of the stack.  Actually, it results in uglier code in `pop` than `push` in solution 2.

## Solution2.java

---
Q: How does solution 2 solve the problem?

A: Solution 2 takes $O(n)$ time to `push` and $O(1)$ time to do anything else.  When it `push`, it needs to make the pushed element front of the queue to reverse the order and thus takes $O(n)$ time.

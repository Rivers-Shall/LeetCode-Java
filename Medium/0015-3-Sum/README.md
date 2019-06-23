# 0015 3 Sum

## Solution1.java

---
Q: How does solution 1 solve the problem?

A: It first sorts the whole array and then views every element's negative as a target and performs 2-sum searching in the rest of the array.

---
Q: Is the optimization pointed out by the comments important?

A: Yes.  Very important.  The conditional `continue` at the beginning of the outermost loop and the two `while` loops when we found a 2-sum is critical because it prevents duplicate triples and thus saves us much time and memory.

# 0168 Excel Sheet Column Title

## Solution1.java

This problem is harder than it seems.  Let's analyse it.

Let $f(c) = c - 'A' + 1$ be a function on `'A' ~ 'Z'`.  Then we know $n=f(c_0)+f(c_1)*26+\cdots+f_(c_n)*26^n$.  Now this seems to be a simple 26-radix number.  But we need to be careful because **the codomain of $f(n)$** is **1-26** instead of **0-25**.  And that's the reason of `--n` at the beginning of the loop.
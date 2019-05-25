# 0009 Palindrome Number

## Solution1.java

A basic idea for this problem is try to construct the reverse of `x`.  But Solution1 is based on an observation during the process of constructing reverse:

> If a number is palindrome, we don't have to construct the whole reverse of it.  In the process. there is a point that `x` is *aaaaab* and `reverse` is *aaaaa* or x and y are both *aaaaa*.

So the first `if` in the loop is for odd-digit palindrome numbers and the second one is for even-digit ones.

But one draw back is this algorithm cannot properly deal with *abcd0* kind of numbers.  It will return whether *abcd* is palindrome instead of whether *abcd0* is palindrome.  But *abcd0* is definitely not palindrome.  So this serves as a special case.

## Solution4.java

Solution4 can be viewed as a refined version of Solution1.  It is the result of formalizing the following condition:

> `x` is *aaaaab* and `reverse` is *aaaaa* or x and y are both *aaaaa*.

The formal expression is:
```Java
reverse == x || reverse / 10 == x
```

Also, it eliminates some special cases.  Elimination of special cases is inspired by Solution3.

## Solution2.java

This is the most basic solution of this problem.

## Solution3.java

This solution is a bit of surprising on the first glance---why there is no need to handle the special case `x < 0` ?

It turns out to be the condition `while (x > 0)` that is responsible for no-`x < 0`-special-case scenario.
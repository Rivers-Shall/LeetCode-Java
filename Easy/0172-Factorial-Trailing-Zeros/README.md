# 0172 Factorial Trailing Zeros

## Solution1.java

Solution 1 is the concise one.  It is a bit confusing since it do `n /= 5` every time.  So if this program wants to be correct, the property $\lfloor\frac{\lfloor\frac{n}{5}\rfloor}{5}\rfloor=\lfloor\frac{n}{25}\rfloor$ must hold.

## Solution2.java

Solution 2 is the first program that comes up in my mind since it does not rely on the property mentioned above.  But I got it wrong several times at first since I didn't make `divisor` a `long`, I made it `int`.  And when `n` is large enough, there will be an overflow for `divisor`.

## Note

About why we only need to compute $\sum\lfloor\frac{n}{5^i}\rfloor$, [this site](https://leetcode.com/problems/factorial-trailing-zeroes/discuss/52367/My-explanation-of-the-Log(n)-solution) provides a great explanation.

But I have a theory of my own:

Let $a_i$ be the number of numbers which contain at least $i$ factors of 5 in it.  And we know that $a_i=\lfloor n/5^i\rfloor$.  And the number of numbers which contain exactly $i$ factors of 5 is $a_i-a_{i+1}$.

So we can compute the number of factors of 5:

$$ka_k+\sum_{i=1}^{k-1}i(a_i-a_{i+1})=\sum a_i$$

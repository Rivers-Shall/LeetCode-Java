# 0005 Longest Palindromic Substring

## Solution1.java

Solution 1 is the implementation of dynamic programming algorithm where the state is

> `isPalindrome[i][j] == true` if and only if `s[i..j]`(both inclusive) is a palindrome.  And the formula is `isPalindrome[i][j] = isPalindrome[i + 1][j - 1] && s.charAt(i) == s.charAt(j)`.

This algorithm results in $O(n^2)$ time complexity.

## Solution2.java

Solution 2 is a brute force algorithm by checking whether we can get a palindrome by extending to both sides from a small substring.  This algorithm has a $O(n^2)$ worst case time complexity.

But surprisingly, this solution is much faster than the dynamic programming solution because actually there are very few palindromes in a string. Thus, the extending process will end very soon instead of extending to the end of the string.
# 0125 Valid Palindrome

## Solution1.java

Solution 1 turns all the character into lower case in the first place, which costs more time.

## Solution2.java

Solution 2 uses 

`charString[i] != charString[j] && Character.toLowerCase(charString[i]) != Character.toLowerCase(charString[j])`

 to avoid transforming the whole string into lower case in the first place.

 ## Solution3.java

 Solution 3 uses `Character.isLetterOrDigit` instead of `Character.isAlphabetic || !Character.isDigit` in solution 1.

## Solution4.java

 Solution 4 uses `Character.isLetterOrDigit` instead of `Character.isAlphabetic || !Character.isDigit` in solution 2.
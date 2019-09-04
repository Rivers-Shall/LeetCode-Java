# 0290 Word Pattern

## Solution1.java

I made a lot of mistakes to make this solution right.  There are several points to note:

1. One mapping is not enough.  There must be two mappings or one mapping and one set(to check whether the number of unique characters is the same as the number of unique words)
2. We cannot refresh the mapping by only `letter2Word[index] == null` or `word2Letter.get(word) == null`.  Both of them must be satisfied.
3. `word.equals(letter2Word[index])` instead of `letter2Word[index].equals(word)` since `letter2Word[index]` may be `null`.

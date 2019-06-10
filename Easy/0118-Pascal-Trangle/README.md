# 0118 Pascal's Triangle

## Solution1.java

Solution 1 is the basic solution based on ordinary arrays and the conversion from ordinary array to `ArrayList`.  ~~This is a slow solution where the conversion from ordinary array to `ArrayList` is the bottleneck.~~

It turns out that I was mislead by vs code's lagging compile error.  In the first place, I wrote

```Java
            result.add(Arrays.asList(currentRow));
```

But vs code says it's wrong.  So I changed it into

```Java
            result.add(new ArrayList<>(Arrays.asList(currentRow)));
```
which significantly spoils the performance.

## Solution2.java

Solution 2 is the basic solution totally based on `ArrayList`.

The special case `numRows == 0` should be taken care of carefully.

## Solution3.java

Solution 3 is a solution copied from [My Concise Solution in Java](https://leetcode.com/problems/pascals-triangle/discuss/38141/My-concise-solution-in-Java).  This solution uses only one `ArrayList` to generate the triangle line by line.  However, the extra construction of every row in the final triangle (`allrows.add(new ArrayList<Integer>(row));`) and the add-to-beginning-of-array operation (`row.add(0, 1);`) are expensive.  But it does result in more concise code since there is no need to refer to `allrows.get(j-1)` and thus the special case of `j == 0` is out of question.
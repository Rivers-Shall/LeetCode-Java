class Solution1 {
    public int lengthOfLastWord(String s) {
        int rightIndex;
        for (rightIndex = s.length() - 1; 
             rightIndex >= 0 && Character.isWhitespace(s.charAt(rightIndex));
             --rightIndex)
            ;
        int leftIndex;
        for (leftIndex = rightIndex;
             leftIndex >= 0 && Character.isAlphabetic(s.charAt(leftIndex));
             --leftIndex)
            ;
        return rightIndex - leftIndex;
    }
}
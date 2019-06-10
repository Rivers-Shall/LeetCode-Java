class Solution2 {
    public boolean isPalindrome(String s) {
        char[] charString = s.toCharArray();
        for (int i = 0, j = charString.length - 1; i < j; ++i, --j) {
            while (i < j && !Character.isAlphabetic(charString[i]) && !Character.isDigit(charString[i])) {
                ++i;
            }
            while (i < j && !Character.isAlphabetic(charString[j]) && !Character.isDigit(charString[j])) {
                --j;
            }
            if (charString[i] != charString[j] && Character.toLowerCase(charString[i]) != Character.toLowerCase(charString[j])) {
                return false;
            }
        }
        return true;
    }
}
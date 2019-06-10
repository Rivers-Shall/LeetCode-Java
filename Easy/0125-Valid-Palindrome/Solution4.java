class Solution4 {
    public boolean isPalindrome(String s) {
        char[] charString = s.toCharArray();
        for (int i = 0, j = charString.length - 1; i < j; ++i, --j) {
            while (i < j && !Character.isLetterOrDigit(charString[i])) {
                ++i;
            }
            while (i < j && !Character.isLetterOrDigit(charString[j])) {
                --j;
            }
            if (charString[i] != charString[j] && Character.toLowerCase(charString[i]) != Character.toLowerCase(charString[j])) {
                return false;
            }
        }
        return true;
    }
}
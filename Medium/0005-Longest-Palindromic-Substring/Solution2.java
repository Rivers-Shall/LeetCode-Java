class Solution2 {
    private int loPos, maxLen;

    public String longestPalindrome(String s) {
        if (s.length() < 2) return s;
        
        for (int i = 0; i < s.length() - 1; ++i) {
            extendPalindrome(s, i, i + 1);
            extendPalindrome(s, i, i);
        }
        return s.substring(loPos, loPos + maxLen);
    }

    private void extendPalindrome(String s, int startPos, int endPos) {
        while (startPos >= 0 && endPos < s.length() &&
               s.charAt(startPos) == s.charAt(endPos)) {
            --startPos;
            ++endPos;
        }
        if (maxLen < endPos - startPos - 1) {
            maxLen = endPos - startPos - 1;
            loPos = startPos + 1;
        }
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        //System.out.println(s.longestPalindrome("babad"));
        System.out.println(s.longestPalindrome("cbbd"));
        System.out.println(s.longestPalindrome("ccc"));
    }
}
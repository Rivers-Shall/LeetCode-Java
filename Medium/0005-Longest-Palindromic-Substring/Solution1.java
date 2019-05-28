class Solution1 {
    public String longestPalindrome(String s) {
        if (s.equals("")) return "";
        boolean[][] isPalindrom = new boolean[s.length()][s.length()];
        int maxLen = 1;
        int maxStart = 0, maxEnd = 0;

        for (int i = 0; i < s.length(); ++i) {
            isPalindrom[i][i] = true;
        }
        for (int i = 0; i < s.length() - 1; ++i) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                isPalindrom[i][i + 1] = true;
                maxLen = 2;
                maxStart = i;
                maxEnd = i + 1;
            }
        }
        for (int len = 3; len <= s.length(); ++len) {
            for (int start = 0; start < s.length() - len + 1; ++start) {
                int end = start + len - 1;
                if (isPalindrom[start + 1][end - 1] && s.charAt(start) == s.charAt(end)) {
                    isPalindrom[start][end] = true;
                    maxLen = len;
                    maxStart = start;
                    maxEnd = end;
                }
            }
        }
        return s.substring(maxStart, maxEnd + 1);
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.longestPalindrome("babad"));
        System.out.println(s.longestPalindrome("cbbd"));
        System.out.println(s.longestPalindrome("ccc"));
    }
}
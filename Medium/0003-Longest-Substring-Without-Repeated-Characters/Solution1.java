
class Solution1 {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        int maxLen = 0;
        while (right < s.length()) {
            while (right < s.length() && repeat(s, left, right) == -1) {
                ++right;
            }
            if (maxLen < right - left) {
                maxLen = right - left;
            }
            if (right < s.length()) left = repeat(s, left, right) + 1;
        }
        return maxLen;
    }

    private int repeat(String s, int left, int right) {
        for (int i = left; i < right; ++i) {
            if (s.charAt(i) == s.charAt(right)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.lengthOfLongestSubstring("dvdf"));
    }
}
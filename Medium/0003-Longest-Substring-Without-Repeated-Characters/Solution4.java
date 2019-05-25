import java.util.Arrays;

class Solution4 {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLen = 0;
        int[] charToIndex = new int[128];
        Arrays.fill(charToIndex, -1);
        while (right < s.length()) {
            left = Math.max(left, charToIndex[s.charAt(right)] + 1);
            charToIndex[s.charAt(right)] = right;
            maxLen = Math.max(maxLen, right - left + 1);
            ++right;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Solution4 s = new Solution4();
        System.out.println(s.lengthOfLongestSubstring("abba"));
    }
}
import java.util.HashMap;

class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charToIndex = new HashMap<>();
        int left = 0, right = 0, maxLen = 0;
        while (right < s.length()) {
            if (charToIndex.containsKey(s.charAt(right))) {
                left = Math.max(left, charToIndex.get(s.charAt(right)) + 1);
            }
            charToIndex.put(s.charAt(right), right);
            maxLen = Math.max(maxLen, right - left + 1);
            ++right;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.lengthOfLongestSubstring("abba"));
    }
}
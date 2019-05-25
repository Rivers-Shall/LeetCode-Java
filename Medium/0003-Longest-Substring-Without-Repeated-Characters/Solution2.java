import java.util.HashMap;

class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charToIndex = new HashMap<>();
        int left = 0, right = 0;
        int maxLen = 0;
        while (right < s.length()) {
            while (right < s.length() && !charToIndex.containsKey(s.charAt(right))) {
                charToIndex.put(s.charAt(right), right);
                ++right;
            }
            if (maxLen < right - left) {
                maxLen = right - left;
            }
            if (right < s.length()) {
                int newLeft = charToIndex.get(s.charAt(right)) + 1;
                for (int i = left; i < newLeft; ++i) {
                    charToIndex.remove(s.charAt(i));
                }
                left = newLeft;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.lengthOfLongestSubstring("abba"));
    }
}
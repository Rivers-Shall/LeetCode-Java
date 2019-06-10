class Solution1 {
    public int titleToNumber(String s) {
        char[] charArray = s.toCharArray();
        int result = 0;
        for (char c : charArray) {
            result = result * 26 + (c - 'A' + 1);
        }
        return result;
    }
}
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int left  = 0;
        int right = Math.min(str1.length(), str2.length());
        while (right > left) {
            int mid = (right - left) / 2 + left + 1;
            String prefix = str1.substring(0, mid);
            if (str1.startsWith(prefix) && str2.startsWith(prefix)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        left = 0;
        for (int len = right; len > 0; --len) {
            String divisor = str1.substring(0, len);
            if (isDivisor(divisor, str1) && isDivisor(divisor, str2)) {
                return divisor;
            }
        }
        return "";
    }

    private boolean isDivisor(String divisor, String str) {
        if (str.length() % divisor.length() != 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i += divisor.length()) {
            if (!divisor.equals(str.substring(i, i + divisor.length()))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.gcdOfStrings("ABC", "ABCABC"));
        System.out.println(s.gcdOfStrings("ABAB", "ABABAB"));
    }
}
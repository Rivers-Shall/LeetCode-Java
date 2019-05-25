
class Solution3 {
    public String longestCommonPrefix(String[] strings) {
        if (strings.length == 0) {
            return "";
        }
        String minString, maxString;

        minString = maxString = strings[0];
        for (String string : strings) {
            if (minString.compareTo(string) > 0) {
                minString = string;
            }
            if (maxString.compareTo(string) < 0) {
                maxString = string;
            }
        }

        int length = 0, maxLength = Math.min(minString.length(), maxString.length());
        while (length < maxLength && minString.charAt(length) == maxString.charAt(length)) {
            ++length;
        }
        return minString.substring(0, length);
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.longestCommonPrefix(new String[] { "flow", "flows", "flower" }));
    }
}
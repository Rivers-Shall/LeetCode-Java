
class Solution2 {
    public String longestCommonPrefix(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }
        
        int prefixLength = strings[0].length();
        for (String string : strings) {
            int newPrefixLength = 0;
            while (newPrefixLength < prefixLength && 
                   newPrefixLength < string.length() && 
                   string.charAt(newPrefixLength) == strings[0].charAt(newPrefixLength)) {
                ++newPrefixLength;
            }
            prefixLength = newPrefixLength;
        }
        return strings[0].substring(0, prefixLength);
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.longestCommonPrefix(new String[] { "flows", "flow", "flowers" }));
    }
}
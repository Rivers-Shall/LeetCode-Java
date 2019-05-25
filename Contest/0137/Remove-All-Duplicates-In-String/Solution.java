
class Solution {

    public String removeDuplicates(String s) {
        char[] str = s.toCharArray();
        int prevLen = s.length();
        int newLen = s.length();
        do {
            prevLen = newLen;
            newLen = 0;
            for (int i = 0; i < prevLen;) {
                if (i == prevLen - 1 || str[i] != str[i + 1]) {
                    str[newLen++] = str[i++];
                } else {
                    i += 2;
                }
            }
        } while (newLen < prevLen);
        return new String(str, 0, newLen);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.removeDuplicates("aaaaaaaaa"));
    }
}
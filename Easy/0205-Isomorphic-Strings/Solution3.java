class Solution3 {
    public boolean isIsomorphic(String s, String t) {
        char[] s2t = new char[Short.MAX_VALUE + 1];
        char[] t2s = new char[Short.MAX_VALUE + 1];

        for (int i = 0; i < s.length(); ++i) {
            char charOfS = s.charAt(i);
            char charOfT = t.charAt(i);
            if (s2t[charOfS] == '\0') {
                s2t[charOfS] = charOfT;
            } else if (s2t[charOfS] != charOfT) {
                return false;
            }
            if (t2s[charOfT] == '\0') {
                t2s[charOfT] = charOfS;
            } else if (t2s[charOfT] != charOfS) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.isIsomorphic("ab", "aa"));
    }
}
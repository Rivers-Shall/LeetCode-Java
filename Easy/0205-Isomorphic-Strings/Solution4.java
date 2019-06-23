class Solution4 {
    public boolean isIsomorphic(String s, String t) {
        char[] s2t = new char[Short.MAX_VALUE + 1];
        char[] t2s = new char[Short.MAX_VALUE + 1];
        int nCharOfS = 0;
        int nCharOfT = 0;

        for (int i = 0; i < s.length(); ++i) {
            char charOfS = s.charAt(i);
            char charOfT = t.charAt(i);
            if (s2t[charOfS] == '\0') {
                s2t[charOfS] = charOfT;
                ++nCharOfS;
            } else if (s2t[charOfS] != charOfT) {
                return false;
            }
            if (t2s[charOfT] == '\0') {
                t2s[charOfT] = charOfS;
                ++nCharOfT;
            }
        }

        return nCharOfS == nCharOfT;
    }

    public static void main(String[] args) {
        Solution4 s = new Solution4();
        System.out.println(s.isIsomorphic("ab", "aa"));
    }
}
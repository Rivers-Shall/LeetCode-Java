import java.util.HashMap;

class Solution1 {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> s2t = new HashMap<>();
        HashMap<Character, Character> t2s = new HashMap<>();

        for (int i = 0; i < s.length(); ++i) {
            if (!s2t.containsKey(s.charAt(i))) {
                s2t.put(s.charAt(i), t.charAt(i));
            } else if (s2t.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
            if (!t2s.containsKey(t.charAt(i))) {
                t2s.put(t.charAt(i), s.charAt(i));
            } else if (t2s.get(t.charAt(i)) != s.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.isIsomorphic("ab", "aa"));
    }
}
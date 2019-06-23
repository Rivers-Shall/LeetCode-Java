import java.util.HashMap;
import java.util.HashSet;

class Solution2 {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> s2t = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();

        for (int i = 0; i < s.length(); ++i) {
            if (!s2t.containsKey(s.charAt(i))) {
                s2t.put(s.charAt(i), t.charAt(i));
            } else if (s2t.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
            tSet.add(t.charAt(i));
        }

        return s2t.size() == tSet.size();
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.isIsomorphic("ab", "aa"));
    }
}
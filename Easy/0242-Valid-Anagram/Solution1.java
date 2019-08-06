class Solution1 {
    public boolean isAnagram(String s, String t) {
        char[] letterOccur = new char[26];
        
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); ++i) {
            ++letterOccur[s.charAt(i) - 'a'];
        }
        for (int i = 0; i < t.length(); ++i) {
            int index = t.charAt(i) - 'a';
            if (letterOccur[index] == 0) {
                return false;
            } else {
                --letterOccur[index];
            }
        }
        return true;
    }
}
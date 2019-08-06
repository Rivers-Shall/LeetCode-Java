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

        for (char c : s.toCharArray()) {
            ++letterOccur[c - 'a'];
        }
        for (char c : t.toCharArray()) {
            int index = c - 'a';
            if (letterOccur[index] == 0) {
                return false;
            } else {
                --letterOccur[index];
            }
        }
        return true;
    }
}
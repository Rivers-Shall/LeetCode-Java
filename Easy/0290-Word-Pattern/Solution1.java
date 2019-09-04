import java.util.HashMap;

class Solution1 {
    public boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        String[] letter2Word = new String[26];
        HashMap<String, Character> word2Letter = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            int index = pattern.charAt(i) - 'a';
            String word = words[i];
            char character = pattern.charAt(i);
            if (letter2Word[index] == null && word2Letter.get(word) == null) {
                letter2Word[index] = word;
                word2Letter.put(word, character);
            } else if (!word.equals(letter2Word[index]) || character != word2Letter.get(word)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.wordPattern("abba", "dog cat cat dog"));
        System.out.println(s.wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(s.wordPattern("abba", "dog cat cat fish"));
        System.out.println(s.wordPattern("abba", "cat cat cat cat"));
        System.out.println(s.wordPattern("abbaa", "dog cat cat fish"));
        System.out.println(s.wordPattern("ab", "dog dog"));
    }
}

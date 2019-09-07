import java.util.HashSet;

class Solution1 {

    HashSet<Character> vowels = new HashSet<>();

    {
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
    }

    public String reverseVowels(String s) {
        char[] charArr = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < j && !vowels.contains(charArr[i])) {
                ++i;
            }
            while (i < j && !vowels.contains(charArr[j])) {
                --j;
            }
            if (i < j) {
                char tmp = charArr[i];
                charArr[i] = charArr[j];
                charArr[j] = tmp;
                ++i;
                --j;
            }
        }
        return new String(charArr);
    }
}
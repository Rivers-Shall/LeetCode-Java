class Solution1 {
    static char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

    private boolean contains(char[] vowels, char c) {
        for (char vowel : vowels) {
            if (c == vowel) {
                return true;
            }
        }
        return false;
    }

    public String reverseVowels(String s) {
        char[] charArr = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < j && !contains(vowels, charArr[i])) {
                ++i;
            }
            while (i < j && !contains(vowels, charArr[j])) {
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
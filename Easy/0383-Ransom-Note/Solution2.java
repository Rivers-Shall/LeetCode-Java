class Solution2 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] char2OccuranceTimes = new int[26];
        for (int i = 0; i < magazine.length(); ++i) {
            int currentIndex = magazine.charAt(i) - 'a';
            int occuranceTimes = char2OccuranceTimes[currentIndex] + 1;
            char2OccuranceTimes[currentIndex] = occuranceTimes;
        }

        for (int i = 0; i < ransomNote.length(); ++i) {
            int currentIndex = ransomNote.charAt(i) - 'a';
            int nRest = char2OccuranceTimes[currentIndex];
            if (nRest == 0) {
                return false;
            } else {
                --nRest;
                char2OccuranceTimes[currentIndex] = nRest;
            }
        }
        return true;
    }
}
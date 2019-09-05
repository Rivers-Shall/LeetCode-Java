class Solution1 {
    public String getHint(String secret, String guess) {
        int[] numberOfOccurNumber = new int[10];
        char[] secretCharArr = secret.toCharArray();

        for (char c : secretCharArr) {
            ++numberOfOccurNumber[c - '0'];
        }

        int nBull = 0;
        int nCow = 0;
        for (int i = 0; i < guess.length(); ++i) {
            int standard = secret.charAt(i) - '0';
            int guessed = guess.charAt(i) - '0';
            if (standard == guessed) {
                ++nBull;
                --numberOfOccurNumber[guessed];
            }
        }

        for (int i = 0; i < guess.length(); ++i) {
            int standard = secret.charAt(i) - '0';
            int guessed = guess.charAt(i) - '0';
            if (standard != guessed && numberOfOccurNumber[guessed] > 0) {
                ++nCow;
                --numberOfOccurNumber[guessed];
            }
        }

        return nBull + "A" + nCow + "B";
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.getHint("1807", "7810"));
        System.out.println(s.getHint("1123", "0111"));
    }
}
class Solution2 {
    public String getHint(String secret, String guess) {
        int[] numberOfSecretOccurNumber = new int[10];
        int[] numberOfGuessOccurNumber = new int[10];

        int nBull = 0;
        int nCow = 0;

        for (int i = 0; i < guess.length(); ++i) {
            int standard = secret.charAt(i) - '0';
            int guessed = guess.charAt(i) - '0';
            if (standard == guessed) {
                ++nBull;
            } else {
                ++numberOfGuessOccurNumber[guessed];
                ++numberOfSecretOccurNumber[standard];
            }
        }

        for (int i = 0; i < 10; ++i) {
            nCow += Math.min(numberOfGuessOccurNumber[i], numberOfSecretOccurNumber[i]);
        }
        return nBull + "A" + nCow + "B";
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.getHint("1807", "7810"));
        System.out.println(s.getHint("1123", "0111"));
    }
}
class Solution2 {
    public int removeDuplicates(int[] numbers) {
        int nUnique = 0;
        for (int i = 0; i < numbers.length; ++i) {
            if (i == 0 || numbers[i] != numbers[i - 1]) {
                numbers[nUnique++] = numbers[i];
            }
        }
        return nUnique;
    }
}
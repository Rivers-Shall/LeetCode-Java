
class Solution1 {
    public int removeElement(int[] numbers, int val) {
        int newIndex = 0;
        for (int i = 0; i < numbers.length; ++i) {
            if (numbers[i] != val) {
                numbers[newIndex++] = numbers[i];
            }
        }
        return newIndex;
    }
}
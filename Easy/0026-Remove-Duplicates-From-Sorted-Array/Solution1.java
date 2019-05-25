
class Solution1 {
    public int removeDuplicates(int[] numbers) {
        int uniqueIndex = 0;
        int originIndex = 0;

        while (originIndex < numbers.length) {
            while (originIndex < numbers.length && numbers[originIndex] == numbers[uniqueIndex]) {
                ++originIndex;
            }
            if (originIndex < numbers.length) {
                numbers[++uniqueIndex] = numbers[originIndex];
            }
        }
        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] array = {1, 1, 2, 3};
        int length = s.removeDuplicates(array);
        for (int i = 0; i < length; ++i) {
            System.out.println(array[i]);
        }
    }
}
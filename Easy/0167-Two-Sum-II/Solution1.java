class Solution1 {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0, j = numbers.length - 1; i < j;) {
            int[] result = new int[2];
            int sum = numbers[i] + numbers[j];
            if (sum < target) {
                ++i;
            } else if (sum > target) {
                --j;
            } else {
                result[0] = i + 1;
                result[1] = j + 1;
                return result;
            }
        }
        return null;
    }
}
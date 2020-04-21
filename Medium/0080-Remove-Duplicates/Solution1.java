import java.util.Arrays;

class Solution1 {
    public int removeDuplicates(int[] nums) {
        int validIndex = 0, times = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                times = 1;
            } else {
                times ++;
            }
            if (times <= 2) {
                nums[validIndex++] = nums[i];
            }
        }
        return validIndex;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int len = s.removeDuplicates(new int[] {1, 1, 1, 2, 3, 3});
        System.out.println(len == 5);

        len = s.removeDuplicates(new int[] {0, 0, 1, 1, 1, 1, 2, 3, 3});
        System.out.println(len == 7);
    }
}
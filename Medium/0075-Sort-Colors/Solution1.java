import java.util.Arrays;

class Solution1 {
    public void sortColors(int[] nums) {
        int lastIndexOf0 = -1, lastIndexOf1 = -1, lastIndexOf2 = -1;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 0) {
                ++lastIndexOf0;
                ++lastIndexOf1;
                ++lastIndexOf2;
            } else if (nums[i] == 1) {
                ++lastIndexOf1;
                ++lastIndexOf2;
            } else {
                ++lastIndexOf2;
            }
            if (lastIndexOf0 >= 0 && nums[lastIndexOf0] != 0) nums[lastIndexOf0] = 0;
            if (lastIndexOf1 > lastIndexOf0 && nums[lastIndexOf1] != 1) nums[lastIndexOf1] = 1;
            if (lastIndexOf2 > lastIndexOf1 && nums[lastIndexOf2] != 2) nums[lastIndexOf2] = 2;
        }
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();

        int[] nums = new int[] {2, 0, 2, 1, 1, 0};
        s.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
import java.util.Arrays;

class Solution1 {
    public void moveZeroes(int[] nums) {
        int indexOfFirstZero = 0;
        int indexOfNextNonzero = 0;
        while (indexOfNextNonzero < nums.length) {
            int tmp = nums[indexOfFirstZero];
            nums[indexOfFirstZero] = nums[indexOfNextNonzero];
            nums[indexOfNextNonzero] = tmp;

            while (indexOfFirstZero < nums.length && nums[indexOfFirstZero] != 0) {
                ++indexOfFirstZero;
            }
            indexOfNextNonzero = indexOfFirstZero;
            while (indexOfNextNonzero < nums.length && nums[indexOfNextNonzero] == 0) {
                ++indexOfNextNonzero;
            }
        }
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] nums = {0,1,0,3,12};
        s.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
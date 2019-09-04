import java.util.Arrays;

class Solution2 {
    public void moveZeroes(int[] nums) {
        int indexOfFirstZero = 0;
        int indexOfNextNonzero = 0;

        while (indexOfFirstZero < nums.length && nums[indexOfFirstZero] != 0) {
            ++indexOfFirstZero;
        }
        indexOfNextNonzero = indexOfFirstZero;
        while (indexOfNextNonzero < nums.length && nums[indexOfNextNonzero] == 0) {
            ++indexOfNextNonzero;
        }

        while (indexOfNextNonzero < nums.length) {
            int tmp = nums[indexOfFirstZero];
            nums[indexOfFirstZero] = nums[indexOfNextNonzero];
            nums[indexOfNextNonzero] = tmp;

            while (indexOfFirstZero < nums.length && nums[indexOfFirstZero] != 0) {
                ++indexOfFirstZero;
            }
            while (indexOfNextNonzero < nums.length && nums[indexOfNextNonzero] == 0) {
                ++indexOfNextNonzero;
            }
        }
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] nums = {0,1,0,4,12};
        s.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
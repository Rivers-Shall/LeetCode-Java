
class Solution1 {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        Integer max = null;
        for (int i = 0; i < nums.length; ++i) {
            if (sum < 0) sum = 0;
            sum += nums[i];
            if (max == null || sum > max) {
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.maxSubArray(new int[] {-2, -1, -3, -4, -1, -2, -1, -5, -4}));
    }
}
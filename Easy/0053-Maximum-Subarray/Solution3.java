
class Solution3 {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        for (int i = 0; i < nums.length; ++i) {
            if (sum < 0) sum = 0;
            sum += nums[i];
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
class Solution2 {
    public int maxSubArray(int[] nums) {
        return maxSubArray(nums, 0, nums.length - 1);
    }

    private int maxSubArray(int[] nums, int lo, int hi) {
        if (lo == hi) return nums[lo];

        int mid = lo + (hi - lo) / 2;
        int max = nums[mid] + nums[mid + 1];
        int leftMax = nums[mid], leftSum = 0;
        for (int i = mid; i >= lo; --i) {
            leftSum += nums[i];
            leftMax = Math.max(leftMax, leftSum);
        }
        int rightMax = nums[mid + 1], rightSum = 0;
        for (int i = mid + 1; i <= hi; ++i) {
            rightSum += nums[i];
            rightMax = Math.max(rightMax, rightSum);
        }
        max = Math.max(max, leftMax + rightMax);
        max = Math.max(max, maxSubArray(nums, lo, mid));
        max = Math.max(max, maxSubArray(nums, mid + 1, hi));

        return max;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
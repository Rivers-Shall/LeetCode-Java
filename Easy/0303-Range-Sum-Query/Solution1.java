class NumArray {

    int[] prefixSum = null;
    int[] nums = null;

    public NumArray(int[] nums) {
        this.nums = nums;
        this.prefixSum = new int[nums.length];
        if (nums.length > 0) {
            prefixSum[0] = nums[0];
            for (int i = 1; i < nums.length; ++i) {
                prefixSum[i] = prefixSum[i - 1] + nums[i];
            }
        }
    }

    public int sumRange(int i, int j) {
        return prefixSum[j] - prefixSum[i] + nums[i];
    }
}
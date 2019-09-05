class NumArray2 {

    int[] prefixSum = null;
    int[] nums = null;

    public NumArray2(int[] nums) {
        this.nums = nums;
        this.prefixSum = new int[nums.length + 1];
        for (int i = 1; i <= nums.length; ++i) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        return prefixSum[j + 1] - prefixSum[i];
    }
}
class Solution2 {
    public void rotate(int[] nums, int stepWidth) {
        stepWidth %= nums.length;
        int nCycle = gcd(stepWidth, nums.length);
        int cycleLen = nums.length / nCycle;
        for (int i = 0; i < nCycle; i++) {
            // backup the last element
            int last = nums[((cycleLen - 1) * stepWidth + i) % nums.length];
            for (int j = cycleLen - 1; j > 0; --j) {
                int currIndex = (j * stepWidth + i) % nums.length;
                int prevIndex = ((j - 1) * stepWidth + i) % nums.length;
                nums[currIndex] = nums[prevIndex];
            }
            nums[i] = last;
        }
    }

    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
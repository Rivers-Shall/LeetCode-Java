class Solution1 {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        int[] firstNMax = new int[nums.length];
        firstNMax[0] = nums[0];
        firstNMax[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; ++i) {
            firstNMax[i] = Math.max(firstNMax[i - 1], firstNMax[i - 2] + nums[i]);
        }
        return firstNMax[firstNMax.length - 1];
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.rob(new int[] {1,2,3,1}));
        System.out.println(s.rob(new int[] {2,7,9,3,1}));
    }
}
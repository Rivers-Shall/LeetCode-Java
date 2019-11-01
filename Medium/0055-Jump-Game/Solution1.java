class Solution1 {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) return false;

        int current = 0;
        int canJumpMax = 0 + nums[0]; // from nums[0..current] we can jump to nums[0..canJumpMax]
        while (canJumpMax > current && canJumpMax < nums.length - 1) {
            int max = canJumpMax;
            for (int i = current; i <= canJumpMax; ++i) {
                if (i + nums[i] > max) {
                    max = i + nums[i];
                }
            }
            current = canJumpMax;
            canJumpMax = max;
        }

        return canJumpMax >= nums.length - 1;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.canJump(new int[] {2,3,1,1,4}));
        System.out.println(s.canJump(new int[] {3,2,1,0,4}));
    }
}
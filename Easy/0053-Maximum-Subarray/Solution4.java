
class Solution4 {
    public int maxSubArray(int[] nums) {
        int maxEndingHere = 0;
        int maxSoFar = nums[0];
        for (int i = 0; i < nums.length; ++i) {
            if (maxEndingHere < 0) maxEndingHere = 0;
            maxEndingHere += nums[i];
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        Solution4 s = new Solution4();
        System.out.println(s.maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
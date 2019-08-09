class Solution1 {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int standardSum = nums.length * (nums.length + 1) / 2;
        return standardSum - sum;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] nums = {0, 2, 3};
        System.out.println(s.missingNumber(nums));
    }
}
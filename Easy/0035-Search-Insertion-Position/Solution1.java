class Solution1 {
    public int searchInsert(int[] nums, int target) {
        int insertPos = 0;
        while (insertPos < nums.length && nums[insertPos] < target) {
            ++insertPos;
        }
        return insertPos;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3};
        Solution1 s = new Solution1();
        System.out.println(s.searchInsert(nums, 2));
    }
}
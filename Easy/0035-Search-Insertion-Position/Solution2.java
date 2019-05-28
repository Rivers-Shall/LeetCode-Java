class Solution2 {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] nums = new int[] {1, 2, 3};
        System.out.println(s.searchInsert(nums, 2));
    }
}
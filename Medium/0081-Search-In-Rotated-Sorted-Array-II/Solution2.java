class Solution2 {
    public boolean search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] < nums[right] || nums[mid] < nums[left]) {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else if (nums[left] < nums[mid] || nums[right] < nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                right --;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();

        System.out.println(s.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0));
        System.out.println(s.search(new int[] {3, 1, 1, 1, 1}, 3));
        System.out.println(s.search(new int[] {2, 2, 0, 2, 2}, 0));
        System.out.println(s.search(new int[] {2, 5, 6, 0, 0, 1, 2}, 0));
        System.out.println(!s.search(new int[] {2, 5, 6, 0, 0, 1, 2}, 3));
        System.out.println(s.search(new int[] {0, 0, 1, 2, 2, 5, 6}, 0));
        System.out.println(!s.search(new int[] {0, 0, 1, 2, 2, 5, 6}, 3));
    }
}
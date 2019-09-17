class Solution1 {
    public int[] searchRange(int[] nums, int target) {
        int[] range = new int[2];
        range[0] = leftEdge(nums, target);
        range[1] = rightEdge(nums, target);
        return range;
    }

    private int leftEdge(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        if (nums[left] == target) {
            return left;
        }
        return -1;
    }

    private int rightEdge(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (right - left) / 2 + left + 1;
            if (nums[mid] <= target) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        if (nums[left] == target) {
            return left;
        }
        return -1;
    }
}
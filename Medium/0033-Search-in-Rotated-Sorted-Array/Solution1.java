class Solution1 {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        
        int left = 0, right = nums.length - 1;
        while (left < right - 1) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] < nums[left] && nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid;
            }
        }
        int targetIndex = binarySearchIn(nums, target, 0, left);
        targetIndex = Math.max(targetIndex, binarySearchIn(nums, target, left + 1, nums.length - 1));

        return targetIndex;
    }

    // assume that nums[startIndex..endIndex] is in ascending order
    private int binarySearchIn(int[] nums, int target, int startIndex, int endIndex) {
        int left = startIndex, right = endIndex;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] nums = new int[] {4, 5 ,6 ,7, 0, 1, 2};
        System.out.println(s.search(nums, 0));
    }
}
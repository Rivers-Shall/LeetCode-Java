import java.util.Arrays;

class Solution1 {
    public boolean search(int[] nums, int target) {
        int k = searchPivot(nums);
        return Arrays.binarySearch(nums, 0, k, target) >= 0 || 
               Arrays.binarySearch(nums, k, nums.length, target) >= 0;
    }

    private int searchPivot(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (mid != 0 && nums[mid - 1] > nums[mid]) {
                return mid;
            } else if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else if (nums[left] > nums[mid]) {
                right = mid - 1;
            } else if (nums[right] >= nums[right - 1]) {
                right --;
            } else {
                return right;
            }
        }
        return left;
    }
    
    public static void main(String[] args) {
        Solution1 s = new Solution1();

        System.out.println(s.search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0));
        System.out.println(s.search(new int[] {3, 1, 1, 1, 1}, 3));
        System.out.println(s.search(new int[] {2, 2, 0, 2, 2}, 0));
        System.out.println(s.search(new int[] {2, 5, 6, 0, 0, 1, 2}, 0));
        System.out.println(!s.search(new int[] {2, 5, 6, 0, 0, 1, 2}, 3));
        System.out.println(s.search(new int[] {0, 0, 1, 2, 2, 5, 6}, 0));
        System.out.println(!s.search(new int[] {0, 0, 1, 2, 2, 5, 6}, 3));
    }
}
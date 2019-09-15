class Solution1 {
    public void nextPermutation(int[] nums) {
        if (nums.length <= 1)
            return;

        int swapIndex = nums.length - 2;
        while (swapIndex >= 0) {
            int nextBiggerIndex = nextBiggerIn(nums[swapIndex], nums, swapIndex + 1);
            // found the next bigger index
            if (nextBiggerIndex >= 0) {
                int tmp = nums[nextBiggerIndex];
                nums[nextBiggerIndex] = nums[swapIndex];
                nums[swapIndex] = tmp;
                break;
            }
            --swapIndex;
        }

        // nums[swapIndex + 1...nums.length - 1] is in descending order
        // and by reordering it by ascending order, we get the next
        // permutation
        for (int i = swapIndex + 1, j = nums.length - 1; i < j; ++i, --j) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }

    // assume that nums[startIndex...end] is sorted in desending order
    // find the smallest number that is bigger than target
    // use binary search
    private int nextBiggerIn(int target, int[] nums, int startIndex) {
        int left = startIndex, right = nums.length - 1;
        while (left < right) {
            int mid = (right - left) / 2 + left + 1;
            if (nums[mid] > target) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        // now left == right
        if (nums[left] <= target) {
            return -1;
        } else {
            return left;
        }
    }
}
class Solution1 {
    public int majorityElement(int[] nums) {
        return findRank(nums, 0, nums.length - 1, nums.length / 2);
    }

    private int findRank(int[] nums, int lo, int hi, int rank) {
        int k = partition(nums, lo, hi);
        if (k == rank) return nums[k];
        else if (k < rank) return findRank(nums, k + 1, hi, rank);
        else return findRank(nums, lo, k - 1, rank);
    }

    private int partition(int[] nums, int lo, int hi) {
        if (lo == hi) return lo;
        int key = nums[lo];
        int i = lo, j = hi + 1;
        while (i < j) {
            while (nums[++i] < key)
                if (i == hi) break;
            while (nums[--j] > key)
                if (j == lo) break;
            if (i >= j) break;
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        int tmp = nums[j];
        nums[j] = nums[lo];
        nums[lo] = tmp;
        return j;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.majorityElement(new int[] {1, 2, 2, 2}));
    }
}
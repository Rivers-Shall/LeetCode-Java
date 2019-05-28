class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m - 1, j = n - 1, k = n + m - 1; k >= 0; --k) {
            if      (i < 0)               nums1[k] = nums2[j--];
            else if (j < 0)               nums1[k] = nums1[i--];
            else if (nums1[i] > nums2[j]) nums1[k] = nums1[i--];
            else                          nums1[k] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] nums1 = new int[] {1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[] {2, 5, 6};
        s.merge(nums1, 3, nums2, 3);
        for (int i : nums1) {
            System.out.println(i);
        }
    }
}
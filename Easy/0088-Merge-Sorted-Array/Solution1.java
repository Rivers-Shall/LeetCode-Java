class Solution1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] aux = new int[m + n];
        for (int i = 0, j = 0, k = 0; k < m + n; ++k) {
            if      (i >= m)               aux[k] = nums2[j++];
            else if (j >= n)               aux[k] = nums1[i++];
            else if (nums1[i] <= nums2[j]) aux[k] = nums1[i++];
            else                           aux[k] = nums2[j++];
        }
        System.arraycopy(aux, 0, nums1, 0, m + n);
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] nums1 = new int[] {1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[] {2, 5, 6};
        s.merge(nums1, 3, nums2, 3);
        for (int i : nums1) {
            System.out.println(i);
        }
    }
}
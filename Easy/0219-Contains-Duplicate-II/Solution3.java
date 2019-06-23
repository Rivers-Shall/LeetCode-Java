class Solution3 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = 1; j <= k; ++j) {
                int newIndex = i + j;
                if (newIndex >= nums.length) break;
                if (nums[newIndex] == nums[i]) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.containsNearbyDuplicate(new int[] {1,2,3,1}, 3));
        System.out.println(s.containsNearbyDuplicate(new int[] {1,0,1,1}, 1));
        System.out.println(s.containsNearbyDuplicate(new int[] {1,2,3,1,2,3}, 2));
    }
}
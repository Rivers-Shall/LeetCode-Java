class Solution3 {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int[] backup = new int[nums.length];
        System.arraycopy(nums, 0, backup, 0, nums.length);
        for (int i = 0; i < backup.length; ++i) {
            int newIndex = (i + k) % nums.length;
            nums[newIndex] = backup[i];
        }
    }
}
class Solution3 {
    public int majorityElement(int[] nums) {
        int count = 0, major = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (count == 0) {
                count = 1;
                major = nums[i];
            } else if (nums[i] == major) {
                ++count;
            } else {
                --count;
            }
        }
        return major;
    }
}
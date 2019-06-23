import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution1 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length && nums[i] <= 0; ++i) {
            // no need to check duplicate target
            if (i != 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1, right = nums.length - 1;
            int target = -nums[i];
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum < target) {
                    ++left;
                } else if (sum > target) {
                    --right;
                } else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // no need to check duplicate value
                    while (left < right && nums[left] == nums[left + 1]) ++left;
                    ++left;
                    while (left < right && nums[right] == nums[right - 1]) --right;
                    --right;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.threeSum(new int[] {-1, 0, 1, 2, -1, -4}));
    }
}
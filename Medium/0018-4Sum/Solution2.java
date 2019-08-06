import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> fourSumSets = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length - 1; ++j) {
                if (j != i + 1 && nums[j] == nums[j - 1]) continue;
                int twoSumTarget = target - nums[i] - nums[j];
                List<List<Integer>> twoSumSets = twoSum(nums, j + 1, nums.length - 1, twoSumTarget);
                for (List<Integer> twoSumSet : twoSumSets) {
                    twoSumSet.add(0, nums[j]);
                    twoSumSet.add(0, nums[i]);
                    if (fourSumSets.size() == 0 || !twoSumSet.equals(fourSumSets.get(fourSumSets.size() - 1))) {
                        fourSumSets.add(twoSumSet);
                    }
                }
            }
        }
        return fourSumSets;
    }

    private List<List<Integer>> twoSum(int[] nums, int low, int high, int target) {
        List<List<Integer>> solutionSets = new ArrayList<>();

        if (nums[low] * 2 <= target && nums[high] * 2 >= target) {
            while (low < high) {
                int sum = nums[low] + nums[high];
                if (sum > target) {
                    --high;
                } else if (sum < target) {
                    ++low;
                } else {
                    List<Integer> newSolutionSet = new ArrayList<>();
                    newSolutionSet.add(nums[low]);
                    newSolutionSet.add(nums[high]);
                    solutionSets.add(newSolutionSet);

                    while (low < high && nums[low + 1] == nums[low]) {
                        ++low;
                    }
                    while (low < high && nums[high - 1] == nums[high]) {
                        --high;
                    }
                    ++low;
                    --high;
                }
            }
        }
        return solutionSets;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] nums = {1, 0, -1, 0, -2, 2};
        System.out.println(s.fourSum(nums, 0));
    }
}
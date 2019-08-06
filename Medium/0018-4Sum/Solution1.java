import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;

class Solution1 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> fourSumSets = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length; ++j) {
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
        HashSet<Integer> numHashSet = new HashSet<>();

        for (int i = low; i <= high; ++i) {
            int complement = target - nums[i];
            if (numHashSet.contains(complement)) {
                ArrayList<Integer> newSolutionSet = new ArrayList<>();
                newSolutionSet.add(complement);
                newSolutionSet.add(nums[i]);
                solutionSets.add(newSolutionSet);
            }
            numHashSet.add(nums[i]);
        }

        return solutionSets;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] nums = {1, 0, -1, 0, -2, 2};
        System.out.println(s.fourSum(nums, 0));
    }
}
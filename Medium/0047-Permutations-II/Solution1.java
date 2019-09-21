import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution1 {
    private List<Integer> currentPermutation = null;
    private List<List<Integer>> permutations = null;

    public List<List<Integer>> permuteUnique(int[] nums) {
        currentPermutation = new ArrayList<>();
        permutations = new ArrayList<>();
        Arrays.sort(nums);
        backTrack(nums, new boolean[nums.length]);
        return permutations;
    }

    private void backTrack(int[] nums, boolean used[]) {
        if (currentPermutation.size() == nums.length) {
            permutations.add(new ArrayList<>(currentPermutation));
            return;
        }

        int prevIndex = -1;
        int index = 0;
        while (index < nums.length) {
            while (index < nums.length && used[index]) {
                ++index;
            }
            if (index < nums.length && (prevIndex == -1 || nums[index] != nums[prevIndex])) {
                prevIndex = index;
                used[index] = true;
                currentPermutation.add(nums[index]);
                backTrack(nums, used);
                currentPermutation.remove(currentPermutation.size() - 1);
                used[index] = false;
            }
            ++index;
        }
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.permuteUnique(new int[] {1, 2, 1}));
    }
}
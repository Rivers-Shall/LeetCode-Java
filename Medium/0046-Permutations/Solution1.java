import java.util.ArrayList;
import java.util.List;

class Solution1 {
    private List<Integer> currentPermutation = null;
    private List<List<Integer>> permutations = null;

    public List<List<Integer>> permute(int[] nums) {
        currentPermutation = new ArrayList<>();
        permutations = new ArrayList<>();
        permute(nums, new boolean[nums.length]);
        return permutations;
    }

    private void permute(int[] nums, boolean[] used) {
        if (currentPermutation.size() == nums.length) {
            permutations.add(new ArrayList<>(currentPermutation));
            return;
        }

        for (int i = 0; i < nums.length; ++i) {
            if (!used[i]) {
                currentPermutation.add(nums[i]);
                used[i] = true;
                permute(nums, used);
                used[i] = false;
                currentPermutation.remove(currentPermutation.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.permute(new int[] {1, 2, 3, 4}));
    }
}
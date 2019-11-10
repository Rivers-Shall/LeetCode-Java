import java.util.ArrayList;
import java.util.List;

class Solution3 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempArray, int[] nums, int start) {
        result.add(new ArrayList<>(tempArray));
        for (int i = start; i < nums.length; ++i) {
            tempArray.add(nums[i]);
            backtrack(result, tempArray, nums, i + 1);
            tempArray.remove(tempArray.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.subsets(new int[] {1, 3, 2}));
        System.out.println(s.subsets(new int[] {}));
        System.out.println(s.subsets(new int[] {2}));
    }
}
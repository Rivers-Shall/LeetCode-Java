import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution4 {
    List<Integer> currentCombination;
    List<List<Integer>> combinations;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        currentCombination = new ArrayList<>();
        combinations = new ArrayList<>();
        backTrack(candidates, 0, target);
        return combinations;
    }

    private void backTrack(int[] candidates, int from, int target) {
        if (target == 0) {
            combinations.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int i = from; i < candidates.length; ++i) {
            if (candidates[i] <= target) {
                currentCombination.add(candidates[i]);
                backTrack(candidates, i, target - candidates[i]);
                currentCombination.remove(currentCombination.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Solution4 s = new Solution4();
        System.out.println(s.combinationSum(new int[] { 8, 7, 4, 3 }, 11));
    }
}
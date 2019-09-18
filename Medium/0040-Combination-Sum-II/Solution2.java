import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution2 {
    List<List<Integer>> combinations = null;
    List<Integer> currentCombination = null;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        combinations = new ArrayList<>();
        currentCombination = new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(candidates, 0, target);
        return combinations;
    }

    private void backTrack(int[] candidates, int from, int target) {
        if (target == 0) {
            combinations.add(new ArrayList<>(currentCombination));
            return;
        }
        if (from == candidates.length || target < 0) {
            return;
        }
        int candidate = candidates[from];
        int occurTime = 0;
        int index;
        for (index = from; index < candidates.length && candidates[index] == candidate; ++index) {
            ++occurTime;
        }
        for (int nCopy = 0; nCopy <= occurTime; ++nCopy) {
            if (nCopy * candidate <= target) {
                for (int i = 0; i < nCopy; ++i) {
                    currentCombination.add(candidate);
                }
                backTrack(candidates, index, target - nCopy * candidate);
                for (int i = 0; i < nCopy; ++i) {
                    currentCombination.remove(currentCombination.size() - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.combinationSum2(new int[] { 2, 5, 2, 1, 2 }, 5));
        System.out.println(s.combinationSum2(new int[] { 14, 6, 25, 9, 30, 20, 33, 34, 28, 30, 16, 12, 31, 9, 9, 12, 34,
                16, 25, 32, 8, 7, 30, 12, 33, 20, 21, 29, 24, 17, 27, 34, 11, 17, 30, 6, 32, 21, 27, 17, 16, 8, 24, 12,
                12, 28, 11, 33, 10, 32, 22, 13, 34, 18, 12 }, 27));
    }
}
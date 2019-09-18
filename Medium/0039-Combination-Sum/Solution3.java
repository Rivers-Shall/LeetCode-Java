import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution3 {
    private HashMap<List<Integer>, List<List<Integer>>> target2Combinations = new HashMap<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return combinationSum(candidates, 0, target);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int from, int target) {
        List<List<Integer>> combinations;
        if (target == 0) {
            combinations = new ArrayList<>();
            combinations.add(new ArrayList<>());
            return combinations;
        }
        if ((combinations = target2Combinations.get(Arrays.asList(from, target))) != null) {
            return combinations;
        }
        combinations = new ArrayList<>();
        for (int i = from; i < candidates.length; ++i) {
            int candidate = candidates[i];
            if (candidate <= target) {
                int complement = target - candidate;
                List<List<Integer>> complementCombinations = combinationSum(candidates, i, complement);
                for (List<Integer> complementCombination : complementCombinations) {
                    List<Integer> targetCombination = new ArrayList<>();
                    targetCombination.addAll(complementCombination);
                    targetCombination.add(candidate);
                    combinations.add(targetCombination);
                }
            }
        }

        target2Combinations.put(Arrays.asList(from, target), combinations);

        return combinations;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.combinationSum(new int[] {2, 3, 8}, 8));
    }
}
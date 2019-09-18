import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution2 {
    private HashMap<Integer, List<List<Integer>>> target2Combinations = new HashMap<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinations;
        if (target == 0) {
            combinations = new ArrayList<>();
            combinations.add(new ArrayList<>());
            return combinations;
        }
        if ((combinations = target2Combinations.get(target)) != null) {
            return combinations;
        }
        combinations = new ArrayList<>();
        for (int candidate : candidates) {
            if (candidate <= target) {
                int complement = target - candidate;
                List<List<Integer>> complementCombinations = combinationSum(candidates, complement);
                for (List<Integer> complementCombination : complementCombinations) {
                    if (complementCombination.size() == 0 || complementCombination.get(complementCombination.size() - 1) <= candidate) {
                        List<Integer> targetCombination = new ArrayList<>();
                        targetCombination.addAll(complementCombination);
                        targetCombination.add(candidate);
                        combinations.add(targetCombination);
                    }
                }
            }
        }

        target2Combinations.put(target, combinations);

        return combinations;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.combinationSum(new int[] {2, 3, 8}, 8));
    }
}
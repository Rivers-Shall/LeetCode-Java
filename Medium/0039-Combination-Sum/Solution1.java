import java.util.ArrayList;
import java.util.List;

class Solution1 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (target == 0) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>());
            return result;
        }
        List<List<Integer>> combinations = new ArrayList<>();
        for (int candidate : candidates) {
            if (candidate <= target) {
                int complement = target - candidate;
                List<List<Integer>> complementCombinations = combinationSum(candidates, complement);
                for (List<Integer> complementCombination : complementCombinations) {
                    if (complementCombination.size() == 0 || complementCombination.get(complementCombination.size() - 1) <= candidate) {
                        complementCombination.add(candidate);
                        combinations.add(complementCombination);
                    }
                }
            }
        }

        return combinations;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.combinationSum(new int[] {2, 3, 8}, 8));
    }
}
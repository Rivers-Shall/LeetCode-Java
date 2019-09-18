import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution3 {
    List<List<Integer>> combinations = null;
    List<Integer> currentCombination = null;
    HashMap<Integer, Integer> number2OccurTime = null;
    int[] numbers = null;
    int[] occurTimes = null;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        combinations = new ArrayList<>();
        currentCombination = new ArrayList<>();
        number2OccurTime = new HashMap<>();
        for (int candidate : candidates) {
            int occurTime = number2OccurTime.getOrDefault(candidate, 0) + 1;
            number2OccurTime.put(candidate, occurTime);
        }
        numbers = new int[number2OccurTime.size()];
        occurTimes = new int[number2OccurTime.size()];
        int index = 0;
        for (int number : number2OccurTime.keySet()) {
            numbers[index] = number;
            occurTimes[index] = number2OccurTime.get(number);
            ++index;
        }
        backTrack(candidates, target, 0);
        return combinations;
    }

    private void backTrack(int[] candidates, int target, int from) {
        if (target == 0) {
            combinations.add(new ArrayList<>(currentCombination));
            return;
        }
        if (from == numbers.length) {
            return;
        }
        int candidate = numbers[from];
        int occurTime = occurTimes[from];
        for (int nCopy = 0; nCopy <= occurTime; ++nCopy) {
            if (nCopy * candidate <= target) {
                for (int i = 0; i < nCopy; ++i) {
                    currentCombination.add(candidate);
                }
                backTrack(candidates, target - nCopy * candidate, from + 1);
                for (int i = 0; i < nCopy; ++i) {
                    currentCombination.remove(currentCombination.size() - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        System.out.println(s.combinationSum2(new int[] { 2, 5, 2, 1, 2 }, 5));
        System.out.println(s.combinationSum2(new int[] { 14, 6, 25, 9, 30, 20, 33, 34, 28, 30, 16, 12, 31, 9, 9, 12, 34,
                16, 25, 32, 8, 7, 30, 12, 33, 20, 21, 29, 24, 17, 27, 34, 11, 17, 30, 6, 32, 21, 27, 17, 16, 8, 24, 12,
                12, 28, 11, 33, 10, 32, 22, 13, 34, 18, 12 }, 27));
    }
}
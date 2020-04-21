import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.List;

class Solution1 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Map<Integer, Integer> num2Times = new HashMap<>();
        for (int num : nums) {
            num2Times.put(num, num2Times.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> entries = num2Times.entrySet().stream().collect(Collectors.toList());
        List<List<Integer>> newList = new ArrayList<>();
        newList.add(new ArrayList<>());
        return dfs(entries, 0, newList);
    }

    private List<List<Integer>> dfs(List<Map.Entry<Integer, Integer>> entries, int index, List<List<Integer>> curr) {
        if (index == entries.size()) {
            return curr;
        }
        int nPrev = curr.size();
        for (int i = 1; i <= entries.get(index).getValue(); ++i) {
            int key = entries.get(index).getKey();
            for (int j = 0; j < nPrev; ++j) {
                List<Integer> newList = new ArrayList<>(curr.get(j));
                for (int k = 0; k < i; ++k) {
                    newList.add(key);
                }
                curr.add(newList);
            }
        }
        return dfs(entries, index + 1, curr);
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();

        System.out.println(s.subsetsWithDup(new int[] {1, 2, 2}));
    }
}
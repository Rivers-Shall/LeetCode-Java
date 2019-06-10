import java.util.ArrayList;
import java.util.List;

class Solution2 {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        if (numRows > 0) {
            result.add(new ArrayList<>());
            result.get(0).add(1);
        }
        for (int i = 1; i < numRows; ++i) {
            result.add(new ArrayList<>());
            List<Integer> currentRow = result.get(i);
            currentRow.add(1);
            for (int j = 0; j < i - 1; ++j) {
                int next = result.get(i - 1).get(j) + result.get(i - 1).get(j + 1);
                result.get(i).add(next);
            }
            currentRow.add(1);
        }
        return result;
    }
}
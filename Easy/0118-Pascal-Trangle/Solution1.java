import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution1 {
    public List<List<Integer>> generate(int numRows) {
        Integer[] currentRow;
        ArrayList<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= numRows; ++i) {
            currentRow = new Integer[i];
            currentRow[0] = currentRow[i - 1] = 1;
            for (int j = 1; j < i - 1; ++j) {
                currentRow[j] = result.get(i - 2).get(j - 1) + result.get(i - 2).get(j);
            }
            result.add(Arrays.asList(currentRow));
        }
        return result;
    }
}
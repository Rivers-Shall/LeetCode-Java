import java.util.Arrays;
import java.util.List;

class Solution2 {
    public List<Integer> getRow(int rowIndex) {
        Integer[] result = new Integer[rowIndex + 1];
        for (int i = 0; i <= rowIndex; ++i) {
            result[0] = result[i] = 1;
            for (int j = i - 1; j > 0; --j) {
                result[j] = result[j] + result[j - 1];
            }
        }
        return Arrays.asList(result);
    }
}
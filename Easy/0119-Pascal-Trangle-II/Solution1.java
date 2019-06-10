import java.util.ArrayList;
import java.util.List;

class Solution1 {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> result = new ArrayList<>(rowIndex);
        for (int i = 0; i <= rowIndex; ++i) {
            result.add(1);
            for (int j = result.size() - 2; j > 0; --j) {
                result.set(j, result.get(j) + result.get(j - 1));
            }
        }
        return result;
    }
}
import java.util.ArrayList;
import java.util.List;

class Solution2 {
    List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> combine(int n, int k) {
        combine(1, n, k, new ArrayList<>());
        return result;
    }

    private void combine(int current, int n, int k, List<Integer> list) {
        if (list.size() == k) {
            result.add(new ArrayList<>(list));
            return;
        }
        if (n - current + 1 + list.size() < k) return; // extremely important improvement!!!

        for (int i = current; i <= n; ++i) {
            list.add(i);
            combine(i + 1, n, k, list);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.combine(4, 2));
        System.out.println(s.combine(4, 3));
    }
}
public class Solution1 {
    public int numTrees(int n) {
        int[] result = new int[n + 1];
        result[0] = result[1] = 1;
        for (int i = 2; i <= n; ++i) {
            for (int j = 0; j < i; ++j) {
                result[i] += result[j] * result[i - 1 - j];
            }
        }
        return result[n];
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.numTrees(2));
        System.out.println(s.numTrees(3));
    }
}
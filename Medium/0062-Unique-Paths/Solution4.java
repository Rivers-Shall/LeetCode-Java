class Solution4 {

    public int uniquePaths(int m, int n) {
        int[] nWays = new int[n];
        for (int i = 0; i < n; ++i) {
            nWays[i] = 1;
        }
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                nWays[j] += nWays[j - 1];
            }
        }
        return nWays[n - 1];
    }

    public static void main(String[] args) {
        Solution4 s = new Solution4();
        System.out.println(s.uniquePaths(3, 2));
        System.out.println(s.uniquePaths(2, 3));
        System.out.println(s.uniquePaths(7, 3));
        System.out.println(s.uniquePaths(3, 7));
    }
}
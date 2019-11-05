class Solution1 {
    int nRow;
    int nCol;

    private boolean isValidRow(int n) {
        return n >= 0 && n < nRow;
    }

    private boolean isValidCol(int n) {
        return n >= 0 && n < nCol;
    }

    public int uniquePaths(int m, int n) {
        nRow = m;
        nCol = n;
        int[][] nWays = new int[m][];
        for (int i = 0; i < nWays.length; ++i) {
            nWays[i] = new int[n];
        }

        nWays[0][0] = 1;
        for (int length = 1; length <= m + n - 2; ++length) {
            for (int i = 0; length - i >= 0 && i < nRow; ++i) {
                if (!(isValidRow(i) && isValidCol(length - i))) {
                    continue;
                }
                if (isValidRow(i - 1) && isValidCol(length - i)) {
                    nWays[i][length - i] += nWays[i - 1][length - i];
                }
                if (isValidCol(length - i - 1) && isValidCol(length - i)) {
                    nWays[i][length - i] += nWays[i][length - i - 1];
                }
            }
        }
        return nWays[nRow - 1][nCol - 1];
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.uniquePaths(3, 2));
        System.out.println(s.uniquePaths(2, 3));
        System.out.println(s.uniquePaths(7, 3));
        System.out.println(s.uniquePaths(3, 7));
    }
}
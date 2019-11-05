class Solution2 {
    int nRow;
    int nCol;

    private boolean isValid(int x, int y) {
        return x >= 0 && x < nRow && y >= 0 && y < nCol;
    }

    public int uniquePaths(int m, int n) {
        nRow = m;
        nCol = n;
        int[][] nWays = new int[nRow][];
        for (int i = 0; i < nWays.length; ++i) {
            nWays[i] = new int[nCol];
        }

        nWays[0][0] = 1;
        int nStep = Math.min(nRow, nCol);
        for (int length = 1; length <= nRow + nCol - 2; ++length) {
            int start = Math.max(0, length - nCol + 1);
            for (int i = start; i < start + nStep; ++i) {
                if (!isValid(i, length - i)) {
                    continue;
                }
                if (isValid(i - 1, length - i)) {
                    nWays[i][length - i] += nWays[i - 1][length - i];
                }
                if (isValid(i, length - i - 1)) {
                    nWays[i][length - i] += nWays[i][length - i - 1];
                }
            }
        }
        return nWays[nRow - 1][nCol - 1];
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.uniquePaths(3, 2));
        System.out.println(s.uniquePaths(2, 3));
        System.out.println(s.uniquePaths(7, 3));
        System.out.println(s.uniquePaths(3, 7));
    }
}
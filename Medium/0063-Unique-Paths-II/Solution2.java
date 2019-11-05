class Solution2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        if (m == 0) return 0;
        int n = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1) return 0;

        int[] nWays = new int[n];
        nWays[0] = 1;
        for (int j = 1; j < n; ++j) {
            nWays[j] = nWays[j - 1];
            if (obstacleGrid[0][j] == 1) {
                nWays[j] = 0;
            }
        }
        for (int i = 1; i < m; ++i) {
            if (obstacleGrid[i][0] == 1) {
                nWays[0] = 0;
            }
            for (int j = 1; j < n; ++j) {
                nWays[j] += nWays[j - 1];
                if (obstacleGrid[i][j] == 1) {
                    nWays[j] = 0;
                }
            }
        }
        return nWays[n - 1];
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.uniquePathsWithObstacles(new int[][] {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        }));
        System.out.println(s.uniquePathsWithObstacles(new int[][] {
            {0, 0},
            {0, 1},
            {0, 0}
        }));
    }
}
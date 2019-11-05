class Solution1 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        if (m == 0) return 0;
        int n = obstacleGrid[0].length;

        int maxStep = Math.min(m, n);
        int maxDis = m + n - 2;
        int[] nWays = new int[maxStep];
        boolean indexForRow = maxStep == m;

        nWays[0] = 1 - obstacleGrid[0][0];
        for (int dis = 1; dis <= maxDis; ++dis) {
            int start, end;
            if (dis < maxStep) { // first maxStep - 2 rounds
                start = dis;
                end = 0;
            } else if (maxDis - dis + 1 < maxStep) { // last maxStep - 2 rounds
                start = maxStep - 1;
                end = maxStep + dis - maxDis - 1;
            } else {
                start = maxStep - 1;
                end = 0;
            }
            for (int i = start; i >= end; --i) {
                int x = indexForRow ? i : dis - i;
                int y = indexForRow ? dis - i : i;
                if (obstacleGrid[x][y] == 1) {
                    nWays[i] = 0;
                } else if (i != 0) {
                    nWays[i] = nWays[i - 1] + nWays[i];
                }
            }
        }
        return nWays[maxStep - 1];
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
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
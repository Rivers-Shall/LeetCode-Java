class Solution1 {
    public int minPathSum(int[][] grid) {
        int nRow = grid.length;
        if (nRow == 0) return 0;
        int nCol = grid[0].length;
        int[] minSum = new int[nCol];

        minSum[0] = grid[0][0];
        for (int i = 1; i < nCol; ++i) {
            minSum[i] = grid[0][i] + minSum[i - 1];
        }
        for (int i = 1; i < nRow; ++i) {
            minSum[0] += grid[i][0];
            for (int j = 1; j < nCol; ++j) {
                minSum[j] = Math.min(minSum[j - 1], minSum[j]) + grid[i][j];
            }
        }
        
        return minSum[nCol - 1];
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.minPathSum(new int[][] {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}
        }));
    }
}
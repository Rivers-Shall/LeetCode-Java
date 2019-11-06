class Solution1 {
    private int getRowNo(int index, int nCol) {
        return index / nCol;
    }

    private int getColNo(int index, int nCol) {
        return index % nCol;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int nRow = matrix.length;
        if (nRow == 0) return false;
        int nCol = matrix[0].length;
        int left = 0, right = nRow * nCol - 1;

        while (left <= right) {
            int mid = (right - left) / 2 + left;
            int x = getRowNo(mid, nCol);
            int y = getColNo(mid, nCol);
            if (matrix[x][y] < target) {
                left = mid + 1;
            } else if (matrix[x][y] > target) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[][] matrix = new int[][] {
            {1, 3, 5, 7}, 
            {10, 11, 16, 20},
            {23, 30, 34, 50}
        };
        System.out.println(s.searchMatrix(matrix, 3));
        System.out.println(s.searchMatrix(matrix, 13));
    }
}
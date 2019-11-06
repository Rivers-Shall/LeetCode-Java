import java.util.Arrays;

class Solution1 {
    /*
    ** matrix[0][i] == 0 (0 <= i < nCol) means the ith column should be set to zero
    ** matrix[i][0] == 0 (1 <= i < nRow) means the ith row should be set to zero
    ** firstRowZero == true means the 0th row should be set to zero
    */
    public void setZeroes(int[][] matrix) {
        int nRow = matrix.length;
        if (nRow == 0) return;
        int nCol = matrix[0].length;
        boolean firstRowZero = false;

        for (int i = 0; i < nCol; ++i) {
            if (matrix[0][i] == 0) {
                firstRowZero = true;
            }
        }
        for (int i = 1; i < nRow; ++i) {
            for (int j = 0; j < nCol; ++j) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = matrix[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < nRow; ++i) {
            if (matrix[i][0] == 0) {
                for (int j = 0; j < nCol; ++j) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < nCol; ++i) {
            if (matrix[0][i] == 0) {
                for (int j = 0; j < nRow; ++j) {
                    matrix[j][i] = 0;
                }
            }
        }

        if (firstRowZero) {
            for (int i = 0; i < nCol; ++i) {
                matrix[0][i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[][] matrix = new int[][] {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        s.setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
        matrix = new int[][]{
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5}
        };
        s.setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
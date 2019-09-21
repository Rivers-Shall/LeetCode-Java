import java.util.Arrays;

class Solution1 {
    public void rotate(int[][] matrix) {
        for (int circleDepth = 0; circleDepth < matrix.length / 2; ++circleDepth) {
            for (int bias = 0; bias < matrix.length - 2 * circleDepth - 1; ++bias) {
                int currentX = circleDepth;
                int currentY = bias + circleDepth;
                int nextNum = matrix[currentX][currentY];
                for (int i = 0; i < 4; ++i) {
                    int nextY = matrix.length - 1 - currentX;
                    int nextX = currentY;
                    int tmp = matrix[nextX][nextY];
                    matrix[nextX][nextY] = nextNum;
                    nextNum = tmp;
                    currentX = nextX;
                    currentY = nextY;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[][] matrix = new int[3][];
        for (int i = 0; i < 3; ++i) {
            matrix[i] = new int[3];
            for (int j = 0; j < 3; ++j) {
                matrix[i][j] = 3 * i + j;
            }
        }
        s.rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
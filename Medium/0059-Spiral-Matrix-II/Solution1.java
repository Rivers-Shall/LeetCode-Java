import java.util.Arrays;

class Solution1 {
    private int[][] directions = {
        {0, 1}, {1, 0}, {0, -1}, {-1, 0}
    };

    public int[][] generateMatrix(int n) {
        int x = 0, y = 0;
        int indexOfDirections = 0;
        int[][] matrix = new int[n][];
        for (int i = 0; i < n; ++i) {
            matrix[i] = new int[n];
        }

        int num = 1;
        for (int length = 0; length < n; ++length) {
            for (int i = 0; i < n - length - 1; ++i) {
                matrix[x][y] = num++;
                x += directions[indexOfDirections][0];
                y += directions[indexOfDirections][1];
            }
            matrix[x][y] = num++;
            indexOfDirections = (indexOfDirections + 1) % 4;
            for (int i = 0; i < n - length - 1; ++i) {
                x += directions[indexOfDirections][0];
                y += directions[indexOfDirections][1];
                matrix[x][y] = num++;
            }
            indexOfDirections = (indexOfDirections + 1) % 4;
            x += directions[indexOfDirections][0];
            y += directions[indexOfDirections][1];
        }

        return matrix;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(Arrays.deepToString(s.generateMatrix(1)));
        System.out.println(Arrays.deepToString(s.generateMatrix(2)));
        System.out.println(Arrays.deepToString(s.generateMatrix(3)));
    }
}
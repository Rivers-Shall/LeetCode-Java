import java.util.ArrayList;
import java.util.List;

class Solution1 {
    int[][] directions = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

    public List<Integer> spiralOrder(int[][] matrix) {
        int nRow = matrix.length, nCol = 0;
        if (nRow > 0) {
            nCol = matrix[0].length;
        }
        int indexOfDirections = 0;
        List<Integer> spiralOrder = new ArrayList<>();

        int x = 0, y = 0;
        int maxLength = Math.min(nRow, nCol);
        for (int length = 0; length < maxLength; ++length) {
            for (int i = 0; i < nCol - length - 1; ++i) {
                spiralOrder.add(matrix[x][y]);
                x += directions[indexOfDirections][0];
                y += directions[indexOfDirections][1];
            }
            spiralOrder.add(matrix[x][y]);
            indexOfDirections = (indexOfDirections + 1) % 4;
            for (int i = 0; i < nRow - length - 1; ++i) {
                x += directions[indexOfDirections][0];
                y += directions[indexOfDirections][1];
                spiralOrder.add(matrix[x][y]);
            }
            indexOfDirections = (indexOfDirections + 1) % 4;
            x += directions[indexOfDirections][0];
            y += directions[indexOfDirections][1];
        }
        return spiralOrder;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[][] matrix = new int[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(s.spiralOrder(matrix));

        matrix = new int[][] {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        System.out.println(s.spiralOrder(matrix));

        matrix = new int[][] {
            {1, 2, 3, 4}
        };
        System.out.println(s.spiralOrder(matrix));

        matrix = new int[][] {
            {1}, {2}, {3}, {4}
        };
        System.out.println(s.spiralOrder(matrix));
    }
}
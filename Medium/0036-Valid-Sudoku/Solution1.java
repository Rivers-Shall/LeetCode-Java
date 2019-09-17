import java.util.Arrays;

class Solution {
    boolean[] hasNumber = new boolean[10];

    public boolean isValidSudoku(char[][] board) {
        boolean isValid = true;
        for (int i = 0; i < 9; ++i) {
            isValid &= isValidRow(board, i);
        }
        for (int i = 0; i < 9; ++i) {
            isValid &= isValidCol(board, i);
        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                isValid &= isValidBox(board, i, j);
            }
        }

        return isValid;
    }

    private boolean isValidRow(char[][] board, int noRow) {
        Arrays.fill(hasNumber, false);
        for (int i = 0; i < 9; ++i) {
            if (board[noRow][i] != '.') {
                int number = board[noRow][i] - '0';
                if (hasNumber[number]) {
                    return false;
                }
                hasNumber[number] = true;
            }
        }
        return true;
    }

    private boolean isValidCol(char[][] board, int noCol) {
        Arrays.fill(hasNumber, false);
        for (int i = 0; i < 9; ++i) {
            if (board[i][noCol] != '.') {
                int number = board[i][noCol] - '0';
                if (hasNumber[number]) {
                    return false;
                }
                hasNumber[number] = true;
            }
        }
        return true;
    }

    private boolean isValidBox(char[][] board, int leftUpperX, int leftUpperY) {
        Arrays.fill(hasNumber, false);
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                if (board[leftUpperX + i][leftUpperY + j] != '.') {
                    int number = board[leftUpperX + i][leftUpperY + j] - '0';
                    if (hasNumber[number]) {
                        return false;
                    }
                    hasNumber[number] = true;
                }
            }
        }
        return true;
    }
}
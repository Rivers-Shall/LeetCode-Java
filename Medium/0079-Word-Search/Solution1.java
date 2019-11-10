class Solution1 {
    private int[][] directions = new int[][] {
        {1, 0},
        {-1, 0},
        {0, 1},
        {0, -1}
    };

    private int nRow = 0;
    private int nCol = 0;
    private boolean[][] visited = null;

    public boolean exist(char[][] board, String word) {
        nRow = board.length;
        if (nRow == 0) return false;
        nCol = board[0].length;
        visited = new boolean[nRow][];
        for (int i = 0; i < nRow; ++i) {
            visited[i] = new boolean[nCol];
        }
        boolean found = false;
        for (int i = 0; i < nRow; ++i) {
            for (int j = 0; j < nCol; ++j) {
                if (board[i][j] == word.charAt(0)) {
                    visited[i][j] = true;
                    found |= dfs(board, i, j, word, 1);
                    visited[i][j] = false;
                }
                if (found) return true;
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, int x, int y, String word, int index) {
        if (index == word.length()) return true;

        boolean found = false;
        for (int i = 0; i < directions.length; ++i) {
            int newX = x + directions[i][0];
            int newY = y + directions[i][1];
            if (!(newX >= 0 && newX < nRow && newY >= 0 && newY < nCol && !visited[newX][newY])) {
                continue;
            }
            if (board[newX][newY] == word.charAt(index)) {
                visited[newX][newY] = true;
                found |= dfs(board, newX, newY, word, index + 1);
                visited[newX][newY] = false;
            }
            if (found) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Solution1 s = new Solution1();
        char[][] board = new char[][] {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };

        System.out.println(s.exist(board, "ABCCED"));
        System.out.println(s.exist(board, "SEE"));
        System.out.println(s.exist(board, "ABCB"));
    }
}
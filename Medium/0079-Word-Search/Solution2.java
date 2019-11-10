class Solution2 {
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
        for (int i = 0; i < nRow; ++i) {
            for (int j = 0; j < nCol; ++j) {
                visited[i][j] = true;
                if (dfs(board, i, j, word, 0)) return true;
                visited[i][j] = false;
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, int x, int y, String word, int index) {
        if (index == word.length() - 1 && board[x][y] == word.charAt(index)) return true;
        if (board[x][y] != word.charAt(index)) return false;

        for (int i = 0; i < directions.length; ++i) {
            int newX = x + directions[i][0];
            int newY = y + directions[i][1];
            if (!(newX >= 0 && newX < nRow && newY >= 0 && newY < nCol && !visited[newX][newY])) {
                continue;
            }
            visited[newX][newY] = true;
            if (dfs(board, newX, newY, word, index + 1)) return true;
            visited[newX][newY] = false;
        }

        return false;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
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
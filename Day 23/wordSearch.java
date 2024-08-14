// 79. Word Search

public class wordSearch {
    public boolean exist(char[][] board, String word) {
        int[][] visited = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    visited[i][j] = 1;
                    if (path(board, word, 0, i, j, visited)) {
                        return true;
                    }
                    visited[i][j] = 0;
                }
            }
        }
        return false;
    }

    public static boolean path(char[][] board, String word, int index, int i, int j, int[][] visited) {
        if (index == word.length() - 1) {
            return true;
        }

        boolean a = false, b = false, c = false, d = false;

        if (i >= 0 && i <= board.length - 2 && visited[i + 1][j] == 0) {
            if (board[i + 1][j] == word.charAt(index + 1)) {
                visited[i + 1][j] = 1;
                a = path(board, word, index + 1, i + 1, j, visited);
                visited[i + 1][j] = 0;
            }
        }

        if (j >= 0 && j <= board[0].length - 2 && visited[i][j + 1] == 0) {
            if (board[i][j + 1] == word.charAt(index + 1)) {
                visited[i][j + 1] = 1;
                b = path(board, word, index + 1, i, j + 1, visited);
                visited[i][j + 1] = 0;
            }
        }

        if (i >= 1 && i <= board.length - 1) {
            if (board[i - 1][j] == word.charAt(index + 1) && visited[i - 1][j] == 0) {
                visited[i - 1][j] = 1;
                c = path(board, word, index + 1, i - 1, j, visited);
                visited[i - 1][j] = 0;
            }
        }

        if (j >= 1 && j <= board[0].length - 1) {
            if (board[i][j - 1] == word.charAt(index + 1) && visited[i][j - 1] == 0) {
                visited[i][j - 1] = 1;
                d = path(board, word, index + 1, i, j - 1, visited);
                visited[i][j - 1] = 0;
            }
        }

        return a || b || c || d;
    }
}



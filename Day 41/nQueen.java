// 51. N-Queens
import java.util.ArrayList;
import java.util.List;

public class nQueen {
    public void solve(int col, char board[][], List<List<String>> ans, int n, boolean leftRow[], boolean upperDiagonal[], boolean lowerDiagonal[]) {
        if(col == n) {
            ans.add(construct(board, n));
            return;
        }

        for(int row = 0; row < n; row++) {
            if(leftRow[row] == false && lowerDiagonal[row + col] == false && upperDiagonal[(n-1) + (col-row)] == false) {
                board[row][col] = 'Q';
                leftRow[row] = true;
                lowerDiagonal[row + col] = true;
                upperDiagonal[(n-1) + (col-row)] = true;
                solve(col+1, board, ans, n, leftRow, upperDiagonal, lowerDiagonal);
                board[row][col] = '.';
                leftRow[row] = false;
                lowerDiagonal[row + col] = false;
                upperDiagonal[(n-1) + (col-row)] = false;
            }
        }
    }

    public List<String> construct(char board[][], int n) {
        List<String> res = new ArrayList<>();
        for(int i=0; i<n; i++) {
            String s = new String(board[i]);
            res.add(s);
        }

        return res;
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char board[][] = new char[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = '.';
            }
        }
        boolean leftRow[] = new boolean[n];
        boolean upperDiagonal[] = new boolean[2 * n-1];
        boolean lowerDiagonal[] = new boolean[2 * n-1];
        solve(0, board, ans, n, leftRow, upperDiagonal, lowerDiagonal);

        return ans;
    }
}

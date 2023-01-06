import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _51 {
    List<List<String>> result = new ArrayList<>();
    char[][] chessboard;
    public List<List<String>> solveNQueens(int n) {
        chessboard = new char[n][n];
        for (char[] chars : chessboard) {
            Arrays.fill(chars, '.');
        }
        backTracking(n, 0);
        return result;
    }
    public void backTracking(int n, int row) {
        if (n == row) {
            List<String> board = new ArrayList<>();
            for (char[] chars : chessboard) {
                board.add(String.copyValueOf(chars));
            }
            result.add(board);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (isValid(row, i, n)) {
                chessboard[row][i] = 'Q';
                backTracking(n, row + 1);
                chessboard[row][i] = '.';
            }
        }
    }
    public boolean isValid(int row, int col, int n) {
        for (int i = 0; i < row; i++) {
            if (chessboard[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >=0 && j >= 0; i--, j--) {
            if (chessboard[i][j] == 'Q') {
                return false;
            }
        }
        for(int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (chessboard[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}

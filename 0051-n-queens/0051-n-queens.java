
import java.util.*;

class Solution {

    public List<List<String>> solveNQueens(int n) {

        boolean[][] board = new boolean[n][n];

        List<List<String>> ans = new ArrayList<>();

        print(board, n, 0, ans);

        return ans;
    }

    public void print(boolean[][] board, int tq, int row,
                      List<List<String>> ans) {

        if (tq == 0) {

            List<String> list = new ArrayList<>();

            for (int i = 0; i < board.length; i++) {

                String s = "";

                for (int j = 0; j < board[0].length; j++) {

                    if (board[i][j]) {
                        s += "Q";
                    } else {
                        s += ".";
                    }
                }

                list.add(s);
            }

            ans.add(list);
            return;
        }

        for (int col = 0; col < board.length; col++) {

            if (issafe(board, row, col)) {

                board[row][col] = true;

                print(board, tq - 1, row + 1, ans);

                // Queen ko hata rahe hain backtracking ke liye
                board[row][col] = false;
            }
        }
    }

    public boolean issafe(boolean[][] board, int row, int col) {

        // Up check
        int r = row;

        while (r >= 0) {
            if (board[r][col]) {
                return false;
            }
            r--;
        }

        // Left diagonal check
        r = row;
        int c = col;

        while (r >= 0 && c >= 0) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c--;
        }

        // Right diagonal check
        r = row;
        c = col;

        while (r >= 0 && c < board[0].length) {
            if (board[r][c]) {
                return false;
            }
            r--;
            c++;
        }

        return true;
    }
}

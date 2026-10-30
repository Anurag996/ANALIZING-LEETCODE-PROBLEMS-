class Solution {

    public void solveSudoku(char[][] board) {
        Print(board, 0, 0);
    }

    public boolean Print(char[][] board, int row, int col) {

        if (col == 9) {
            col = 0;
            row++;
        }

        if (row == 9) {
            return true;
        }

        if (board[row][col] != '.') {
            return Print(board, row, col + 1);
        }

        for (char val = '1'; val <= '9'; val++) {

            if (issafe(board, row, col, val)) {

                board[row][col] = val;

                boolean ans = Print(board, row, col + 1);

                if (ans) {
                    return true;
                }

                // Agar solution nahi mila to cell wapas empty
                board[row][col] = '.';
            }
        }

        return false;
    }

    public boolean issafe(char[][] board, int row, int col, char val) {

        // Row check
        for (int c = 0; c < 9; c++) {
            if (board[row][c] == val) {
                return false;
            }
        }

        // Column check
        for (int r = 0; r < 9; r++) {
            if (board[r][col] == val) {
                return false;
            }
        }

        // 3x3 box ka starting point
        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for (int r = startRow; r < startRow + 3; r++) {
            for (int c = startCol; c < startCol + 3; c++) {
                if (board[r][c] == val) {
                    return false;
                }
            }
        }

        return true;
    }
}
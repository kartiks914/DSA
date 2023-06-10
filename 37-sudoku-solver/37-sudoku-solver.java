class Solution {
    public void solveSudoku(char[][] board) {
        int row =0;
        int col=0;
        sudokuSolver(board, row,col);
    }
    public static boolean sudokuSolver(char[][] board, int row, int col) {
        // Base case
        if (row == 9) {
            return true;
        }

        int nextRow = row;
        int nextCol = col + 1;
        if ( col +1 == 9) {
            nextRow++;
            nextCol = 0;
        }

        if (board[row][col] != '.') {
            return sudokuSolver(board, nextRow, nextCol);
        }

        for (char digit = '1'; digit <= '9'; digit++) {
            if (isSafe(board, row, col, digit)) {
                board[row][col] = digit;
                if (sudokuSolver(board, nextRow, nextCol)) {
                    return true;}
                board[row][col] = '.'; // Backtrack
            }
        }
        return false;
    }

    public static boolean isSafe(char[][] board, int row, int col, char digit) {
        // col check
        for (int i = 0; i <= 8; i++) {
            if (board[i][col] == digit){
                return false;}
        }
        // row check
        for (int j = 0; j <= 8; j++) {
            if (board[row][j] == digit) {
                return false;
            }
        }
        // grid check
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }}
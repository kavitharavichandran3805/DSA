public class Sudoku {
    final static int inner_dimension = 3;

    public static void main(String[] args) {
        int[][] board = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };
        printBoard(board);
        System.out.println("-----------------------------------------------");
        solve_sudoku(board, 0, 0);
        printBoard(board);

    }

    public static boolean solve_sudoku(int[][] board, int row, int col) {
        if (row == board.length) {
            col++;
            if (col == board.length) {
                return true;
            } else {
                row = 0;
            }
        }

        if (board[row][col] != 0) {
            return solve_sudoku(board, row + 1, col);
        }

        for (int i = 1; i <= board.length; i++) {
            if (isValid(board, row, col, i)) {
                board[row][col] = i;
                if (solve_sudoku(board, row + 1, col))
                    return true;
                board[row][col] = 0;
            }
        }
        return false;
    }

    public static boolean isValid(int[][] board, int row, int col, int num) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) {
                return false;
            }
            if (board[i][col] == num) {
                return false;
            }
        }

        int rowStart = (row / inner_dimension) * inner_dimension;
        int colStart = (col / inner_dimension) * inner_dimension;
        for (int i = rowStart; i < rowStart + 3; i++) {
            for (int j = colStart; j < colStart + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (i % inner_dimension == 0) {
                System.out.println();
            }
            for (int j = 0; j < board[0].length; j++) {
                if (j % inner_dimension == 0) {
                    System.out.print(" ");
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
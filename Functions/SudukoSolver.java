package Functions;

public class SudukoSolver {
    public boolean isSafe (char[][] board, int row, int col, int number) {
        // Condition for row and column
         for (int i = 0; i < board.length; i++) {
            if (board[i][col] ==  (char)(number + '0')) { // Check if the number is already present in the column
                return false;
            }
            if (board[row][i] ==  (char)(number + '0')) { // Check if the number is already present in the row
                return false;
            }
            
         }

         //Condition for grid
         int sr =  (row/3) * 3; // starting row of the grid
         int sc =  (col/3) * 3; // starting column of the grid 

         for (int i = sr; i <sr+3;i++) {
            for (int j = sc; j < sc+3; j++) {
                if (board[i][j] ==  (char)(number + '0')) { // Check if the number is already present in the grid
                    return false;
                }
            }
         }
         return true;
    }

    public boolean helper (char [][] board, int row, int col) {
        if (row == board.length) { // If we have reached the end of the board, it means we have successfully placed all numbers
            return true;
        }
        int newRow = 0;
        int newCol = 0;
        if (col  != board.length -1) { // If we are not at the last column, we can move to the next column
            newRow = row;
            newCol = col + 1; 
        } else {
             newRow = row + 1;
             newCol = 0;
        }

        if (board[row][col] != '.') {
            if (helper(board, newRow, newCol)) { // If the current cell is already filled, we can move to the next cell
                return true;
            }
        } else {
            for (int i = 1; i <=9; i++) {
                if (isSafe (board, row, col, i)) {
                    board[row][col] =  (char)(i='0'); // Place the number in the cell
                    if (helper(board, newRow, newCol)) {
                        return true;
                    } else {
                        board[row][col] = '.'; // If the placement did not lead to a solution, we backtrack by removing the number
                    }
                }
            }
        }
        return false;
          
    }
    public void solveSudoku (char [][] board) {
         helper(board, 0, 0);
    }
}

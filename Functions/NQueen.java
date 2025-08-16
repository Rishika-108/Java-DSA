package Functions;

import java.util.ArrayList;
import java.util.List;

public class NQueen {
    public boolean isSafe (int row, int col, char[][] board) {

        //Checks the placement of another queen in horizontal direction
        for (int j = 0; j < board.length; j++) { // Iterate through the row
            if (board[row][j] == 'Q') { 
                return false;
            }
        }
        //Checks the placement of another queen in vertical direction
        for(int i =0; i <board[0].length; i++) { // Iterate through the column
                if (board[i][col] == 'Q') {
                    return false;
                }
        }
        //Checks the placement of another queen in upper left
        int r = row;
        for (int c= col; c >=0  && r >= 0; c--,r--) { // Iterate through the upper left diagonal
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        //Checks the presence of another queen in upper right
        r = row;
        for (int c = col; col <board.length && r >= 0; r--,c--) { // Iterate through the upper right diagonal
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        //Checks the presence of another queen in lower left
        r = row;
        for (int c = col;  c >= 0  && r <board.length; r++, c--) { // Iterate through the lower left diagonal
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        //Checks the presence of another queen in lower right
        r = row;
        for (int c = col; c < board.length && r < board.length; r++, c++) { // Iterate through the lower right diagonal
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        return true;

    }
    public void saveBoard (char[][] board, List<List<String>>allBoards) {
        String row =  "";
        List <String> newBoard = new ArrayList <> ();
        for (int i = 0; i < board.length; i++) { //
            row =  "";
            for (int j = 0; j < board[0].length; j++) { //
                  if (board[i][j] == 'Q') {
                      row += 'Q';
                  } else  {
                    row += '.';
                  }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard); // Add the new board configuration to the list of all boards
    }
    public void helper (char[][] board, List<List<String>>allBoards, int col) {
         if (col == board.length) { // If all queens are placed, save the board configuration
            saveBoard (board, allBoards); 
         }
         for (int row = 0;  row < board.length; row++) { 
            if (isSafe (row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col);
                board[row][col] =  '.';
            }
         }
    }

    public List<List<String>> solveNQueens(int n) {
       List <List<String>> allBoards = new ArrayList<>(); 
       char [][] board = new char[n][n];
       helper(board, allBoards, n);
       return allBoards;
    }
}

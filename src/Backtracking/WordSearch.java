// Given an m x n matrix, return true if the the word exists in the matrix

package Backtracking;

public class WordSearch {
  private char[][] board;
  private int rowLength;
  private int colLength;


  public boolean exist(char[][] board, String word) {
    this.board = board;
    this.rowLength = board.length;
    this.colLength = board[0].length;

    for (int r = 0; r < board.length; r++) {
      for (int c = 0; c < board[0].length; c++) {
        if (backtrack(r, c, word, 0)) {
          return true;
        }
      }
    }

    return false;
  }

  public boolean backtrack(int row, int col, String word, int index) {
    if (index >= word.length()) {
      return true;
    }

    // check boundaries of row and col AND check if board[r][c] = letter
    if (row < 0 || row == rowLength || col < 0 || col == colLength ||
    board[row][col] != word.charAt(index)) {
      return false;
    }

    // mark the board in case we go back
    board[row][col] = '#';

    // visit cells clockwise: right, down, left, up
    int[] rowOffset = {0, 1, 0, -1};
    int[] colOffset = {1, 0, -1, 0};

    for (int i = 0; i < 4; i++) {
      if (backtrack(row + rowOffset[i], col + colOffset[i], word, index + 1)) {
        return true;
      }
    }

    // if you got here, change back board[row][col]
    board[row][col] = word.charAt(index);
    return false;
  }


  public static void main (String[] args) {
    char[][] board = {{'C', 'C', 'C', 'C'}, {'C', 'A', 'B', 'C'}, {'C', 'B', 'B', 'A'}, {'C', 'C', 'C', 'C'}};
    String word = "ABBA";

    System.out.println(new WordSearch().exist(board, word));
  }

}

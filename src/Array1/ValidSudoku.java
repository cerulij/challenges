// Determine if the sudoku board is valid

package Array1;

import java.util.HashSet;


public class ValidSudoku {

  public boolean isValidSudoku(char[][] board) {
    HashSet<Character>[] rows = new HashSet[9];
    HashSet<Character>[] cols = new HashSet[9];
    HashSet<Character>[] boxes = new HashSet[9];

    for (int i = 0; i < 9; i++) {
      rows[i] = new HashSet<>();
      cols[i] = new HashSet<>();
      boxes[i] = new HashSet<>();
    }

    for (int r = 0; r < 9; r++) {
      for (int c = 0; c < 9; c++) {
        char value = board[r][c];

        if (value == '.') {
          continue;
        }

        if (rows[r].contains(value)) {
          return false;
        }
        rows[r].add(value);

        if (cols[c].contains(value)) {
          return false;
        }
        cols[c].add(value);

        int boxIdx = (r/3) * 3 + (c/3);
        if (boxes[boxIdx].contains(value)) {
          return false;
        }
        boxes[boxIdx].add(value);
      }
    }

    return true;
  }

}

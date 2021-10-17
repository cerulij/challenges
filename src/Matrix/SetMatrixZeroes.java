// Given an m x n matrix, if an element is 0, set the entire row and column to 0 in place

package Matrix;

import java.util.Arrays;

public class SetMatrixZeroes {

  public void setZeroes(int[][] matrix) {
    int rowLength = matrix.length;
    int colLength = matrix[0].length;
    boolean isCol = false;

    for (int r = 0; r < rowLength; r++) {

      // To make sure we don't set to 0 the first col when it's not needed,
      // we set a flag isCol when we encounter a 0 in the first cell of every col
      if (matrix[r][0] == 0) {
        isCol = true;
      }

      for (int c = 1; c < colLength; c++) {
        if (matrix[r][c] == 0) {
          matrix[0][c] = 0;
          matrix[r][0] = 0;
        }
      }
    }

    for (int r = 1; r < rowLength; r++) {
      for (int c = 1; c < colLength; c++) {
        if (matrix[0][c] == 0 || matrix[r][0] == 0) {
          matrix[r][c] = 0;
        }
      }
    }

    if (matrix[0][0] == 0) {
      Arrays.fill(matrix[0], 0);
    }

    if (isCol) {
      for (int r = 0; r < rowLength; r++) {
        matrix[r][0] = 0;
      }
    }
  }


}

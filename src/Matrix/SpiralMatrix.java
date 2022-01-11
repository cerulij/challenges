// Given an m x n matrix, return all elements of the matrix in spiral order

package Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> result = new ArrayList<>();

    int rowLength = matrix.length;
    int colLength = matrix[0].length;

    int up = 0;
    int down = rowLength - 1;

    int left = 0;
    int right = colLength - 1;

    while (result.size() < rowLength * colLength) {
      // From left to right
      for (int c = left; c <= right; c++) {
        result.add(matrix[up][c]);
      }

      // From up to down
      for (int r = up + 1; r <= down; r++) {
        result.add(matrix[r][right]);
      }

      if (up != down) {
        // From right to left
        for (int c = right - 1; c >= left; c--) {
          result.add(matrix[down][c]);
        }
      }

      if (left != right) {
        // From bottom to up
        for (int r = down - 1; r > up; r--) {
          result.add(matrix[r][left]);
        }
      }

      left++;
      right--;
      up++;
      down--;
    }

    return result;
  }

}

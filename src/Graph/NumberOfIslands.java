// Given an m x n grid where '1' is land and '0' is water, determine the number of islands

package Graph;

public class NumberOfIslands {

  private void dfs(char[][] grid, int r, int c) {
    int rowLength = grid.length;
    int colLength = grid[0].length;

    if (r < 0 || c < 0 || r >= rowLength || c >= colLength || grid[r][c] == '0') {
      return;
    }

    // mark the grid so we don't go back to this spot
    grid[r][c] = '0';

    // call dfs on adjacents of the land
    dfs(grid, r + 1, c);
    dfs(grid, r, c + 1);
    dfs(grid, r - 1, c);
    dfs(grid, r, c - 1);
  }


  public int numIslands(char[][] grid) {
    if (grid == null || grid.length == 0) {
      return 0;
    }

    int rowLength = grid.length;
    int colLength = grid[0].length;
    int numIslands = 0;

    for (int r = 0; r < rowLength; r++) {
      for (int c = 0; c < colLength; c++) {
        // if we find land, call dfs on adjacents
       if (grid[r][c] == '1') {
         numIslands++;
         dfs(grid, r, c);
       }
      }
    }

    return numIslands;
  }

}

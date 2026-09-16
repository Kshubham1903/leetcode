class Solution {
    public int numIslands(char[][] grid) {
       int m = grid.length;
        int n = grid[0].length;

        int count = 0;

        int[][] directions = {
            {-1, 0},  // up
            {1, 0},   // down
            {0, -1},  // left
            {0, 1}    // right
        };

        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                if (grid[i][j] == '1') {

                    count++;

                    q.add(new int[]{i, j});
                    grid[i][j] = '0';

                    while (!q.isEmpty()) {

                        int[] cell = q.poll();

                        int row = cell[0];
                        int col = cell[1];

                        for (int[] dir : directions) {

                            int newRow = row + dir[0];
                            int newCol = col + dir[1];

                            if (newRow >= 0 && newRow < m &&
                                newCol >= 0 && newCol < n &&
                                grid[newRow][newCol] == '1') {

                                q.add(new int[]{newRow, newCol});

                                // Mark visited
                                grid[newRow][newCol] = '0';
                            }
                        }
                    }
                }
            }
        }

        return count;
    }
}
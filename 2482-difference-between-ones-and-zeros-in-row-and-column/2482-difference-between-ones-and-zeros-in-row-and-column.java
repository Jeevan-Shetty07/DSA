class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int rowl = grid.length, coll = grid[0].length;

        int[] row0 = new int[rowl];
        int[] col0 = new int[coll];

        for (int i = 0; i < rowl; i++) {
            for (int j = 0; j < coll; j++) {
                if (grid[i][j] == 0) {
                    row0[i]++;
                    col0[j]++;
                }
            }
        }

        for (int i = 0; i < rowl; i++) {
            for (int j = 0; j < coll; j++) {
                grid[i][j] = (coll - row0[i]) + (rowl - col0[j]) - row0[i] - col0[j];
            }
        }

        return grid;
    }
}
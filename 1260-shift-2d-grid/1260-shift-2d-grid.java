class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;
        int n = row * col;
        k = k % n;
        if (k == 0) {
            return convert(grid);
        }

        reverse(grid, 0, n - 1);
        reverse(grid, 0, k - 1);
        reverse(grid, k, n - 1);

        return convert(grid);
    }

    static void reverse(int[][] grid, int i, int j) {
        int col = grid[0].length;
        while (i < j) {
            int r1 = i / col;
            int c1 = i % col;
            int r2 = j / col;
            int c2 = j % col;

            int temp = grid[r1][c1];
            grid[r1][c1] = grid[r2][c2];
            grid[r2][c2] = temp;
            i++;
            j--;
        }
    }
    static List<List<Integer>> convert(int[][] grid) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int[] row : grid) {
            List<Integer> list = new ArrayList<>();
            for (int x : row)  list.add(x);
            ans.add(list);
        }
        return ans;
    }
}
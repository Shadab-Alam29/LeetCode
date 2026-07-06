class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
         for (int i = 0; i < grid.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < grid[i].length; j++) {
                list.add(grid[i][j]);
            }
            map.put(i, list);
        }
        HashMap<Integer, List<Integer>> colMap = new HashMap<>();

        for (int j = 0; j < grid[0].length; j++) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < grid.length; i++) {
                list.add(grid[i][j]);
            }
            colMap.put(j, list);
        }
         int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (map.get(i).equals(colMap.get(j))) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
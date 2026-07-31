class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();

        List<List<Integer>> dp = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i; j++) row.add(Integer.MAX_VALUE);
            dp.add(row);
        }
        return fun(0, 0, triangle, n, dp);
    }
    static int fun(int i, int j, List<List<Integer>> arr, int n, List<List<Integer>> dp) {

        if(i == n - 1)  return arr.get(i).get(j);
        if(dp.get(i).get(j) != Integer.MAX_VALUE)  return dp.get(i).get(j);

        int down =  fun(i + 1, j, arr, n, dp);
        int diagonal =  fun(i + 1, j + 1, arr, n, dp);

        int ans =  arr.get(i).get(j) + Math.min(down, diagonal);
        dp.get(i).set(j, ans);
        return ans ;
    }
}
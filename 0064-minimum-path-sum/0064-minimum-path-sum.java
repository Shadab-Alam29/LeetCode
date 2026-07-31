class Solution {
    public int minPathSum(int[][] grid) {
      int i = grid.length;
      int j = grid[0].length;
      int [][]dp = new int [i][j];
      for ( int[] row : dp)
            Arrays.fill(row,-1);
      return fun ( i-1 , j-1 , grid , dp);
     }
     static int fun( int i , int j , int[][]arr , int[][]dp){
        if ( i == 0 && j== 0 ) return arr[i][j];
        if ( i<0 || j <0)return (int)1e9;
        if ( dp[i][j]!= -1)return dp[i][j];

        int up = arr[i][j] + fun ( i-1 , j , arr ,dp);
        int left = arr[i][j] + fun ( i , j-1 , arr ,dp);

        return dp[i][j] = Math.min( up,left );
     }
}
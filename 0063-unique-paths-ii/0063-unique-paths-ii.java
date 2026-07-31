class Solution {
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][] = new int[m+1][n+1];
        for( int[] i : dp){
            Arrays.fill(i,-1);
        }
        return fun(m-1,n-1,dp,obstacleGrid);
    }
    static int fun(int i , int j,int[][]dp ,int[][]arr ){
        if (i < 0 || j < 0) return 0;
        if (arr[i][j] == 1) return 0;
        if (i == 0 && j == 0 ) return  1;

        if(dp[i][j]!= -1)return dp[i][j]; 
        
        int up = fun( i-1 , j, dp ,arr );
        int left = fun( i , j-1, dp ,arr );

        return dp[i][j] =  up+left ;
    }
}
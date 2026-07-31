class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m+1][n+1];
        for( int[] i : dp){
            Arrays.fill(i,-1);
        }
        return fun(m-1,n-1,dp);
    }
    static int fun(int i , int j,int[][]dp ){
        if ( i < 0 || j < 0 )return dp[i][j] = 0 ;
        if(dp[i][j]!= -1)return dp[i][j];
        if ( i == 0 || j == 0 )return dp[i][j] = 1 ;
        
        int up = fun( i-1 , j, dp );
        int left = fun( i , j-1, dp );

        return dp[i][j] =  up+left ;
    }
}
// 1    1   1    1    1    1    1 
// 1    2   3    4    5    6    7
// 1    3   6   10   15   21   28
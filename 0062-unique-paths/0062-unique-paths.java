class Solution {
    public int uniquePaths(int m, int n) {
        int [][] ar=new int [m][n];
        if(m==0||n==0){
            return 1;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0){
                    ar[i][j]=1;
                }
                else{
                    ar[i][j]=ar[i-1][j]+ar[i][j-1];
                }
            }
        }
        return ar[m-1][n-1];
    }
}
// 1    1   1    1    1    1    1 
// 1    2   3    4    5    6    7
// 1    3   6   10   15   21   28
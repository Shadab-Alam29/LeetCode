class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()+1][text2.length()+1];
        for ( int i = 1 ; i < dp.length ; i++){
            for ( int j = 1 ; j < dp[0].length ; j++){
                if ( text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];



    //     Integer dp[][]=new Integer[text1.length()][text2.length()];
    //    // int dp[][]=new int[text1.length()][text2.length()];
    //    // for(int r[]:dp)Arrays.fill(r,-1);
    //     return  lcs(text1,text2,0,0,dp) ;
    // }
    // int lcs(String s1 , String s2 , int i , int j,Integer dp[][]){
    //     if ( i==s1.length()|| j==s2.length())return 0 ;
    //   //  if( dp[i][j]!=-1)return dp[i][j];
    //     if( dp[i][j]!=null)return dp[i][j];
    //     if ( s1.charAt(i)==s2.charAt(j)){
    //         return dp[i][j]= 1+ lcs(s1,s2,i+1,j+1,dp);
    //     }
    //     else {
    //         int a = lcs(s1,s2,i+1,j,dp);
    //         int b = lcs(s1,s2,i,j+1,dp);
    //         return dp[i][j]=Math.max(a,b);
    //     }
    }
}
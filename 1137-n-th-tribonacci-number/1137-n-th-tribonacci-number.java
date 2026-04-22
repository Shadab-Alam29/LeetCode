class Solution {
    public int tribonacci(int n) {
        int dp[] = new int [n+2];
        dp[0]= 0; 
        dp[1]= 1;
        dp[2]= 1;
        for ( int i = 3 ; i<=n ;i++){
            dp[i]= dp[i-1]+dp[i-2]+dp[i-3];
        }
        return dp[n];
    }
}


// class Solution {
//     public int tribonacci(int n) {  
//       int dp[] = new int [ n+1 ];
//       return tri(n,dp);
//     }
//         public int tri(int n , int dp []) {  
//         if ( n == 0 ) return 0;
//         if ( n == 1 || n == 2 ) return 1 ;
//         if ( dp[n]!=0) return dp[n];
//         return dp[n]= tri( n-1,dp)+ tri(n-2,dp) + tri(n-3,dp);

//     }
// }





//                                                            n = 5

//                 n = 4 +                                    n =3 +                                          n =2 
//          n = 3 + n =2 + n= 1 ,                        n = 2 + n =1 + n=0 ,                             n = 1 + n =0 
// n = 2 + n =1 + n =0 , n = 1 + n =0 , n =0 ,               n = 1 + n=0 ,                                     n = 0


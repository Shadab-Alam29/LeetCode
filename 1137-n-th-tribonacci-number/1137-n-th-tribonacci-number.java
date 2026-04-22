class Solution {
    int dp[]=new int [51];
    public int tribonacci(int n) {  
      return tri(n);

    }
        public int tri(int n ) {  
        if ( n == 0 ) return 0;
        if ( n == 1 || n == 2 ) return 1 ;
        if ( dp[n]!=0) return dp[n];
        return dp[n] = tri( n-1)+ tri(n-2) + tri(n-3);

    }


}





//                                                            n = 5

//                 n = 4 +                                    n =3 +                                          n =2 
//          n = 3 + n =2 + n= 1 ,                        n = 2 + n =1 + n=0 ,                             n = 1 + n =0 
// n = 2 + n =1 + n =0 , n = 1 + n =0 , n =0 ,               n = 1 + n=0 ,                                     n = 0


class Solution {
    public int fib(int n) {
        int dp []= new int [n+1];
        return f(n,dp);
    }
    int f( int n,int []dp){
        if ( dp[n]!=0)return dp[n];
        if ( n<=1)return n;
        return f(n-1,dp)+f(n-2,dp);
    }
            
        // int a = 0 , b = 1 ;
        // for ( int i = 0 ; i<n ;i++){
        //     int c = a+b;
        //     a=b;
        //     b=c;
        // }
        // return a ;

        // if(n<=1){
        //     return n;
        // }
        // if(n==2){
        //     return 1;
        // }
        // return fib(n-2)+fib(n-1);
    //}
}

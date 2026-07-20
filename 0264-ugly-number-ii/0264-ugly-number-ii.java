class Solution {
    public int nthUglyNumber(int n) {
        // int count = 0;
        // int num = 1;
        // while (true){
        //     int x = num;
        //     while( x % 2 == 0 ) x /=2 ;
        //     while( x % 3 == 0 ) x /=3 ;
        //     while( x % 5 == 0 ) x /=5 ;

        //     if ( x== 1) count++;
        //     if ( count == n) return num;
        //     num++;
        // }

        int p1 = 0, p2 = 0 , p3 = 0 ;
        int dp[]=new int[n];
        dp[0]=1;
        for( int i = 1 ; i < n ; i++ ){
                int mult2 = dp[p1]*2;
                int mult3 = dp[p2]*3;
                int mult5 = dp[p3]*5;
                dp[i] = Math.min( mult2 , Math.min( mult3 , mult5 ));

                if (dp[i]==mult2)p1++;
                if (dp[i]==mult3)p2++;
                if (dp[i]==mult5)p3++;
        }
        return dp[n-1];
    }
}
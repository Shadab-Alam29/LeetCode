class Solution {
    public long minCuttingCost(int n, int m, int k) {
        if ( n <= k && m <= k) return 0 ; 
        long cost = 0 ;
        if ( n > k ){
            cost += (long) k * (n-k);
        }
        if ( m > k ){
            cost += (long) k * (m-k);
        }
        return cost ;
    }
}
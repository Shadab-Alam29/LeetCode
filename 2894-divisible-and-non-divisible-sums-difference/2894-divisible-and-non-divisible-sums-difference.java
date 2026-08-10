class Solution {
    public int differenceOfSums(int n, int m) {
        int sum = 0 ;
        int total = n * (n+1)/2 ;
        for ( int i = 1 ; i <= n ; i++ ){
            if ( i % m == 0 )sum += i ;
        }
        return (total - (sum*2)) ;
    }
}
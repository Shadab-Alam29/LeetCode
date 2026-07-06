class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0 ;
        int max = Integer.MIN_VALUE;
       for ( int i : gain){
            ans = ans + i ;
            max = Math.max(max ,ans) ;
       } 
       if ( max < 0) return 0 ;
       return max ;
    }
}
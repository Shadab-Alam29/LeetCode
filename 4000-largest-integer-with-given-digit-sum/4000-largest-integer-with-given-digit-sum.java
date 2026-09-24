class Solution {
    public int largestInteger(int n, int s) {
        if ( s > 9 * n) return -1 ;
        int ans = 0 ;
        while ( n > 0 ){
            int digit = Math.min(9,s);
            ans = ans * 10 + digit ;
            s= s-digit;
            n--;
        }
        return ans ;
    }
}
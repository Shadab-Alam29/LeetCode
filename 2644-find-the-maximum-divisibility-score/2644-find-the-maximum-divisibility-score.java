class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int max = Integer.MIN_VALUE;
        int ans = -1;
        for ( int i : divisors){
            int total = 0 ;
            for( int j : nums){
                if ( j % i == 0)total++;
            }
            if (total > max) {
                max = total;
                ans = i;
            }
            else if (total == max) 
                ans = Math.min(ans, i);
        }
        return ans ;
    }
}
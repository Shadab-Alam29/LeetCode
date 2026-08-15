class Solution {
    public int longestSubsequence(int[] nums) {
        int xr = 0 ; 
        int zcount = 0 ; 
        for ( int i : nums){
            xr ^= i ;
            if ( i == 0 ) zcount++ ;
        }
         if ( xr != 0 ) return nums.length; 
         if ( zcount == nums.length) return 0 ;

         return nums.length-1 ;
    }
}
class Solution {
    public int minimumDistance(int[] nums) {
        int ans = Integer.MAX_VALUE; 
        for(int i = 0 ; i < nums.length ; i++){
            int j = -1 ; 
            int k = -1 ;
            int val = nums[i];
            for( int p = i+1 ; p<nums.length;p++){
                if(val == nums[p] && j == -1){
                    j = p ;
                }
                else if ( val == nums[p] && j!=-1){
                    k = p ;
                    break ;
                }
            }
             if (j != -1 && k != -1) {
                int dist = Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i);
                ans = Math.min(ans, dist);
            }
        }
       if ( ans == Integer.MAX_VALUE) return -1;
       return ans ;
    }
}
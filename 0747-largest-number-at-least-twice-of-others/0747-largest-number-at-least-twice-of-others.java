class Solution {
    public int dominantIndex(int[] nums) {
        int maxind = 0 ; 
        int max = 0 ;
        for ( int i = 0 ; i < nums.length ; i++ ){
            if ( nums[i] > max){
                max = nums[i];
                maxind = i ;
            }
        }
        for ( int i : nums){
            if ( i!= max && i * 2 > max) return -1 ;
        }
        return maxind;
    }
}
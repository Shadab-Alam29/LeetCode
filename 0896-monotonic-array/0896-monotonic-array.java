class Solution {
    public boolean isMonotonic(int[] nums) {
        int a = 0 ;
        int s = 0 ;
        for ( int i = 0 ; i<nums.length-1;i++){
            if ( nums[i] < nums[i+1] )a = 1 ;
            else if (nums[i] > nums[i + 1]) s = 1;
        }
        if ( s == 1 && a == 1) return false;
        return true ;
    }
}
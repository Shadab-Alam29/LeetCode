class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0 ; 
        int max2 = 0 ; 
        for( int X : nums){
            if ( X >= max1){
                max2 = max1 ;
                max1 = X ;
            }
            else if ( X >=max2) max2 = X;
        }
        return ((max1-1)*(max2-1));
    }
}
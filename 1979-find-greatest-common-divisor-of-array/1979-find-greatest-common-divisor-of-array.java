class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for ( int i : nums){
            if ( min > i)min = i ;
            if ( max < i)max = i ;
        }
         while ( max!=0){
                int temp = max ; 
                max = min % max ;
                min = temp ;
         }
         return min ;
    }
}
class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int ans = Integer.MAX_VALUE ; 
        int one = -1 ; 
        int two = -1 ; 
        
        for ( int i = 0 ; i < nums.length ; i++){
            if ( nums[i] == 1 ){
                one =  i ;
                if (two != -1){
                    ans = Math.min(ans, Math.abs(two-one));
                }
            }
            if ( nums[i] == 2){
                two = i ; 
                if ( one != -1){
                    ans = Math.min(ans , Math.abs(one-two));
                }
            }
        }

        // for ( int i = 0 ; i < nums.length ; i++){
        //     if ( nums[i] == 1){
        //         for ( int j = 0 ; j < nums.length ; j++ ){
        //             if ( nums[j] == 2){
        //                 ans = Math.min(ans , Math.abs(i-j));
        //             }
        //         }
        //     }
        // }
        
        if ( ans != Integer.MAX_VALUE ) return ans ;
        return -1 ;
    }
}
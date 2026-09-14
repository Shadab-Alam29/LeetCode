class Solution {
    public int minMaxGame(int[] nums) {
        while( nums.length> 1){
            int ans[] = new int [nums.length/2];
            for( int i = 0 ; i < ans.length ; i++){
                if ( i % 2 == 0 ){
                    ans[i] = Math.min(nums[2*i],nums[2*i+1]);
                }
                else{
                    ans[i] = Math.max(nums[2*i],nums[2*i+1]);
                }
            }
            nums = ans ;
        }
        return nums[0];
    }
}
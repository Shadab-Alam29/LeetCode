class Solution {
    public long maxAlternatingSum(int[] nums) {
        for ( int i = 0 ; i < nums.length ; i++){
            if ( nums[i] < 0)   nums[i] = nums[i]*-1;
        }
    Arrays.sort(nums);
    int n = nums.length/2;
    long ans = 0 ; 
    for ( int i = 0 ; i < n ; i++){
        ans -= (long)nums[i]* nums[i];
    } 
    for ( int i = n ; i < nums.length ; i++){
        ans  +=  (long)nums[i]*nums[i]  ;
    }
    return ans ;
    }
}
class Solution {
    public int maximizeSum(int[] nums, int k) {
       Arrays.sort(nums); 
        int val = nums[nums.length - 1] ;
        int ans = nums[nums.length - 1] ;
       for ( int i = 1 ; i < k ; i++){
            ans = ans + (val+i);
       }
       return ans ; 
    }
}

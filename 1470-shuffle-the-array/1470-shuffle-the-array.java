class Solution {
    public int[] shuffle(int[] nums, int n) {
       int p = 0 ;
       int q = n ;
       int ans [] = new int [nums.length];
     for ( int i = 0 ; i<nums.length; i=i+2){
        ans[i]=nums[p++];
        ans[i+1]= nums[q++];
     } 
     return ans;
    }
}
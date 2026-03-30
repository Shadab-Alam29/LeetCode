class Solution {
     public int[] nextGreaterElements(int[] nums) {
        int max = nums[0];
        int i = 0;
        int ans [] = new int [nums.length];
        Arrays.fill(ans,-1);
        for(; i< nums.length-1;i++){
        if(nums[i]<nums[i+1] ){
            ans[i] = nums[i+1];
            max = nums[i+1]% nums.length;
        }
        else ans[i] = -1 ;
    }
        for(;i<nums.length;i++){
             ans[i]= max ;
        } 
        return ans;
    }
}
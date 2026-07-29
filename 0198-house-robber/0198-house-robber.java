class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        int []dp = new int [n];
        Arrays.fill(dp, -1);
        return fun(nums,nums.length-1,dp);
    }
    static int fun(int[]nums,int ind , int[]dp){
        if(ind < 0)return 0 ;
        if(ind == 0 )return nums[0];
        if(dp[ind] != -1)return dp[ind];
        int take = nums[ind] + fun(nums,ind-2,dp);
        int not_take = fun(nums,ind-1,dp);
        return dp[ind] = Math.max(take,not_take);
    }
}
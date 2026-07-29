class Solution {
    public int rob(int[] nums) {
        int n = nums.length ; 
        if (n == 1) return nums[0];
        int[] arr1 = Arrays.copyOfRange(nums, 0, n - 1);
        int[] arr2 = Arrays.copyOfRange(nums, 1, n);
        int[] dp1 = new int[arr1.length];
        int[] dp2 = new int[arr2.length];

        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        return Math.max(fun(arr1, arr1.length - 1, dp1),fun(arr2, arr2.length - 1, dp2));
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
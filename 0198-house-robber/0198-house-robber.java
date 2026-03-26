class Solution {
    public int rob(int[] nums) {
        int amount [] = new int [nums.length];
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if(nums.length == 2 ) return Math.max(nums[0],nums[1]);
         amount[0] = nums[0];
         amount[1] = Math.max(nums[0],nums[1]);
        int max_amount = amount[0];
        for(int i = 2 ; i <=nums.length-1;i++){
            amount[i] = Math.max(amount[i-1], nums[i] + amount[i-2]);
            max_amount = Math.max(amount[i],amount[i-1]);
        }
        return max_amount ; 
    }
}
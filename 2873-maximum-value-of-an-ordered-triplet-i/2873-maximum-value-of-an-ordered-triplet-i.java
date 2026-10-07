class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans = 0;
        long maxi = nums[0];
        long diff = 0;
        for (int k = 1; k < nums.length; k++) {
            ans = Math.max(ans, diff * nums[k]);
            diff = Math.max(diff, maxi - nums[k]);
            maxi = Math.max(maxi, nums[k]);
        }
        return ans;
    }
}
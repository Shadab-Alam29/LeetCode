class Solution {
    public int minDifference(int[] nums) {
        if (nums.length <= 4) return 0;
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        int n = nums.length - 1;
        ans = Math.min(nums[n] - nums[3], ans);
        ans = Math.min(nums[n - 1] - nums[2], ans);
        ans = Math.min(nums[n - 2] - nums[1], ans);
        ans = Math.min(nums[n - 3] - nums[0], ans);
        return ans;
    }
}
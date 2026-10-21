class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int firsttwozero = nums[n - 1] - nums[2];
        int lasttwozero = nums[n - 3] - nums[0];
        int firstlastzero = nums[n - 2] - nums[1];

        int ans = Math.min(firsttwozero, lasttwozero);
        return Math.min(ans, firstlastzero);
    }
}
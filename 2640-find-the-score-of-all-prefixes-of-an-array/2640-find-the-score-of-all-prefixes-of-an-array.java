class Solution {
    public long[] findPrefixScore(int[] nums) {

        int max = nums[0];
        long[] ans = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            ans[i] = (long) nums[i] + max;
        }

        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i] + ans[i - 1];
        }

        return ans;
    }
}
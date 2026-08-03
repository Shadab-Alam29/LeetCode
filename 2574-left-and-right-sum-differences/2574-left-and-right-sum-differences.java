class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            sum -= nums[i];         
            ans[i] = Math.abs(leftSum - sum);
            leftSum += nums[i];
        }

        return ans;
    }
}
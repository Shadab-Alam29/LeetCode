class Solution {
    public int maxScore(int[] nums, int k) {
        int n = nums.length;
        int total = 0;

        for (int x : nums)
            total += x;
        int window = n - k;
        if (window == 0)
            return total;
        int sum = 0;
        for (int i = 0; i < window; i++)
            sum += nums[i];

        int ans = total - sum;
        for (int i = window; i < n; i++) {
            sum += nums[i];
            sum -= nums[i - window];
            ans = Math.max(ans, total - sum);
        }

        return ans;
    }
}
class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int pre[] = new int[n];
        int suf[] = new int[n];
        int ans[] = new int[n];
        pre[0] = nums[0];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] + nums[i];
        }
        suf[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suf[i] = suf[i + 1] + nums[i];
        }
        for (int i = 0; i < n; i++) {
            int l = nums[i] * i - (pre[i] - nums[i]);
            int r = (suf[i] - nums[i]) - nums[i] * (n - i - 1);
            
            ans[i] = l + r;
        }
        return ans;
    }
}
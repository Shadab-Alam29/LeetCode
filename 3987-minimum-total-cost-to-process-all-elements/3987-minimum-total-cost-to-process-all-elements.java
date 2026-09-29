class Solution {
    public int minimumCost(int[] nums, int k) {

        long curr = k;
        long cost = 0;

        for (int i : nums) {

            if (i > curr) {
                long x = (i - curr + k - 1) / k;

                curr += x * k;
                cost += x;
            }

            curr -= i;
        }

        long ans = cost % 1000000007;
        ans = ans * ((cost + 1) % 1000000007) % 1000000007;
        ans = ans * 500000004 % 1000000007;

        return (int)ans;
    }
}
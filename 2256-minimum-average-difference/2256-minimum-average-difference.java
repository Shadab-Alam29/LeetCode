class Solution {
    public int minimumAverageDifference(int[] nums) {
        long pref[] = new long[nums.length];
        pref[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            pref[i] = pref[i - 1] + nums[i];
        }

        long suff[] = new long[nums.length];
        suff[0] = pref[nums.length - 1] - nums[0];

        for (int i = 1; i < nums.length; i++) {
            suff[i] = suff[i - 1] - nums[i];
        }

        long ans = Long.MAX_VALUE;
        int index = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            long first = pref[i] / (i + 1);
            long second = 0;

            if (i != n - 1) {
                second = suff[i] / (n - i - 1);
            }

            long diff = Math.abs(first - second);

            if (diff < ans) {
                ans = diff;
                index = i;
            }
        }

        return index;
    }
}
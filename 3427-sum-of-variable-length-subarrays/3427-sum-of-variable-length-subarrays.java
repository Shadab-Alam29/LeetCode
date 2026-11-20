class Solution {
    public int subarraySum(int[] nums) {
        int pref[] = new int[nums.length];
        pref[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pref[i] = pref[i - 1] + nums[i];
        }
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            int start = Math.max(0, i - nums[i]);
            if (start == 0) {
                total += pref[i];
            } else {
                total += pref[i] - pref[start - 1];
            }
        }
        return total;
    }
}
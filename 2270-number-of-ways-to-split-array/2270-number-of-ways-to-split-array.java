class Solution {
    public int waysToSplitArray(int[] nums) {
        int c = 0;
        long sum = 0;
        for (int i : nums) {
            sum += i;
        }
        long left = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            left += nums[i];
            sum = sum - nums[i];

            if (left >= sum) {
                c++;
            }
        }
        return c;
    }
}
class Solution {
    public int[] transformArray(int[] nums) {
        int even = 0;
        for (int x : nums) {
            if (x % 2 == 0) even++;
        }
        int i = 0;
        while (even > 0) {
            nums[i++] = 0;
            even--;
        }
        while (i < nums.length) {
            nums[i++] = 1;
        }
        return nums;
    }
}
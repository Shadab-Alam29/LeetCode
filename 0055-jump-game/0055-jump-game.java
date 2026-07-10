class Solution {
    public boolean canJump(int[] nums) {
        int moves = 1;
        boolean ans = true;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] >= moves) {
                moves = 1;
                ans = true;
            } else {
                moves++;
                ans = false;
            }
        }

        return ans;
    }
}
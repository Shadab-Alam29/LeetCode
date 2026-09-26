class Solution {
    public int minDeletion(int[] nums) {
        int c = 0;
        int check = 2; // fir even index 
        for (int i = 1; i < nums.length; i++) {
            if (check % 2 == 0) {
                if (nums[i] == nums[i - 1]) {
                    c++;
                } else {
                    check=1;
                }
            } else {
                check=2;
            }
        }

        if ((nums.length - c) % 2 != 0) {
            c++;
        }

        return c;
    }
}
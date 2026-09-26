class Solution {
    public int minDeletion(int[] nums) {
        int c = 0;
        int check = 0; // fir odd index 
        for (int i = 1; i < nums.length; i++) {
            if (check % 2 == 0) {
                if (nums[i] == nums[i - 1]) {
                    c++;
                } else {
                    check++;
                }
            } else {
                check++;
            }
        }

        if ((nums.length - c) % 2 != 0) {
            c++;
        }

        return c;
    }
}
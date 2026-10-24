class Solution {
    public int arraySign(int[] nums) {
        int one = 0;
        int nevone = 0;

        for (int i : nums) {
            if (i == 0) return 0;
            else if (i < 0) one++;
            else nevone++;
        }

        if (one % 2 == 0) return 1;
        else return -1;
    }
}
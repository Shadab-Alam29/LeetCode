class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] freq = new int[101];
        for (int i : nums) {
            freq[i]++;
        }
        int[] ans = new int[nums.length];
        int f = 0;
        while (f < nums.length) {
            for (int i = 0; i < freq.length; i++) {
                if (freq[i] > 0) {
                    ans[f] = i;
                    f++;
                    freq[i]--;
                }
            }
        }
        return ans;
    }
}
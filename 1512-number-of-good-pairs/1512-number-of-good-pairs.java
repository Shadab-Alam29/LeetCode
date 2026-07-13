class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101];
        int ans = 0;
        for (int i : nums) {
            ans += freq[i];
            freq[i]++;
        }
        return ans;
    }
}
class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i : nums) {
            if (freq.containsKey(i)) {
                freq.put(i, freq.get(i) + 1);
            } else {
                freq.put(i, 1);
            }
        }
        int ans = 0;
        for (int key : freq.keySet()) {
            if (freq.containsKey(key + 1)) {
                ans = Math.max(ans, freq.get(key) + freq.get(key + 1));
            }
        }
        return ans;
    }
}
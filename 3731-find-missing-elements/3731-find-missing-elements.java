class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int x : nums) {
            max = Math.max(max, x);
            min = Math.min(min,x);
        }
        boolean[] seen = new boolean[max + 1];
        for (int x : nums) {
            seen[x] = true;
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (!seen[i]) {
                ans.add(i);
            }
        }

        return ans;
    }
}
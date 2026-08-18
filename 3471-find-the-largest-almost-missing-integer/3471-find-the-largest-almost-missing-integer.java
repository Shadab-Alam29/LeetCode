class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        if (k == 1) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int x : nums) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
            int ans = -1;
            for (int x : map.keySet()) {
                if (map.get(x) == 1) {
                    ans = Math.max(ans, x);
                }
            }
            return ans;
        }
        if (k == n) {
            int ans = nums[0];
            for (int x : nums) {
                ans = Math.max(ans, x);
            }
            return ans;
        }
        int ans = -1;
        int first = nums[0];
        boolean unique = true;
        for (int i = 1; i < n; i++) {
            if (nums[i] == first) {
                unique = false;
                break;
            }
        }
        if (unique) {
            ans = Math.max(ans, first);
        }
        int last = nums[n - 1];
        unique = true;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == last) {
                unique = false;
                break;
            }
        }
        if (unique) {
            ans = Math.max(ans, last);
        }
        return ans;
    }
}
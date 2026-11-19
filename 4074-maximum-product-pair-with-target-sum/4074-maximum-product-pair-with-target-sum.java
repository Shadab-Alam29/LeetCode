class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int[] ans = new int[2];
        Arrays.fill(ans, -1);
        int n = nums.length;
        long max = Long.MIN_VALUE;
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((long) nums[i] + nums[j] == target && nums[i] != nums[j]) {
                    long product = (long) nums[i] * nums[j];
                    if (!found || max < product) {
                        max = product;
                        found = true;
                        if (nums[i] > nums[j]) {
                            ans[0] = i;
                            ans[1] = j;
                        } else {
                            ans[0] = j;
                            ans[1] = i;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
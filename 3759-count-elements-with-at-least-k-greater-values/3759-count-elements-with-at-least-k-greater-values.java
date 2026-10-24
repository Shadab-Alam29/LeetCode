class Solution {
    public int countElements(int[] nums, int k) {
        int ans = 0;
        int n = nums.length;

        if (k == 0) return n;

        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            int low = i + 1;
            int high = n - 1;
            int idx = n;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (nums[mid] > nums[i]) {
                    idx = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            int c = n - idx;

            if (c >= k) {
                ans++;
            }
        }

        return ans;
    }
}
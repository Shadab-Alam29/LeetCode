class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n = nums.length;
        int[] prefMax = new int[n];
        int[] sufMax = new int[n];
        prefMax[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefMax[i] = Math.max(prefMax[i - 1], nums[i]);
        }
        sufMax[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            sufMax[i] = Math.max(sufMax[i + 1], nums[i]);
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean greaterThanLeft = (i == 0) || (nums[i] > prefMax[i - 1]);
            boolean greaterThanRight = (i == n - 1) || (nums[i] > sufMax[i + 1]);
            if (greaterThanLeft || greaterThanRight) {
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}
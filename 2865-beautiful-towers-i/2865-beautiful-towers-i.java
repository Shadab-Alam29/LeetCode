class Solution {
    public long maximumSumOfHeights(int[] heights) {
        int n = heights.length;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            long sum = heights[i];
            int check = heights[i];
            for (int j = i - 1; j >= 0; j--) {
                check = Math.min(check, heights[j]);
                sum += check;
            }
            check = heights[i];
            for (int j = i + 1; j < n; j++) {
                check = Math.min(check, heights[j]);
                sum += check;
            }
            ans = Math.max(ans, sum);
        }

        return ans;
    }
}
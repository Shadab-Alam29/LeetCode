class Solution {
    public long maximumTotalSum(int[] max) {
        Arrays.sort(max);
        long sum = 0;
        int prev = Integer.MAX_VALUE;
        for (int i = max.length - 1; i >= 0; i--) {
            int h = Math.min(max[i], prev - 1);
            if (h <= 0) return -1;
            sum += h;
            prev = h;
        }
        return sum;
    }
}
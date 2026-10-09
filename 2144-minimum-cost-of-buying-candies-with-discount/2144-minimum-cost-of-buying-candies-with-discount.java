class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum = 0;
        int n = cost.length - 1;

        for (int i = n; i >= 0; i--) {
            if ((n - i) % 3 != 2) {
                sum += cost[i];
            }
        }

        return sum;
    }
}
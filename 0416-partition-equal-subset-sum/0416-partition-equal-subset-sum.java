class Solution {
    public boolean canPartition(int[] arr) {
        int sum = 0;
        for (int num : arr)   sum += num;
        if (sum % 2 != 0) return false;
        int target = sum / 2;
        int[][] dp = new int[arr.length][target + 1];
        for (int[] row : dp)  Arrays.fill(row, -1);
        return f(arr, arr.length - 1, target, dp);
    }

    static boolean f(int[] arr, int index, int target, int[][] dp) {
        if (target == 0) return true;
        if (index < 0) return false;
        if (dp[index][target] != -1)    return dp[index][target] == 1;
        boolean ans = f(arr, index - 1, target, dp);
        if (arr[index] <= target) 
        ans = ans || f(arr, index - 1, target - arr[index], dp);
        dp[index][target] = ans ? 1 : 0;
        return ans;
    }
}
class Solution {
    public boolean canPartition(int[] arr) {
        int sum = 0;
        for( int i: arr){
            sum +=i;
        }
        if (sum % 2 != 0) return false;
        sum = sum / 2;
        int[][] dp = new int[arr.length][sum + 1];
        for (int i = 0; i < arr.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        return f(arr, arr.length - 1, sum, dp);
    }

    static Boolean f(int[] arr, int index, int target, int[][] dp) {
        if (target == 0) return true;
        if (index < 0) return false;
        if (dp[index][target] != -1)
        return dp[index][target] == 1;
        boolean notTake = f(arr, index - 1, target, dp);
        boolean take = false;
        if (arr[index] <= target)
            take = f(arr, index - 1, target - arr[index], dp);
        boolean ans = take || notTake;
        dp[index][target] = ans ? 1 : 0;
        return ans;
    }
}
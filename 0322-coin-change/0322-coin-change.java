// class Solution {
//     public int coinChange(int[] coins, int amount) {
//         int ans = solve( coins,amount);
//         if ( ans == Integer.MAX_VALUE) return -1 ;
//         else return ans ;  
//     }
//     static int solve(int[] coins ,int amount ){
//         if ( amount == 0 )return 0 ; 
//         if ( amount < 0 )return Integer.MAX_VALUE;
//         int min = Integer.MAX_VALUE;
        
//         for ( int takencoin : coins){
//                 int ans = solve(coins,amount-takencoin);
//                 if ( ans == Integer.MAX_VALUE)continue;
//                 int bossAns = ans + 1;
//                 min = Math.min(min,bossAns);
//         }
//         return min ;
//     }
// }

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);
        int ans = solve(coins, amount, dp);
        if ( ans == Integer.MAX_VALUE) return -1 ;
        else return ans ; 
    }

    static int solve(int[] coins, int amount, int[] dp) {
        if (amount == 0) return 0;
        if (amount < 0) return Integer.MAX_VALUE;
        if (dp[amount] != -1) return dp[amount];

        int min = Integer.MAX_VALUE;

        for (int takencoin : coins) {
            int ans = solve(coins, amount - takencoin, dp);
            if (ans == Integer.MAX_VALUE) continue;
            min = Math.min(min, ans + 1);
        }

        dp[amount] = min;
        return min;
    }
}
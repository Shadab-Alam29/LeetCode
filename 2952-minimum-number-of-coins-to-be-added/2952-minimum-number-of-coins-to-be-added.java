class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);
        int sum = 0;
        int ans = 0;
        int i = 0 ;
        while(sum<target){
            if (i < coins.length && coins[i] <= (sum+1) ){
                sum += coins[i];
                i++;
            }
            else{
                ans++;
                sum +=sum+1; 
            }
        }
        return ans;
    }
}
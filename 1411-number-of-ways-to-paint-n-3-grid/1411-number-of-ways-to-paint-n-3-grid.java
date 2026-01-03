class Solution {
    public int numOfWays(int n) {
        int mod = 1000000007;
        if(n==0){
            return 0;
            }
            long twocolor = 6;
            long threecolor = 6;
            n--;
            while(n>0){
                long newTwocolor=((3 * twocolor) + (2* threecolor));
                threecolor=((2 * twocolor) + (2 * threecolor))% mod;
                twocolor=newTwocolor%mod;
                n--;
            }
             int ans= (int) ((twocolor + threecolor) % mod);
             return ans;   
    }
}
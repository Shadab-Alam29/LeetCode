class Solution {
    public int[] evenOddBit(int n) {
        int[] ans = new int[2];
        int index = 0;
        while(n>0){
            if ( n % 2 == 1 ){
                if ( index % 2 == 0) ans[0]++;
                else ans[1]++;
            }
            n/=2;
            index++;
        }
        return ans ;
    }
}
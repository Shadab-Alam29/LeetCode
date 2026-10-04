class Solution {
    public int isWinner(int[] p1, int[] p2) {
        int sum1 = 0 ; 
        int sum2 = 0 ;
        for ( int i = 0 ; i < p1.length ; i++){
            if ((i>=1 && p1[i-1] == 10) || ( i>=2 && p1[i-2] == 10)){
                sum1 += 2*p1[i];
            }
            else {
                sum1 +=p1[i];
            }
            if ((i>=1 && p2[i-1] == 10) || ( i>=2 && p2[i-2] == 10)){
                sum2 += 2*p2[i];
            }
            else {
                sum2 +=p2[i];
            }
        }
        if ( sum1 > sum2)return 1 ;
        if ( sum2 > sum1) return 2 ;
        return 0 ;
    }
}
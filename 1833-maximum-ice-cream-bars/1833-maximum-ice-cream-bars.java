class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int c = 0 ; 
        if ( costs[0] > coins)return 0 ;
        for ( int i = 0 ; i < costs.length ; i++ ){
            if ( costs[i] <= coins){
                c++;
                coins-=costs[i];
            }
            else {
                break;
            }
        }
        return c ;
    }
}
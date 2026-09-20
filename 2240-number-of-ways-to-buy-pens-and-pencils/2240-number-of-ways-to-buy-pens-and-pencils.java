class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        int moves = total/cost1;
        long sum = 0 ;
        for( int i = 0 ; i <= moves ; i++){
            sum += (total - (cost1 * i )) / cost2 + 1 ;
        }
        return sum ;
    }
}
class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1 ; 
        int end = num ; 
        while (start <= end ){
            int min = start + ( end - start )/ 2 ;
            Long sqr = (long) min * min ;
            if ( sqr == num)return true ;
            else if ( sqr > num){
                end = min-1 ;
            }
            else {
                start = min+1 ;
            }
        }
        return false;
    }
}
class Solution {
    public int findWinningPlayer(int[] skills, int k) {
        int n = skills.length;
        if ( k >= n){
            int m = 0 ;
            for(int i = 0 ; i < n ;i++ ){
                if ( skills[m] < skills[i] ){
                    m = i ;
                }
            }
            return m ;
        }


        int i = 0 ; 
        int j = 1 ;
        int c = 0 ;
        while ( j < n){
            if ( skills[i] > skills[j]){
                j++;
                c++;
            }
            else {
                i = j ;
                j++ ;
                c=1 ;
            }
            if ( c == k){
                return i ;
            }
        }
        return i ;
    }
}
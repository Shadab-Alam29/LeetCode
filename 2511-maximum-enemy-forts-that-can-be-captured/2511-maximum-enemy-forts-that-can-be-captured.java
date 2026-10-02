class Solution {
    public int captureForts(int[] forts) {
        int n = forts.length;
        int ans = 0 ;
        for ( int i = 0 ; i < n ; i++){
            if ( forts[i] != 0 ){
            for ( int j = i+1 ; j < n ; j++){
                if (forts[j]!= 0){
                    if ( forts[i] != forts[j]){
                        ans = Math.max(ans , j-i-1) ;
                    }
                    break ;
                }
            }
            }
        }
        return ans ;
    }
}
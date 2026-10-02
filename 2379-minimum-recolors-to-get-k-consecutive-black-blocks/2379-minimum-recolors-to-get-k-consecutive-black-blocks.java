class Solution {
    public int minimumRecolors(String blocks, int k) {
        int c = 0 ; 
         int ans = Integer.MAX_VALUE;
        char[] arr = blocks.toCharArray(); 
        for ( int i = 0 ; i < arr.length ; i++){
            if ( arr[i]== 'W' ) c++ ;
            if ( i >=k && arr[i-k] == 'W'){
                c--;
            }
            if ( i >=k -1){
                ans = Math.min(ans,c);
            }
        }
        return ans ;
    }
}
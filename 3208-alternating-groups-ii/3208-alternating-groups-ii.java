class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int count = 1 ; 
        int ans = 0 ;
        int n = colors.length;
        for ( int i = 1 ; i < k+n-1 ; i++){
            if(colors[i%n] != colors[(i-1) % n])count ++;
            else count = 1 ;
            if ( count >=k) ans++; 
        }
        return ans ;
    }
}